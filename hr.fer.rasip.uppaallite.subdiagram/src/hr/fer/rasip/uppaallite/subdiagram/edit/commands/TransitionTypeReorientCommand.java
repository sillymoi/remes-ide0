package hr.fer.rasip.uppaallite.subdiagram.edit.commands;

import hr.fer.rasip.uppaallite.LocationType;
import hr.fer.rasip.uppaallite.TemplateType;
import hr.fer.rasip.uppaallite.TransitionType;
import hr.fer.rasip.uppaallite.subdiagram.edit.policies.UppaalliteBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TransitionTypeReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TransitionTypeReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof TransitionType) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof LocationType && newEnd instanceof LocationType)) {
			return false;
		}
		LocationType target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof TemplateType)) {
			return false;
		}
		TemplateType container = (TemplateType) getLink().eContainer();
		return UppaalliteBaseItemSemanticEditPolicy.LinkConstraints
				.canExistTransitionType_4002(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof LocationType && newEnd instanceof LocationType)) {
			return false;
		}
		LocationType source = getLink().getSource();
		if (!(getLink().eContainer() instanceof TemplateType)) {
			return false;
		}
		TemplateType container = (TemplateType) getLink().eContainer();
		return UppaalliteBaseItemSemanticEditPolicy.LinkConstraints
				.canExistTransitionType_4002(container, source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected TransitionType getLink() {
		return (TransitionType) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected LocationType getOldSource() {
		return (LocationType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected LocationType getNewSource() {
		return (LocationType) newEnd;
	}

	/**
	 * @generated
	 */
	protected LocationType getOldTarget() {
		return (LocationType) oldEnd;
	}

	/**
	 * @generated
	 */
	protected LocationType getNewTarget() {
		return (LocationType) newEnd;
	}
}
