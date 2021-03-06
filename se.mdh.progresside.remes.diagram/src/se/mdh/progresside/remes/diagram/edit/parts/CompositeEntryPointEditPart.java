package se.mdh.progresside.remes.diagram.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ComponentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import se.mdh.progresside.remes.diagram.edit.policies.CompositeEntryPointItemSemanticEditPolicy;
import se.mdh.progresside.remes.diagram.providers.RemesElementTypes;

/**
 * @generated
 */
public class CompositeEntryPointEditPart extends AbstractBorderItemEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3037;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public CompositeEntryPointEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositeEntryPointItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ComponentEditPolicy() {
			@Override
			protected Command getDeleteCommand(GroupRequest request) {
				return UnexecutableCommand.INSTANCE;
			}
		});
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		CompositeEntryPointFigure figure = new CompositeEntryPointFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CompositeEntryPointFigure getPrimaryShape() {
		return (CompositeEntryPointFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(10, 10);

		//FIXME: workaround for #154536
		result.getBounds().setSize(result.getPreferredSize());
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(RemesElementTypes.Edge_4028);
		types.add(RemesElementTypes.WriteEdge_4030);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof EntryPointEditPart) {
			types.add(RemesElementTypes.Edge_4028);
		}
		if (targetEditPart instanceof EntryPoint2EditPart) {
			types.add(RemesElementTypes.Edge_4028);
		}
		if (targetEditPart instanceof EntryPoint3EditPart) {
			types.add(RemesElementTypes.Edge_4028);
		}
		if (targetEditPart instanceof EntryPoint4EditPart) {
			types.add(RemesElementTypes.Edge_4028);
		}
		if (targetEditPart instanceof CompositeExitPointEditPart) {
			types.add(RemesElementTypes.Edge_4028);
		}
		if (targetEditPart instanceof WritePointEditPart) {
			types.add(RemesElementTypes.WriteEdge_4030);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == RemesElementTypes.Edge_4028) {
			types.add(RemesElementTypes.EntryPoint_3024);
		}
		if (relationshipType == RemesElementTypes.Edge_4028) {
			types.add(RemesElementTypes.EntryPoint_3029);
		}
		if (relationshipType == RemesElementTypes.Edge_4028) {
			types.add(RemesElementTypes.EntryPoint_3032);
		}
		if (relationshipType == RemesElementTypes.Edge_4028) {
			types.add(RemesElementTypes.EntryPoint_3035);
		}
		if (relationshipType == RemesElementTypes.Edge_4028) {
			types.add(RemesElementTypes.CompositeExitPoint_3038);
		}
		if (relationshipType == RemesElementTypes.WriteEdge_4030) {
			types.add(RemesElementTypes.WritePoint_3044);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class CompositeEntryPointFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public CompositeEntryPointFigure() {
			this.setFill(false);
			this.setOutline(false);
			this.setLineWidth(1);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			Polygon polyline0 = new Polygon();
			polyline0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(0)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(0)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode()
					.DPtoLP(10)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode()
					.DPtoLP(10)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(3), getMapMode()
					.DPtoLP(8)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(4), getMapMode()
					.DPtoLP(5)));
			polyline0.addPoint(new Point(getMapMode().DPtoLP(3), getMapMode()
					.DPtoLP(2)));
			polyline0.setFill(true);
			polyline0.setLineWidth(1);
			polyline0.setBackgroundColor(ColorConstants.green);

			this.add(polyline0);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = true;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

	@Override
	public Command getCommand(Request request) {
		System.out.println(request);
		Command command = super.getCommand(request);
		System.out.println(command);
		return command;
	}
}
