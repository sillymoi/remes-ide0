/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package se.mdh.progresside.remes.impl;

import hr.fer.rasip.remes.grammars.logical.tree.TreePackage;

import hr.fer.rasip.remes.grammars.logical.tree.impl.TreePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.mdh.progresside.attributes.AttributesPackage;

import se.mdh.progresside.attributes.impl.AttributesPackageImpl;

import se.mdh.progresside.remes.CompositeEntryPoint;
import se.mdh.progresside.remes.CompositeExitPoint;
import se.mdh.progresside.remes.CompositeMode;
import se.mdh.progresside.remes.ConditionalConnector;
import se.mdh.progresside.remes.ControlPath;
import se.mdh.progresside.remes.Edge;
import se.mdh.progresside.remes.EntryPoint;
import se.mdh.progresside.remes.ExitPoint;
import se.mdh.progresside.remes.InitEdge;
import se.mdh.progresside.remes.InitPoint;
import se.mdh.progresside.remes.Mode;
import se.mdh.progresside.remes.Point;
import se.mdh.progresside.remes.PrimitiveTypes;
import se.mdh.progresside.remes.RemesDiagram;
import se.mdh.progresside.remes.RemesFactory;
import se.mdh.progresside.remes.RemesPackage;
import se.mdh.progresside.remes.Resource;
import se.mdh.progresside.remes.ResourceTypes;
import se.mdh.progresside.remes.SubMode;
import se.mdh.progresside.remes.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RemesPackageImpl extends EPackageImpl implements RemesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remesDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEntryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeExitPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.mdh.progresside.remes.RemesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RemesPackageImpl() {
		super(eNS_URI, RemesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RemesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RemesPackage init() {
		if (isInited) return (RemesPackage)EPackage.Registry.INSTANCE.getEPackage(RemesPackage.eNS_URI);

		// Obtain or create and register package
		RemesPackageImpl theRemesPackage = (RemesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RemesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RemesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AttributesPackageImpl theAttributesPackage = (AttributesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AttributesPackage.eNS_URI) instanceof AttributesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AttributesPackage.eNS_URI) : AttributesPackage.eINSTANCE);
		TreePackageImpl theTreePackage = (TreePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) instanceof TreePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI) : TreePackage.eINSTANCE);

		// Create package meta-data objects
		theRemesPackage.createPackageContents();
		theAttributesPackage.createPackageContents();
		theTreePackage.createPackageContents();

		// Initialize created meta-data
		theRemesPackage.initializePackageContents();
		theAttributesPackage.initializePackageContents();
		theTreePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRemesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RemesPackage.eNS_URI, theRemesPackage);
		return theRemesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeMode() {
		return compositeModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_SubModes() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_ConditionalConnectors() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_InitPoint() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_CompositeEntryPoint() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeMode_CompositeExitPoint() {
		return (EReference)compositeModeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalConnector() {
		return conditionalConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalConnector_Parent() {
		return (EReference)conditionalConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_ActionGuard() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_ActionBody() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_ParsedActionGuard() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_ConnectFrom() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_ConnectTo() {
		return (EReference)edgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitEdge() {
		return initEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitEdge_Initialization() {
		return (EAttribute)initEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitEdge_ConnectFrom() {
		return (EReference)initEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitEdge_ConnectTo() {
		return (EReference)initEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMode_Initialization() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Variables() {
		return (EReference)modeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Resources() {
		return (EReference)modeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemesDiagram() {
		return remesDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemesDiagram_Modes() {
		return (EReference)remesDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubMode() {
		return subModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubMode_Invariant() {
		return (EAttribute)subModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubMode_IsUrgent() {
		return (EAttribute)subModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubMode_Parent() {
		return (EReference)subModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubMode_ParsedInvariant() {
		return (EReference)subModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_VectorSize() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Global() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Scope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Readable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Writable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Expression() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Type() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Scope() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitPoint() {
		return initPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitPoint_InitEdge() {
		return (EReference)initPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPoint() {
		return entryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPoint_EntryEdges() {
		return (EReference)entryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitPoint() {
		return exitPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExitPoint_ExitEdges() {
		return (EReference)exitPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlPath() {
		return controlPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlPath_EntryPoint() {
		return (EReference)controlPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlPath_ExitPoint() {
		return (EReference)controlPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlPath_Name() {
		return (EAttribute)controlPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeEntryPoint() {
		return compositeEntryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeExitPoint() {
		return compositeExitPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveTypes() {
		return primitiveTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceTypes() {
		return resourceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemesFactory getRemesFactory() {
		return (RemesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		compositeModeEClass = createEClass(COMPOSITE_MODE);
		createEReference(compositeModeEClass, COMPOSITE_MODE__SUB_MODES);
		createEReference(compositeModeEClass, COMPOSITE_MODE__CONDITIONAL_CONNECTORS);
		createEReference(compositeModeEClass, COMPOSITE_MODE__INIT_POINT);
		createEReference(compositeModeEClass, COMPOSITE_MODE__COMPOSITE_ENTRY_POINT);
		createEReference(compositeModeEClass, COMPOSITE_MODE__COMPOSITE_EXIT_POINT);

		conditionalConnectorEClass = createEClass(CONDITIONAL_CONNECTOR);
		createEReference(conditionalConnectorEClass, CONDITIONAL_CONNECTOR__PARENT);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__ACTION_GUARD);
		createEAttribute(edgeEClass, EDGE__ACTION_BODY);
		createEReference(edgeEClass, EDGE__PARSED_ACTION_GUARD);
		createEReference(edgeEClass, EDGE__CONNECT_FROM);
		createEReference(edgeEClass, EDGE__CONNECT_TO);

		initEdgeEClass = createEClass(INIT_EDGE);
		createEAttribute(initEdgeEClass, INIT_EDGE__INITIALIZATION);
		createEReference(initEdgeEClass, INIT_EDGE__CONNECT_FROM);
		createEReference(initEdgeEClass, INIT_EDGE__CONNECT_TO);

		modeEClass = createEClass(MODE);
		createEAttribute(modeEClass, MODE__INITIALIZATION);
		createEReference(modeEClass, MODE__VARIABLES);
		createEReference(modeEClass, MODE__RESOURCES);

		remesDiagramEClass = createEClass(REMES_DIAGRAM);
		createEReference(remesDiagramEClass, REMES_DIAGRAM__MODES);

		subModeEClass = createEClass(SUB_MODE);
		createEAttribute(subModeEClass, SUB_MODE__INVARIANT);
		createEAttribute(subModeEClass, SUB_MODE__IS_URGENT);
		createEReference(subModeEClass, SUB_MODE__PARENT);
		createEReference(subModeEClass, SUB_MODE__PARSED_INVARIANT);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__VECTOR_SIZE);
		createEAttribute(variableEClass, VARIABLE__GLOBAL);
		createEReference(variableEClass, VARIABLE__SCOPE);
		createEAttribute(variableEClass, VARIABLE__READABLE);
		createEAttribute(variableEClass, VARIABLE__WRITABLE);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__EXPRESSION);
		createEAttribute(resourceEClass, RESOURCE__TYPE);
		createEReference(resourceEClass, RESOURCE__SCOPE);

		pointEClass = createEClass(POINT);

		initPointEClass = createEClass(INIT_POINT);
		createEReference(initPointEClass, INIT_POINT__INIT_EDGE);

		entryPointEClass = createEClass(ENTRY_POINT);
		createEReference(entryPointEClass, ENTRY_POINT__ENTRY_EDGES);

		exitPointEClass = createEClass(EXIT_POINT);
		createEReference(exitPointEClass, EXIT_POINT__EXIT_EDGES);

		controlPathEClass = createEClass(CONTROL_PATH);
		createEReference(controlPathEClass, CONTROL_PATH__ENTRY_POINT);
		createEReference(controlPathEClass, CONTROL_PATH__EXIT_POINT);
		createEAttribute(controlPathEClass, CONTROL_PATH__NAME);

		compositeEntryPointEClass = createEClass(COMPOSITE_ENTRY_POINT);

		compositeExitPointEClass = createEClass(COMPOSITE_EXIT_POINT);

		// Create enums
		primitiveTypesEEnum = createEEnum(PRIMITIVE_TYPES);
		resourceTypesEEnum = createEEnum(RESOURCE_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AttributesPackage theAttributesPackage = (AttributesPackage)EPackage.Registry.INSTANCE.getEPackage(AttributesPackage.eNS_URI);
		TreePackage theTreePackage = (TreePackage)EPackage.Registry.INSTANCE.getEPackage(TreePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeModeEClass.getESuperTypes().add(this.getMode());
		conditionalConnectorEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		conditionalConnectorEClass.getESuperTypes().add(this.getControlPath());
		edgeEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		initEdgeEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		modeEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		modeEClass.getESuperTypes().add(this.getControlPath());
		remesDiagramEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		subModeEClass.getESuperTypes().add(this.getMode());
		variableEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		resourceEClass.getESuperTypes().add(theAttributesPackage.getAttributable());
		initPointEClass.getESuperTypes().add(this.getPoint());
		entryPointEClass.getESuperTypes().add(this.getPoint());
		exitPointEClass.getESuperTypes().add(this.getPoint());
		compositeEntryPointEClass.getESuperTypes().add(this.getExitPoint());
		compositeExitPointEClass.getESuperTypes().add(this.getEntryPoint());

		// Initialize classes and features; add operations and parameters
		initEClass(compositeModeEClass, CompositeMode.class, "CompositeMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeMode_SubModes(), this.getSubMode(), this.getSubMode_Parent(), "subModes", null, 1, -1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_ConditionalConnectors(), this.getConditionalConnector(), this.getConditionalConnector_Parent(), "conditionalConnectors", null, 0, -1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_InitPoint(), this.getInitPoint(), null, "initPoint", null, 1, 1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_CompositeEntryPoint(), this.getCompositeEntryPoint(), null, "compositeEntryPoint", null, 1, 1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeMode_CompositeExitPoint(), this.getCompositeExitPoint(), null, "compositeExitPoint", null, 1, 1, CompositeMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalConnectorEClass, ConditionalConnector.class, "ConditionalConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalConnector_Parent(), this.getCompositeMode(), this.getCompositeMode_ConditionalConnectors(), "parent", null, 0, 1, ConditionalConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_ActionGuard(), ecorePackage.getEString(), "actionGuard", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEdge_ActionBody(), ecorePackage.getEString(), "actionBody", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_ParsedActionGuard(), theTreePackage.getLogicalRoot(), null, "parsedActionGuard", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_ConnectFrom(), this.getExitPoint(), this.getExitPoint_ExitEdges(), "connectFrom", null, 1, 1, Edge.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_ConnectTo(), this.getEntryPoint(), this.getEntryPoint_EntryEdges(), "connectTo", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initEdgeEClass, InitEdge.class, "InitEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitEdge_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, InitEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitEdge_ConnectFrom(), this.getInitPoint(), this.getInitPoint_InitEdge(), "connectFrom", null, 1, 1, InitEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitEdge_ConnectTo(), this.getEntryPoint(), null, "connectTo", null, 1, 1, InitEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMode_Initialization(), ecorePackage.getEString(), "initialization", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode_Variables(), this.getVariable(), this.getVariable_Scope(), "variables", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode_Resources(), this.getResource(), this.getResource_Scope(), "resources", null, 0, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remesDiagramEClass, RemesDiagram.class, "RemesDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemesDiagram_Modes(), this.getMode(), null, "modes", null, 0, -1, RemesDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subModeEClass, SubMode.class, "SubMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubMode_Invariant(), ecorePackage.getEString(), "invariant", null, 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubMode_IsUrgent(), ecorePackage.getEBoolean(), "isUrgent", "false", 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubMode_Parent(), this.getCompositeMode(), this.getCompositeMode_SubModes(), "parent", null, 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubMode_ParsedInvariant(), theTreePackage.getLogicalRoot(), null, "parsedInvariant", null, 0, 1, SubMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getPrimitiveTypes(), "type", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_VectorSize(), ecorePackage.getEInt(), "vectorSize", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Global(), ecorePackage.getEBoolean(), "global", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Scope(), this.getMode(), this.getMode_Variables(), "scope", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Readable(), ecorePackage.getEBoolean(), "readable", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Writable(), ecorePackage.getEBoolean(), "writable", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Type(), this.getResourceTypes(), "type", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Scope(), this.getMode(), this.getMode_Resources(), "scope", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initPointEClass, InitPoint.class, "InitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitPoint_InitEdge(), this.getInitEdge(), this.getInitEdge_ConnectFrom(), "initEdge", null, 1, 1, InitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryPointEClass, EntryPoint.class, "EntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPoint_EntryEdges(), this.getEdge(), this.getEdge_ConnectTo(), "entryEdges", null, 1, -1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exitPointEClass, ExitPoint.class, "ExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExitPoint_ExitEdges(), this.getEdge(), this.getEdge_ConnectFrom(), "exitEdges", null, 1, -1, ExitPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlPathEClass, ControlPath.class, "ControlPath", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlPath_EntryPoint(), this.getEntryPoint(), null, "entryPoint", null, 1, 1, ControlPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlPath_ExitPoint(), this.getExitPoint(), null, "exitPoint", null, 1, 1, ControlPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlPath_Name(), ecorePackage.getEString(), "name", null, 0, 1, ControlPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeEntryPointEClass, CompositeEntryPoint.class, "CompositeEntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeExitPointEClass, CompositeExitPoint.class, "CompositeExitPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypesEEnum, PrimitiveTypes.class, "PrimitiveTypes");
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.INTEGER);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.BOOLEAN);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.NATURAL);
		addEEnumLiteral(primitiveTypesEEnum, PrimitiveTypes.CLOCK);

		initEEnum(resourceTypesEEnum, ResourceTypes.class, "ResourceTypes");
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.CPU);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.MEMORY);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.BANDWIDTH);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.POWER);
		addEEnumLiteral(resourceTypesEEnum, ResourceTypes.PORT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (getEdge_ActionGuard(), 
		   source, 
		   new String[] {
			 "constraints", "InvariantsSyntaxCorrect"
		   });		
		addAnnotation
		  (getSubMode_Invariant(), 
		   source, 
		   new String[] {
			 "constraints", "InvariantsSyntaxCorrect"
		   });
	}

} //RemesPackageImpl