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
import se.mdh.progresside.remes.diagram.edit.parts.Resource2EditPart;
import se.mdh.progresside.remes.diagram.part.RemesDiagramUpdater;
import se.mdh.progresside.remes.diagram.part.RemesNodeDescriptor;
import se.mdh.progresside.remes.diagram.part.RemesVisualIDRegistry;

/**
 * @generated
 */
public class SubModeSubModeResourcesCompartment2CanonicalEditPolicy extends
		CanonicalEditPolicy {

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
				.getSubModeSubModeResourcesCompartment_7028SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
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
		case Resource2EditPart.VISUAL_ID:
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
					.getMode_Resources());
		}
		return myFeaturesToSynchronize;
	}

}
