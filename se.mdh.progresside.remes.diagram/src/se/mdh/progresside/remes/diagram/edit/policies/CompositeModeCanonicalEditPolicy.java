package se.mdh.progresside.remes.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeEntryPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.CompositeExitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.EntryPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint2EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint3EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.ExitPoint4EditPart;
import se.mdh.progresside.remes.diagram.edit.parts.InitPointEditPart;
import se.mdh.progresside.remes.diagram.edit.parts.WritePointEditPart;
import se.mdh.progresside.remes.diagram.part.RemesDiagramUpdater;
import se.mdh.progresside.remes.diagram.part.RemesNodeDescriptor;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;

/**
 * @generated
 */
public class CompositeModeCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = RemesDiagramUpdater
				.getCompositeMode_2008SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((RemesNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = RemesVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case EntryPoint4EditPart.VISUAL_ID:
		case ExitPoint4EditPart.VISUAL_ID:
		case CompositeEntryPointEditPart.VISUAL_ID:
		case CompositeExitPointEditPart.VISUAL_ID:
		case InitPointEditPart.VISUAL_ID:
		case WritePointEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getControlPath_EntryPoint());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getControlPath_ExitPoint());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_CompositeEntryPoint());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_CompositeExitPoint());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_InitPoint());
			myFeaturesToSynchronize.add(RemesPackage.eINSTANCE
					.getCompositeMode_WritePoint());
		}
		return myFeaturesToSynchronize;
	}

}
