/*
* generated by Xtext
*/

package hr.fer.rasip.remes.profile.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class ProfileGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PlatformProfileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PlatformProfile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPlatformProfileAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cProfileKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cResourcesKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cResourcesAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cResourcesResourceParserRuleCall_4_2_0 = (RuleCall)cResourcesAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cResourcesAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cResourcesResourceParserRuleCall_4_3_1_0 = (RuleCall)cResourcesAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cConstraintsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cConstraintsAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cConstraintsConstraintParserRuleCall_5_2_0 = (RuleCall)cConstraintsAssignment_5_2.eContents().get(0);
		private final Group cGroup_5_3 = (Group)cGroup_5.eContents().get(3);
		private final Keyword cCommaKeyword_5_3_0 = (Keyword)cGroup_5_3.eContents().get(0);
		private final Assignment cConstraintsAssignment_5_3_1 = (Assignment)cGroup_5_3.eContents().get(1);
		private final RuleCall cConstraintsConstraintParserRuleCall_5_3_1_0 = (RuleCall)cConstraintsAssignment_5_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5_4 = (Keyword)cGroup_5.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//PlatformProfile:
		//	{PlatformProfile} "profile" name=ID "{" ("resources" "{" resources+=Resource ("," resources+=Resource)* "}")?
		//	("constraints" "{" constraints+=Constraint ("," constraints+=Constraint)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{PlatformProfile} "profile" name=ID "{" ("resources" "{" resources+=Resource ("," resources+=Resource)* "}")?
		//("constraints" "{" constraints+=Constraint ("," constraints+=Constraint)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{PlatformProfile}
		public Action getPlatformProfileAction_0() { return cPlatformProfileAction_0; }

		//"profile"
		public Keyword getProfileKeyword_1() { return cProfileKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("resources" "{" resources+=Resource ("," resources+=Resource)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"resources"
		public Keyword getResourcesKeyword_4_0() { return cResourcesKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//resources+=Resource
		public Assignment getResourcesAssignment_4_2() { return cResourcesAssignment_4_2; }

		//Resource
		public RuleCall getResourcesResourceParserRuleCall_4_2_0() { return cResourcesResourceParserRuleCall_4_2_0; }

		//("," resources+=Resource)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//resources+=Resource
		public Assignment getResourcesAssignment_4_3_1() { return cResourcesAssignment_4_3_1; }

		//Resource
		public RuleCall getResourcesResourceParserRuleCall_4_3_1_0() { return cResourcesResourceParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//("constraints" "{" constraints+=Constraint ("," constraints+=Constraint)* "}")?
		public Group getGroup_5() { return cGroup_5; }

		//"constraints"
		public Keyword getConstraintsKeyword_5_0() { return cConstraintsKeyword_5_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_5_1() { return cLeftCurlyBracketKeyword_5_1; }

		//constraints+=Constraint
		public Assignment getConstraintsAssignment_5_2() { return cConstraintsAssignment_5_2; }

		//Constraint
		public RuleCall getConstraintsConstraintParserRuleCall_5_2_0() { return cConstraintsConstraintParserRuleCall_5_2_0; }

		//("," constraints+=Constraint)*
		public Group getGroup_5_3() { return cGroup_5_3; }

		//","
		public Keyword getCommaKeyword_5_3_0() { return cCommaKeyword_5_3_0; }

		//constraints+=Constraint
		public Assignment getConstraintsAssignment_5_3_1() { return cConstraintsAssignment_5_3_1; }

		//Constraint
		public RuleCall getConstraintsConstraintParserRuleCall_5_3_1_0() { return cConstraintsConstraintParserRuleCall_5_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5_4() { return cRightCurlyBracketKeyword_5_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class ResourceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Resource");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeResourceTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommercialAtKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cWeightAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cWeightINTTerminalRuleCall_3_1_0 = (RuleCall)cWeightAssignment_3_1.eContents().get(0);
		
		//Resource:
		//	name=ID ":" type=ResourceType ("@" weight=INT)?;
		public ParserRule getRule() { return rule; }

		//name=ID ":" type=ResourceType ("@" weight=INT)?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=ResourceType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//ResourceType
		public RuleCall getTypeResourceTypeEnumRuleCall_2_0() { return cTypeResourceTypeEnumRuleCall_2_0; }

		//("@" weight=INT)?
		public Group getGroup_3() { return cGroup_3; }

		//"@"
		public Keyword getCommercialAtKeyword_3_0() { return cCommercialAtKeyword_3_0; }

		//weight=INT
		public Assignment getWeightAssignment_3_1() { return cWeightAssignment_3_1; }

		//INT
		public RuleCall getWeightINTTerminalRuleCall_3_1_0() { return cWeightINTTerminalRuleCall_3_1_0; }
	}

	public class ConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Constraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeConstraintTypeEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cReferencesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cReferencesResourceCrossReference_2_0 = (CrossReference)cReferencesAssignment_2.eContents().get(0);
		private final RuleCall cReferencesResourceIDTerminalRuleCall_2_0_1 = (RuleCall)cReferencesResourceCrossReference_2_0.eContents().get(1);
		private final Assignment cIsDerivationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cIsDerivationApostropheKeyword_3_0 = (Keyword)cIsDerivationAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cOperationAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOperationConstraintOperationEnumRuleCall_5_0 = (RuleCall)cOperationAssignment_5.eContents().get(0);
		private final Assignment cBoundAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cBoundINTTerminalRuleCall_6_0 = (RuleCall)cBoundAssignment_6.eContents().get(0);
		
		//Constraint:
		//	type=ConstraintType "(" references=[Resource] isDerivation?="\'"? ")" operation=ConstraintOperation bound=INT;
		public ParserRule getRule() { return rule; }

		//type=ConstraintType "(" references=[Resource] isDerivation?="\'"? ")" operation=ConstraintOperation bound=INT
		public Group getGroup() { return cGroup; }

		//type=ConstraintType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//ConstraintType
		public RuleCall getTypeConstraintTypeEnumRuleCall_0_0() { return cTypeConstraintTypeEnumRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//references=[Resource]
		public Assignment getReferencesAssignment_2() { return cReferencesAssignment_2; }

		//[Resource]
		public CrossReference getReferencesResourceCrossReference_2_0() { return cReferencesResourceCrossReference_2_0; }

		//ID
		public RuleCall getReferencesResourceIDTerminalRuleCall_2_0_1() { return cReferencesResourceIDTerminalRuleCall_2_0_1; }

		//isDerivation?="\'"?
		public Assignment getIsDerivationAssignment_3() { return cIsDerivationAssignment_3; }

		//"\'"
		public Keyword getIsDerivationApostropheKeyword_3_0() { return cIsDerivationApostropheKeyword_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//operation=ConstraintOperation
		public Assignment getOperationAssignment_5() { return cOperationAssignment_5; }

		//ConstraintOperation
		public RuleCall getOperationConstraintOperationEnumRuleCall_5_0() { return cOperationConstraintOperationEnumRuleCall_5_0; }

		//bound=INT
		public Assignment getBoundAssignment_6() { return cBoundAssignment_6; }

		//INT
		public RuleCall getBoundINTTerminalRuleCall_6_0() { return cBoundINTTerminalRuleCall_6_0; }
	}
	
	
	public class ResourceTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ResourceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCpuEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCpuCpuKeyword_0_0 = (Keyword)cCpuEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMemoryEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMemoryMemoryKeyword_1_0 = (Keyword)cMemoryEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBandwidthEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBandwidthBandwidthKeyword_2_0 = (Keyword)cBandwidthEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cPowerEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cPowerPowerKeyword_3_0 = (Keyword)cPowerEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cPortEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cPortPortKeyword_4_0 = (Keyword)cPortEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum ResourceType:
		//	cpu | memory | bandwidth | power | port;
		public EnumRule getRule() { return rule; }

		//cpu | memory | bandwidth | power | port
		public Alternatives getAlternatives() { return cAlternatives; }

		//cpu
		public EnumLiteralDeclaration getCpuEnumLiteralDeclaration_0() { return cCpuEnumLiteralDeclaration_0; }

		//"cpu"
		public Keyword getCpuCpuKeyword_0_0() { return cCpuCpuKeyword_0_0; }

		//memory
		public EnumLiteralDeclaration getMemoryEnumLiteralDeclaration_1() { return cMemoryEnumLiteralDeclaration_1; }

		//"memory"
		public Keyword getMemoryMemoryKeyword_1_0() { return cMemoryMemoryKeyword_1_0; }

		//bandwidth
		public EnumLiteralDeclaration getBandwidthEnumLiteralDeclaration_2() { return cBandwidthEnumLiteralDeclaration_2; }

		//"bandwidth"
		public Keyword getBandwidthBandwidthKeyword_2_0() { return cBandwidthBandwidthKeyword_2_0; }

		//power
		public EnumLiteralDeclaration getPowerEnumLiteralDeclaration_3() { return cPowerEnumLiteralDeclaration_3; }

		//"power"
		public Keyword getPowerPowerKeyword_3_0() { return cPowerPowerKeyword_3_0; }

		//port
		public EnumLiteralDeclaration getPortEnumLiteralDeclaration_4() { return cPortEnumLiteralDeclaration_4; }

		//"port"
		public Keyword getPortPortKeyword_4_0() { return cPortPortKeyword_4_0; }
	}

	public class ConstraintTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ConstraintType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMinimumEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMinimumMinKeyword_0_0 = (Keyword)cMinimumEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cMaximumEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cMaximumMaxKeyword_1_0 = (Keyword)cMaximumEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cAverageEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cAverageAvgKeyword_2_0 = (Keyword)cAverageEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum ConstraintType:
		//	Minimum="min" | Maximum="max" | Average="avg";
		public EnumRule getRule() { return rule; }

		//Minimum="min" | Maximum="max" | Average="avg"
		public Alternatives getAlternatives() { return cAlternatives; }

		//Minimum="min"
		public EnumLiteralDeclaration getMinimumEnumLiteralDeclaration_0() { return cMinimumEnumLiteralDeclaration_0; }

		//"min"
		public Keyword getMinimumMinKeyword_0_0() { return cMinimumMinKeyword_0_0; }

		//Maximum="max"
		public EnumLiteralDeclaration getMaximumEnumLiteralDeclaration_1() { return cMaximumEnumLiteralDeclaration_1; }

		//"max"
		public Keyword getMaximumMaxKeyword_1_0() { return cMaximumMaxKeyword_1_0; }

		//Average="avg"
		public EnumLiteralDeclaration getAverageEnumLiteralDeclaration_2() { return cAverageEnumLiteralDeclaration_2; }

		//"avg"
		public Keyword getAverageAvgKeyword_2_0() { return cAverageAvgKeyword_2_0; }
	}

	public class ConstraintOperationElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ConstraintOperation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cLessEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cLessLessThanSignKeyword_0_0 = (Keyword)cLessEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cLessOrEqualEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cLessOrEqualLessThanSignEqualsSignKeyword_1_0 = (Keyword)cLessOrEqualEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cEqualEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cEqualEqualsSignEqualsSignKeyword_2_0 = (Keyword)cEqualEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cGreaterOrEqualEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cGreaterOrEqualGreaterThanSignEqualsSignKeyword_3_0 = (Keyword)cGreaterOrEqualEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cGreaterEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cGreaterGreaterThanSignKeyword_4_0 = (Keyword)cGreaterEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum ConstraintOperation:
		//	Less="<" | LessOrEqual="<=" | Equal="==" | GreaterOrEqual=">=" | Greater=">";
		public EnumRule getRule() { return rule; }

		//Less="<" | LessOrEqual="<=" | Equal="==" | GreaterOrEqual=">=" | Greater=">"
		public Alternatives getAlternatives() { return cAlternatives; }

		//Less="<"
		public EnumLiteralDeclaration getLessEnumLiteralDeclaration_0() { return cLessEnumLiteralDeclaration_0; }

		//"<"
		public Keyword getLessLessThanSignKeyword_0_0() { return cLessLessThanSignKeyword_0_0; }

		//LessOrEqual="<="
		public EnumLiteralDeclaration getLessOrEqualEnumLiteralDeclaration_1() { return cLessOrEqualEnumLiteralDeclaration_1; }

		//"<="
		public Keyword getLessOrEqualLessThanSignEqualsSignKeyword_1_0() { return cLessOrEqualLessThanSignEqualsSignKeyword_1_0; }

		//Equal="=="
		public EnumLiteralDeclaration getEqualEnumLiteralDeclaration_2() { return cEqualEnumLiteralDeclaration_2; }

		//"=="
		public Keyword getEqualEqualsSignEqualsSignKeyword_2_0() { return cEqualEqualsSignEqualsSignKeyword_2_0; }

		//GreaterOrEqual=">="
		public EnumLiteralDeclaration getGreaterOrEqualEnumLiteralDeclaration_3() { return cGreaterOrEqualEnumLiteralDeclaration_3; }

		//">="
		public Keyword getGreaterOrEqualGreaterThanSignEqualsSignKeyword_3_0() { return cGreaterOrEqualGreaterThanSignEqualsSignKeyword_3_0; }

		//Greater=">"
		public EnumLiteralDeclaration getGreaterEnumLiteralDeclaration_4() { return cGreaterEnumLiteralDeclaration_4; }

		//">"
		public Keyword getGreaterGreaterThanSignKeyword_4_0() { return cGreaterGreaterThanSignKeyword_4_0; }
	}
	
	private PlatformProfileElements pPlatformProfile;
	private ResourceElements pResource;
	private ConstraintElements pConstraint;
	private ResourceTypeElements unknownRuleResourceType;
	private ConstraintTypeElements unknownRuleConstraintType;
	private ConstraintOperationElements unknownRuleConstraintOperation;
	private TerminalRule tID;
	private TerminalRule tINT;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tWS;
	private TerminalRule tANY_OTHER;
	
	private final GrammarProvider grammarProvider;

	@Inject
	public ProfileGrammarAccess(GrammarProvider grammarProvider) {
		this.grammarProvider = grammarProvider;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	
	//PlatformProfile:
	//	{PlatformProfile} "profile" name=ID "{" ("resources" "{" resources+=Resource ("," resources+=Resource)* "}")?
	//	("constraints" "{" constraints+=Constraint ("," constraints+=Constraint)* "}")? "}";
	public PlatformProfileElements getPlatformProfileAccess() {
		return (pPlatformProfile != null) ? pPlatformProfile : (pPlatformProfile = new PlatformProfileElements());
	}
	
	public ParserRule getPlatformProfileRule() {
		return getPlatformProfileAccess().getRule();
	}

	//Resource:
	//	name=ID ":" type=ResourceType ("@" weight=INT)?;
	public ResourceElements getResourceAccess() {
		return (pResource != null) ? pResource : (pResource = new ResourceElements());
	}
	
	public ParserRule getResourceRule() {
		return getResourceAccess().getRule();
	}

	//Constraint:
	//	type=ConstraintType "(" references=[Resource] isDerivation?="\'"? ")" operation=ConstraintOperation bound=INT;
	public ConstraintElements getConstraintAccess() {
		return (pConstraint != null) ? pConstraint : (pConstraint = new ConstraintElements());
	}
	
	public ParserRule getConstraintRule() {
		return getConstraintAccess().getRule();
	}

	//enum ResourceType:
	//	cpu | memory | bandwidth | power | port;
	public ResourceTypeElements getResourceTypeAccess() {
		return (unknownRuleResourceType != null) ? unknownRuleResourceType : (unknownRuleResourceType = new ResourceTypeElements());
	}
	
	public EnumRule getResourceTypeRule() {
		return getResourceTypeAccess().getRule();
	}

	//enum ConstraintType:
	//	Minimum="min" | Maximum="max" | Average="avg";
	public ConstraintTypeElements getConstraintTypeAccess() {
		return (unknownRuleConstraintType != null) ? unknownRuleConstraintType : (unknownRuleConstraintType = new ConstraintTypeElements());
	}
	
	public EnumRule getConstraintTypeRule() {
		return getConstraintTypeAccess().getRule();
	}

	//enum ConstraintOperation:
	//	Less="<" | LessOrEqual="<=" | Equal="==" | GreaterOrEqual=">=" | Greater=">";
	public ConstraintOperationElements getConstraintOperationAccess() {
		return (unknownRuleConstraintOperation != null) ? unknownRuleConstraintOperation : (unknownRuleConstraintOperation = new ConstraintOperationElements());
	}
	
	public EnumRule getConstraintOperationRule() {
		return getConstraintOperationAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal INT returns ecore::EInt:
	//	"-"? "0".."9"+;
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	} 

	////terminal INT returns ecore::EInt: ('0'..'9')+ ;
	//
	////terminal STRING :
	//
	////'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	//
	////"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\') | !('\\'|"'") )* "'";
	//
	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return (tANY_OTHER != null) ? tANY_OTHER : (tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER"));
	} 
}
