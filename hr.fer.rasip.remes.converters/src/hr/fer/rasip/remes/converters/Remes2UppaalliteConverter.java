package hr.fer.rasip.remes.converters;

import hr.fer.rasip.uppaallite.UppaallitePackage;

import java.net.URL;
import java.util.Collections;
import java.util.UUID;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.osgi.framework.Bundle;

import se.mdh.progresside.components.ComponentsPlugin;
import se.mdh.progresside.components.core.IArchModel;
import se.mdh.progresside.components.core.IComponent;
import se.mdh.progresside.components.core.IProComModelManager;
import se.mdh.progresside.proComMetamodel.IdentifiableElement;
import se.mdh.progresside.proComMetamodel.procomPackage;
import se.mdh.progresside.proComMetamodel.proSave.Component;
import se.mdh.progresside.proComMetamodel.proSave.ProSaveSubsystem;
import se.mdh.progresside.proComMetamodel.proSave.impl.ComponentImpl;
import se.mdh.progresside.proComMetamodel.proSys.CompositeSubsystem;
import se.mdh.progresside.proComMetamodel.proSys.Subsystem;
import se.mdh.progresside.proComMetamodel.proSys.impl.SubsystemImpl;
import se.mdh.progresside.proComMetamodel.util.ProComComponentResourceFactory;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.attributes.IREMESModel;
import se.mdh.progresside.remes.attributes.impl.REMESModel;

public class Remes2UppaalliteConverter {

	private static EMFInjector injector;
	private static IExtractor extractor;

	private static IReferenceModel remesMetamodel;
	private static IReferenceModel uppaalMetamodel;
	private static IReferenceModel procomMetamodel;

	private static final String remesURI = RemesPackage.eNS_URI; //"http://www.mdh.se/progresside/remes/1.2.0/remes.ecore"; //$NON-NLS-1$
	private static final String procomURI = procomPackage.eNS_URI;
	private static final String uppaalliteURI = UppaallitePackage.eNS_URI;

	private static URL asmRemesProSaveURL;
	private static URL asmRemesProSysURL;
	private static URL asmRemesProSaveSubsystemURL;

	static {
		// ATL remes2pta transformation
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID); //$NON-NLS-1$
		asmRemesProSaveURL = bundle.getEntry("resources/remesProSave2ulite.asm"); //$NON-NLS-1$
		asmRemesProSysURL = bundle.getEntry("resources/remesProSys2ulite.asm"); //$NON-NLS-1$
		asmRemesProSaveSubsystemURL = bundle.getEntry("resources/remesProSaveSubsystem2ulite.asm"); //$NON-NLS-1$
		
		try {
			injector = (EMFInjector) CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$		

			// Metamodels
			ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$
			remesMetamodel = factory.newReferenceModel();
			uppaalMetamodel = factory.newReferenceModel();
			procomMetamodel = factory.newReferenceModel();

			injector.inject(uppaalMetamodel, uppaalliteURI);
			injector.inject(remesMetamodel, remesURI);

			injector.inject(procomMetamodel, procomURI);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	/*
	 * public Remes2UppaalliteConverter(IArchModel model) { this.archModel =
	 * model; }
	 */

	public static void doConvertArchitecture(IFile remesFile,
			IFile uppaalliteFile, IArchModel archModel) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource modelResource = resourceSet.getResource(
				ProComComponentResourceFactory.getEmfResource(
						archModel.getCorrespondingResource()).getURI(), true);

		for (Object element : modelResource.getContents()) {
			if (element instanceof ComponentImpl) {
				Component c = (Component) element;

				IComponent componentResource = getComponentResource(c);
				if (componentResource != null) {
					IREMESModel behModel = REMESModel
							.getForComponent(componentResource);
					doConvertBehaviour(asmRemesProSaveURL,modelResource, behModel, uppaalliteFile,
							remesFile);
				}
			} else if (element instanceof SubsystemImpl) {
				Subsystem s = (Subsystem) element;

				IComponent componentResource = getComponentResource(s);
				if (componentResource != null) {
					IREMESModel behModel = REMESModel
							.getForComponent(componentResource);

					if (s.getRealization() instanceof ProSaveSubsystem) {
						doConvertBehaviour(asmRemesProSaveSubsystemURL,modelResource, behModel, uppaalliteFile,
								remesFile);
					} else if (s.getRealization() instanceof CompositeSubsystem) {
						doConvertBehaviour(asmRemesProSysURL, modelResource, behModel, uppaalliteFile,
								remesFile);
					}
				}
			}
		}
	}

	private static IComponent getComponentResource(IdentifiableElement e) {
		// Find the enclosing project for that component
		IProComModelManager mgr = ComponentsPlugin.getDefault()
				.getProComModelManager();
		for (IProject project : mgr.getAllProjects(true)) {
			UUID uuid = UUID.fromString(e.getUUID());
			if (mgr.componentExists(project, uuid))
				return mgr.getComponent(project, uuid);
		}
		return null;
	}

	public static void doConvertBehaviour(URL transfURL, Resource modelResource, IREMESModel behModel, IFile uppaalliteFile, IFile remesFile) {
		String uliteUri = uppaalliteFile.getLocationURI().toString();
		String remesUri = remesFile.getLocationURI().toString();

		try {
			remes2pta(transfURL, modelResource, remesUri, uliteUri);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void remes2pta(URL transfURL, Resource procomModelResource,
			String remesFile, String outputFile) throws Exception {

		// Defaults
		ModelFactory factory = CoreService.createModelFactory("EMF"); //$NON-NLS-1$

		// Getting launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		// Creating models
		IModel procomModel = factory.newModel(procomMetamodel);
		IModel remesModel = factory.newModel(remesMetamodel);
		IModel ptaModel = factory.newModel(uppaalMetamodel);

		// Loading existing model
		injector.inject(remesModel, remesFile);
		injector.inject(procomModel, procomModelResource);

		// Launching
		launcher.addInOutModel(remesModel, "IN", "REMES"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(procomModel, "IN1", "PROCOM"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(ptaModel, "OUT", "ULITE"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(),
				Collections.<String, Object> emptyMap(), transfURL.openStream());

		extractor.extract(ptaModel, outputFile);

	}
}
