// Generated from es/es/isa/sedl/module/statcharts/grammar/StatCharts.g4 by ANTLR 4.1
package es.es.isa.sedl.module.statcharts.grammar;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StatChartsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCATTERPLOT=1, HISTOGRAM=2, BOXPLOT=3, PIECHART=4, VS=5, SHOW=6, AND=7, 
		SIGMA_BANDS=8, NORMAL_DISTRIBUTION=9, WS=10, EXTENSION_POINT_CONTENT=11, 
		IMPORT=12, EXPERIMENT=13, TYPE=14, VERSION=15, REP=16, NOTES=17, ANNOTATIONS=18, 
		SUBJECTS=19, OBJECT=20, POPULATION=21, RESPONSIBLE=22, COLLABORATOR=23, 
		CONSTANTS=24, VARIABLES=25, FACTORS=26, NCFACTORS=27, OUTCOME=28, EXTRANEOUS=29, 
		MEASURED=30, ORDERED=31, ENUM=32, INTEGER=33, FLOAT=34, BOOL=35, RANGE_MIN_MAX=36, 
		HYPOTHESIS=37, DIFFERENTIAL=38, ASSOCIATIONAL=39, DESCRIPTIVE=40, DESIGN=41, 
		SAMPLING=42, ASSIGNMENT=43, DETAILED_DESIGN=44, BLOCKING=45, SIZING=46, 
		GROUPS=47, PROTOCOL=48, ANALYSES=49, OF=50, WHERE=51, FILTER=52, GROUPING=53, 
		PROJ=54, LINEAR=55, CUADRATIC=56, RANDOM=57, ADHOC=58, CONFIGURATION=59, 
		OUTPUTS=60, INPUTS=61, SETTING=62, PROCEDURE=63, RUNTIMES=64, LIBRARIES=65, 
		OPERATING_SYSTEM=66, COMMAND=67, TREATMENT=68, MEASUREMENT=69, FILE=70, 
		ROLE=71, FORMAT=72, MAPPING=73, RUNS=74, RESULT=75, PVALUE=76, DESCRIPTION=77, 
		STHRESHOLD=78, FREEDOM_DEGREES=79, PLUS=80, SIGNMIN=81, RRES=82, START=83, 
		END=84, N=85, Z=86, Q=87, R=88, I=89, C=90, MAX=91, MIN=92, MEAN=93, MODE=94, 
		MEDIAN=95, STDDEV=96, VARIANCE=97, IQR=98, RANGE=99, RANKING=100, CONFIDENCE_INTERVAL=101, 
		PEARSON=102, BIVARIATE_REGRESSION=103, SPEARMAN=104, KENDALL=105, CRAMER=106, 
		LOG_LINEAR=107, KOLMOGOROV_SMIRNOV=108, LILLIEFORS=109, SHAPIRO_WILK=110, 
		LEVENE=111, T_STUDENT=112, WILCOXON=113, MCNEMAR=114, ANOVA=115, FACTANOVAWRS=116, 
		FRIEDMAN=117, ALIGNED_FRIEDMAN=118, IMAN_DAVEPORT=119, QUADE=120, COCHRAN_Q=121, 
		BONFERRONI_DUNN=122, HOLMS=123, HOCHBERG=124, HOMMEL=125, HOLLAND=126, 
		ROM=127, FINNER=128, LI=129, SHAFFER=130, NAMENYI=131, TTEST=132, SIGN_TEST=133, 
		CHI_SQUARE=134, KRUSKAL=135, FISHER=136, TUKEY=137, PREPROCESSING=138, 
		PRETREATMENT=139, EXECUTION=140, POSTPROCESSING=141, MAIN_RESULT=142, 
		ADDITIONAL_EVIDENCE=143, MISCELLANEOUS=144, OPEN_PAR=145, CLOSE_PAR=146, 
		OPEN_BRA=147, CLOSE_BRA=148, OPEN_SQU_BRA=149, CLOSE_SQU_BRA=150, DOT=151, 
		FROM=152, AS=153, IS=154, IN=155, ON=156, IMPACTS=157, SIGNIFICANTLY=158, 
		BY=159, LINEARLY=160, LOGISTICALLY=161, CORRELATED=162, WITH=163, BAR=164, 
		EQUAL=165, Identifier=166, COMMENT=167, LINE_COMMENT=168, IntegerLiteral=169, 
		ExplicitVersionNumber=170, FloatingPointLiteral=171, BooleanLiteral=172, 
		CharacterLiteral=173, StringLiteral=174, Url=175, Email=176, COMMA=177, 
		COLON=178, DOUBLECOLON=179, ID=180;
	public static final String[] tokenNames = {
		"<INVALID>", "'ScatterPlot'", "'Histogram'", "'BoxPlot'", "'PieChart'", 
		"'VS'", "'show'", "'and'", "'sigma_bands'", "'normal_distribution'", "WS", 
		"EXTENSION_POINT_CONTENT", "'import'", "'EXPERIMENT'", "'type'", "'version'", 
		"'rep'", "'Notes'", "'Annotations'", "'Subjects'", "'Object'", "'Population'", 
		"'Responsible'", "'Collaborator'", "'Constants'", "'Variables'", "'Factors'", 
		"'NCFactors'", "'Outcome'", "'Extraneous'", "'measured'", "'ordered'", 
		"'enum'", "'integer'", "'float'", "'boolean'", "'range'", "'Hypothesis'", 
		"'Differential'", "'Associational'", "'Descriptive'", "'Design'", "'Sampling'", 
		"'Assignment'", "'Detailed_Design'", "'Blocking'", "'sizing'", "'Groups'", 
		"'Protocol'", "'Analyses'", "'of'", "'where'", "'Filter'", "'Grouping'", 
		"'Proj'", "'linear'", "'cuadratic'", "'Random'", "'Adhoc'", "'Configuration'", 
		"'Outputs'", "'Inputs'", "'Setting'", "'Procedure'", "'Runtimes'", "'Libraries'", 
		"'OperatingSystem'", "'Command'", "'Treatment'", "'Measurement'", "'File'", 
		"'role'", "'format'", "'mapping'", "'Runs'", "'Result'", "'Pvalue'", "'description'", 
		"'Sthreshold'", "'freedom_degrees'", "'+'", "'-'", "'r'", "'Start'", "'End'", 
		"'N'", "'Z'", "'Q'", "'R'", "'I'", "'C'", "'max'", "'min'", "'Avg'", "'Mode'", 
		"'Median'", "'StdDev'", "'Variance'", "'IQR'", "'Range'", "'Ranking'", 
		"'CI'", "'Pearson'", "'BivariateRegression'", "'Spearman'", "'Kendall'", 
		"'CRAMER'", "'LogLinear'", "'Kolmogorov-Smirnov'", "'Lilliefors'", "'Shapiro-Wilk'", 
		"'Levene'", "'T-student'", "'Wilcoxon'", "'McNemar'", "'ANOVA'", "'FactANOVAwRS'", 
		"'Friedman'", "'Aligned Friedman'", "'Iman & Davenport'", "'Quade'", "'Cochran Q'", 
		"'Bonferroni-Dunn'", "'Holms'", "'Hochberg'", "'Hommel'", "'Holland'", 
		"'Rom'", "'Finner'", "'Li'", "'Shaffer'", "'Nemenyi'", "'TTest'", "'SignTest'", 
		"'Chi Square'", "'KruskalWalls'", "'Fisher'", "'Tukey'", "'Preprocessing'", 
		"'Pretreatment'", "'Execution'", "'Postprocessing'", "'MainResult'", "'AdditionalEvidence'", 
		"'Miscellaneous'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "'from'", 
		"'as'", "'is'", "'in'", "'on'", "'impacts'", "'significantly'", "'by'", 
		"'linearly'", "'logistically'", "'correlated'", "'with'", "'|'", "'='", 
		"Identifier", "COMMENT", "LINE_COMMENT", "IntegerLiteral", "ExplicitVersionNumber", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"Url", "Email", "','", "':'", "'::'", "ID"
	};
	public static final int
		RULE_chart = 0, RULE_chartType = 1, RULE_scatterPlot = 2, RULE_histogram = 3, 
		RULE_boxPlot = 4, RULE_pieChart = 5, RULE_datasetSpecification = 6, RULE_document = 7, 
		RULE_moduleImports = 8, RULE_moduleImport = 9, RULE_experimentPreamble = 10, 
		RULE_experimentType = 11, RULE_experimentContext = 12, RULE_notes = 13, 
		RULE_annotations = 14, RULE_subjects = 15, RULE_stakeholder = 16, RULE_stakeholderFrom = 17, 
		RULE_role = 18, RULE_object = 19, RULE_population = 20, RULE_constants = 21, 
		RULE_constantsBlock = 22, RULE_variables = 23, RULE_variablesBlock = 24, 
		RULE_factors = 25, RULE_ncfactors = 26, RULE_outcomes = 27, RULE_outcomeDeclaration = 28, 
		RULE_extraneous = 29, RULE_extraneousDeclaration = 30, RULE_factorDeclaration = 31, 
		RULE_factorDeclarationUnits = 32, RULE_factorDeclarationType = 33, RULE_enumDeclaration = 34, 
		RULE_functionalDeclaration = 35, RULE_factorDeclarationRange = 36, RULE_intervalLiteral = 37, 
		RULE_hypothesis = 38, RULE_hypothesisDeclaration = 39, RULE_differentialHypothesis = 40, 
		RULE_explicitDifferentialHypothesis = 41, RULE_factorList = 42, RULE_outcomeList = 43, 
		RULE_idList = 44, RULE_implicitDifferentialHypothesis = 45, RULE_associationalHypothesis = 46, 
		RULE_implicitAssociationalHypothesis = 47, RULE_explicitAssociationalHypothesis = 48, 
		RULE_outcome = 49, RULE_descriptiveHypothesis = 50, RULE_design = 51, 
		RULE_designBlock = 52, RULE_customDesignBlock = 53, RULE_designSampling = 54, 
		RULE_samplingType = 55, RULE_designAssignment = 56, RULE_designBlocking = 57, 
		RULE_detailedDesign = 58, RULE_groups = 59, RULE_groupsExpresion = 60, 
		RULE_sizingSentence = 61, RULE_protocol = 62, RULE_explicitProtocol = 63, 
		RULE_protocolStep = 64, RULE_measurement = 65, RULE_treatment = 66, RULE_analyses = 67, 
		RULE_analysesBlocks = 68, RULE_analysesBlock = 69, RULE_statisticFunction = 70, 
		RULE_rankingSF = 71, RULE_rFunction = 72, RULE_centralTendencyMeasurementSF = 73, 
		RULE_ctmFunction = 74, RULE_variabilityMeasureSF = 75, RULE_vmFunction = 76, 
		RULE_confidenceIntervalSF = 77, RULE_ciFunction = 78, RULE_correlationCoeficientSF = 79, 
		RULE_ccFunction = 80, RULE_nhstSF = 81, RULE_nhstFunction = 82, RULE_statisticFunctionParam = 83, 
		RULE_statisticFunctionParamVariable = 84, RULE_assignment = 85, RULE_statisticFunctionValue = 86, 
		RULE_statisticFunctionFilter = 87, RULE_oldStatisticFunctionFilter = 88, 
		RULE_newStatisticFunctionFilter = 89, RULE_ofDSSpec = 90, RULE_whereDSSpec = 91, 
		RULE_byDSSpec = 92, RULE_filter = 93, RULE_grouping = 94, RULE_projection = 95, 
		RULE_configuration = 96, RULE_configurationBlock = 97, RULE_singleConf = 98, 
		RULE_inputs = 99, RULE_outputs = 100, RULE_files = 101, RULE_file = 102, 
		RULE_roles = 103, RULE_format = 104, RULE_mapping = 105, RULE_settings = 106, 
		RULE_runtimes = 107, RULE_runtime = 108, RULE_libraries = 109, RULE_library = 110, 
		RULE_experimentalProcedure = 111, RULE_unstructuredProcedureDefinition = 112, 
		RULE_procedureStep = 113, RULE_procDef = 114, RULE_procedureStepType = 115, 
		RULE_treatmentStep = 116, RULE_measurementStep = 117, RULE_postprocestingStep = 118, 
		RULE_extensionPointStep = 119, RULE_preprocessingStep = 120, RULE_procBody = 121, 
		RULE_structuredProcedureDefinition = 122, RULE_preProcessingDefinition = 123, 
		RULE_pretreatmentClause = 124, RULE_executionProcedureDefinition = 125, 
		RULE_postProcessing = 126, RULE_execution = 127, RULE_executionBlock = 128, 
		RULE_executionConf = 129, RULE_execStart = 130, RULE_execEnd = 131, RULE_resultExecution = 132, 
		RULE_analysesExecution = 133, RULE_analysesExecBlock = 134, RULE_analFunctions = 135, 
		RULE_exeFunction = 136, RULE_values = 137, RULE_exeFunctionTypes = 138, 
		RULE_exeDescription = 139, RULE_exeArguments = 140, RULE_otherParam = 141, 
		RULE_arg = 142, RULE_exeValuation = 143, RULE_fileExec = 144, RULE_freedom_degrees = 145, 
		RULE_fdParam = 146, RULE_bodyTempDiff = 147, RULE_pairIV = 148, RULE_pair = 149, 
		RULE_friedmanFunction = 150, RULE_pearsonFunction = 151, RULE_regresionBlock = 152, 
		RULE_regresion = 153, RULE_id = 154, RULE_email = 155, RULE_versionNumber = 156, 
		RULE_url = 157, RULE_repUrl = 158, RULE_value = 159, RULE_type = 160, 
		RULE_structValue = 161, RULE_fields = 162, RULE_field = 163, RULE_numericSet = 164, 
		RULE_extensionPoint = 165;
	public static final String[] ruleNames = {
		"chart", "chartType", "scatterPlot", "histogram", "boxPlot", "pieChart", 
		"datasetSpecification", "document", "moduleImports", "moduleImport", "experimentPreamble", 
		"experimentType", "experimentContext", "notes", "annotations", "subjects", 
		"stakeholder", "stakeholderFrom", "role", "object", "population", "constants", 
		"constantsBlock", "variables", "variablesBlock", "factors", "ncfactors", 
		"outcomes", "outcomeDeclaration", "extraneous", "extraneousDeclaration", 
		"factorDeclaration", "factorDeclarationUnits", "factorDeclarationType", 
		"enumDeclaration", "functionalDeclaration", "factorDeclarationRange", 
		"intervalLiteral", "hypothesis", "hypothesisDeclaration", "differentialHypothesis", 
		"explicitDifferentialHypothesis", "factorList", "outcomeList", "idList", 
		"implicitDifferentialHypothesis", "associationalHypothesis", "implicitAssociationalHypothesis", 
		"explicitAssociationalHypothesis", "outcome", "descriptiveHypothesis", 
		"design", "designBlock", "customDesignBlock", "designSampling", "samplingType", 
		"designAssignment", "designBlocking", "detailedDesign", "groups", "groupsExpresion", 
		"sizingSentence", "protocol", "explicitProtocol", "protocolStep", "measurement", 
		"treatment", "analyses", "analysesBlocks", "analysesBlock", "statisticFunction", 
		"rankingSF", "rFunction", "centralTendencyMeasurementSF", "ctmFunction", 
		"variabilityMeasureSF", "vmFunction", "confidenceIntervalSF", "ciFunction", 
		"correlationCoeficientSF", "ccFunction", "nhstSF", "nhstFunction", "statisticFunctionParam", 
		"statisticFunctionParamVariable", "assignment", "statisticFunctionValue", 
		"statisticFunctionFilter", "oldStatisticFunctionFilter", "newStatisticFunctionFilter", 
		"ofDSSpec", "whereDSSpec", "byDSSpec", "filter", "grouping", "projection", 
		"configuration", "configurationBlock", "singleConf", "inputs", "outputs", 
		"files", "file", "roles", "format", "mapping", "settings", "runtimes", 
		"runtime", "libraries", "library", "experimentalProcedure", "unstructuredProcedureDefinition", 
		"procedureStep", "procDef", "procedureStepType", "treatmentStep", "measurementStep", 
		"postprocestingStep", "extensionPointStep", "preprocessingStep", "procBody", 
		"structuredProcedureDefinition", "preProcessingDefinition", "pretreatmentClause", 
		"executionProcedureDefinition", "postProcessing", "execution", "executionBlock", 
		"executionConf", "execStart", "execEnd", "resultExecution", "analysesExecution", 
		"analysesExecBlock", "analFunctions", "exeFunction", "values", "exeFunctionTypes", 
		"exeDescription", "exeArguments", "otherParam", "arg", "exeValuation", 
		"fileExec", "freedom_degrees", "fdParam", "bodyTempDiff", "pairIV", "pair", 
		"friedmanFunction", "pearsonFunction", "regresionBlock", "regresion", 
		"id", "email", "versionNumber", "url", "repUrl", "value", "type", "structValue", 
		"fields", "field", "numericSet", "extensionPoint"
	};

	@Override
	public String getGrammarFileName() { return "StatCharts.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	       


	       private boolean parsingVariables=false;
	       private Map<String, Object> constants=new HashMap<String,Object>();
	       private Map<String, Object> variables = new HashMap<String,Object>();
	       private List<String> importedModules = new ArrayList<String>();
	       
	       public List<String> getImportedModules(){return importedModules;}       
	       public Map<String, Object> getVariables(){return variables;}
	       public Map<String, Object> getConstants(){return constants;}

	public StatChartsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StatChartsParser.EOF, 0); }
		public ChartTypeContext chartType() {
			return getRuleContext(ChartTypeContext.class,0);
		}
		public ChartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterChart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitChart(this);
		}
	}

	public final ChartContext chart() throws RecognitionException {
		ChartContext _localctx = new ChartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); chartType();
			setState(333); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChartTypeContext extends ParserRuleContext {
		public PieChartContext pieChart() {
			return getRuleContext(PieChartContext.class,0);
		}
		public HistogramContext histogram() {
			return getRuleContext(HistogramContext.class,0);
		}
		public ScatterPlotContext scatterPlot() {
			return getRuleContext(ScatterPlotContext.class,0);
		}
		public BoxPlotContext boxPlot() {
			return getRuleContext(BoxPlotContext.class,0);
		}
		public ChartTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chartType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterChartType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitChartType(this);
		}
	}

	public final ChartTypeContext chartType() throws RecognitionException {
		ChartTypeContext _localctx = new ChartTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_chartType);
		try {
			setState(339);
			switch (_input.LA(1)) {
			case SCATTERPLOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(335); scatterPlot();
				}
				break;
			case HISTOGRAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); histogram();
				}
				break;
			case BOXPLOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(337); boxPlot();
				}
				break;
			case PIECHART:
				enterOuterAlt(_localctx, 4);
				{
				setState(338); pieChart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScatterPlotContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StatChartsParser.ID, 0); }
		public DatasetSpecificationContext datasetSpecification() {
			return getRuleContext(DatasetSpecificationContext.class,0);
		}
		public TerminalNode VS() { return getToken(StatChartsParser.VS, 0); }
		public TerminalNode SCATTERPLOT() { return getToken(StatChartsParser.SCATTERPLOT, 0); }
		public ScatterPlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scatterPlot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterScatterPlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitScatterPlot(this);
		}
	}

	public final ScatterPlotContext scatterPlot() throws RecognitionException {
		ScatterPlotContext _localctx = new ScatterPlotContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scatterPlot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); match(SCATTERPLOT);
			setState(342); datasetSpecification();
			setState(343); match(VS);
			setState(344); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HistogramContext extends ParserRuleContext {
		public TerminalNode HISTOGRAM() { return getToken(StatChartsParser.HISTOGRAM, 0); }
		public TerminalNode SHOW() { return getToken(StatChartsParser.SHOW, 0); }
		public DatasetSpecificationContext datasetSpecification() {
			return getRuleContext(DatasetSpecificationContext.class,0);
		}
		public TerminalNode AND() { return getToken(StatChartsParser.AND, 0); }
		public TerminalNode NORMAL_DISTRIBUTION() { return getToken(StatChartsParser.NORMAL_DISTRIBUTION, 0); }
		public TerminalNode SIGMA_BANDS() { return getToken(StatChartsParser.SIGMA_BANDS, 0); }
		public HistogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_histogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterHistogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitHistogram(this);
		}
	}

	public final HistogramContext histogram() throws RecognitionException {
		HistogramContext _localctx = new HistogramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_histogram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(HISTOGRAM);
			setState(347); datasetSpecification();
			setState(355);
			_la = _input.LA(1);
			if (_la==SHOW) {
				{
				setState(348); match(SHOW);
				setState(353);
				switch (_input.LA(1)) {
				case SIGMA_BANDS:
					{
					setState(349); match(SIGMA_BANDS);
					{
					setState(350); match(AND);
					setState(351); match(NORMAL_DISTRIBUTION);
					}
					}
					break;
				case NORMAL_DISTRIBUTION:
					{
					setState(352); match(NORMAL_DISTRIBUTION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoxPlotContext extends ParserRuleContext {
		public DatasetSpecificationContext datasetSpecification() {
			return getRuleContext(DatasetSpecificationContext.class,0);
		}
		public TerminalNode BOXPLOT() { return getToken(StatChartsParser.BOXPLOT, 0); }
		public BoxPlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxPlot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterBoxPlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitBoxPlot(this);
		}
	}

	public final BoxPlotContext boxPlot() throws RecognitionException {
		BoxPlotContext _localctx = new BoxPlotContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boxPlot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(BOXPLOT);
			setState(358); datasetSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieChartContext extends ParserRuleContext {
		public DatasetSpecificationContext datasetSpecification() {
			return getRuleContext(DatasetSpecificationContext.class,0);
		}
		public TerminalNode PIECHART() { return getToken(StatChartsParser.PIECHART, 0); }
		public PieChartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieChart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPieChart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPieChart(this);
		}
	}

	public final PieChartContext pieChart() throws RecognitionException {
		PieChartContext _localctx = new PieChartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pieChart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(PIECHART);
			setState(361); datasetSpecification();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatasetSpecificationContext extends ParserRuleContext {
		public StatisticFunctionFilterContext statisticFunctionFilter() {
			return getRuleContext(StatisticFunctionFilterContext.class,0);
		}
		public DatasetSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDatasetSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDatasetSpecification(this);
		}
	}

	public final DatasetSpecificationContext datasetSpecification() throws RecognitionException {
		DatasetSpecificationContext _localctx = new DatasetSpecificationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_datasetSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); statisticFunctionFilter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public HypothesisContext hypothesis() {
			return getRuleContext(HypothesisContext.class,0);
		}
		public DesignContext design() {
			return getRuleContext(DesignContext.class,0);
		}
		public TerminalNode EOF() { return getToken(StatChartsParser.EOF, 0); }
		public ExperimentPreambleContext experimentPreamble() {
			return getRuleContext(ExperimentPreambleContext.class,0);
		}
		public ModuleImportsContext moduleImports() {
			return getRuleContext(ModuleImportsContext.class,0);
		}
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public ConfigurationContext configuration() {
			return getRuleContext(ConfigurationContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); moduleImports();
			setState(366); experimentPreamble();
			setState(368);
			_la = _input.LA(1);
			if (_la==CONSTANTS) {
				{
				setState(367); constants();
				}
			}

			setState(370); variables();
			setState(371); hypothesis();
			setState(372); design();
			setState(374);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(373); configuration();
				}
			}

			setState(376); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleImportsContext extends ParserRuleContext {
		public ModuleImportContext moduleImport(int i) {
			return getRuleContext(ModuleImportContext.class,i);
		}
		public List<ModuleImportContext> moduleImport() {
			return getRuleContexts(ModuleImportContext.class);
		}
		public ModuleImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleImports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterModuleImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitModuleImports(this);
		}
	}

	public final ModuleImportsContext moduleImports() throws RecognitionException {
		ModuleImportsContext _localctx = new ModuleImportsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleImports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(378); moduleImport();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleImportContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StatChartsParser.Identifier, 0); }
		public TerminalNode IMPORT() { return getToken(StatChartsParser.IMPORT, 0); }
		public ModuleImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterModuleImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitModuleImport(this);
		}
	}

	public final ModuleImportContext moduleImport() throws RecognitionException {
		ModuleImportContext _localctx = new ModuleImportContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_moduleImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(IMPORT);
			setState(385); match(Identifier);
			importedModules.add(_localctx.Identifier().getText());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentPreambleContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(StatChartsParser.VERSION, 0); }
		public TerminalNode TYPE() { return getToken(StatChartsParser.TYPE, 0); }
		public TerminalNode COLON(int i) {
			return getToken(StatChartsParser.COLON, i);
		}
		public ExperimentContextContext experimentContext() {
			return getRuleContext(ExperimentContextContext.class,0);
		}
		public TerminalNode REP() { return getToken(StatChartsParser.REP, 0); }
		public List<TerminalNode> COLON() { return getTokens(StatChartsParser.COLON); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public TerminalNode EXPERIMENT() { return getToken(StatChartsParser.EXPERIMENT, 0); }
		public RepUrlContext repUrl() {
			return getRuleContext(RepUrlContext.class,0);
		}
		public ExperimentTypeContext experimentType() {
			return getRuleContext(ExperimentTypeContext.class,0);
		}
		public ExperimentPreambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentPreamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExperimentPreamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExperimentPreamble(this);
		}
	}

	public final ExperimentPreambleContext experimentPreamble() throws RecognitionException {
		ExperimentPreambleContext _localctx = new ExperimentPreambleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_experimentPreamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(EXPERIMENT);
			setState(389); match(COLON);
			setState(390); id();
			setState(394);
			_la = _input.LA(1);
			if (_la==VERSION) {
				{
				setState(391); match(VERSION);
				setState(392); match(COLON);
				setState(393); versionNumber();
				}
			}

			setState(399);
			_la = _input.LA(1);
			if (_la==REP) {
				{
				setState(396); match(REP);
				setState(397); match(COLON);
				setState(398); repUrl();
				}
			}

			setState(404);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(401); match(TYPE);
				setState(402); match(COLON);
				setState(403); experimentType();
				}
			}

			setState(406); experimentContext();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentTypeContext extends ParserRuleContext {
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public ExperimentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExperimentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExperimentType(this);
		}
	}

	public final ExperimentTypeContext experimentType() throws RecognitionException {
		ExperimentTypeContext _localctx = new ExperimentTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_experimentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); extensionPoint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentContextContext extends ParserRuleContext {
		public PopulationContext population() {
			return getRuleContext(PopulationContext.class,0);
		}
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public SubjectsContext subjects() {
			return getRuleContext(SubjectsContext.class,0);
		}
		public ExperimentContextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentContext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExperimentContext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExperimentContext(this);
		}
	}

	public final ExperimentContextContext experimentContext() throws RecognitionException {
		ExperimentContextContext _localctx = new ExperimentContextContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_experimentContext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if (_la==NOTES) {
				{
				setState(410); notes();
				}
			}

			setState(414);
			_la = _input.LA(1);
			if (_la==ANNOTATIONS) {
				{
				setState(413); annotations();
				}
			}

			setState(417);
			_la = _input.LA(1);
			if (_la==SUBJECTS) {
				{
				setState(416); subjects();
				}
			}

			setState(420);
			_la = _input.LA(1);
			if (_la==OBJECT) {
				{
				setState(419); object();
				}
			}

			setState(423);
			_la = _input.LA(1);
			if (_la==POPULATION) {
				{
				setState(422); population();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotesContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(StatChartsParser.StringLiteral); }
		public TerminalNode NOTES() { return getToken(StatChartsParser.NOTES, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode StringLiteral(int i) {
			return getToken(StatChartsParser.StringLiteral, i);
		}
		public NotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterNotes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitNotes(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_notes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); match(NOTES);
			setState(426); match(COLON);
			setState(428); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(427); match(StringLiteral);
				}
				}
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(StatChartsParser.StringLiteral); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode ANNOTATIONS() { return getToken(StatChartsParser.ANNOTATIONS, 0); }
		public TerminalNode StringLiteral(int i) {
			return getToken(StatChartsParser.StringLiteral, i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAnnotations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAnnotations(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_annotations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); match(ANNOTATIONS);
			setState(433); match(COLON);
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(434); match(StringLiteral);
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode SUBJECTS() { return getToken(StatChartsParser.SUBJECTS, 0); }
		public StakeholderContext stakeholder(int i) {
			return getRuleContext(StakeholderContext.class,i);
		}
		public List<StakeholderContext> stakeholder() {
			return getRuleContexts(StakeholderContext.class);
		}
		public SubjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterSubjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitSubjects(this);
		}
	}

	public final SubjectsContext subjects() throws RecognitionException {
		SubjectsContext _localctx = new SubjectsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subjects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(SUBJECTS);
			setState(440); match(COLON);
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(441); stakeholder();
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StakeholderContext extends ParserRuleContext {
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public StakeholderFromContext stakeholderFrom() {
			return getRuleContext(StakeholderFromContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode AS() { return getToken(StatChartsParser.AS, 0); }
		public StakeholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stakeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStakeholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStakeholder(this);
		}
	}

	public final StakeholderContext stakeholder() throws RecognitionException {
		StakeholderContext _localctx = new StakeholderContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stakeholder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446); id();
			setState(447); match(OPEN_PAR);
			setState(448); email();
			setState(449); match(CLOSE_PAR);
			setState(451);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(450); stakeholderFrom();
				}
			}

			setState(455);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(453); match(AS);
				setState(454); role();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StakeholderFromContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode FROM() { return getToken(StatChartsParser.FROM, 0); }
		public StakeholderFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stakeholderFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStakeholderFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStakeholderFrom(this);
		}
	}

	public final StakeholderFromContext stakeholderFrom() throws RecognitionException {
		StakeholderFromContext _localctx = new StakeholderFromContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stakeholderFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(FROM);
			setState(458); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleContext extends ParserRuleContext {
		public TerminalNode COLLABORATOR() { return getToken(StatChartsParser.COLLABORATOR, 0); }
		public TerminalNode RESPONSIBLE() { return getToken(StatChartsParser.RESPONSIBLE, 0); }
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRole(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_role);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==RESPONSIBLE || _la==COLLABORATOR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(StatChartsParser.OBJECT, 0); }
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); match(OBJECT);
			setState(463); match(COLON);
			setState(464); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PopulationContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode POPULATION() { return getToken(StatChartsParser.POPULATION, 0); }
		public PopulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_population; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPopulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPopulation(this);
		}
	}

	public final PopulationContext population() throws RecognitionException {
		PopulationContext _localctx = new PopulationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_population);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); match(POPULATION);
			setState(467); match(COLON);
			setState(468); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantsContext extends ParserRuleContext {
		public ConstantsBlockContext constantsBlock() {
			return getRuleContext(ConstantsBlockContext.class,0);
		}
		public TerminalNode CONSTANTS() { return getToken(StatChartsParser.CONSTANTS, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitConstants(this);
		}
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); match(CONSTANTS);
			setState(471); match(COLON);
			setState(472); constantsBlock();
			parsingVariables=false;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantsBlockContext extends ParserRuleContext {
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public ConstantsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterConstantsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitConstantsBlock(this);
		}
	}

	public final ConstantsBlockContext constantsBlock() throws RecognitionException {
		ConstantsBlockContext _localctx = new ConstantsBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constantsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(475); field();
				}
				}
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(StatChartsParser.VARIABLES, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public VariablesBlockContext variablesBlock() {
			return getRuleContext(VariablesBlockContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480); match(VARIABLES);
			setState(481); match(COLON);
			setState(482); variablesBlock();
			parsingVariables=true;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesBlockContext extends ParserRuleContext {
		public FactorsContext factors() {
			return getRuleContext(FactorsContext.class,0);
		}
		public ExtraneousContext extraneous() {
			return getRuleContext(ExtraneousContext.class,0);
		}
		public NcfactorsContext ncfactors() {
			return getRuleContext(NcfactorsContext.class,0);
		}
		public OutcomesContext outcomes() {
			return getRuleContext(OutcomesContext.class,0);
		}
		public VariablesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterVariablesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitVariablesBlock(this);
		}
	}

	public final VariablesBlockContext variablesBlock() throws RecognitionException {
		VariablesBlockContext _localctx = new VariablesBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variablesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			_la = _input.LA(1);
			if (_la==FACTORS) {
				{
				setState(485); factors();
				}
			}

			setState(489);
			_la = _input.LA(1);
			if (_la==NCFACTORS) {
				{
				setState(488); ncfactors();
				}
			}

			setState(492);
			_la = _input.LA(1);
			if (_la==OUTCOME) {
				{
				setState(491); outcomes();
				}
			}

			setState(495);
			_la = _input.LA(1);
			if (_la==EXTRANEOUS) {
				{
				setState(494); extraneous();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorsContext extends ParserRuleContext {
		public TerminalNode FACTORS() { return getToken(StatChartsParser.FACTORS, 0); }
		public List<FactorDeclarationContext> factorDeclaration() {
			return getRuleContexts(FactorDeclarationContext.class);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public FactorDeclarationContext factorDeclaration(int i) {
			return getRuleContext(FactorDeclarationContext.class,i);
		}
		public FactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFactors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFactors(this);
		}
	}

	public final FactorsContext factors() throws RecognitionException {
		FactorsContext _localctx = new FactorsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(FACTORS);
			setState(498); match(COLON);
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499); factorDeclaration();
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NcfactorsContext extends ParserRuleContext {
		public List<FactorDeclarationContext> factorDeclaration() {
			return getRuleContexts(FactorDeclarationContext.class);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public FactorDeclarationContext factorDeclaration(int i) {
			return getRuleContext(FactorDeclarationContext.class,i);
		}
		public TerminalNode NCFACTORS() { return getToken(StatChartsParser.NCFACTORS, 0); }
		public NcfactorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ncfactors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterNcfactors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitNcfactors(this);
		}
	}

	public final NcfactorsContext ncfactors() throws RecognitionException {
		NcfactorsContext _localctx = new NcfactorsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ncfactors);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504); match(NCFACTORS);
			setState(505); match(COLON);
			setState(507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(506); factorDeclaration();
				}
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomesContext extends ParserRuleContext {
		public TerminalNode OUTCOME() { return getToken(StatChartsParser.OUTCOME, 0); }
		public List<OutcomeDeclarationContext> outcomeDeclaration() {
			return getRuleContexts(OutcomeDeclarationContext.class);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public OutcomeDeclarationContext outcomeDeclaration(int i) {
			return getRuleContext(OutcomeDeclarationContext.class,i);
		}
		public OutcomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOutcomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOutcomes(this);
		}
	}

	public final OutcomesContext outcomes() throws RecognitionException {
		OutcomesContext _localctx = new OutcomesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_outcomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); match(OUTCOME);
			setState(512); match(COLON);
			setState(514); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513); outcomeDeclaration();
				}
				}
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeDeclarationContext extends ParserRuleContext {
		public FactorDeclarationContext factorDeclaration() {
			return getRuleContext(FactorDeclarationContext.class,0);
		}
		public OutcomeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcomeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOutcomeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOutcomeDeclaration(this);
		}
	}

	public final OutcomeDeclarationContext outcomeDeclaration() throws RecognitionException {
		OutcomeDeclarationContext _localctx = new OutcomeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_outcomeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); factorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtraneousContext extends ParserRuleContext {
		public ExtraneousDeclarationContext extraneousDeclaration(int i) {
			return getRuleContext(ExtraneousDeclarationContext.class,i);
		}
		public TerminalNode EXTRANEOUS() { return getToken(StatChartsParser.EXTRANEOUS, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public List<ExtraneousDeclarationContext> extraneousDeclaration() {
			return getRuleContexts(ExtraneousDeclarationContext.class);
		}
		public ExtraneousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraneous; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExtraneous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExtraneous(this);
		}
	}

	public final ExtraneousContext extraneous() throws RecognitionException {
		ExtraneousContext _localctx = new ExtraneousContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_extraneous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); match(EXTRANEOUS);
			setState(521); match(COLON);
			setState(523); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(522); extraneousDeclaration();
				}
				}
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtraneousDeclarationContext extends ParserRuleContext {
		public List<FactorDeclarationContext> factorDeclaration() {
			return getRuleContexts(FactorDeclarationContext.class);
		}
		public FactorDeclarationContext factorDeclaration(int i) {
			return getRuleContext(FactorDeclarationContext.class,i);
		}
		public ExtraneousDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraneousDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExtraneousDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExtraneousDeclaration(this);
		}
	}

	public final ExtraneousDeclarationContext extraneousDeclaration() throws RecognitionException {
		ExtraneousDeclarationContext _localctx = new ExtraneousDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_extraneousDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(527); factorDeclaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(530); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationContext extends ParserRuleContext {
		public FactorDeclarationUnitsContext factorDeclarationUnits() {
			return getRuleContext(FactorDeclarationUnitsContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FactorDeclarationRangeContext factorDeclarationRange() {
			return getRuleContext(FactorDeclarationRangeContext.class,0);
		}
		public FactorDeclarationTypeContext factorDeclarationType() {
			return getRuleContext(FactorDeclarationTypeContext.class,0);
		}
		public FactorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFactorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFactorDeclaration(this);
		}
	}

	public final FactorDeclarationContext factorDeclaration() throws RecognitionException {
		FactorDeclarationContext _localctx = new FactorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); id();
			setState(533); factorDeclarationType();
			setState(535);
			_la = _input.LA(1);
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (RANGE_MIN_MAX - 36)) | (1L << (MAX - 36)) | (1L << (MIN - 36)))) != 0)) {
				{
				setState(534); factorDeclarationRange();
				}
			}

			setState(538);
			_la = _input.LA(1);
			if (_la==MEASURED) {
				{
				setState(537); factorDeclarationUnits();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationUnitsContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode MEASURED() { return getToken(StatChartsParser.MEASURED, 0); }
		public TerminalNode IN() { return getToken(StatChartsParser.IN, 0); }
		public FactorDeclarationUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclarationUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFactorDeclarationUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFactorDeclarationUnits(this);
		}
	}

	public final FactorDeclarationUnitsContext factorDeclarationUnits() throws RecognitionException {
		FactorDeclarationUnitsContext _localctx = new FactorDeclarationUnitsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factorDeclarationUnits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); match(MEASURED);
			setState(541); match(IN);
			setState(542); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationTypeContext extends ParserRuleContext {
		public TerminalNode ORDERED() { return getToken(StatChartsParser.ORDERED, 0); }
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NumericSetContext numericSet() {
			return getRuleContext(NumericSetContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(StatChartsParser.ENUM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IN() { return getToken(StatChartsParser.IN, 0); }
		public FactorDeclarationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclarationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFactorDeclarationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFactorDeclarationType(this);
		}
	}

	public final FactorDeclarationTypeContext factorDeclarationType() throws RecognitionException {
		FactorDeclarationTypeContext _localctx = new FactorDeclarationTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_factorDeclarationType);
		int _la;
		try {
			setState(552);
			switch (_input.LA(1)) {
			case ORDERED:
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				_la = _input.LA(1);
				if (_la==ORDERED) {
					{
					setState(544); match(ORDERED);
					}
				}

				setState(547); match(ENUM);
				setState(548); enumDeclaration();
				}
				break;
			case INTEGER:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(549); type();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 3);
				{
				setState(550); match(IN);
				setState(551); numericSet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(StatChartsParser.StringLiteral); }
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode FloatingPointLiteral(int i) {
			return getToken(StatChartsParser.FloatingPointLiteral, i);
		}
		public List<TerminalNode> IntegerLiteral() { return getTokens(StatChartsParser.IntegerLiteral); }
		public FunctionalDeclarationContext functionalDeclaration(int i) {
			return getRuleContext(FunctionalDeclarationContext.class,i);
		}
		public List<TerminalNode> FloatingPointLiteral() { return getTokens(StatChartsParser.FloatingPointLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(StatChartsParser.StringLiteral, i);
		}
		public TerminalNode IntegerLiteral(int i) {
			return getToken(StatChartsParser.IntegerLiteral, i);
		}
		public List<FunctionalDeclarationContext> functionalDeclaration() {
			return getRuleContexts(FunctionalDeclarationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_enumDeclaration);
		int _la;
		try {
			setState(582);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(554); match(StringLiteral);
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(555); match(COMMA);
					setState(556); match(StringLiteral);
					}
					}
					setState(559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(561); match(IntegerLiteral);
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(562); match(COMMA);
					setState(563); match(IntegerLiteral);
					}
					}
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(568); match(FloatingPointLiteral);
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(569); match(COMMA);
					setState(570); match(FloatingPointLiteral);
					}
					}
					setState(573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(575); functionalDeclaration();
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(576); match(COMMA);
					setState(577); functionalDeclaration();
					}
					}
					setState(580); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionalDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public FunctionalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFunctionalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFunctionalDeclaration(this);
		}
	}

	public final FunctionalDeclarationContext functionalDeclaration() throws RecognitionException {
		FunctionalDeclarationContext _localctx = new FunctionalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionalDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); id();
			setState(585); match(OPEN_PAR);
			setState(587);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(586); fields();
				}
			}

			setState(589); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorDeclarationRangeContext extends ParserRuleContext {
		public TerminalNode MIN() { return getToken(StatChartsParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(StatChartsParser.MAX, 0); }
		public IntervalLiteralContext intervalLiteral(int i) {
			return getRuleContext(IntervalLiteralContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(StatChartsParser.COMMA, 0); }
		public TerminalNode CLOSE_SQU_BRA() { return getToken(StatChartsParser.CLOSE_SQU_BRA, 0); }
		public TerminalNode OPEN_SQU_BRA() { return getToken(StatChartsParser.OPEN_SQU_BRA, 0); }
		public List<IntervalLiteralContext> intervalLiteral() {
			return getRuleContexts(IntervalLiteralContext.class);
		}
		public TerminalNode RANGE_MIN_MAX() { return getToken(StatChartsParser.RANGE_MIN_MAX, 0); }
		public FactorDeclarationRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorDeclarationRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFactorDeclarationRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFactorDeclarationRange(this);
		}
	}

	public final FactorDeclarationRangeContext factorDeclarationRange() throws RecognitionException {
		FactorDeclarationRangeContext _localctx = new FactorDeclarationRangeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factorDeclarationRange);
		try {
			setState(602);
			switch (_input.LA(1)) {
			case RANGE_MIN_MAX:
				enterOuterAlt(_localctx, 1);
				{
				setState(591); match(RANGE_MIN_MAX);
				setState(592); match(OPEN_SQU_BRA);
				setState(593); intervalLiteral();
				setState(594); match(COMMA);
				setState(595); intervalLiteral();
				setState(596); match(CLOSE_SQU_BRA);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(598); match(MIN);
				setState(599); intervalLiteral();
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(600); match(MAX);
				setState(601); intervalLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(StatChartsParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(StatChartsParser.FloatingPointLiteral, 0); }
		public IntervalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitIntervalLiteral(this);
		}
	}

	public final IntervalLiteralContext intervalLiteral() throws RecognitionException {
		IntervalLiteralContext _localctx = new IntervalLiteralContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_intervalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if ( !(_la==IntegerLiteral || _la==FloatingPointLiteral) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HypothesisContext extends ParserRuleContext {
		public TerminalNode HYPOTHESIS() { return getToken(StatChartsParser.HYPOTHESIS, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public List<HypothesisDeclarationContext> hypothesisDeclaration() {
			return getRuleContexts(HypothesisDeclarationContext.class);
		}
		public HypothesisDeclarationContext hypothesisDeclaration(int i) {
			return getRuleContext(HypothesisDeclarationContext.class,i);
		}
		public HypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitHypothesis(this);
		}
	}

	public final HypothesisContext hypothesis() throws RecognitionException {
		HypothesisContext _localctx = new HypothesisContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_hypothesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); match(HYPOTHESIS);
			setState(607); match(COLON);
			setState(609); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(608); hypothesisDeclaration();
				}
				}
				setState(611); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIFFERENTIAL) | (1L << ASSOCIATIONAL) | (1L << DESCRIPTIVE))) != 0) || _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HypothesisDeclarationContext extends ParserRuleContext {
		public AssociationalHypothesisContext associationalHypothesis() {
			return getRuleContext(AssociationalHypothesisContext.class,0);
		}
		public DifferentialHypothesisContext differentialHypothesis() {
			return getRuleContext(DifferentialHypothesisContext.class,0);
		}
		public DescriptiveHypothesisContext descriptiveHypothesis() {
			return getRuleContext(DescriptiveHypothesisContext.class,0);
		}
		public HypothesisDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hypothesisDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterHypothesisDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitHypothesisDeclaration(this);
		}
	}

	public final HypothesisDeclarationContext hypothesisDeclaration() throws RecognitionException {
		HypothesisDeclarationContext _localctx = new HypothesisDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hypothesisDeclaration);
		try {
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613); differentialHypothesis();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614); associationalHypothesis();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615); descriptiveHypothesis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DifferentialHypothesisContext extends ParserRuleContext {
		public ImplicitDifferentialHypothesisContext implicitDifferentialHypothesis() {
			return getRuleContext(ImplicitDifferentialHypothesisContext.class,0);
		}
		public ExplicitDifferentialHypothesisContext explicitDifferentialHypothesis() {
			return getRuleContext(ExplicitDifferentialHypothesisContext.class,0);
		}
		public DifferentialHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_differentialHypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDifferentialHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDifferentialHypothesis(this);
		}
	}

	public final DifferentialHypothesisContext differentialHypothesis() throws RecognitionException {
		DifferentialHypothesisContext _localctx = new DifferentialHypothesisContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_differentialHypothesis);
		try {
			setState(620);
			switch (_input.LA(1)) {
			case DIFFERENTIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(618); implicitDifferentialHypothesis();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(619); explicitDifferentialHypothesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitDifferentialHypothesisContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(StatChartsParser.ON, 0); }
		public FactorListContext factorList() {
			return getRuleContext(FactorListContext.class,0);
		}
		public TerminalNode IMPACTS() { return getToken(StatChartsParser.IMPACTS, 0); }
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public TerminalNode SIGNIFICANTLY() { return getToken(StatChartsParser.SIGNIFICANTLY, 0); }
		public ExplicitDifferentialHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitDifferentialHypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExplicitDifferentialHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExplicitDifferentialHypothesis(this);
		}
	}

	public final ExplicitDifferentialHypothesisContext explicitDifferentialHypothesis() throws RecognitionException {
		ExplicitDifferentialHypothesisContext _localctx = new ExplicitDifferentialHypothesisContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_explicitDifferentialHypothesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); factorList();
			setState(623); match(IMPACTS);
			setState(625);
			_la = _input.LA(1);
			if (_la==SIGNIFICANTLY) {
				{
				setState(624); match(SIGNIFICANTLY);
				}
			}

			setState(627); match(ON);
			setState(628); outcome();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorListContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public FactorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFactorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFactorList(this);
		}
	}

	public final FactorListContext factorList() throws RecognitionException {
		FactorListContext _localctx = new FactorListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_factorList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630); idList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeListContext extends ParserRuleContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public OutcomeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcomeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOutcomeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOutcomeList(this);
		}
	}

	public final OutcomeListContext outcomeList() throws RecognitionException {
		OutcomeListContext _localctx = new OutcomeListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_outcomeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632); idList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdListContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode AND() { return getToken(StatChartsParser.AND, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitIdList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); id();
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(635); match(COMMA);
				setState(636); id();
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(642); match(AND);
				setState(643); id();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitDifferentialHypothesisContext extends ParserRuleContext {
		public TerminalNode DIFFERENTIAL() { return getToken(StatChartsParser.DIFFERENTIAL, 0); }
		public ImplicitDifferentialHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitDifferentialHypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterImplicitDifferentialHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitImplicitDifferentialHypothesis(this);
		}
	}

	public final ImplicitDifferentialHypothesisContext implicitDifferentialHypothesis() throws RecognitionException {
		ImplicitDifferentialHypothesisContext _localctx = new ImplicitDifferentialHypothesisContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_implicitDifferentialHypothesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); match(DIFFERENTIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociationalHypothesisContext extends ParserRuleContext {
		public ImplicitAssociationalHypothesisContext implicitAssociationalHypothesis() {
			return getRuleContext(ImplicitAssociationalHypothesisContext.class,0);
		}
		public ExplicitAssociationalHypothesisContext explicitAssociationalHypothesis() {
			return getRuleContext(ExplicitAssociationalHypothesisContext.class,0);
		}
		public AssociationalHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associationalHypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAssociationalHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAssociationalHypothesis(this);
		}
	}

	public final AssociationalHypothesisContext associationalHypothesis() throws RecognitionException {
		AssociationalHypothesisContext _localctx = new AssociationalHypothesisContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_associationalHypothesis);
		try {
			setState(650);
			switch (_input.LA(1)) {
			case ASSOCIATIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(648); implicitAssociationalHypothesis();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(649); explicitAssociationalHypothesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitAssociationalHypothesisContext extends ParserRuleContext {
		public TerminalNode ASSOCIATIONAL() { return getToken(StatChartsParser.ASSOCIATIONAL, 0); }
		public ImplicitAssociationalHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitAssociationalHypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterImplicitAssociationalHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitImplicitAssociationalHypothesis(this);
		}
	}

	public final ImplicitAssociationalHypothesisContext implicitAssociationalHypothesis() throws RecognitionException {
		ImplicitAssociationalHypothesisContext _localctx = new ImplicitAssociationalHypothesisContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_implicitAssociationalHypothesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); match(ASSOCIATIONAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitAssociationalHypothesisContext extends ParserRuleContext {
		public TerminalNode CORRELATED() { return getToken(StatChartsParser.CORRELATED, 0); }
		public TerminalNode WITH() { return getToken(StatChartsParser.WITH, 0); }
		public TerminalNode IS() { return getToken(StatChartsParser.IS, 0); }
		public TerminalNode LINEARLY() { return getToken(StatChartsParser.LINEARLY, 0); }
		public TerminalNode LOGISTICALLY() { return getToken(StatChartsParser.LOGISTICALLY, 0); }
		public FactorListContext factorList() {
			return getRuleContext(FactorListContext.class,0);
		}
		public OutcomeContext outcome() {
			return getRuleContext(OutcomeContext.class,0);
		}
		public ExplicitAssociationalHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitAssociationalHypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExplicitAssociationalHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExplicitAssociationalHypothesis(this);
		}
	}

	public final ExplicitAssociationalHypothesisContext explicitAssociationalHypothesis() throws RecognitionException {
		ExplicitAssociationalHypothesisContext _localctx = new ExplicitAssociationalHypothesisContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_explicitAssociationalHypothesis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); outcome();
			setState(655); match(IS);
			setState(657);
			_la = _input.LA(1);
			if (_la==LINEARLY || _la==LOGISTICALLY) {
				{
				setState(656);
				_la = _input.LA(1);
				if ( !(_la==LINEARLY || _la==LOGISTICALLY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(659); match(CORRELATED);
			setState(660); match(WITH);
			setState(661); factorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutcomeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OutcomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outcome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOutcome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOutcome(this);
		}
	}

	public final OutcomeContext outcome() throws RecognitionException {
		OutcomeContext _localctx = new OutcomeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_outcome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescriptiveHypothesisContext extends ParserRuleContext {
		public TerminalNode DESCRIPTIVE() { return getToken(StatChartsParser.DESCRIPTIVE, 0); }
		public DescriptiveHypothesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptiveHypothesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDescriptiveHypothesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDescriptiveHypothesis(this);
		}
	}

	public final DescriptiveHypothesisContext descriptiveHypothesis() throws RecognitionException {
		DescriptiveHypothesisContext _localctx = new DescriptiveHypothesisContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_descriptiveHypothesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665); match(DESCRIPTIVE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public DesignBlockContext designBlock() {
			return getRuleContext(DesignBlockContext.class,0);
		}
		public TerminalNode DESIGN() { return getToken(StatChartsParser.DESIGN, 0); }
		public DesignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_design; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDesign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDesign(this);
		}
	}

	public final DesignContext design() throws RecognitionException {
		DesignContext _localctx = new DesignContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_design);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(DESIGN);
			setState(668); match(COLON);
			setState(669); designBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignBlockContext extends ParserRuleContext {
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public CustomDesignBlockContext customDesignBlock() {
			return getRuleContext(CustomDesignBlockContext.class,0);
		}
		public DesignBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDesignBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDesignBlock(this);
		}
	}

	public final DesignBlockContext designBlock() throws RecognitionException {
		DesignBlockContext _localctx = new DesignBlockContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_designBlock);
		try {
			setState(673);
			switch (_input.LA(1)) {
			case SAMPLING:
				enterOuterAlt(_localctx, 1);
				{
				setState(671); customDesignBlock();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(672); extensionPoint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomDesignBlockContext extends ParserRuleContext {
		public GroupsContext groups() {
			return getRuleContext(GroupsContext.class,0);
		}
		public ProtocolContext protocol() {
			return getRuleContext(ProtocolContext.class,0);
		}
		public DesignSamplingContext designSampling() {
			return getRuleContext(DesignSamplingContext.class,0);
		}
		public DetailedDesignContext detailedDesign() {
			return getRuleContext(DetailedDesignContext.class,0);
		}
		public AnalysesContext analyses() {
			return getRuleContext(AnalysesContext.class,0);
		}
		public CustomDesignBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customDesignBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterCustomDesignBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitCustomDesignBlock(this);
		}
	}

	public final CustomDesignBlockContext customDesignBlock() throws RecognitionException {
		CustomDesignBlockContext _localctx = new CustomDesignBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_customDesignBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675); designSampling();
			setState(677);
			_la = _input.LA(1);
			if (_la==DETAILED_DESIGN) {
				{
				setState(676); detailedDesign();
				}
			}

			setState(679); groups();
			setState(680); protocol();
			setState(681); analyses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignSamplingContext extends ParserRuleContext {
		public DesignBlockingContext designBlocking() {
			return getRuleContext(DesignBlockingContext.class,0);
		}
		public SamplingTypeContext samplingType() {
			return getRuleContext(SamplingTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public DesignAssignmentContext designAssignment() {
			return getRuleContext(DesignAssignmentContext.class,0);
		}
		public TerminalNode SAMPLING() { return getToken(StatChartsParser.SAMPLING, 0); }
		public DesignSamplingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designSampling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDesignSampling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDesignSampling(this);
		}
	}

	public final DesignSamplingContext designSampling() throws RecognitionException {
		DesignSamplingContext _localctx = new DesignSamplingContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_designSampling);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683); match(SAMPLING);
			setState(684); match(COLON);
			setState(685); samplingType();
			setState(687);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(686); designAssignment();
				}
			}

			setState(690);
			_la = _input.LA(1);
			if (_la==BLOCKING) {
				{
				setState(689); designBlocking();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SamplingTypeContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(StatChartsParser.RANDOM, 0); }
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode ADHOC() { return getToken(StatChartsParser.ADHOC, 0); }
		public SamplingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samplingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterSamplingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitSamplingType(this);
		}
	}

	public final SamplingTypeContext samplingType() throws RecognitionException {
		SamplingTypeContext _localctx = new SamplingTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_samplingType);
		try {
			setState(695);
			switch (_input.LA(1)) {
			case RANDOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(692); match(RANDOM);
				}
				break;
			case ADHOC:
				enterOuterAlt(_localctx, 2);
				{
				setState(693); match(ADHOC);
				setState(694); match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignAssignmentContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(StatChartsParser.RANDOM, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(StatChartsParser.ASSIGNMENT, 0); }
		public DesignAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDesignAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDesignAssignment(this);
		}
	}

	public final DesignAssignmentContext designAssignment() throws RecognitionException {
		DesignAssignmentContext _localctx = new DesignAssignmentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_designAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697); match(ASSIGNMENT);
			setState(698); match(COLON);
			setState(701);
			switch (_input.LA(1)) {
			case RANDOM:
				{
				setState(699); match(RANDOM);
				}
				break;
			case Identifier:
				{
				setState(700); id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignBlockingContext extends ParserRuleContext {
		public TerminalNode BLOCKING() { return getToken(StatChartsParser.BLOCKING, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public DesignBlockingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designBlocking; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDesignBlocking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDesignBlocking(this);
		}
	}

	public final DesignBlockingContext designBlocking() throws RecognitionException {
		DesignBlockingContext _localctx = new DesignBlockingContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_designBlocking);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703); match(BLOCKING);
			setState(704); match(COLON);
			setState(705); id();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(706); match(COMMA);
				setState(707); id();
				}
				}
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DetailedDesignContext extends ParserRuleContext {
		public DesignBlockingContext designBlocking() {
			return getRuleContext(DesignBlockingContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode DETAILED_DESIGN() { return getToken(StatChartsParser.DETAILED_DESIGN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DesignAssignmentContext designAssignment() {
			return getRuleContext(DesignAssignmentContext.class,0);
		}
		public DetailedDesignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detailedDesign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterDetailedDesign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitDetailedDesign(this);
		}
	}

	public final DetailedDesignContext detailedDesign() throws RecognitionException {
		DetailedDesignContext _localctx = new DetailedDesignContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_detailedDesign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713); match(DETAILED_DESIGN);
			setState(714); match(COLON);
			setState(715); id();
			setState(717);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(716); designAssignment();
				}
			}

			setState(720);
			_la = _input.LA(1);
			if (_la==BLOCKING) {
				{
				setState(719); designBlocking();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupsContext extends ParserRuleContext {
		public TerminalNode GROUPS() { return getToken(StatChartsParser.GROUPS, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public GroupsExpresionContext groupsExpresion() {
			return getRuleContext(GroupsExpresionContext.class,0);
		}
		public GroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitGroups(this);
		}
	}

	public final GroupsContext groups() throws RecognitionException {
		GroupsContext _localctx = new GroupsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_groups);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722); match(GROUPS);
			setState(723); match(COLON);
			setState(724); groupsExpresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupsExpresionContext extends ParserRuleContext {
		public List<SizingSentenceContext> sizingSentence() {
			return getRuleContexts(SizingSentenceContext.class);
		}
		public SizingSentenceContext sizingSentence(int i) {
			return getRuleContext(SizingSentenceContext.class,i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public FunctionalDeclarationContext functionalDeclaration(int i) {
			return getRuleContext(FunctionalDeclarationContext.class,i);
		}
		public TerminalNode BY() { return getToken(StatChartsParser.BY, 0); }
		public List<FunctionalDeclarationContext> functionalDeclaration() {
			return getRuleContexts(FunctionalDeclarationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public GroupsExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupsExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterGroupsExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitGroupsExpresion(this);
		}
	}

	public final GroupsExpresionContext groupsExpresion() throws RecognitionException {
		GroupsExpresionContext _localctx = new GroupsExpresionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_groupsExpresion);
		int _la;
		try {
			setState(749);
			switch (_input.LA(1)) {
			case BY:
				enterOuterAlt(_localctx, 1);
				{
				setState(726); match(BY);
				setState(727); id();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(728); match(COMMA);
					setState(729); id();
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(735); sizingSentence();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(737); functionalDeclaration();
				setState(738); sizingSentence();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(739); match(COMMA);
					setState(740); functionalDeclaration();
					setState(741); sizingSentence();
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SIZING:
				enterOuterAlt(_localctx, 3);
				{
				setState(748); sizingSentence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizingSentenceContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(StatChartsParser.IntegerLiteral, 0); }
		public TerminalNode SIZING() { return getToken(StatChartsParser.SIZING, 0); }
		public SizingSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizingSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterSizingSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitSizingSentence(this);
		}
	}

	public final SizingSentenceContext sizingSentence() throws RecognitionException {
		SizingSentenceContext _localctx = new SizingSentenceContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sizingSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751); match(SIZING);
			setState(752); match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolContext extends ParserRuleContext {
		public TerminalNode RANDOM() { return getToken(StatChartsParser.RANDOM, 0); }
		public ExplicitProtocolContext explicitProtocol() {
			return getRuleContext(ExplicitProtocolContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode PROTOCOL() { return getToken(StatChartsParser.PROTOCOL, 0); }
		public ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterProtocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitProtocol(this);
		}
	}

	public final ProtocolContext protocol() throws RecognitionException {
		ProtocolContext _localctx = new ProtocolContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_protocol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754); match(PROTOCOL);
			setState(755); match(COLON);
			setState(758);
			switch (_input.LA(1)) {
			case RANDOM:
				{
				setState(756); match(RANDOM);
				}
				break;
			case TREATMENT:
			case MEASUREMENT:
				{
				setState(757); explicitProtocol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitProtocolContext extends ParserRuleContext {
		public ProtocolStepContext protocolStep(int i) {
			return getRuleContext(ProtocolStepContext.class,i);
		}
		public List<ProtocolStepContext> protocolStep() {
			return getRuleContexts(ProtocolStepContext.class);
		}
		public ExplicitProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitProtocol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExplicitProtocol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExplicitProtocol(this);
		}
	}

	public final ExplicitProtocolContext explicitProtocol() throws RecognitionException {
		ExplicitProtocolContext _localctx = new ExplicitProtocolContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_explicitProtocol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(760); protocolStep();
				}
				}
				setState(763); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TREATMENT || _la==MEASUREMENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolStepContext extends ParserRuleContext {
		public MeasurementContext measurement() {
			return getRuleContext(MeasurementContext.class,0);
		}
		public TreatmentContext treatment() {
			return getRuleContext(TreatmentContext.class,0);
		}
		public ProtocolStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterProtocolStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitProtocolStep(this);
		}
	}

	public final ProtocolStepContext protocolStep() throws RecognitionException {
		ProtocolStepContext _localctx = new ProtocolStepContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_protocolStep);
		try {
			setState(767);
			switch (_input.LA(1)) {
			case MEASUREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(765); measurement();
				}
				break;
			case TREATMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(766); treatment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasurementContext extends ParserRuleContext {
		public TerminalNode MEASUREMENT() { return getToken(StatChartsParser.MEASUREMENT, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public FunctionalDeclarationContext functionalDeclaration() {
			return getRuleContext(FunctionalDeclarationContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public MeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterMeasurement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitMeasurement(this);
		}
	}

	public final MeasurementContext measurement() throws RecognitionException {
		MeasurementContext _localctx = new MeasurementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_measurement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(769); match(MEASUREMENT);
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(770); id();
					setState(771); match(COMMA);
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(778); functionalDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreatmentContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode TREATMENT() { return getToken(StatChartsParser.TREATMENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public FunctionalDeclarationContext functionalDeclaration() {
			return getRuleContext(FunctionalDeclarationContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public TreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitTreatment(this);
		}
	}

	public final TreatmentContext treatment() throws RecognitionException {
		TreatmentContext _localctx = new TreatmentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_treatment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(780); match(TREATMENT);
			setState(786);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(781); id();
					setState(782); match(COMMA);
					}
					} 
				}
				setState(788);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(789); functionalDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesContext extends ParserRuleContext {
		public AnalysesBlocksContext analysesBlocks() {
			return getRuleContext(AnalysesBlocksContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode ANALYSES() { return getToken(StatChartsParser.ANALYSES, 0); }
		public AnalysesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAnalyses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAnalyses(this);
		}
	}

	public final AnalysesContext analyses() throws RecognitionException {
		AnalysesContext _localctx = new AnalysesContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_analyses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); match(ANALYSES);
			setState(792); match(COLON);
			setState(793); analysesBlocks();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesBlocksContext extends ParserRuleContext {
		public List<AnalysesBlockContext> analysesBlock() {
			return getRuleContexts(AnalysesBlockContext.class);
		}
		public AnalysesBlockContext analysesBlock(int i) {
			return getRuleContext(AnalysesBlockContext.class,i);
		}
		public AnalysesBlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesBlocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAnalysesBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAnalysesBlocks(this);
		}
	}

	public final AnalysesBlocksContext analysesBlocks() throws RecognitionException {
		AnalysesBlocksContext _localctx = new AnalysesBlocksContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_analysesBlocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(795); analysesBlock();
				}
				}
				setState(798); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesBlockContext extends ParserRuleContext {
		public StatisticFunctionContext statisticFunction(int i) {
			return getRuleContext(StatisticFunctionContext.class,i);
		}
		public List<StatisticFunctionContext> statisticFunction() {
			return getRuleContexts(StatisticFunctionContext.class);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AnalysesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAnalysesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAnalysesBlock(this);
		}
	}

	public final AnalysesBlockContext analysesBlock() throws RecognitionException {
		AnalysesBlockContext _localctx = new AnalysesBlockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_analysesBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(800); id();
			setState(801); match(COLON);
			setState(803); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(802); statisticFunction();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(805); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionContext extends ParserRuleContext {
		public CorrelationCoeficientSFContext correlationCoeficientSF() {
			return getRuleContext(CorrelationCoeficientSFContext.class,0);
		}
		public NhstSFContext nhstSF() {
			return getRuleContext(NhstSFContext.class,0);
		}
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public RankingSFContext rankingSF() {
			return getRuleContext(RankingSFContext.class,0);
		}
		public CentralTendencyMeasurementSFContext centralTendencyMeasurementSF() {
			return getRuleContext(CentralTendencyMeasurementSFContext.class,0);
		}
		public ConfidenceIntervalSFContext confidenceIntervalSF() {
			return getRuleContext(ConfidenceIntervalSFContext.class,0);
		}
		public VariabilityMeasureSFContext variabilityMeasureSF() {
			return getRuleContext(VariabilityMeasureSFContext.class,0);
		}
		public StatisticFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStatisticFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStatisticFunction(this);
		}
	}

	public final StatisticFunctionContext statisticFunction() throws RecognitionException {
		StatisticFunctionContext _localctx = new StatisticFunctionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statisticFunction);
		try {
			setState(814);
			switch (_input.LA(1)) {
			case RANKING:
				enterOuterAlt(_localctx, 1);
				{
				setState(807); rankingSF();
				}
				break;
			case MEAN:
			case MODE:
			case MEDIAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(808); centralTendencyMeasurementSF();
				}
				break;
			case STDDEV:
			case VARIANCE:
			case IQR:
			case RANGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(809); variabilityMeasureSF();
				}
				break;
			case CONFIDENCE_INTERVAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(810); confidenceIntervalSF();
				}
				break;
			case PEARSON:
			case BIVARIATE_REGRESSION:
			case SPEARMAN:
			case KENDALL:
			case CRAMER:
			case LOG_LINEAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(811); correlationCoeficientSF();
				}
				break;
			case KOLMOGOROV_SMIRNOV:
			case LILLIEFORS:
			case SHAPIRO_WILK:
			case LEVENE:
			case T_STUDENT:
			case WILCOXON:
			case MCNEMAR:
			case ANOVA:
			case FACTANOVAWRS:
			case FRIEDMAN:
			case ALIGNED_FRIEDMAN:
			case IMAN_DAVEPORT:
			case QUADE:
			case COCHRAN_Q:
			case BONFERRONI_DUNN:
			case HOLMS:
			case HOCHBERG:
			case HOMMEL:
			case HOLLAND:
			case ROM:
			case FINNER:
			case LI:
			case SHAFFER:
			case NAMENYI:
			case TTEST:
			case SIGN_TEST:
			case CHI_SQUARE:
			case KRUSKAL:
			case FISHER:
			case TUKEY:
				enterOuterAlt(_localctx, 6);
				{
				setState(812); nhstSF();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(813); extensionPoint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RankingSFContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(StatChartsParser.COMMA, 0); }
		public RFunctionContext rFunction() {
			return getRuleContext(RFunctionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public CentralTendencyMeasurementSFContext centralTendencyMeasurementSF() {
			return getRuleContext(CentralTendencyMeasurementSFContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public VariabilityMeasureSFContext variabilityMeasureSF() {
			return getRuleContext(VariabilityMeasureSFContext.class,0);
		}
		public RankingSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rankingSF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRankingSF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRankingSF(this);
		}
	}

	public final RankingSFContext rankingSF() throws RecognitionException {
		RankingSFContext _localctx = new RankingSFContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_rankingSF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816); rFunction();
			setState(817); match(OPEN_PAR);
			setState(820);
			switch (_input.LA(1)) {
			case MEAN:
			case MODE:
			case MEDIAN:
				{
				setState(818); centralTendencyMeasurementSF();
				}
				break;
			case STDDEV:
			case VARIANCE:
			case IQR:
			case RANGE:
				{
				setState(819); variabilityMeasureSF();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(822); match(COMMA);
			setState(823); id();
			setState(824); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RFunctionContext extends ParserRuleContext {
		public TerminalNode RANKING() { return getToken(StatChartsParser.RANKING, 0); }
		public RFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRFunction(this);
		}
	}

	public final RFunctionContext rFunction() throws RecognitionException {
		RFunctionContext _localctx = new RFunctionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_rFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); match(RANKING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CentralTendencyMeasurementSFContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public CtmFunctionContext ctmFunction() {
			return getRuleContext(CtmFunctionContext.class,0);
		}
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public CentralTendencyMeasurementSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centralTendencyMeasurementSF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterCentralTendencyMeasurementSF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitCentralTendencyMeasurementSF(this);
		}
	}

	public final CentralTendencyMeasurementSFContext centralTendencyMeasurementSF() throws RecognitionException {
		CentralTendencyMeasurementSFContext _localctx = new CentralTendencyMeasurementSFContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_centralTendencyMeasurementSF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828); ctmFunction();
			setState(829); match(OPEN_PAR);
			setState(830); statisticFunctionParam();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(831); match(COMMA);
				setState(832); statisticFunctionParam();
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(838); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtmFunctionContext extends ParserRuleContext {
		public TerminalNode MEDIAN() { return getToken(StatChartsParser.MEDIAN, 0); }
		public TerminalNode MEAN() { return getToken(StatChartsParser.MEAN, 0); }
		public TerminalNode MODE() { return getToken(StatChartsParser.MODE, 0); }
		public CtmFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctmFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterCtmFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitCtmFunction(this);
		}
	}

	public final CtmFunctionContext ctmFunction() throws RecognitionException {
		CtmFunctionContext _localctx = new CtmFunctionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ctmFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (MEAN - 93)) | (1L << (MODE - 93)) | (1L << (MEDIAN - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariabilityMeasureSFContext extends ParserRuleContext {
		public VmFunctionContext vmFunction() {
			return getRuleContext(VmFunctionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public VariabilityMeasureSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabilityMeasureSF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterVariabilityMeasureSF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitVariabilityMeasureSF(this);
		}
	}

	public final VariabilityMeasureSFContext variabilityMeasureSF() throws RecognitionException {
		VariabilityMeasureSFContext _localctx = new VariabilityMeasureSFContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_variabilityMeasureSF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); vmFunction();
			setState(843); match(OPEN_PAR);
			setState(844); statisticFunctionParam();
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(845); match(COMMA);
				setState(846); statisticFunctionParam();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VmFunctionContext extends ParserRuleContext {
		public TerminalNode VARIANCE() { return getToken(StatChartsParser.VARIANCE, 0); }
		public TerminalNode RANGE() { return getToken(StatChartsParser.RANGE, 0); }
		public TerminalNode IQR() { return getToken(StatChartsParser.IQR, 0); }
		public TerminalNode STDDEV() { return getToken(StatChartsParser.STDDEV, 0); }
		public VmFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vmFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterVmFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitVmFunction(this);
		}
	}

	public final VmFunctionContext vmFunction() throws RecognitionException {
		VmFunctionContext _localctx = new VmFunctionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_vmFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (STDDEV - 96)) | (1L << (VARIANCE - 96)) | (1L << (IQR - 96)) | (1L << (RANGE - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfidenceIntervalSFContext extends ParserRuleContext {
		public StatisticFunctionParamContext statisticFunctionParam() {
			return getRuleContext(StatisticFunctionParamContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public CiFunctionContext ciFunction() {
			return getRuleContext(CiFunctionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public ConfidenceIntervalSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_confidenceIntervalSF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterConfidenceIntervalSF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitConfidenceIntervalSF(this);
		}
	}

	public final ConfidenceIntervalSFContext confidenceIntervalSF() throws RecognitionException {
		ConfidenceIntervalSFContext _localctx = new ConfidenceIntervalSFContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_confidenceIntervalSF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); ciFunction();
			setState(857); match(OPEN_PAR);
			setState(858); statisticFunctionParam();
			setState(859); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CiFunctionContext extends ParserRuleContext {
		public TerminalNode CONFIDENCE_INTERVAL() { return getToken(StatChartsParser.CONFIDENCE_INTERVAL, 0); }
		public CiFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterCiFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitCiFunction(this);
		}
	}

	public final CiFunctionContext ciFunction() throws RecognitionException {
		CiFunctionContext _localctx = new CiFunctionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ciFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861); match(CONFIDENCE_INTERVAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorrelationCoeficientSFContext extends ParserRuleContext {
		public CcFunctionContext ccFunction() {
			return getRuleContext(CcFunctionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public CorrelationCoeficientSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlationCoeficientSF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterCorrelationCoeficientSF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitCorrelationCoeficientSF(this);
		}
	}

	public final CorrelationCoeficientSFContext correlationCoeficientSF() throws RecognitionException {
		CorrelationCoeficientSFContext _localctx = new CorrelationCoeficientSFContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_correlationCoeficientSF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863); ccFunction();
			setState(864); match(OPEN_PAR);
			setState(865); statisticFunctionParam();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(866); match(COMMA);
				setState(867); statisticFunctionParam();
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CcFunctionContext extends ParserRuleContext {
		public TerminalNode KENDALL() { return getToken(StatChartsParser.KENDALL, 0); }
		public TerminalNode BIVARIATE_REGRESSION() { return getToken(StatChartsParser.BIVARIATE_REGRESSION, 0); }
		public TerminalNode CRAMER() { return getToken(StatChartsParser.CRAMER, 0); }
		public TerminalNode SPEARMAN() { return getToken(StatChartsParser.SPEARMAN, 0); }
		public TerminalNode LOG_LINEAR() { return getToken(StatChartsParser.LOG_LINEAR, 0); }
		public TerminalNode PEARSON() { return getToken(StatChartsParser.PEARSON, 0); }
		public CcFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ccFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterCcFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitCcFunction(this);
		}
	}

	public final CcFunctionContext ccFunction() throws RecognitionException {
		CcFunctionContext _localctx = new CcFunctionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_ccFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (PEARSON - 102)) | (1L << (BIVARIATE_REGRESSION - 102)) | (1L << (SPEARMAN - 102)) | (1L << (KENDALL - 102)) | (1L << (CRAMER - 102)) | (1L << (LOG_LINEAR - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NhstSFContext extends ParserRuleContext {
		public NhstFunctionContext nhstFunction() {
			return getRuleContext(NhstFunctionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(StatChartsParser.COMMA, 0); }
		public List<StatisticFunctionParamContext> statisticFunctionParam() {
			return getRuleContexts(StatisticFunctionParamContext.class);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public StatisticFunctionParamContext statisticFunctionParam(int i) {
			return getRuleContext(StatisticFunctionParamContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public NhstSFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhstSF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterNhstSF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitNhstSF(this);
		}
	}

	public final NhstSFContext nhstSF() throws RecognitionException {
		NhstSFContext _localctx = new NhstSFContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_nhstSF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877); nhstFunction();
			setState(878); match(OPEN_PAR);
			setState(879); statisticFunctionParam();
			setState(880); match(COMMA);
			setState(881); statisticFunctionParam();
			setState(882); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NhstFunctionContext extends ParserRuleContext {
		public TerminalNode ROM() { return getToken(StatChartsParser.ROM, 0); }
		public TerminalNode IMAN_DAVEPORT() { return getToken(StatChartsParser.IMAN_DAVEPORT, 0); }
		public TerminalNode MCNEMAR() { return getToken(StatChartsParser.MCNEMAR, 0); }
		public TerminalNode NAMENYI() { return getToken(StatChartsParser.NAMENYI, 0); }
		public TerminalNode TTEST() { return getToken(StatChartsParser.TTEST, 0); }
		public TerminalNode SIGN_TEST() { return getToken(StatChartsParser.SIGN_TEST, 0); }
		public TerminalNode LEVENE() { return getToken(StatChartsParser.LEVENE, 0); }
		public TerminalNode SHAFFER() { return getToken(StatChartsParser.SHAFFER, 0); }
		public TerminalNode WILCOXON() { return getToken(StatChartsParser.WILCOXON, 0); }
		public TerminalNode ALIGNED_FRIEDMAN() { return getToken(StatChartsParser.ALIGNED_FRIEDMAN, 0); }
		public TerminalNode CHI_SQUARE() { return getToken(StatChartsParser.CHI_SQUARE, 0); }
		public TerminalNode KRUSKAL() { return getToken(StatChartsParser.KRUSKAL, 0); }
		public TerminalNode LI() { return getToken(StatChartsParser.LI, 0); }
		public TerminalNode FINNER() { return getToken(StatChartsParser.FINNER, 0); }
		public TerminalNode FACTANOVAWRS() { return getToken(StatChartsParser.FACTANOVAWRS, 0); }
		public TerminalNode FISHER() { return getToken(StatChartsParser.FISHER, 0); }
		public TerminalNode KOLMOGOROV_SMIRNOV() { return getToken(StatChartsParser.KOLMOGOROV_SMIRNOV, 0); }
		public TerminalNode HOMMEL() { return getToken(StatChartsParser.HOMMEL, 0); }
		public TerminalNode HOCHBERG() { return getToken(StatChartsParser.HOCHBERG, 0); }
		public TerminalNode T_STUDENT() { return getToken(StatChartsParser.T_STUDENT, 0); }
		public TerminalNode BONFERRONI_DUNN() { return getToken(StatChartsParser.BONFERRONI_DUNN, 0); }
		public TerminalNode TUKEY() { return getToken(StatChartsParser.TUKEY, 0); }
		public TerminalNode HOLMS() { return getToken(StatChartsParser.HOLMS, 0); }
		public TerminalNode FRIEDMAN() { return getToken(StatChartsParser.FRIEDMAN, 0); }
		public TerminalNode SHAPIRO_WILK() { return getToken(StatChartsParser.SHAPIRO_WILK, 0); }
		public TerminalNode ANOVA() { return getToken(StatChartsParser.ANOVA, 0); }
		public TerminalNode QUADE() { return getToken(StatChartsParser.QUADE, 0); }
		public TerminalNode COCHRAN_Q() { return getToken(StatChartsParser.COCHRAN_Q, 0); }
		public TerminalNode HOLLAND() { return getToken(StatChartsParser.HOLLAND, 0); }
		public TerminalNode LILLIEFORS() { return getToken(StatChartsParser.LILLIEFORS, 0); }
		public NhstFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nhstFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterNhstFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitNhstFunction(this);
		}
	}

	public final NhstFunctionContext nhstFunction() throws RecognitionException {
		NhstFunctionContext _localctx = new NhstFunctionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_nhstFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (KOLMOGOROV_SMIRNOV - 108)) | (1L << (LILLIEFORS - 108)) | (1L << (SHAPIRO_WILK - 108)) | (1L << (LEVENE - 108)) | (1L << (T_STUDENT - 108)) | (1L << (WILCOXON - 108)) | (1L << (MCNEMAR - 108)) | (1L << (ANOVA - 108)) | (1L << (FACTANOVAWRS - 108)) | (1L << (FRIEDMAN - 108)) | (1L << (ALIGNED_FRIEDMAN - 108)) | (1L << (IMAN_DAVEPORT - 108)) | (1L << (QUADE - 108)) | (1L << (COCHRAN_Q - 108)) | (1L << (BONFERRONI_DUNN - 108)) | (1L << (HOLMS - 108)) | (1L << (HOCHBERG - 108)) | (1L << (HOMMEL - 108)) | (1L << (HOLLAND - 108)) | (1L << (ROM - 108)) | (1L << (FINNER - 108)) | (1L << (LI - 108)) | (1L << (SHAFFER - 108)) | (1L << (NAMENYI - 108)) | (1L << (TTEST - 108)) | (1L << (SIGN_TEST - 108)) | (1L << (CHI_SQUARE - 108)) | (1L << (KRUSKAL - 108)) | (1L << (FISHER - 108)) | (1L << (TUKEY - 108)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionParamContext extends ParserRuleContext {
		public StatisticFunctionParamVariableContext statisticFunctionParamVariable() {
			return getRuleContext(StatisticFunctionParamVariableContext.class,0);
		}
		public StatisticFunctionValueContext statisticFunctionValue() {
			return getRuleContext(StatisticFunctionValueContext.class,0);
		}
		public StatisticFunctionFilterContext statisticFunctionFilter() {
			return getRuleContext(StatisticFunctionFilterContext.class,0);
		}
		public StatisticFunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStatisticFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStatisticFunctionParam(this);
		}
	}

	public final StatisticFunctionParamContext statisticFunctionParam() throws RecognitionException {
		StatisticFunctionParamContext _localctx = new StatisticFunctionParamContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_statisticFunctionParam);
		try {
			setState(890);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(886); statisticFunctionValue();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887); statisticFunctionFilter();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(888); statisticFunctionParamVariable();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionParamVariableContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public StatisticFunctionParamVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionParamVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStatisticFunctionParamVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStatisticFunctionParamVariable(this);
		}
	}

	public final StatisticFunctionParamVariableContext statisticFunctionParamVariable() throws RecognitionException {
		StatisticFunctionParamVariableContext _localctx = new StatisticFunctionParamVariableContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_statisticFunctionParamVariable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(892); assignment();
				}
			}

			setState(899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(895); match(COMMA);
					setState(896); assignment();
					}
					} 
				}
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(StatChartsParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902); id();
			setState(905);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(903); match(EQUAL);
				setState(904); value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionValueContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(StatChartsParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(StatChartsParser.FloatingPointLiteral, 0); }
		public StatisticFunctionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStatisticFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStatisticFunctionValue(this);
		}
	}

	public final StatisticFunctionValueContext statisticFunctionValue() throws RecognitionException {
		StatisticFunctionValueContext _localctx = new StatisticFunctionValueContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_statisticFunctionValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_la = _input.LA(1);
			if ( !(_la==IntegerLiteral || _la==FloatingPointLiteral) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticFunctionFilterContext extends ParserRuleContext {
		public OldStatisticFunctionFilterContext oldStatisticFunctionFilter() {
			return getRuleContext(OldStatisticFunctionFilterContext.class,0);
		}
		public NewStatisticFunctionFilterContext newStatisticFunctionFilter() {
			return getRuleContext(NewStatisticFunctionFilterContext.class,0);
		}
		public StatisticFunctionFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticFunctionFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStatisticFunctionFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStatisticFunctionFilter(this);
		}
	}

	public final StatisticFunctionFilterContext statisticFunctionFilter() throws RecognitionException {
		StatisticFunctionFilterContext _localctx = new StatisticFunctionFilterContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_statisticFunctionFilter);
		try {
			setState(911);
			switch (_input.LA(1)) {
			case FILTER:
			case GROUPING:
				enterOuterAlt(_localctx, 1);
				{
				setState(909); oldStatisticFunctionFilter();
				}
				break;
			case EOF:
			case VS:
			case SHOW:
			case OF:
			case WHERE:
			case CLOSE_PAR:
			case BY:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(910); newStatisticFunctionFilter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OldStatisticFunctionFilterContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(StatChartsParser.DOT); }
		public GroupingContext grouping() {
			return getRuleContext(GroupingContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(StatChartsParser.DOT, i);
		}
		public OldStatisticFunctionFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldStatisticFunctionFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOldStatisticFunctionFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOldStatisticFunctionFilter(this);
		}
	}

	public final OldStatisticFunctionFilterContext oldStatisticFunctionFilter() throws RecognitionException {
		OldStatisticFunctionFilterContext _localctx = new OldStatisticFunctionFilterContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_oldStatisticFunctionFilter);
		int _la;
		try {
			setState(927);
			switch (_input.LA(1)) {
			case FILTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(913); filter();
				setState(916);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(914); match(DOT);
					setState(915); grouping();
					}
					break;
				}
				setState(920);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(918); match(DOT);
					setState(919); projection();
					}
				}

				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(922); grouping();
				setState(925);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(923); match(DOT);
					setState(924); projection();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewStatisticFunctionFilterContext extends ParserRuleContext {
		public OfDSSpecContext ofDSSpec() {
			return getRuleContext(OfDSSpecContext.class,0);
		}
		public WhereDSSpecContext whereDSSpec() {
			return getRuleContext(WhereDSSpecContext.class,0);
		}
		public ByDSSpecContext byDSSpec() {
			return getRuleContext(ByDSSpecContext.class,0);
		}
		public NewStatisticFunctionFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newStatisticFunctionFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterNewStatisticFunctionFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitNewStatisticFunctionFilter(this);
		}
	}

	public final NewStatisticFunctionFilterContext newStatisticFunctionFilter() throws RecognitionException {
		NewStatisticFunctionFilterContext _localctx = new NewStatisticFunctionFilterContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_newStatisticFunctionFilter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(929); ofDSSpec();
				}
			}

			setState(933);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(932); whereDSSpec();
				}
			}

			setState(936);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(935); byDSSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OfDSSpecContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode OF() { return getToken(StatChartsParser.OF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public OfDSSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ofDSSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOfDSSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOfDSSpec(this);
		}
	}

	public final OfDSSpecContext ofDSSpec() throws RecognitionException {
		OfDSSpecContext _localctx = new OfDSSpecContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ofDSSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(938); match(OF);
			setState(939); id();
			setState(944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(940); match(COMMA);
					setState(941); id();
					}
					} 
				}
				setState(946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereDSSpecContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(StatChartsParser.WHERE, 0); }
		public StatisticFunctionParamVariableContext statisticFunctionParamVariable() {
			return getRuleContext(StatisticFunctionParamVariableContext.class,0);
		}
		public WhereDSSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereDSSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterWhereDSSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitWhereDSSpec(this);
		}
	}

	public final WhereDSSpecContext whereDSSpec() throws RecognitionException {
		WhereDSSpecContext _localctx = new WhereDSSpecContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_whereDSSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947); match(WHERE);
			setState(948); statisticFunctionParamVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByDSSpecContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode BY() { return getToken(StatChartsParser.BY, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public ByDSSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byDSSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterByDSSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitByDSSpec(this);
		}
	}

	public final ByDSSpecContext byDSSpec() throws RecognitionException {
		ByDSSpecContext _localctx = new ByDSSpecContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_byDSSpec);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(950); match(BY);
			setState(951); id();
			setState(956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(952); match(COMMA);
					setState(953); id();
					}
					} 
				}
				setState(958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public StatisticFunctionParamVariableContext statisticFunctionParamVariable() {
			return getRuleContext(StatisticFunctionParamVariableContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(StatChartsParser.FILTER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFilter(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959); match(FILTER);
			setState(960); match(OPEN_PAR);
			setState(961); statisticFunctionParamVariable();
			setState(962); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode GROUPING() { return getToken(StatChartsParser.GROUPING, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_BRA() { return getToken(StatChartsParser.CLOSE_BRA, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public TerminalNode OPEN_BRA() { return getToken(StatChartsParser.OPEN_BRA, 0); }
		public GroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterGrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitGrouping(this);
		}
	}

	public final GroupingContext grouping() throws RecognitionException {
		GroupingContext _localctx = new GroupingContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_grouping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964); match(GROUPING);
			setState(965); match(OPEN_PAR);
			setState(966); match(OPEN_BRA);
			setState(967); id();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(968); match(COMMA);
				setState(969); id();
				}
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(975); match(CLOSE_BRA);
			setState(976); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProjectionContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode PROJ() { return getToken(StatChartsParser.PROJ, 0); }
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitProjection(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_projection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978); match(PROJ);
			setState(979); match(OPEN_PAR);
			setState(980); id();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(981); match(COMMA);
				setState(982); id();
				}
				}
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(988); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigurationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode CONFIGURATION() { return getToken(StatChartsParser.CONFIGURATION, 0); }
		public ConfigurationBlockContext configurationBlock(int i) {
			return getRuleContext(ConfigurationBlockContext.class,i);
		}
		public List<ConfigurationBlockContext> configurationBlock() {
			return getRuleContexts(ConfigurationBlockContext.class);
		}
		public ConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitConfiguration(this);
		}
	}

	public final ConfigurationContext configuration() throws RecognitionException {
		ConfigurationContext _localctx = new ConfigurationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_configuration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990); match(CONFIGURATION);
			setState(991); match(COLON);
			setState(993); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(992); configurationBlock();
				}
				}
				setState(995); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigurationBlockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SingleConfContext singleConf() {
			return getRuleContext(SingleConfContext.class,0);
		}
		public ConfigurationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configurationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterConfigurationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitConfigurationBlock(this);
		}
	}

	public final ConfigurationBlockContext configurationBlock() throws RecognitionException {
		ConfigurationBlockContext _localctx = new ConfigurationBlockContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_configurationBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); id();
			setState(998); match(COLON);
			setState(999); singleConf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleConfContext extends ParserRuleContext {
		public ExperimentalProcedureContext experimentalProcedure() {
			return getRuleContext(ExperimentalProcedureContext.class,0);
		}
		public ExecutionContext execution() {
			return getRuleContext(ExecutionContext.class,0);
		}
		public SettingsContext settings() {
			return getRuleContext(SettingsContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public SingleConfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleConf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterSingleConf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitSingleConf(this);
		}
	}

	public final SingleConfContext singleConf() throws RecognitionException {
		SingleConfContext _localctx = new SingleConfContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_singleConf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_la = _input.LA(1);
			if (_la==INPUTS) {
				{
				setState(1001); inputs();
				}
			}

			setState(1005);
			_la = _input.LA(1);
			if (_la==OUTPUTS) {
				{
				setState(1004); outputs();
				}
			}

			setState(1008);
			_la = _input.LA(1);
			if (_la==SETTING) {
				{
				setState(1007); settings();
				}
			}

			setState(1010); experimentalProcedure();
			setState(1012);
			_la = _input.LA(1);
			if (_la==RUNS) {
				{
				setState(1011); execution();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public FilesContext files(int i) {
			return getRuleContext(FilesContext.class,i);
		}
		public List<FilesContext> files() {
			return getRuleContexts(FilesContext.class);
		}
		public TerminalNode INPUTS() { return getToken(StatChartsParser.INPUTS, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitInputs(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014); match(INPUTS);
			setState(1015); match(COLON);
			setState(1016); files();
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1017); match(COMMA);
				setState(1018); files();
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputsContext extends ParserRuleContext {
		public TerminalNode OUTPUTS() { return getToken(StatChartsParser.OUTPUTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public FilesContext files(int i) {
			return getRuleContext(FilesContext.class,i);
		}
		public List<FilesContext> files() {
			return getRuleContexts(FilesContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOutputs(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024); match(OUTPUTS);
			setState(1025); match(COLON);
			setState(1026); files();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1027); match(COMMA);
				setState(1028); files();
				}
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilesContext extends ParserRuleContext {
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_files; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFiles(this);
		}
	}

	public final FilesContext files() throws RecognitionException {
		FilesContext _localctx = new FilesContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_files);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034); file();
			setState(1036);
			_la = _input.LA(1);
			if (_la==ROLE) {
				{
				setState(1035); roles();
				}
			}

			setState(1039);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(1038); format();
				}
			}

			setState(1042);
			_la = _input.LA(1);
			if (_la==MAPPING) {
				{
				setState(1041); mapping();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(StatChartsParser.FILE, 0); }
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044); match(FILE);
			setState(1045); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RolesContext extends ParserRuleContext {
		public TerminalNode MISCELLANEOUS() { return getToken(StatChartsParser.MISCELLANEOUS, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode MAIN_RESULT() { return getToken(StatChartsParser.MAIN_RESULT, 0); }
		public TerminalNode ADDITIONAL_EVIDENCE() { return getToken(StatChartsParser.ADDITIONAL_EVIDENCE, 0); }
		public TerminalNode ROLE() { return getToken(StatChartsParser.ROLE, 0); }
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRoles(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047); match(ROLE);
			setState(1048); match(COLON);
			setState(1049);
			_la = _input.LA(1);
			if ( !(((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (MAIN_RESULT - 142)) | (1L << (ADDITIONAL_EVIDENCE - 142)) | (1L << (MISCELLANEOUS - 142)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(StatChartsParser.FORMAT, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFormat(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051); match(FORMAT);
			setState(1052); match(COLON);
			setState(1053); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public TerminalNode MAPPING() { return getToken(StatChartsParser.MAPPING, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055); match(MAPPING);
			setState(1056); match(COLON);
			setState(1057); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SettingsContext extends ParserRuleContext {
		public RuntimesContext runtimes() {
			return getRuleContext(RuntimesContext.class,0);
		}
		public TerminalNode SETTING() { return getToken(StatChartsParser.SETTING, 0); }
		public LibrariesContext libraries() {
			return getRuleContext(LibrariesContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public SettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterSettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitSettings(this);
		}
	}

	public final SettingsContext settings() throws RecognitionException {
		SettingsContext _localctx = new SettingsContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_settings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059); match(SETTING);
			setState(1060); match(COLON);
			setState(1062);
			_la = _input.LA(1);
			if (_la==RUNTIMES) {
				{
				setState(1061); runtimes();
				}
			}

			setState(1065);
			_la = _input.LA(1);
			if (_la==LIBRARIES) {
				{
				setState(1064); libraries();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimesContext extends ParserRuleContext {
		public List<RuntimeContext> runtime() {
			return getRuleContexts(RuntimeContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode RUNTIMES() { return getToken(StatChartsParser.RUNTIMES, 0); }
		public RuntimeContext runtime(int i) {
			return getRuleContext(RuntimeContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public RuntimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRuntimes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRuntimes(this);
		}
	}

	public final RuntimesContext runtimes() throws RecognitionException {
		RuntimesContext _localctx = new RuntimesContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_runtimes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067); match(RUNTIMES);
			setState(1068); match(COLON);
			setState(1069); runtime();
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1070); match(COMMA);
				setState(1071); runtime();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public RuntimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRuntime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRuntime(this);
		}
	}

	public final RuntimeContext runtime() throws RecognitionException {
		RuntimeContext _localctx = new RuntimeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_runtime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077); id();
			setState(1078); versionNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibrariesContext extends ParserRuleContext {
		public TerminalNode LIBRARIES() { return getToken(StatChartsParser.LIBRARIES, 0); }
		public LibraryContext library(int i) {
			return getRuleContext(LibraryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public List<LibraryContext> library() {
			return getRuleContexts(LibraryContext.class);
		}
		public LibrariesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterLibraries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitLibraries(this);
		}
	}

	public final LibrariesContext libraries() throws RecognitionException {
		LibrariesContext _localctx = new LibrariesContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_libraries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080); match(LIBRARIES);
			setState(1081); match(COLON);
			setState(1082); library();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1083); match(COMMA);
				setState(1084); library();
				}
				}
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public LibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitLibrary(this);
		}
	}

	public final LibraryContext library() throws RecognitionException {
		LibraryContext _localctx = new LibraryContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_library);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090); id();
			setState(1091); versionNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExperimentalProcedureContext extends ParserRuleContext {
		public UnstructuredProcedureDefinitionContext unstructuredProcedureDefinition() {
			return getRuleContext(UnstructuredProcedureDefinitionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public StructuredProcedureDefinitionContext structuredProcedureDefinition() {
			return getRuleContext(StructuredProcedureDefinitionContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(StatChartsParser.PROCEDURE, 0); }
		public ExperimentalProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experimentalProcedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExperimentalProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExperimentalProcedure(this);
		}
	}

	public final ExperimentalProcedureContext experimentalProcedure() throws RecognitionException {
		ExperimentalProcedureContext _localctx = new ExperimentalProcedureContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_experimentalProcedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093); match(PROCEDURE);
			setState(1094); match(COLON);
			setState(1097);
			switch (_input.LA(1)) {
			case EOF:
			case COMMAND:
			case RUNS:
			case Identifier:
				{
				setState(1095); unstructuredProcedureDefinition();
				}
				break;
			case PREPROCESSING:
			case EXECUTION:
				{
				setState(1096); structuredProcedureDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnstructuredProcedureDefinitionContext extends ParserRuleContext {
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public UnstructuredProcedureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unstructuredProcedureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterUnstructuredProcedureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitUnstructuredProcedureDefinition(this);
		}
	}

	public final UnstructuredProcedureDefinitionContext unstructuredProcedureDefinition() throws RecognitionException {
		UnstructuredProcedureDefinitionContext _localctx = new UnstructuredProcedureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_unstructuredProcedureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1099); procedureStep();
				}
				}
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStepContext extends ParserRuleContext {
		public ProcDefContext procDef() {
			return getRuleContext(ProcDefContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public ProcBodyContext procBody() {
			return getRuleContext(ProcBodyContext.class,0);
		}
		public ProcedureStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterProcedureStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitProcedureStep(this);
		}
	}

	public final ProcedureStepContext procedureStep() throws RecognitionException {
		ProcedureStepContext _localctx = new ProcedureStepContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_procedureStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105); procDef();
			setState(1106); match(COLON);
			setState(1107); procBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcDefContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public ProcedureStepTypeContext procedureStepType() {
			return getRuleContext(ProcedureStepTypeContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public TerminalNode COMMAND() { return getToken(StatChartsParser.COMMAND, 0); }
		public TerminalNode AS() { return getToken(StatChartsParser.AS, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public ProcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterProcDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitProcDef(this);
		}
	}

	public final ProcDefContext procDef() throws RecognitionException {
		ProcDefContext _localctx = new ProcDefContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_procDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109); match(COMMAND);
			setState(1112);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1110); match(AS);
				setState(1111); procedureStepType();
				}
			}

			setState(1125);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1114); match(OPEN_PAR);
				setState(1115); id();
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1116); match(COMMA);
					setState(1117); id();
					}
					}
					setState(1122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1123); match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStepTypeContext extends ParserRuleContext {
		public MeasurementStepContext measurementStep() {
			return getRuleContext(MeasurementStepContext.class,0);
		}
		public PostprocestingStepContext postprocestingStep() {
			return getRuleContext(PostprocestingStepContext.class,0);
		}
		public TreatmentStepContext treatmentStep() {
			return getRuleContext(TreatmentStepContext.class,0);
		}
		public ExtensionPointStepContext extensionPointStep() {
			return getRuleContext(ExtensionPointStepContext.class,0);
		}
		public PreprocessingStepContext preprocessingStep() {
			return getRuleContext(PreprocessingStepContext.class,0);
		}
		public ProcedureStepTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStepType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterProcedureStepType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitProcedureStepType(this);
		}
	}

	public final ProcedureStepTypeContext procedureStepType() throws RecognitionException {
		ProcedureStepTypeContext _localctx = new ProcedureStepTypeContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_procedureStepType);
		try {
			setState(1132);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127); treatmentStep();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128); measurementStep();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129); preprocessingStep();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1130); postprocestingStep();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1131); extensionPointStep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreatmentStepContext extends ParserRuleContext {
		public TerminalNode TREATMENT() { return getToken(StatChartsParser.TREATMENT, 0); }
		public TreatmentStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatmentStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterTreatmentStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitTreatmentStep(this);
		}
	}

	public final TreatmentStepContext treatmentStep() throws RecognitionException {
		TreatmentStepContext _localctx = new TreatmentStepContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_treatmentStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134); match(TREATMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasurementStepContext extends ParserRuleContext {
		public TerminalNode MEASUREMENT() { return getToken(StatChartsParser.MEASUREMENT, 0); }
		public MeasurementStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurementStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterMeasurementStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitMeasurementStep(this);
		}
	}

	public final MeasurementStepContext measurementStep() throws RecognitionException {
		MeasurementStepContext _localctx = new MeasurementStepContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_measurementStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136); match(MEASUREMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostprocestingStepContext extends ParserRuleContext {
		public TerminalNode POSTPROCESSING() { return getToken(StatChartsParser.POSTPROCESSING, 0); }
		public PostprocestingStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postprocestingStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPostprocestingStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPostprocestingStep(this);
		}
	}

	public final PostprocestingStepContext postprocestingStep() throws RecognitionException {
		PostprocestingStepContext _localctx = new PostprocestingStepContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_postprocestingStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138); match(POSTPROCESSING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionPointStepContext extends ParserRuleContext {
		public ExtensionPointContext extensionPoint() {
			return getRuleContext(ExtensionPointContext.class,0);
		}
		public PretreatmentClauseContext pretreatmentClause() {
			return getRuleContext(PretreatmentClauseContext.class,0);
		}
		public ExtensionPointStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionPointStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExtensionPointStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExtensionPointStep(this);
		}
	}

	public final ExtensionPointStepContext extensionPointStep() throws RecognitionException {
		ExtensionPointStepContext _localctx = new ExtensionPointStepContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_extensionPointStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			_la = _input.LA(1);
			if (_la==PRETREATMENT) {
				{
				setState(1140); pretreatmentClause();
				}
			}

			setState(1143); extensionPoint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreprocessingStepContext extends ParserRuleContext {
		public TerminalNode PREPROCESSING() { return getToken(StatChartsParser.PREPROCESSING, 0); }
		public PretreatmentClauseContext pretreatmentClause() {
			return getRuleContext(PretreatmentClauseContext.class,0);
		}
		public PreprocessingStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessingStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPreprocessingStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPreprocessingStep(this);
		}
	}

	public final PreprocessingStepContext preprocessingStep() throws RecognitionException {
		PreprocessingStepContext _localctx = new PreprocessingStepContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_preprocessingStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			_la = _input.LA(1);
			if (_la==PRETREATMENT) {
				{
				setState(1145); pretreatmentClause();
				}
			}

			setState(1148); match(PREPROCESSING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcBodyContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public ProcBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterProcBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitProcBody(this);
		}
	}

	public final ProcBodyContext procBody() throws RecognitionException {
		ProcBodyContext _localctx = new ProcBodyContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_procBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredProcedureDefinitionContext extends ParserRuleContext {
		public ExecutionProcedureDefinitionContext executionProcedureDefinition() {
			return getRuleContext(ExecutionProcedureDefinitionContext.class,0);
		}
		public PostProcessingContext postProcessing() {
			return getRuleContext(PostProcessingContext.class,0);
		}
		public PreProcessingDefinitionContext preProcessingDefinition() {
			return getRuleContext(PreProcessingDefinitionContext.class,0);
		}
		public StructuredProcedureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredProcedureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStructuredProcedureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStructuredProcedureDefinition(this);
		}
	}

	public final StructuredProcedureDefinitionContext structuredProcedureDefinition() throws RecognitionException {
		StructuredProcedureDefinitionContext _localctx = new StructuredProcedureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_structuredProcedureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_la = _input.LA(1);
			if (_la==PREPROCESSING) {
				{
				setState(1152); preProcessingDefinition();
				}
			}

			setState(1155); executionProcedureDefinition();
			setState(1157);
			_la = _input.LA(1);
			if (_la==POSTPROCESSING) {
				{
				setState(1156); postProcessing();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreProcessingDefinitionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode PREPROCESSING() { return getToken(StatChartsParser.PREPROCESSING, 0); }
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public PreProcessingDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preProcessingDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPreProcessingDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPreProcessingDefinition(this);
		}
	}

	public final PreProcessingDefinitionContext preProcessingDefinition() throws RecognitionException {
		PreProcessingDefinitionContext _localctx = new PreProcessingDefinitionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_preProcessingDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159); match(PREPROCESSING);
			setState(1160); match(COLON);
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1161); procedureStep();
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PretreatmentClauseContext extends ParserRuleContext {
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public TerminalNode PRETREATMENT() { return getToken(StatChartsParser.PRETREATMENT, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public PretreatmentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pretreatmentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPretreatmentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPretreatmentClause(this);
		}
	}

	public final PretreatmentClauseContext pretreatmentClause() throws RecognitionException {
		PretreatmentClauseContext _localctx = new PretreatmentClauseContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_pretreatmentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167); match(PRETREATMENT);
			setState(1179);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1168); match(OPEN_PAR);
				setState(1169); id();
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1170); match(COMMA);
					setState(1171); id();
					}
					}
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1177); match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionProcedureDefinitionContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode EXECUTION() { return getToken(StatChartsParser.EXECUTION, 0); }
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public ExecutionProcedureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionProcedureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExecutionProcedureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExecutionProcedureDefinition(this);
		}
	}

	public final ExecutionProcedureDefinitionContext executionProcedureDefinition() throws RecognitionException {
		ExecutionProcedureDefinitionContext _localctx = new ExecutionProcedureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_executionProcedureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181); match(EXECUTION);
			setState(1182); match(COLON);
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1183); procedureStep();
				}
				}
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostProcessingContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public ProcedureStepContext procedureStep(int i) {
			return getRuleContext(ProcedureStepContext.class,i);
		}
		public List<ProcedureStepContext> procedureStep() {
			return getRuleContexts(ProcedureStepContext.class);
		}
		public TerminalNode POSTPROCESSING() { return getToken(StatChartsParser.POSTPROCESSING, 0); }
		public PostProcessingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postProcessing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPostProcessing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPostProcessing(this);
		}
	}

	public final PostProcessingContext postProcessing() throws RecognitionException {
		PostProcessingContext _localctx = new PostProcessingContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_postProcessing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189); match(POSTPROCESSING);
			setState(1190); match(COLON);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(1191); procedureStep();
				}
				}
				setState(1196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionContext extends ParserRuleContext {
		public ExecutionBlockContext executionBlock(int i) {
			return getRuleContext(ExecutionBlockContext.class,i);
		}
		public List<ExecutionBlockContext> executionBlock() {
			return getRuleContexts(ExecutionBlockContext.class);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode RUNS() { return getToken(StatChartsParser.RUNS, 0); }
		public ExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExecution(this);
		}
	}

	public final ExecutionContext execution() throws RecognitionException {
		ExecutionContext _localctx = new ExecutionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_execution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1197); match(RUNS);
			setState(1198); match(COLON);
			setState(1200); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1199); executionBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionBlockContext extends ParserRuleContext {
		public ExecutionConfContext executionConf() {
			return getRuleContext(ExecutionConfContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExecutionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExecutionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExecutionBlock(this);
		}
	}

	public final ExecutionBlockContext executionBlock() throws RecognitionException {
		ExecutionBlockContext _localctx = new ExecutionBlockContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_executionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204); id();
			setState(1205); match(COLON);
			setState(1206); executionConf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutionConfContext extends ParserRuleContext {
		public ResultExecutionContext resultExecution() {
			return getRuleContext(ResultExecutionContext.class,0);
		}
		public ExecStartContext execStart() {
			return getRuleContext(ExecStartContext.class,0);
		}
		public ExecEndContext execEnd() {
			return getRuleContext(ExecEndContext.class,0);
		}
		public AnalysesExecutionContext analysesExecution() {
			return getRuleContext(AnalysesExecutionContext.class,0);
		}
		public ExecutionConfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionConf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExecutionConf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExecutionConf(this);
		}
	}

	public final ExecutionConfContext executionConf() throws RecognitionException {
		ExecutionConfContext _localctx = new ExecutionConfContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_executionConf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(1208); execStart();
				setState(1209); execEnd();
				}
			}

			setState(1213); resultExecution();
			setState(1215);
			_la = _input.LA(1);
			if (_la==ANALYSES) {
				{
				setState(1214); analysesExecution();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecStartContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode START() { return getToken(StatChartsParser.START, 0); }
		public ExecStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExecStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExecStart(this);
		}
	}

	public final ExecStartContext execStart() throws RecognitionException {
		ExecStartContext _localctx = new ExecStartContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_execStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217); match(START);
			setState(1218); match(COLON);
			setState(1219); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecEndContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode END() { return getToken(StatChartsParser.END, 0); }
		public ExecEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExecEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExecEnd(this);
		}
	}

	public final ExecEndContext execEnd() throws RecognitionException {
		ExecEndContext _localctx = new ExecEndContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_execEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221); match(END);
			setState(1222); match(COLON);
			setState(1223); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultExecutionContext extends ParserRuleContext {
		public List<FileExecContext> fileExec() {
			return getRuleContexts(FileExecContext.class);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public FileExecContext fileExec(int i) {
			return getRuleContext(FileExecContext.class,i);
		}
		public TerminalNode RESULT() { return getToken(StatChartsParser.RESULT, 0); }
		public ResultExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultExecution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterResultExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitResultExecution(this);
		}
	}

	public final ResultExecutionContext resultExecution() throws RecognitionException {
		ResultExecutionContext _localctx = new ResultExecutionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_resultExecution);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225); match(RESULT);
			setState(1226); match(COLON);
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FILE) {
				{
				{
				setState(1227); fileExec();
				}
				}
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesExecutionContext extends ParserRuleContext {
		public AnalysesExecBlockContext analysesExecBlock(int i) {
			return getRuleContext(AnalysesExecBlockContext.class,i);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode ANALYSES() { return getToken(StatChartsParser.ANALYSES, 0); }
		public List<AnalysesExecBlockContext> analysesExecBlock() {
			return getRuleContexts(AnalysesExecBlockContext.class);
		}
		public AnalysesExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesExecution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAnalysesExecution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAnalysesExecution(this);
		}
	}

	public final AnalysesExecutionContext analysesExecution() throws RecognitionException {
		AnalysesExecutionContext _localctx = new AnalysesExecutionContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_analysesExecution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1233); match(ANALYSES);
			setState(1234); match(COLON);
			setState(1236); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1235); analysesExecBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1238); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalysesExecBlockContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AnalFunctionsContext analFunctions() {
			return getRuleContext(AnalFunctionsContext.class,0);
		}
		public AnalysesExecBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analysesExecBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAnalysesExecBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAnalysesExecBlock(this);
		}
	}

	public final AnalysesExecBlockContext analysesExecBlock() throws RecognitionException {
		AnalysesExecBlockContext _localctx = new AnalysesExecBlockContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_analysesExecBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240); id();
			setState(1241); match(COLON);
			setState(1242); analFunctions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnalFunctionsContext extends ParserRuleContext {
		public ExeFunctionContext exeFunction(int i) {
			return getRuleContext(ExeFunctionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public List<ExeFunctionContext> exeFunction() {
			return getRuleContexts(ExeFunctionContext.class);
		}
		public AnalFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterAnalFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitAnalFunctions(this);
		}
	}

	public final AnalFunctionsContext analFunctions() throws RecognitionException {
		AnalFunctionsContext _localctx = new AnalFunctionsContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_analFunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244); exeFunction();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1245); match(COMMA);
				setState(1246); exeFunction();
				}
				}
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeFunctionContext extends ParserRuleContext {
		public ExeArgumentsContext exeArguments() {
			return getRuleContext(ExeArgumentsContext.class,0);
		}
		public FriedmanFunctionContext friedmanFunction() {
			return getRuleContext(FriedmanFunctionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public ExeFunctionTypesContext exeFunctionTypes() {
			return getRuleContext(ExeFunctionTypesContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public PearsonFunctionContext pearsonFunction() {
			return getRuleContext(PearsonFunctionContext.class,0);
		}
		public ExeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExeFunction(this);
		}
	}

	public final ExeFunctionContext exeFunction() throws RecognitionException {
		ExeFunctionContext _localctx = new ExeFunctionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_exeFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_la = _input.LA(1);
			if (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (MEAN - 93)) | (1L << (MODE - 93)) | (1L << (MEDIAN - 93)) | (1L << (STDDEV - 93)) | (1L << (VARIANCE - 93)) | (1L << (IQR - 93)) | (1L << (RANGE - 93)) | (1L << (RANKING - 93)) | (1L << (CONFIDENCE_INTERVAL - 93)) | (1L << (PEARSON - 93)) | (1L << (BIVARIATE_REGRESSION - 93)) | (1L << (SPEARMAN - 93)) | (1L << (KENDALL - 93)) | (1L << (CRAMER - 93)) | (1L << (LOG_LINEAR - 93)) | (1L << (KOLMOGOROV_SMIRNOV - 93)) | (1L << (LILLIEFORS - 93)) | (1L << (SHAPIRO_WILK - 93)) | (1L << (LEVENE - 93)) | (1L << (T_STUDENT - 93)) | (1L << (WILCOXON - 93)) | (1L << (MCNEMAR - 93)) | (1L << (ANOVA - 93)) | (1L << (FACTANOVAWRS - 93)) | (1L << (FRIEDMAN - 93)) | (1L << (ALIGNED_FRIEDMAN - 93)) | (1L << (IMAN_DAVEPORT - 93)) | (1L << (QUADE - 93)) | (1L << (COCHRAN_Q - 93)) | (1L << (BONFERRONI_DUNN - 93)) | (1L << (HOLMS - 93)) | (1L << (HOCHBERG - 93)) | (1L << (HOMMEL - 93)) | (1L << (HOLLAND - 93)) | (1L << (ROM - 93)) | (1L << (FINNER - 93)) | (1L << (LI - 93)) | (1L << (SHAFFER - 93)) | (1L << (NAMENYI - 93)) | (1L << (TTEST - 93)) | (1L << (SIGN_TEST - 93)) | (1L << (CHI_SQUARE - 93)) | (1L << (KRUSKAL - 93)) | (1L << (FISHER - 93)) | (1L << (TUKEY - 93)))) != 0)) {
				{
				setState(1252); exeFunctionTypes();
				}
			}

			setState(1256);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1255); exeArguments();
				}
			}

			setState(1258); match(COLON);
			setState(1262);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case StringLiteral:
				{
				setState(1259); values();
				}
				break;
			case PVALUE:
				{
				setState(1260); friedmanFunction();
				}
				break;
			case OPEN_BRA:
				{
				setState(1261); pearsonFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264); value();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (IntegerLiteral - 169)) | (1L << (FloatingPointLiteral - 169)) | (1L << (BooleanLiteral - 169)) | (1L << (StringLiteral - 169)))) != 0)) {
				{
				{
				setState(1265); value();
				}
				}
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeFunctionTypesContext extends ParserRuleContext {
		public NhstFunctionContext nhstFunction() {
			return getRuleContext(NhstFunctionContext.class,0);
		}
		public CcFunctionContext ccFunction() {
			return getRuleContext(CcFunctionContext.class,0);
		}
		public VmFunctionContext vmFunction() {
			return getRuleContext(VmFunctionContext.class,0);
		}
		public CtmFunctionContext ctmFunction() {
			return getRuleContext(CtmFunctionContext.class,0);
		}
		public RFunctionContext rFunction() {
			return getRuleContext(RFunctionContext.class,0);
		}
		public CiFunctionContext ciFunction() {
			return getRuleContext(CiFunctionContext.class,0);
		}
		public ExeFunctionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeFunctionTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExeFunctionTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExeFunctionTypes(this);
		}
	}

	public final ExeFunctionTypesContext exeFunctionTypes() throws RecognitionException {
		ExeFunctionTypesContext _localctx = new ExeFunctionTypesContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_exeFunctionTypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			switch (_input.LA(1)) {
			case STDDEV:
			case VARIANCE:
			case IQR:
			case RANGE:
				{
				setState(1271); vmFunction();
				}
				break;
			case MEAN:
			case MODE:
			case MEDIAN:
				{
				setState(1272); ctmFunction();
				}
				break;
			case KOLMOGOROV_SMIRNOV:
			case LILLIEFORS:
			case SHAPIRO_WILK:
			case LEVENE:
			case T_STUDENT:
			case WILCOXON:
			case MCNEMAR:
			case ANOVA:
			case FACTANOVAWRS:
			case FRIEDMAN:
			case ALIGNED_FRIEDMAN:
			case IMAN_DAVEPORT:
			case QUADE:
			case COCHRAN_Q:
			case BONFERRONI_DUNN:
			case HOLMS:
			case HOCHBERG:
			case HOMMEL:
			case HOLLAND:
			case ROM:
			case FINNER:
			case LI:
			case SHAFFER:
			case NAMENYI:
			case TTEST:
			case SIGN_TEST:
			case CHI_SQUARE:
			case KRUSKAL:
			case FISHER:
			case TUKEY:
				{
				setState(1273); nhstFunction();
				}
				break;
			case PEARSON:
			case BIVARIATE_REGRESSION:
			case SPEARMAN:
			case KENDALL:
			case CRAMER:
			case LOG_LINEAR:
				{
				setState(1274); ccFunction();
				}
				break;
			case CONFIDENCE_INTERVAL:
				{
				setState(1275); ciFunction();
				}
				break;
			case RANKING:
				{
				setState(1276); rFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeDescriptionContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode DESCRIPTION() { return getToken(StatChartsParser.DESCRIPTION, 0); }
		public ExeDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExeDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExeDescription(this);
		}
	}

	public final ExeDescriptionContext exeDescription() throws RecognitionException {
		ExeDescriptionContext _localctx = new ExeDescriptionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_exeDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279); match(DESCRIPTION);
			setState(1280); match(COLON);
			setState(1281); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeArgumentsContext extends ParserRuleContext {
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public TerminalNode BAR() { return getToken(StatChartsParser.BAR, 0); }
		public TerminalNode COMMA() { return getToken(StatChartsParser.COMMA, 0); }
		public TerminalNode VS() { return getToken(StatChartsParser.VS, 0); }
		public TerminalNode PLUS() { return getToken(StatChartsParser.PLUS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(StatChartsParser.OPEN_PAR, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public TerminalNode CLOSE_PAR() { return getToken(StatChartsParser.CLOSE_PAR, 0); }
		public OtherParamContext otherParam() {
			return getRuleContext(OtherParamContext.class,0);
		}
		public ExeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExeArguments(this);
		}
	}

	public final ExeArgumentsContext exeArguments() throws RecognitionException {
		ExeArgumentsContext _localctx = new ExeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_exeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283); match(OPEN_PAR);
			setState(1284); arg();
			setState(1287);
			_la = _input.LA(1);
			if (_la==BAR) {
				{
				setState(1285); match(BAR);
				setState(1286); arg();
				}
			}

			setState(1291);
			_la = _input.LA(1);
			if (_la==VS) {
				{
				setState(1289); match(VS);
				setState(1290); arg();
				}
			}

			setState(1295);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1293); match(COMMA);
				setState(1294); otherParam();
				}
			}

			setState(1299);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(1297); match(PLUS);
				setState(1298); arg();
				}
			}

			setState(1301); match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherParamContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(StatChartsParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(StatChartsParser.OPEN_BRA, 0); }
		public OtherParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterOtherParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitOtherParam(this);
		}
	}

	public final OtherParamContext otherParam() throws RecognitionException {
		OtherParamContext _localctx = new OtherParamContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_otherParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303); match(OPEN_BRA);
			setState(1304); arg();
			setState(1305); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1307); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExeValuationContext extends ParserRuleContext {
		public TerminalNode PVALUE(int i) {
			return getToken(StatChartsParser.PVALUE, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(StatChartsParser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(StatChartsParser.COLON); }
		public List<TerminalNode> STHRESHOLD() { return getTokens(StatChartsParser.STHRESHOLD); }
		public TerminalNode STHRESHOLD(int i) {
			return getToken(StatChartsParser.STHRESHOLD, i);
		}
		public List<TerminalNode> PVALUE() { return getTokens(StatChartsParser.PVALUE); }
		public ExeValuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exeValuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExeValuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExeValuation(this);
		}
	}

	public final ExeValuationContext exeValuation() throws RecognitionException {
		ExeValuationContext _localctx = new ExeValuationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_exeValuation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			_la = _input.LA(1);
			if ( !(_la==PVALUE || _la==STHRESHOLD) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1310); match(COLON);
			setState(1311); value();
			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PVALUE || _la==STHRESHOLD) {
				{
				{
				setState(1312);
				_la = _input.LA(1);
				if ( !(_la==PVALUE || _la==STHRESHOLD) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1313); match(COLON);
				setState(1314); value();
				}
				}
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileExecContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(StatChartsParser.FILE, 0); }
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public FileExecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileExec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFileExec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFileExec(this);
		}
	}

	public final FileExecContext fileExec() throws RecognitionException {
		FileExecContext _localctx = new FileExecContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_fileExec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320); match(FILE);
			setState(1321); match(COLON);
			setState(1322); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Freedom_degreesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode FREEDOM_DEGREES() { return getToken(StatChartsParser.FREEDOM_DEGREES, 0); }
		public Freedom_degreesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freedom_degrees; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFreedom_degrees(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFreedom_degrees(this);
		}
	}

	public final Freedom_degreesContext freedom_degrees() throws RecognitionException {
		Freedom_degreesContext _localctx = new Freedom_degreesContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_freedom_degrees);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); match(FREEDOM_DEGREES);
			setState(1325); match(COLON);
			setState(1326); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FdParamContext extends ParserRuleContext {
		public ExeArgumentsContext exeArguments() {
			return getRuleContext(ExeArgumentsContext.class,0);
		}
		public ExeValuationContext exeValuation() {
			return getRuleContext(ExeValuationContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(StatChartsParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(StatChartsParser.OPEN_BRA, 0); }
		public FdParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFdParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFdParam(this);
		}
	}

	public final FdParamContext fdParam() throws RecognitionException {
		FdParamContext _localctx = new FdParamContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_fdParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328); match(OPEN_BRA);
			setState(1329); exeArguments();
			setState(1330); exeValuation();
			setState(1331); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyTempDiffContext extends ParserRuleContext {
		public PairIVContext pairIV() {
			return getRuleContext(PairIVContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(StatChartsParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(StatChartsParser.OPEN_BRA, 0); }
		public BodyTempDiffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyTempDiff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterBodyTempDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitBodyTempDiff(this);
		}
	}

	public final BodyTempDiffContext bodyTempDiff() throws RecognitionException {
		BodyTempDiffContext _localctx = new BodyTempDiffContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_bodyTempDiff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333); match(OPEN_BRA);
			setState(1334); pairIV();
			setState(1335); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairIVContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<NumericSetContext> numericSet() {
			return getRuleContexts(NumericSetContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(StatChartsParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<TerminalNode> COLON() { return getTokens(StatChartsParser.COLON); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public NumericSetContext numericSet(int i) {
			return getRuleContext(NumericSetContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public PairIVContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairIV; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPairIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPairIV(this);
		}
	}

	public final PairIVContext pairIV() throws RecognitionException {
		PairIVContext _localctx = new PairIVContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_pairIV);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(1337); id();
				}
				break;
			case N:
			case Z:
			case Q:
			case R:
			case I:
			case C:
				{
				setState(1338); numericSet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1341); match(COLON);
			setState(1342); value();
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1343); match(COMMA);
				setState(1346);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(1344); id();
					}
					break;
				case N:
				case Z:
				case Q:
				case R:
				case I:
				case C:
					{
					setState(1345); numericSet();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1348); match(COLON);
				setState(1349); value();
				}
				}
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1356); value();
				}
				}
				setState(1359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (IntegerLiteral - 169)) | (1L << (FloatingPointLiteral - 169)) | (1L << (BooleanLiteral - 169)) | (1L << (StringLiteral - 169)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FriedmanFunctionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExeDescriptionContext exeDescription() {
			return getRuleContext(ExeDescriptionContext.class,0);
		}
		public FdParamContext fdParam(int i) {
			return getRuleContext(FdParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public TerminalNode PVALUE() { return getToken(StatChartsParser.PVALUE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public Freedom_degreesContext freedom_degrees() {
			return getRuleContext(Freedom_degreesContext.class,0);
		}
		public List<FdParamContext> fdParam() {
			return getRuleContexts(FdParamContext.class);
		}
		public FriedmanFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_friedmanFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFriedmanFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFriedmanFunction(this);
		}
	}

	public final FriedmanFunctionContext friedmanFunction() throws RecognitionException {
		FriedmanFunctionContext _localctx = new FriedmanFunctionContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_friedmanFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361); match(PVALUE);
			setState(1362); match(COLON);
			setState(1363); value();
			setState(1366);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1364); match(COMMA);
				setState(1365); exeDescription();
				}
				break;
			}
			setState(1370);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1368); match(COMMA);
				setState(1369); freedom_degrees();
				}
				break;
			}
			setState(1376);
			_la = _input.LA(1);
			if (_la==OPEN_BRA) {
				{
				setState(1372); fdParam();
				{
				setState(1373); match(COMMA);
				setState(1374); fdParam();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PearsonFunctionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public NumericSetContext numericSet() {
			return getRuleContext(NumericSetContext.class,0);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(StatChartsParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public List<TerminalNode> COLON() { return getTokens(StatChartsParser.COLON); }
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public RegresionBlockContext regresionBlock() {
			return getRuleContext(RegresionBlockContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(StatChartsParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(StatChartsParser.OPEN_BRA, 0); }
		public PearsonFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pearsonFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterPearsonFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitPearsonFunction(this);
		}
	}

	public final PearsonFunctionContext pearsonFunction() throws RecognitionException {
		PearsonFunctionContext _localctx = new PearsonFunctionContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_pearsonFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378); match(OPEN_BRA);
			setState(1379); numericSet();
			setState(1380); match(COLON);
			setState(1381); value();
			setState(1382); match(COMMA);
			setState(1383); arg();
			setState(1384); match(COLON);
			setState(1385); value();
			setState(1386); match(COMMA);
			setState(1387); regresionBlock();
			setState(1388); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegresionBlockContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RegresionContext regresion() {
			return getRuleContext(RegresionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public RegresionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRegresionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRegresionBlock(this);
		}
	}

	public final RegresionBlockContext regresionBlock() throws RecognitionException {
		RegresionBlockContext _localctx = new RegresionBlockContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_regresionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390); regresion();
			setState(1391); match(COLON);
			setState(1392); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegresionContext extends ParserRuleContext {
		public TerminalNode RRES() { return getToken(StatChartsParser.RRES, 0); }
		public RegresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRegresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRegresion(this);
		}
	}

	public final RegresionContext regresion() throws RecognitionException {
		RegresionContext _localctx = new RegresionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_regresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394); match(RRES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StatChartsParser.Identifier, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmailContext extends ParserRuleContext {
		public TerminalNode Email() { return getToken(StatChartsParser.Email, 0); }
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitEmail(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1398); match(Email);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionNumberContext extends ParserRuleContext {
		public TerminalNode ExplicitVersionNumber() { return getToken(StatChartsParser.ExplicitVersionNumber, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(StatChartsParser.FloatingPointLiteral, 0); }
		public VersionNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterVersionNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitVersionNumber(this);
		}
	}

	public final VersionNumberContext versionNumber() throws RecognitionException {
		VersionNumberContext _localctx = new VersionNumberContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_versionNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_la = _input.LA(1);
			if ( !(_la==ExplicitVersionNumber || _la==FloatingPointLiteral) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(StatChartsParser.Url, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402); match(Url);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepUrlContext extends ParserRuleContext {
		public TerminalNode Url() { return getToken(StatChartsParser.Url, 0); }
		public RepUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterRepUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitRepUrl(this);
		}
	}

	public final RepUrlContext repUrl() throws RecognitionException {
		RepUrlContext _localctx = new RepUrlContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_repUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1404); match(Url);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(StatChartsParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(StatChartsParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(StatChartsParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(StatChartsParser.BooleanLiteral, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			_la = _input.LA(1);
			if ( !(((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (IntegerLiteral - 169)) | (1L << (FloatingPointLiteral - 169)) | (1L << (BooleanLiteral - 169)) | (1L << (StringLiteral - 169)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(StatChartsParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(StatChartsParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(StatChartsParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructValueContext extends ParserRuleContext {
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode CLOSE_BRA() { return getToken(StatChartsParser.CLOSE_BRA, 0); }
		public TerminalNode OPEN_BRA() { return getToken(StatChartsParser.OPEN_BRA, 0); }
		public StructValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterStructValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitStructValue(this);
		}
	}

	public final StructValueContext structValue() throws RecognitionException {
		StructValueContext _localctx = new StructValueContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_structValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410); match(OPEN_BRA);
			setState(1411); fields();
			setState(1412); match(CLOSE_BRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(StatChartsParser.COMMA); }
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(StatChartsParser.COMMA, i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitFields(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414); field();
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1415); match(COMMA);
				setState(1416); field();
				}
				}
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StructValueContext structValue() {
			return getRuleContext(StructValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(StatChartsParser.COLON, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422); id();
			setState(1423); match(COLON);
			setState(1426);
			switch (_input.LA(1)) {
			case OPEN_BRA:
				{
				setState(1424); structValue();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case StringLiteral:
				{
				setState(1425); value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericSetContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(StatChartsParser.N, 0); }
		public TerminalNode I() { return getToken(StatChartsParser.I, 0); }
		public TerminalNode Z() { return getToken(StatChartsParser.Z, 0); }
		public TerminalNode C() { return getToken(StatChartsParser.C, 0); }
		public TerminalNode Q() { return getToken(StatChartsParser.Q, 0); }
		public TerminalNode R() { return getToken(StatChartsParser.R, 0); }
		public NumericSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterNumericSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitNumericSet(this);
		}
	}

	public final NumericSetContext numericSet() throws RecognitionException {
		NumericSetContext _localctx = new NumericSetContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_numericSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (N - 85)) | (1L << (Z - 85)) | (1L << (Q - 85)) | (1L << (R - 85)) | (1L << (I - 85)) | (1L << (C - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionPointContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(StatChartsParser.Identifier, 0); }
		public TerminalNode EXTENSION_POINT_CONTENT() { return getToken(StatChartsParser.EXTENSION_POINT_CONTENT, 0); }
		public ExtensionPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).enterExtensionPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatChartsListener ) ((StatChartsListener)listener).exitExtensionPoint(this);
		}
	}

	public final ExtensionPointContext extensionPoint() throws RecognitionException {
		ExtensionPointContext _localctx = new ExtensionPointContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_extensionPoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430); match(Identifier);
			setState(1431); match(EXTENSION_POINT_CONTENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u00b6\u059c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\5\3\u0156\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0164\n\5\5\5\u0166\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\5\t\u0173\n\t\3\t\3\t\3\t\3\t\5\t\u0179\n\t\3\t\3\t\3\n\7\n\u017e\n\n"+
		"\f\n\16\n\u0181\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u018d"+
		"\n\f\3\f\3\f\3\f\5\f\u0192\n\f\3\f\3\f\3\f\5\f\u0197\n\f\3\f\3\f\3\r\3"+
		"\r\3\16\5\16\u019e\n\16\3\16\5\16\u01a1\n\16\3\16\5\16\u01a4\n\16\3\16"+
		"\5\16\u01a7\n\16\3\16\5\16\u01aa\n\16\3\17\3\17\3\17\6\17\u01af\n\17\r"+
		"\17\16\17\u01b0\3\20\3\20\3\20\6\20\u01b6\n\20\r\20\16\20\u01b7\3\21\3"+
		"\21\3\21\6\21\u01bd\n\21\r\21\16\21\u01be\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u01c6\n\22\3\22\3\22\5\22\u01ca\n\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u01df"+
		"\n\30\r\30\16\30\u01e0\3\31\3\31\3\31\3\31\3\31\3\32\5\32\u01e9\n\32\3"+
		"\32\5\32\u01ec\n\32\3\32\5\32\u01ef\n\32\3\32\5\32\u01f2\n\32\3\33\3\33"+
		"\3\33\6\33\u01f7\n\33\r\33\16\33\u01f8\3\34\3\34\3\34\6\34\u01fe\n\34"+
		"\r\34\16\34\u01ff\3\35\3\35\3\35\6\35\u0205\n\35\r\35\16\35\u0206\3\36"+
		"\3\36\3\37\3\37\3\37\6\37\u020e\n\37\r\37\16\37\u020f\3 \6 \u0213\n \r"+
		" \16 \u0214\3!\3!\3!\5!\u021a\n!\3!\5!\u021d\n!\3\"\3\"\3\"\3\"\3#\5#"+
		"\u0224\n#\3#\3#\3#\3#\3#\5#\u022b\n#\3$\3$\3$\6$\u0230\n$\r$\16$\u0231"+
		"\3$\3$\3$\6$\u0237\n$\r$\16$\u0238\3$\3$\3$\6$\u023e\n$\r$\16$\u023f\3"+
		"$\3$\3$\6$\u0245\n$\r$\16$\u0246\5$\u0249\n$\3%\3%\3%\5%\u024e\n%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u025d\n&\3\'\3\'\3(\3(\3(\6(\u0264"+
		"\n(\r(\16(\u0265\3)\3)\3)\5)\u026b\n)\3*\3*\5*\u026f\n*\3+\3+\3+\5+\u0274"+
		"\n+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\7.\u0280\n.\f.\16.\u0283\13.\3.\3.\5"+
		".\u0287\n.\3/\3/\3\60\3\60\5\60\u028d\n\60\3\61\3\61\3\62\3\62\3\62\5"+
		"\62\u0294\n\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\5\66\u02a4\n\66\3\67\3\67\5\67\u02a8\n\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\58\u02b2\n8\38\58\u02b5\n8\39\39\39\59\u02ba\n9\3"+
		":\3:\3:\3:\5:\u02c0\n:\3;\3;\3;\3;\3;\7;\u02c7\n;\f;\16;\u02ca\13;\3<"+
		"\3<\3<\3<\5<\u02d0\n<\3<\5<\u02d3\n<\3=\3=\3=\3=\3>\3>\3>\3>\7>\u02dd"+
		"\n>\f>\16>\u02e0\13>\3>\3>\3>\3>\3>\3>\3>\3>\7>\u02ea\n>\f>\16>\u02ed"+
		"\13>\3>\5>\u02f0\n>\3?\3?\3?\3@\3@\3@\3@\5@\u02f9\n@\3A\6A\u02fc\nA\r"+
		"A\16A\u02fd\3B\3B\5B\u0302\nB\3C\3C\3C\3C\7C\u0308\nC\fC\16C\u030b\13"+
		"C\3C\3C\3D\3D\3D\3D\7D\u0313\nD\fD\16D\u0316\13D\3D\3D\3E\3E\3E\3E\3F"+
		"\6F\u031f\nF\rF\16F\u0320\3G\3G\3G\6G\u0326\nG\rG\16G\u0327\3H\3H\3H\3"+
		"H\3H\3H\3H\5H\u0331\nH\3I\3I\3I\3I\5I\u0337\nI\3I\3I\3I\3I\3J\3J\3K\3"+
		"K\3K\3K\3K\7K\u0344\nK\fK\16K\u0347\13K\3K\3K\3L\3L\3M\3M\3M\3M\3M\7M"+
		"\u0352\nM\fM\16M\u0355\13M\3M\3M\3N\3N\3O\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3"+
		"Q\3Q\7Q\u0367\nQ\fQ\16Q\u036a\13Q\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\3S\3S\3T"+
		"\3T\3U\3U\3U\3U\5U\u037d\nU\3V\5V\u0380\nV\3V\3V\7V\u0384\nV\fV\16V\u0387"+
		"\13V\3W\3W\3W\5W\u038c\nW\3X\3X\3Y\3Y\5Y\u0392\nY\3Z\3Z\3Z\5Z\u0397\n"+
		"Z\3Z\3Z\5Z\u039b\nZ\3Z\3Z\3Z\5Z\u03a0\nZ\5Z\u03a2\nZ\3[\5[\u03a5\n[\3"+
		"[\5[\u03a8\n[\3[\5[\u03ab\n[\3\\\3\\\3\\\3\\\7\\\u03b1\n\\\f\\\16\\\u03b4"+
		"\13\\\3]\3]\3]\3^\3^\3^\3^\7^\u03bd\n^\f^\16^\u03c0\13^\3_\3_\3_\3_\3"+
		"_\3`\3`\3`\3`\3`\3`\7`\u03cd\n`\f`\16`\u03d0\13`\3`\3`\3`\3a\3a\3a\3a"+
		"\3a\7a\u03da\na\fa\16a\u03dd\13a\3a\3a\3b\3b\3b\6b\u03e4\nb\rb\16b\u03e5"+
		"\3c\3c\3c\3c\3d\5d\u03ed\nd\3d\5d\u03f0\nd\3d\5d\u03f3\nd\3d\3d\5d\u03f7"+
		"\nd\3e\3e\3e\3e\3e\7e\u03fe\ne\fe\16e\u0401\13e\3f\3f\3f\3f\3f\7f\u0408"+
		"\nf\ff\16f\u040b\13f\3g\3g\5g\u040f\ng\3g\5g\u0412\ng\3g\5g\u0415\ng\3"+
		"h\3h\3h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\5l\u0429\nl\3l\5"+
		"l\u042c\nl\3m\3m\3m\3m\3m\7m\u0433\nm\fm\16m\u0436\13m\3n\3n\3n\3o\3o"+
		"\3o\3o\3o\7o\u0440\no\fo\16o\u0443\13o\3p\3p\3p\3q\3q\3q\3q\5q\u044c\n"+
		"q\3r\7r\u044f\nr\fr\16r\u0452\13r\3s\3s\3s\3s\3t\3t\3t\5t\u045b\nt\3t"+
		"\3t\3t\3t\7t\u0461\nt\ft\16t\u0464\13t\3t\3t\5t\u0468\nt\3u\3u\3u\3u\3"+
		"u\5u\u046f\nu\3v\3v\3w\3w\3x\3x\3y\5y\u0478\ny\3y\3y\3z\5z\u047d\nz\3"+
		"z\3z\3{\3{\3|\5|\u0484\n|\3|\3|\5|\u0488\n|\3}\3}\3}\7}\u048d\n}\f}\16"+
		"}\u0490\13}\3~\3~\3~\3~\3~\7~\u0497\n~\f~\16~\u049a\13~\3~\3~\5~\u049e"+
		"\n~\3\177\3\177\3\177\7\177\u04a3\n\177\f\177\16\177\u04a6\13\177\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u04ab\n\u0080\f\u0080\16\u0080\u04ae\13\u0080"+
		"\3\u0081\3\u0081\3\u0081\6\u0081\u04b3\n\u0081\r\u0081\16\u0081\u04b4"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\5\u0083\u04be"+
		"\n\u0083\3\u0083\3\u0083\5\u0083\u04c2\n\u0083\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\7\u0086"+
		"\u04cf\n\u0086\f\u0086\16\u0086\u04d2\13\u0086\3\u0087\3\u0087\3\u0087"+
		"\6\u0087\u04d7\n\u0087\r\u0087\16\u0087\u04d8\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u0089\7\u0089\u04e2\n\u0089\f\u0089\16\u0089"+
		"\u04e5\13\u0089\3\u008a\5\u008a\u04e8\n\u008a\3\u008a\5\u008a\u04eb\n"+
		"\u008a\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u04f1\n\u008a\3\u008b\3"+
		"\u008b\7\u008b\u04f5\n\u008b\f\u008b\16\u008b\u04f8\13\u008b\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0500\n\u008c\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u050a\n"+
		"\u008e\3\u008e\3\u008e\5\u008e\u050e\n\u008e\3\u008e\3\u008e\5\u008e\u0512"+
		"\n\u008e\3\u008e\3\u008e\5\u008e\u0516\n\u008e\3\u008e\3\u008e\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\7\u0091\u0526\n\u0091\f\u0091\16\u0091\u0529\13\u0091"+
		"\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0096"+
		"\3\u0096\5\u0096\u053e\n\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\5\u0096\u0545\n\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u054a\n\u0096\f"+
		"\u0096\16\u0096\u054d\13\u0096\3\u0097\6\u0097\u0550\n\u0097\r\u0097\16"+
		"\u0097\u0551\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0559\n\u0098"+
		"\3\u0098\3\u0098\5\u0098\u055d\n\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\5\u0098\u0563\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u058c\n\u00a4"+
		"\f\u00a4\16\u00a4\u058f\13\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5"+
		"\u0595\n\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\2\u00a8"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134"+
		"\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c"+
		"\2\17\3\2\30\31\4\2\u00ab\u00ab\u00ad\u00ad\3\2\u00a2\u00a3\3\2_a\3\2"+
		"be\3\2hm\3\2n\u008b\3\2\u0090\u0092\4\2NNPP\3\2\u00ac\u00ad\5\2\u00ab"+
		"\u00ab\u00ad\u00ae\u00b0\u00b0\3\2#%\3\2W\\\u059a\2\u014e\3\2\2\2\4\u0155"+
		"\3\2\2\2\6\u0157\3\2\2\2\b\u015c\3\2\2\2\n\u0167\3\2\2\2\f\u016a\3\2\2"+
		"\2\16\u016d\3\2\2\2\20\u016f\3\2\2\2\22\u017f\3\2\2\2\24\u0182\3\2\2\2"+
		"\26\u0186\3\2\2\2\30\u019a\3\2\2\2\32\u019d\3\2\2\2\34\u01ab\3\2\2\2\36"+
		"\u01b2\3\2\2\2 \u01b9\3\2\2\2\"\u01c0\3\2\2\2$\u01cb\3\2\2\2&\u01ce\3"+
		"\2\2\2(\u01d0\3\2\2\2*\u01d4\3\2\2\2,\u01d8\3\2\2\2.\u01de\3\2\2\2\60"+
		"\u01e2\3\2\2\2\62\u01e8\3\2\2\2\64\u01f3\3\2\2\2\66\u01fa\3\2\2\28\u0201"+
		"\3\2\2\2:\u0208\3\2\2\2<\u020a\3\2\2\2>\u0212\3\2\2\2@\u0216\3\2\2\2B"+
		"\u021e\3\2\2\2D\u022a\3\2\2\2F\u0248\3\2\2\2H\u024a\3\2\2\2J\u025c\3\2"+
		"\2\2L\u025e\3\2\2\2N\u0260\3\2\2\2P\u026a\3\2\2\2R\u026e\3\2\2\2T\u0270"+
		"\3\2\2\2V\u0278\3\2\2\2X\u027a\3\2\2\2Z\u027c\3\2\2\2\\\u0288\3\2\2\2"+
		"^\u028c\3\2\2\2`\u028e\3\2\2\2b\u0290\3\2\2\2d\u0299\3\2\2\2f\u029b\3"+
		"\2\2\2h\u029d\3\2\2\2j\u02a3\3\2\2\2l\u02a5\3\2\2\2n\u02ad\3\2\2\2p\u02b9"+
		"\3\2\2\2r\u02bb\3\2\2\2t\u02c1\3\2\2\2v\u02cb\3\2\2\2x\u02d4\3\2\2\2z"+
		"\u02ef\3\2\2\2|\u02f1\3\2\2\2~\u02f4\3\2\2\2\u0080\u02fb\3\2\2\2\u0082"+
		"\u0301\3\2\2\2\u0084\u0303\3\2\2\2\u0086\u030e\3\2\2\2\u0088\u0319\3\2"+
		"\2\2\u008a\u031e\3\2\2\2\u008c\u0322\3\2\2\2\u008e\u0330\3\2\2\2\u0090"+
		"\u0332\3\2\2\2\u0092\u033c\3\2\2\2\u0094\u033e\3\2\2\2\u0096\u034a\3\2"+
		"\2\2\u0098\u034c\3\2\2\2\u009a\u0358\3\2\2\2\u009c\u035a\3\2\2\2\u009e"+
		"\u035f\3\2\2\2\u00a0\u0361\3\2\2\2\u00a2\u036d\3\2\2\2\u00a4\u036f\3\2"+
		"\2\2\u00a6\u0376\3\2\2\2\u00a8\u037c\3\2\2\2\u00aa\u037f\3\2\2\2\u00ac"+
		"\u0388\3\2\2\2\u00ae\u038d\3\2\2\2\u00b0\u0391\3\2\2\2\u00b2\u03a1\3\2"+
		"\2\2\u00b4\u03a4\3\2\2\2\u00b6\u03ac\3\2\2\2\u00b8\u03b5\3\2\2\2\u00ba"+
		"\u03b8\3\2\2\2\u00bc\u03c1\3\2\2\2\u00be\u03c6\3\2\2\2\u00c0\u03d4\3\2"+
		"\2\2\u00c2\u03e0\3\2\2\2\u00c4\u03e7\3\2\2\2\u00c6\u03ec\3\2\2\2\u00c8"+
		"\u03f8\3\2\2\2\u00ca\u0402\3\2\2\2\u00cc\u040c\3\2\2\2\u00ce\u0416\3\2"+
		"\2\2\u00d0\u0419\3\2\2\2\u00d2\u041d\3\2\2\2\u00d4\u0421\3\2\2\2\u00d6"+
		"\u0425\3\2\2\2\u00d8\u042d\3\2\2\2\u00da\u0437\3\2\2\2\u00dc\u043a\3\2"+
		"\2\2\u00de\u0444\3\2\2\2\u00e0\u0447\3\2\2\2\u00e2\u0450\3\2\2\2\u00e4"+
		"\u0453\3\2\2\2\u00e6\u0457\3\2\2\2\u00e8\u046e\3\2\2\2\u00ea\u0470\3\2"+
		"\2\2\u00ec\u0472\3\2\2\2\u00ee\u0474\3\2\2\2\u00f0\u0477\3\2\2\2\u00f2"+
		"\u047c\3\2\2\2\u00f4\u0480\3\2\2\2\u00f6\u0483\3\2\2\2\u00f8\u0489\3\2"+
		"\2\2\u00fa\u0491\3\2\2\2\u00fc\u049f\3\2\2\2\u00fe\u04a7\3\2\2\2\u0100"+
		"\u04af\3\2\2\2\u0102\u04b6\3\2\2\2\u0104\u04bd\3\2\2\2\u0106\u04c3\3\2"+
		"\2\2\u0108\u04c7\3\2\2\2\u010a\u04cb\3\2\2\2\u010c\u04d3\3\2\2\2\u010e"+
		"\u04da\3\2\2\2\u0110\u04de\3\2\2\2\u0112\u04e7\3\2\2\2\u0114\u04f2\3\2"+
		"\2\2\u0116\u04ff\3\2\2\2\u0118\u0501\3\2\2\2\u011a\u0505\3\2\2\2\u011c"+
		"\u0519\3\2\2\2\u011e\u051d\3\2\2\2\u0120\u051f\3\2\2\2\u0122\u052a\3\2"+
		"\2\2\u0124\u052e\3\2\2\2\u0126\u0532\3\2\2\2\u0128\u0537\3\2\2\2\u012a"+
		"\u053d\3\2\2\2\u012c\u054f\3\2\2\2\u012e\u0553\3\2\2\2\u0130\u0564\3\2"+
		"\2\2\u0132\u0570\3\2\2\2\u0134\u0574\3\2\2\2\u0136\u0576\3\2\2\2\u0138"+
		"\u0578\3\2\2\2\u013a\u057a\3\2\2\2\u013c\u057c\3\2\2\2\u013e\u057e\3\2"+
		"\2\2\u0140\u0580\3\2\2\2\u0142\u0582\3\2\2\2\u0144\u0584\3\2\2\2\u0146"+
		"\u0588\3\2\2\2\u0148\u0590\3\2\2\2\u014a\u0596\3\2\2\2\u014c\u0598\3\2"+
		"\2\2\u014e\u014f\5\4\3\2\u014f\u0150\7\2\2\3\u0150\3\3\2\2\2\u0151\u0156"+
		"\5\6\4\2\u0152\u0156\5\b\5\2\u0153\u0156\5\n\6\2\u0154\u0156\5\f\7\2\u0155"+
		"\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2"+
		"\2\2\u0156\5\3\2\2\2\u0157\u0158\7\3\2\2\u0158\u0159\5\16\b\2\u0159\u015a"+
		"\7\7\2\2\u015a\u015b\7\u00b6\2\2\u015b\7\3\2\2\2\u015c\u015d\7\4\2\2\u015d"+
		"\u0165\5\16\b\2\u015e\u0163\7\b\2\2\u015f\u0160\7\n\2\2\u0160\u0161\7"+
		"\t\2\2\u0161\u0164\7\13\2\2\u0162\u0164\7\13\2\2\u0163\u015f\3\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u015e\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\t\3\2\2\2\u0167\u0168\7\5\2\2\u0168\u0169\5\16\b\2\u0169\13"+
		"\3\2\2\2\u016a\u016b\7\6\2\2\u016b\u016c\5\16\b\2\u016c\r\3\2\2\2\u016d"+
		"\u016e\5\u00b0Y\2\u016e\17\3\2\2\2\u016f\u0170\5\22\n\2\u0170\u0172\5"+
		"\26\f\2\u0171\u0173\5,\27\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\5\60\31\2\u0175\u0176\5N(\2\u0176\u0178\5h"+
		"\65\2\u0177\u0179\5\u00c2b\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\7\2\2\3\u017b\21\3\2\2\2\u017c\u017e\5\24\13"+
		"\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\23\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\16\2\2\u0183"+
		"\u0184\7\u00a8\2\2\u0184\u0185\b\13\1\2\u0185\25\3\2\2\2\u0186\u0187\7"+
		"\17\2\2\u0187\u0188\7\u00b4\2\2\u0188\u018c\5\u0136\u009c\2\u0189\u018a"+
		"\7\21\2\2\u018a\u018b\7\u00b4\2\2\u018b\u018d\5\u013a\u009e\2\u018c\u0189"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0191\3\2\2\2\u018e\u018f\7\22\2\2"+
		"\u018f\u0190\7\u00b4\2\2\u0190\u0192\5\u013e\u00a0\2\u0191\u018e\3\2\2"+
		"\2\u0191\u0192\3\2\2\2\u0192\u0196\3\2\2\2\u0193\u0194\7\20\2\2\u0194"+
		"\u0195\7\u00b4\2\2\u0195\u0197\5\30\r\2\u0196\u0193\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\5\32\16\2\u0199\27\3\2\2\2\u019a"+
		"\u019b\5\u014c\u00a7\2\u019b\31\3\2\2\2\u019c\u019e\5\34\17\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\5\36\20\2"+
		"\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4"+
		"\5 \21\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u01a7\5(\25\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u01aa\5*\26\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\33\3\2\2\2\u01ab\u01ac\7\23\2\2\u01ac\u01ae\7\u00b4\2\2\u01ad\u01af\7"+
		"\u00b0\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2"+
		"\u01b0\u01b1\3\2\2\2\u01b1\35\3\2\2\2\u01b2\u01b3\7\24\2\2\u01b3\u01b5"+
		"\7\u00b4\2\2\u01b4\u01b6\7\u00b0\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3"+
		"\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\37\3\2\2\2\u01b9"+
		"\u01ba\7\25\2\2\u01ba\u01bc\7\u00b4\2\2\u01bb\u01bd\5\"\22\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"!\3\2\2\2\u01c0\u01c1\5\u0136\u009c\2\u01c1\u01c2\7\u0093\2\2\u01c2\u01c3"+
		"\5\u0138\u009d\2\u01c3\u01c5\7\u0094\2\2\u01c4\u01c6\5$\23\2\u01c5\u01c4"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c8\7\u009b\2"+
		"\2\u01c8\u01ca\5&\24\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca#"+
		"\3\2\2\2\u01cb\u01cc\7\u009a\2\2\u01cc\u01cd\5\u0136\u009c\2\u01cd%\3"+
		"\2\2\2\u01ce\u01cf\t\2\2\2\u01cf\'\3\2\2\2\u01d0\u01d1\7\26\2\2\u01d1"+
		"\u01d2\7\u00b4\2\2\u01d2\u01d3\7\u00b0\2\2\u01d3)\3\2\2\2\u01d4\u01d5"+
		"\7\27\2\2\u01d5\u01d6\7\u00b4\2\2\u01d6\u01d7\7\u00b0\2\2\u01d7+\3\2\2"+
		"\2\u01d8\u01d9\7\32\2\2\u01d9\u01da\7\u00b4\2\2\u01da\u01db\5.\30\2\u01db"+
		"\u01dc\b\27\1\2\u01dc-\3\2\2\2\u01dd\u01df\5\u0148\u00a5\2\u01de\u01dd"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"/\3\2\2\2\u01e2\u01e3\7\33\2\2\u01e3\u01e4\7\u00b4\2\2\u01e4\u01e5\5\62"+
		"\32\2\u01e5\u01e6\b\31\1\2\u01e6\61\3\2\2\2\u01e7\u01e9\5\64\33\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\5\66"+
		"\34\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01ef\58\35\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01f2\5<\37\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\63\3\2\2\2\u01f3\u01f4\7\34\2\2\u01f4\u01f6\7\u00b4\2\2\u01f5\u01f7\5"+
		"@!\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\65\3\2\2\2\u01fa\u01fb\7\35\2\2\u01fb\u01fd\7\u00b4"+
		"\2\2\u01fc\u01fe\5@!\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\67\3\2\2\2\u0201\u0202\7\36\2\2\u0202"+
		"\u0204\7\u00b4\2\2\u0203\u0205\5:\36\2\u0204\u0203\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u02079\3\2\2\2\u0208"+
		"\u0209\5@!\2\u0209;\3\2\2\2\u020a\u020b\7\37\2\2\u020b\u020d\7\u00b4\2"+
		"\2\u020c\u020e\5> \2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210=\3\2\2\2\u0211\u0213\5@!\2\u0212\u0211"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"?\3\2\2\2\u0216\u0217\5\u0136\u009c\2\u0217\u0219\5D#\2\u0218\u021a\5"+
		"J&\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u021d\5B\"\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021dA\3\2\2\2\u021e"+
		"\u021f\7 \2\2\u021f\u0220\7\u009d\2\2\u0220\u0221\5\u0136\u009c\2\u0221"+
		"C\3\2\2\2\u0222\u0224\7!\2\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\7\"\2\2\u0226\u022b\5F$\2\u0227\u022b\5\u0142"+
		"\u00a2\2\u0228\u0229\7\u009d\2\2\u0229\u022b\5\u014a\u00a6\2\u022a\u0223"+
		"\3\2\2\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022bE\3\2\2\2\u022c"+
		"\u022f\7\u00b0\2\2\u022d\u022e\7\u00b3\2\2\u022e\u0230\7\u00b0\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2"+
		"\2\2\u0232\u0249\3\2\2\2\u0233\u0236\7\u00ab\2\2\u0234\u0235\7\u00b3\2"+
		"\2\u0235\u0237\7\u00ab\2\2\u0236\u0234\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0249\3\2\2\2\u023a\u023d\7\u00ad"+
		"\2\2\u023b\u023c\7\u00b3\2\2\u023c\u023e\7\u00ad\2\2\u023d\u023b\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0249"+
		"\3\2\2\2\u0241\u0244\5H%\2\u0242\u0243\7\u00b3\2\2\u0243\u0245\5H%\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0249\3\2\2\2\u0248\u022c\3\2\2\2\u0248\u0233\3\2\2\2\u0248"+
		"\u023a\3\2\2\2\u0248\u0241\3\2\2\2\u0249G\3\2\2\2\u024a\u024b\5\u0136"+
		"\u009c\2\u024b\u024d\7\u0093\2\2\u024c\u024e\5\u0146\u00a4\2\u024d\u024c"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\7\u0094\2"+
		"\2\u0250I\3\2\2\2\u0251\u0252\7&\2\2\u0252\u0253\7\u0097\2\2\u0253\u0254"+
		"\5L\'\2\u0254\u0255\7\u00b3\2\2\u0255\u0256\5L\'\2\u0256\u0257\7\u0098"+
		"\2\2\u0257\u025d\3\2\2\2\u0258\u0259\7^\2\2\u0259\u025d\5L\'\2\u025a\u025b"+
		"\7]\2\2\u025b\u025d\5L\'\2\u025c\u0251\3\2\2\2\u025c\u0258\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025dK\3\2\2\2\u025e\u025f\t\3\2\2\u025fM\3\2\2\2\u0260"+
		"\u0261\7\'\2\2\u0261\u0263\7\u00b4\2\2\u0262\u0264\5P)\2\u0263\u0262\3"+
		"\2\2\2\u0264\u0265\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"O\3\2\2\2\u0267\u026b\5R*\2\u0268\u026b\5^\60\2\u0269\u026b\5f\64\2\u026a"+
		"\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026bQ\3\2\2\2"+
		"\u026c\u026f\5\\/\2\u026d\u026f\5T+\2\u026e\u026c\3\2\2\2\u026e\u026d"+
		"\3\2\2\2\u026fS\3\2\2\2\u0270\u0271\5V,\2\u0271\u0273\7\u009f\2\2\u0272"+
		"\u0274\7\u00a0\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u0276\7\u009e\2\2\u0276\u0277\5d\63\2\u0277U\3\2\2\2\u0278"+
		"\u0279\5Z.\2\u0279W\3\2\2\2\u027a\u027b\5Z.\2\u027bY\3\2\2\2\u027c\u0281"+
		"\5\u0136\u009c\2\u027d\u027e\7\u00b3\2\2\u027e\u0280\5\u0136\u009c\2\u027f"+
		"\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0286\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285\7\t\2\2\u0285"+
		"\u0287\5\u0136\u009c\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287["+
		"\3\2\2\2\u0288\u0289\7(\2\2\u0289]\3\2\2\2\u028a\u028d\5`\61\2\u028b\u028d"+
		"\5b\62\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d_\3\2\2\2\u028e"+
		"\u028f\7)\2\2\u028fa\3\2\2\2\u0290\u0291\5d\63\2\u0291\u0293\7\u009c\2"+
		"\2\u0292\u0294\t\4\2\2\u0293\u0292\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0296\7\u00a4\2\2\u0296\u0297\7\u00a5\2\2\u0297\u0298\5"+
		"V,\2\u0298c\3\2\2\2\u0299\u029a\5\u0136\u009c\2\u029ae\3\2\2\2\u029b\u029c"+
		"\7*\2\2\u029cg\3\2\2\2\u029d\u029e\7+\2\2\u029e\u029f\7\u00b4\2\2\u029f"+
		"\u02a0\5j\66\2\u02a0i\3\2\2\2\u02a1\u02a4\5l\67\2\u02a2\u02a4\5\u014c"+
		"\u00a7\2\u02a3\u02a1\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4k\3\2\2\2\u02a5"+
		"\u02a7\5n8\2\u02a6\u02a8\5v<\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2"+
		"\u02a8\u02a9\3\2\2\2\u02a9\u02aa\5x=\2\u02aa\u02ab\5~@\2\u02ab\u02ac\5"+
		"\u0088E\2\u02acm\3\2\2\2\u02ad\u02ae\7,\2\2\u02ae\u02af\7\u00b4\2\2\u02af"+
		"\u02b1\5p9\2\u02b0\u02b2\5r:\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2"+
		"\u02b2\u02b4\3\2\2\2\u02b3\u02b5\5t;\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5o\3\2\2\2\u02b6\u02ba\7;\2\2\u02b7\u02b8\7<\2\2\u02b8\u02ba"+
		"\7\u00b0\2\2\u02b9\u02b6\3\2\2\2\u02b9\u02b7\3\2\2\2\u02baq\3\2\2\2\u02bb"+
		"\u02bc\7-\2\2\u02bc\u02bf\7\u00b4\2\2\u02bd\u02c0\7;\2\2\u02be\u02c0\5"+
		"\u0136\u009c\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0s\3\2\2\2"+
		"\u02c1\u02c2\7/\2\2\u02c2\u02c3\7\u00b4\2\2\u02c3\u02c8\5\u0136\u009c"+
		"\2\u02c4\u02c5\7\u00b3\2\2\u02c5\u02c7\5\u0136\u009c\2\u02c6\u02c4\3\2"+
		"\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"u\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\7.\2\2\u02cc\u02cd\7\u00b4\2"+
		"\2\u02cd\u02cf\5\u0136\u009c\2\u02ce\u02d0\5r:\2\u02cf\u02ce\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02d3\5t;\2\u02d2\u02d1\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3w\3\2\2\2\u02d4\u02d5\7\61\2\2\u02d5\u02d6"+
		"\7\u00b4\2\2\u02d6\u02d7\5z>\2\u02d7y\3\2\2\2\u02d8\u02d9\7\u00a1\2\2"+
		"\u02d9\u02de\5\u0136\u009c\2\u02da\u02db\7\u00b3\2\2\u02db\u02dd\5\u0136"+
		"\u009c\2\u02dc\u02da\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e2\5|"+
		"?\2\u02e2\u02f0\3\2\2\2\u02e3\u02e4\5H%\2\u02e4\u02eb\5|?\2\u02e5\u02e6"+
		"\7\u00b3\2\2\u02e6\u02e7\5H%\2\u02e7\u02e8\5|?\2\u02e8\u02ea\3\2\2\2\u02e9"+
		"\u02e5\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2"+
		"\2\2\u02ec\u02f0\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02f0\5|?\2\u02ef\u02d8"+
		"\3\2\2\2\u02ef\u02e3\3\2\2\2\u02ef\u02ee\3\2\2\2\u02f0{\3\2\2\2\u02f1"+
		"\u02f2\7\60\2\2\u02f2\u02f3\7\u00ab\2\2\u02f3}\3\2\2\2\u02f4\u02f5\7\62"+
		"\2\2\u02f5\u02f8\7\u00b4\2\2\u02f6\u02f9\7;\2\2\u02f7\u02f9\5\u0080A\2"+
		"\u02f8\u02f6\3\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\177\3\2\2\2\u02fa\u02fc"+
		"\5\u0082B\2\u02fb\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fb\3\2\2"+
		"\2\u02fd\u02fe\3\2\2\2\u02fe\u0081\3\2\2\2\u02ff\u0302\5\u0084C\2\u0300"+
		"\u0302\5\u0086D\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2\2\u0302\u0083"+
		"\3\2\2\2\u0303\u0309\7G\2\2\u0304\u0305\5\u0136\u009c\2\u0305\u0306\7"+
		"\u00b3\2\2\u0306\u0308\3\2\2\2\u0307\u0304\3\2\2\2\u0308\u030b\3\2\2\2"+
		"\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b\u0309"+
		"\3\2\2\2\u030c\u030d\5H%\2\u030d\u0085\3\2\2\2\u030e\u0314\7F\2\2\u030f"+
		"\u0310\5\u0136\u009c\2\u0310\u0311\7\u00b3\2\2\u0311\u0313\3\2\2\2\u0312"+
		"\u030f\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2"+
		"\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2\2\2\u0317\u0318\5H%\2\u0318\u0087"+
		"\3\2\2\2\u0319\u031a\7\63\2\2\u031a\u031b\7\u00b4\2\2\u031b\u031c\5\u008a"+
		"F\2\u031c\u0089\3\2\2\2\u031d\u031f\5\u008cG\2\u031e\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u008b\3\2"+
		"\2\2\u0322\u0323\5\u0136\u009c\2\u0323\u0325\7\u00b4\2\2\u0324\u0326\5"+
		"\u008eH\2\u0325\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0325\3\2\2\2"+
		"\u0327\u0328\3\2\2\2\u0328\u008d\3\2\2\2\u0329\u0331\5\u0090I\2\u032a"+
		"\u0331\5\u0094K\2\u032b\u0331\5\u0098M\2\u032c\u0331\5\u009cO\2\u032d"+
		"\u0331\5\u00a0Q\2\u032e\u0331\5\u00a4S\2\u032f\u0331\5\u014c\u00a7\2\u0330"+
		"\u0329\3\2\2\2\u0330\u032a\3\2\2\2\u0330\u032b\3\2\2\2\u0330\u032c\3\2"+
		"\2\2\u0330\u032d\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331"+
		"\u008f\3\2\2\2\u0332\u0333\5\u0092J\2\u0333\u0336\7\u0093\2\2\u0334\u0337"+
		"\5\u0094K\2\u0335\u0337\5\u0098M\2\u0336\u0334\3\2\2\2\u0336\u0335\3\2"+
		"\2\2\u0337\u0338\3\2\2\2\u0338\u0339\7\u00b3\2\2\u0339\u033a\5\u0136\u009c"+
		"\2\u033a\u033b\7\u0094\2\2\u033b\u0091\3\2\2\2\u033c\u033d\7f\2\2\u033d"+
		"\u0093\3\2\2\2\u033e\u033f\5\u0096L\2\u033f\u0340\7\u0093\2\2\u0340\u0345"+
		"\5\u00a8U\2\u0341\u0342\7\u00b3\2\2\u0342\u0344\5\u00a8U\2\u0343\u0341"+
		"\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346"+
		"\u0348\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\7\u0094\2\2\u0349\u0095"+
		"\3\2\2\2\u034a\u034b\t\5\2\2\u034b\u0097\3\2\2\2\u034c\u034d\5\u009aN"+
		"\2\u034d\u034e\7\u0093\2\2\u034e\u0353\5\u00a8U\2\u034f\u0350\7\u00b3"+
		"\2\2\u0350\u0352\5\u00a8U\2\u0351\u034f\3\2\2\2\u0352\u0355\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2"+
		"\2\2\u0356\u0357\7\u0094\2\2\u0357\u0099\3\2\2\2\u0358\u0359\t\6\2\2\u0359"+
		"\u009b\3\2\2\2\u035a\u035b\5\u009eP\2\u035b\u035c\7\u0093\2\2\u035c\u035d"+
		"\5\u00a8U\2\u035d\u035e\7\u0094\2\2\u035e\u009d\3\2\2\2\u035f\u0360\7"+
		"g\2\2\u0360\u009f\3\2\2\2\u0361\u0362\5\u00a2R\2\u0362\u0363\7\u0093\2"+
		"\2\u0363\u0368\5\u00a8U\2\u0364\u0365\7\u00b3\2\2\u0365\u0367\5\u00a8"+
		"U\2\u0366\u0364\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u0368\3\2\2\2\u036b\u036c\7\u0094"+
		"\2\2\u036c\u00a1\3\2\2\2\u036d\u036e\t\7\2\2\u036e\u00a3\3\2\2\2\u036f"+
		"\u0370\5\u00a6T\2\u0370\u0371\7\u0093\2\2\u0371\u0372\5\u00a8U\2\u0372"+
		"\u0373\7\u00b3\2\2\u0373\u0374\5\u00a8U\2\u0374\u0375\7\u0094\2\2\u0375"+
		"\u00a5\3\2\2\2\u0376\u0377\t\b\2\2\u0377\u00a7\3\2\2\2\u0378\u037d\5\u00ae"+
		"X\2\u0379\u037d\5\u00b0Y\2\u037a\u037d\5\u00aaV\2\u037b\u037d\3\2\2\2"+
		"\u037c\u0378\3\2\2\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b"+
		"\3\2\2\2\u037d\u00a9\3\2\2\2\u037e\u0380\5\u00acW\2\u037f\u037e\3\2\2"+
		"\2\u037f\u0380\3\2\2\2\u0380\u0385\3\2\2\2\u0381\u0382\7\u00b3\2\2\u0382"+
		"\u0384\5\u00acW\2\u0383\u0381\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383"+
		"\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u00ab\3\2\2\2\u0387\u0385\3\2\2\2\u0388"+
		"\u038b\5\u0136\u009c\2\u0389\u038a\7\u00a7\2\2\u038a\u038c\5\u0140\u00a1"+
		"\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u00ad\3\2\2\2\u038d\u038e"+
		"\t\3\2\2\u038e\u00af\3\2\2\2\u038f\u0392\5\u00b2Z\2\u0390\u0392\5\u00b4"+
		"[\2\u0391\u038f\3\2\2\2\u0391\u0390\3\2\2\2\u0392\u00b1\3\2\2\2\u0393"+
		"\u0396\5\u00bc_\2\u0394\u0395\7\u0099\2\2\u0395\u0397\5\u00be`\2\u0396"+
		"\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0399\7\u0099"+
		"\2\2\u0399\u039b\5\u00c0a\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u03a2\3\2\2\2\u039c\u039f\5\u00be`\2\u039d\u039e\7\u0099\2\2\u039e\u03a0"+
		"\5\u00c0a\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\3\2\2"+
		"\2\u03a1\u0393\3\2\2\2\u03a1\u039c\3\2\2\2\u03a2\u00b3\3\2\2\2\u03a3\u03a5"+
		"\5\u00b6\\\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\3\2\2"+
		"\2\u03a6\u03a8\5\u00b8]\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03aa\3\2\2\2\u03a9\u03ab\5\u00ba^\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab"+
		"\3\2\2\2\u03ab\u00b5\3\2\2\2\u03ac\u03ad\7\64\2\2\u03ad\u03b2\5\u0136"+
		"\u009c\2\u03ae\u03af\7\u00b3\2\2\u03af\u03b1\5\u0136\u009c\2\u03b0\u03ae"+
		"\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u00b7\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b6\7\65\2\2\u03b6\u03b7\5"+
		"\u00aaV\2\u03b7\u00b9\3\2\2\2\u03b8\u03b9\7\u00a1\2\2\u03b9\u03be\5\u0136"+
		"\u009c\2\u03ba\u03bb\7\u00b3\2\2\u03bb\u03bd\5\u0136\u009c\2\u03bc\u03ba"+
		"\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u00bb\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c2\7\66\2\2\u03c2\u03c3\7"+
		"\u0093\2\2\u03c3\u03c4\5\u00aaV\2\u03c4\u03c5\7\u0094\2\2\u03c5\u00bd"+
		"\3\2\2\2\u03c6\u03c7\7\67\2\2\u03c7\u03c8\7\u0093\2\2\u03c8\u03c9\7\u0095"+
		"\2\2\u03c9\u03ce\5\u0136\u009c\2\u03ca\u03cb\7\u00b3\2\2\u03cb\u03cd\5"+
		"\u0136\u009c\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2"+
		"\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03d2\7\u0096\2\2\u03d2\u03d3\7\u0094\2\2\u03d3\u00bf\3\2\2\2\u03d4\u03d5"+
		"\78\2\2\u03d5\u03d6\7\u0093\2\2\u03d6\u03db\5\u0136\u009c\2\u03d7\u03d8"+
		"\7\u00b3\2\2\u03d8\u03da\5\u0136\u009c\2\u03d9\u03d7\3\2\2\2\u03da\u03dd"+
		"\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03de\u03df\7\u0094\2\2\u03df\u00c1\3\2\2\2\u03e0\u03e1"+
		"\7=\2\2\u03e1\u03e3\7\u00b4\2\2\u03e2\u03e4\5\u00c4c\2\u03e3\u03e2\3\2"+
		"\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6"+
		"\u00c3\3\2\2\2\u03e7\u03e8\5\u0136\u009c\2\u03e8\u03e9\7\u00b4\2\2\u03e9"+
		"\u03ea\5\u00c6d\2\u03ea\u00c5\3\2\2\2\u03eb\u03ed\5\u00c8e\2\u03ec\u03eb"+
		"\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03f0\5\u00caf"+
		"\2\u03ef\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03f3"+
		"\5\u00d6l\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2"+
		"\2\u03f4\u03f6\5\u00e0q\2\u03f5\u03f7\5\u0100\u0081\2\u03f6\u03f5\3\2"+
		"\2\2\u03f6\u03f7\3\2\2\2\u03f7\u00c7\3\2\2\2\u03f8\u03f9\7?\2\2\u03f9"+
		"\u03fa\7\u00b4\2\2\u03fa\u03ff\5\u00ccg\2\u03fb\u03fc\7\u00b3\2\2\u03fc"+
		"\u03fe\5\u00ccg\2\u03fd\u03fb\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u00c9\3\2\2\2\u0401\u03ff\3\2\2\2\u0402"+
		"\u0403\7>\2\2\u0403\u0404\7\u00b4\2\2\u0404\u0409\5\u00ccg\2\u0405\u0406"+
		"\7\u00b3\2\2\u0406\u0408\5\u00ccg\2\u0407\u0405\3\2\2\2\u0408\u040b\3"+
		"\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u00cb\3\2\2\2\u040b"+
		"\u0409\3\2\2\2\u040c\u040e\5\u00ceh\2\u040d\u040f\5\u00d0i\2\u040e\u040d"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u0412\5\u00d2j"+
		"\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\3\2\2\2\u0413\u0415"+
		"\5\u00d4k\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u00cd\3\2\2"+
		"\2\u0416\u0417\7H\2\2\u0417\u0418\7\u00b0\2\2\u0418\u00cf\3\2\2\2\u0419"+
		"\u041a\7I\2\2\u041a\u041b\7\u00b4\2\2\u041b\u041c\t\t\2\2\u041c\u00d1"+
		"\3\2\2\2\u041d\u041e\7J\2\2\u041e\u041f\7\u00b4\2\2\u041f\u0420\5\u0136"+
		"\u009c\2\u0420\u00d3\3\2\2\2\u0421\u0422\7K\2\2\u0422\u0423\7\u00b4\2"+
		"\2\u0423\u0424\5\u0136\u009c\2\u0424\u00d5\3\2\2\2\u0425\u0426\7@\2\2"+
		"\u0426\u0428\7\u00b4\2\2\u0427\u0429\5\u00d8m\2\u0428\u0427\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042b\3\2\2\2\u042a\u042c\5\u00dco\2\u042b\u042a"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u00d7\3\2\2\2\u042d\u042e\7B\2\2\u042e"+
		"\u042f\7\u00b4\2\2\u042f\u0434\5\u00dan\2\u0430\u0431\7\u00b3\2\2\u0431"+
		"\u0433\5\u00dan\2\u0432\u0430\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u00d9\3\2\2\2\u0436\u0434\3\2\2\2\u0437"+
		"\u0438\5\u0136\u009c\2\u0438\u0439\5\u013a\u009e\2\u0439\u00db\3\2\2\2"+
		"\u043a\u043b\7C\2\2\u043b\u043c\7\u00b4\2\2\u043c\u0441\5\u00dep\2\u043d"+
		"\u043e\7\u00b3\2\2\u043e\u0440\5\u00dep\2\u043f\u043d\3\2\2\2\u0440\u0443"+
		"\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u00dd\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0444\u0445\5\u0136\u009c\2\u0445\u0446\5\u013a\u009e\2"+
		"\u0446\u00df\3\2\2\2\u0447\u0448\7A\2\2\u0448\u044b\7\u00b4\2\2\u0449"+
		"\u044c\5\u00e2r\2\u044a\u044c\5\u00f6|\2\u044b\u0449\3\2\2\2\u044b\u044a"+
		"\3\2\2\2\u044c\u00e1\3\2\2\2\u044d\u044f\5\u00e4s\2\u044e\u044d\3\2\2"+
		"\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u00e3"+
		"\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0454\5\u00e6t\2\u0454\u0455\7\u00b4"+
		"\2\2\u0455\u0456\5\u00f4{\2\u0456\u00e5\3\2\2\2\u0457\u045a\7E\2\2\u0458"+
		"\u0459\7\u009b\2\2\u0459\u045b\5\u00e8u\2\u045a\u0458\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u0467\3\2\2\2\u045c\u045d\7\u0093\2\2\u045d\u0462\5\u0136"+
		"\u009c\2\u045e\u045f\7\u00b3\2\2\u045f\u0461\5\u0136\u009c\2\u0460\u045e"+
		"\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0465\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0466\7\u0094\2\2\u0466\u0468"+
		"\3\2\2\2\u0467\u045c\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u00e7\3\2\2\2\u0469"+
		"\u046f\5\u00eav\2\u046a\u046f\5\u00ecw\2\u046b\u046f\5\u00f2z\2\u046c"+
		"\u046f\5\u00eex\2\u046d\u046f\5\u00f0y\2\u046e\u0469\3\2\2\2\u046e\u046a"+
		"\3\2\2\2\u046e\u046b\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046d\3\2\2\2\u046f"+
		"\u00e9\3\2\2\2\u0470\u0471\7F\2\2\u0471\u00eb\3\2\2\2\u0472\u0473\7G\2"+
		"\2\u0473\u00ed\3\2\2\2\u0474\u0475\7\u008f\2\2\u0475\u00ef\3\2\2\2\u0476"+
		"\u0478\5\u00fa~\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479"+
		"\3\2\2\2\u0479\u047a\5\u014c\u00a7\2\u047a\u00f1\3\2\2\2\u047b\u047d\5"+
		"\u00fa~\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2"+
		"\u047e\u047f\7\u008c\2\2\u047f\u00f3\3\2\2\2\u0480\u0481\7\u00b0\2\2\u0481"+
		"\u00f5\3\2\2\2\u0482\u0484\5\u00f8}\2\u0483\u0482\3\2\2\2\u0483\u0484"+
		"\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\5\u00fc\177\2\u0486\u0488\5\u00fe"+
		"\u0080\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u00f7\3\2\2\2\u0489"+
		"\u048a\7\u008c\2\2\u048a\u048e\7\u00b4\2\2\u048b\u048d\5\u00e4s\2\u048c"+
		"\u048b\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2"+
		"\2\2\u048f\u00f9\3\2\2\2\u0490\u048e\3\2\2\2\u0491\u049d\7\u008d\2\2\u0492"+
		"\u0493\7\u0093\2\2\u0493\u0498\5\u0136\u009c\2\u0494\u0495\7\u00b3\2\2"+
		"\u0495\u0497\5\u0136\u009c\2\u0496\u0494\3\2\2\2\u0497\u049a\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0498\3\2"+
		"\2\2\u049b\u049c\7\u0094\2\2\u049c\u049e\3\2\2\2\u049d\u0492\3\2\2\2\u049d"+
		"\u049e\3\2\2\2\u049e\u00fb\3\2\2\2\u049f\u04a0\7\u008e\2\2\u04a0\u04a4"+
		"\7\u00b4\2\2\u04a1\u04a3\5\u00e4s\2\u04a2\u04a1\3\2\2\2\u04a3\u04a6\3"+
		"\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u00fd\3\2\2\2\u04a6"+
		"\u04a4\3\2\2\2\u04a7\u04a8\7\u008f\2\2\u04a8\u04ac\7\u00b4\2\2\u04a9\u04ab"+
		"\5\u00e4s\2\u04aa\u04a9\3\2\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04aa\3\2\2"+
		"\2\u04ac\u04ad\3\2\2\2\u04ad\u00ff\3\2\2\2\u04ae\u04ac\3\2\2\2\u04af\u04b0"+
		"\7L\2\2\u04b0\u04b2\7\u00b4\2\2\u04b1\u04b3\5\u0102\u0082\2\u04b2\u04b1"+
		"\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u0101\3\2\2\2\u04b6\u04b7\5\u0136\u009c\2\u04b7\u04b8\7\u00b4\2\2\u04b8"+
		"\u04b9\5\u0104\u0083\2\u04b9\u0103\3\2\2\2\u04ba\u04bb\5\u0106\u0084\2"+
		"\u04bb\u04bc\5\u0108\u0085\2\u04bc\u04be\3\2\2\2\u04bd\u04ba\3\2\2\2\u04bd"+
		"\u04be\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\5\u010a\u0086\2\u04c0\u04c2"+
		"\5\u010c\u0087\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u0105\3"+
		"\2\2\2\u04c3\u04c4\7U\2\2\u04c4\u04c5\7\u00b4\2\2\u04c5\u04c6\7\u00b0"+
		"\2\2\u04c6\u0107\3\2\2\2\u04c7\u04c8\7V\2\2\u04c8\u04c9\7\u00b4\2\2\u04c9"+
		"\u04ca\7\u00b0\2\2\u04ca\u0109\3\2\2\2\u04cb\u04cc\7M\2\2\u04cc\u04d0"+
		"\7\u00b4\2\2\u04cd\u04cf\5\u0122\u0092\2\u04ce\u04cd\3\2\2\2\u04cf\u04d2"+
		"\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u010b\3\2\2\2\u04d2"+
		"\u04d0\3\2\2\2\u04d3\u04d4\7\63\2\2\u04d4\u04d6\7\u00b4\2\2\u04d5\u04d7"+
		"\5\u010e\u0088\2\u04d6\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d6\3"+
		"\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u010d\3\2\2\2\u04da\u04db\5\u0136\u009c"+
		"\2\u04db\u04dc\7\u00b4\2\2\u04dc\u04dd\5\u0110\u0089\2\u04dd\u010f\3\2"+
		"\2\2\u04de\u04e3\5\u0112\u008a\2\u04df\u04e0\7\u00b3\2\2\u04e0\u04e2\5"+
		"\u0112\u008a\2\u04e1\u04df\3\2\2\2\u04e2\u04e5\3\2\2\2\u04e3\u04e1\3\2"+
		"\2\2\u04e3\u04e4\3\2\2\2\u04e4\u0111\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e6"+
		"\u04e8\5\u0116\u008c\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ea"+
		"\3\2\2\2\u04e9\u04eb\5\u011a\u008e\2\u04ea\u04e9\3\2\2\2\u04ea\u04eb\3"+
		"\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04f0\7\u00b4\2\2\u04ed\u04f1\5\u0114"+
		"\u008b\2\u04ee\u04f1\5\u012e\u0098\2\u04ef\u04f1\5\u0130\u0099\2\u04f0"+
		"\u04ed\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f0\u04ef\3\2\2\2\u04f1\u0113\3\2"+
		"\2\2\u04f2\u04f6\5\u0140\u00a1\2\u04f3\u04f5\5\u0140\u00a1\2\u04f4\u04f3"+
		"\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u0115\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u0500\5\u009aN\2\u04fa\u0500"+
		"\5\u0096L\2\u04fb\u0500\5\u00a6T\2\u04fc\u0500\5\u00a2R\2\u04fd\u0500"+
		"\5\u009eP\2\u04fe\u0500\5\u0092J\2\u04ff\u04f9\3\2\2\2\u04ff\u04fa\3\2"+
		"\2\2\u04ff\u04fb\3\2\2\2\u04ff\u04fc\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff"+
		"\u04fe\3\2\2\2\u0500\u0117\3\2\2\2\u0501\u0502\7O\2\2\u0502\u0503\7\u00b4"+
		"\2\2\u0503\u0504\7\u00b0\2\2\u0504\u0119\3\2\2\2\u0505\u0506\7\u0093\2"+
		"\2\u0506\u0509\5\u011e\u0090\2\u0507\u0508\7\u00a6\2\2\u0508\u050a\5\u011e"+
		"\u0090\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050d\3\2\2\2\u050b"+
		"\u050c\7\7\2\2\u050c\u050e\5\u011e\u0090\2\u050d\u050b\3\2\2\2\u050d\u050e"+
		"\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u0510\7\u00b3\2\2\u0510\u0512\5\u011c"+
		"\u008f\2\u0511\u050f\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0515\3\2\2\2\u0513"+
		"\u0514\7R\2\2\u0514\u0516\5\u011e\u0090\2\u0515\u0513\3\2\2\2\u0515\u0516"+
		"\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\7\u0094\2\2\u0518\u011b\3\2\2"+
		"\2\u0519\u051a\7\u0095\2\2\u051a\u051b\5\u011e\u0090\2\u051b\u051c\7\u0096"+
		"\2\2\u051c\u011d\3\2\2\2\u051d\u051e\5\u0136\u009c\2\u051e\u011f\3\2\2"+
		"\2\u051f\u0520\t\n\2\2\u0520\u0521\7\u00b4\2\2\u0521\u0527\5\u0140\u00a1"+
		"\2\u0522\u0523\t\n\2\2\u0523\u0524\7\u00b4\2\2\u0524\u0526\5\u0140\u00a1"+
		"\2\u0525\u0522\3\2\2\2\u0526\u0529\3\2\2\2\u0527\u0525\3\2\2\2\u0527\u0528"+
		"\3\2\2\2\u0528\u0121\3\2\2\2\u0529\u0527\3\2\2\2\u052a\u052b\7H\2\2\u052b"+
		"\u052c\7\u00b4\2\2\u052c\u052d\7\u00b0\2\2\u052d\u0123\3\2\2\2\u052e\u052f"+
		"\7Q\2\2\u052f\u0530\7\u00b4\2\2\u0530\u0531\5\u0140\u00a1\2\u0531\u0125"+
		"\3\2\2\2\u0532\u0533\7\u0095\2\2\u0533\u0534\5\u011a\u008e\2\u0534\u0535"+
		"\5\u0120\u0091\2\u0535\u0536\7\u0096\2\2\u0536\u0127\3\2\2\2\u0537\u0538"+
		"\7\u0095\2\2\u0538\u0539\5\u012a\u0096\2\u0539\u053a\7\u0096\2\2\u053a"+
		"\u0129\3\2\2\2\u053b\u053e\5\u0136\u009c\2\u053c\u053e\5\u014a\u00a6\2"+
		"\u053d\u053b\3\2\2\2\u053d\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0540"+
		"\7\u00b4\2\2\u0540\u054b\5\u0140\u00a1\2\u0541\u0544\7\u00b3\2\2\u0542"+
		"\u0545\5\u0136\u009c\2\u0543\u0545\5\u014a\u00a6\2\u0544\u0542\3\2\2\2"+
		"\u0544\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\7\u00b4\2\2\u0547"+
		"\u0548\5\u0140\u00a1\2\u0548\u054a\3\2\2\2\u0549\u0541\3\2\2\2\u054a\u054d"+
		"\3\2\2\2\u054b\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u012b\3\2\2\2\u054d"+
		"\u054b\3\2\2\2\u054e\u0550\5\u0140\u00a1\2\u054f\u054e\3\2\2\2\u0550\u0551"+
		"\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u012d\3\2\2\2\u0553"+
		"\u0554\7N\2\2\u0554\u0555\7\u00b4\2\2\u0555\u0558\5\u0140\u00a1\2\u0556"+
		"\u0557\7\u00b3\2\2\u0557\u0559\5\u0118\u008d\2\u0558\u0556\3\2\2\2\u0558"+
		"\u0559\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u055b\7\u00b3\2\2\u055b\u055d"+
		"\5\u0124\u0093\2\u055c\u055a\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u0562\3"+
		"\2\2\2\u055e\u055f\5\u0126\u0094\2\u055f\u0560\7\u00b3\2\2\u0560\u0561"+
		"\5\u0126\u0094\2\u0561\u0563\3\2\2\2\u0562\u055e\3\2\2\2\u0562\u0563\3"+
		"\2\2\2\u0563\u012f\3\2\2\2\u0564\u0565\7\u0095\2\2\u0565\u0566\5\u014a"+
		"\u00a6\2\u0566\u0567\7\u00b4\2\2\u0567\u0568\5\u0140\u00a1\2\u0568\u0569"+
		"\7\u00b3\2\2\u0569\u056a\5\u011e\u0090\2\u056a\u056b\7\u00b4\2\2\u056b"+
		"\u056c\5\u0140\u00a1\2\u056c\u056d\7\u00b3\2\2\u056d\u056e\5\u0132\u009a"+
		"\2\u056e\u056f\7\u0096\2\2\u056f\u0131\3\2\2\2\u0570\u0571\5\u0134\u009b"+
		"\2\u0571\u0572\7\u00b4\2\2\u0572\u0573\5\u0140\u00a1\2\u0573\u0133\3\2"+
		"\2\2\u0574\u0575\7T\2\2\u0575\u0135\3\2\2\2\u0576\u0577\7\u00a8\2\2\u0577"+
		"\u0137\3\2\2\2\u0578\u0579\7\u00b2\2\2\u0579\u0139\3\2\2\2\u057a\u057b"+
		"\t\13\2\2\u057b\u013b\3\2\2\2\u057c\u057d\7\u00b1\2\2\u057d\u013d\3\2"+
		"\2\2\u057e\u057f\7\u00b1\2\2\u057f\u013f\3\2\2\2\u0580\u0581\t\f\2\2\u0581"+
		"\u0141\3\2\2\2\u0582\u0583\t\r\2\2\u0583\u0143\3\2\2\2\u0584\u0585\7\u0095"+
		"\2\2\u0585\u0586\5\u0146\u00a4\2\u0586\u0587\7\u0096\2\2\u0587\u0145\3"+
		"\2\2\2\u0588\u058d\5\u0148\u00a5\2\u0589\u058a\7\u00b3\2\2\u058a\u058c"+
		"\5\u0148\u00a5\2\u058b\u0589\3\2\2\2\u058c\u058f\3\2\2\2\u058d\u058b\3"+
		"\2\2\2\u058d\u058e\3\2\2\2\u058e\u0147\3\2\2\2\u058f\u058d\3\2\2\2\u0590"+
		"\u0591\5\u0136\u009c\2\u0591\u0594\7\u00b4\2\2\u0592\u0595\5\u0144\u00a3"+
		"\2\u0593\u0595\5\u0140\u00a1\2\u0594\u0592\3\2\2\2\u0594\u0593\3\2\2\2"+
		"\u0595\u0149\3\2\2\2\u0596\u0597\t\16\2\2\u0597\u014b\3\2\2\2\u0598\u0599"+
		"\7\u00a8\2\2\u0599\u059a\7\r\2\2\u059a\u014d\3\2\2\2\u0090\u0155\u0163"+
		"\u0165\u0172\u0178\u017f\u018c\u0191\u0196\u019d\u01a0\u01a3\u01a6\u01a9"+
		"\u01b0\u01b7\u01be\u01c5\u01c9\u01e0\u01e8\u01eb\u01ee\u01f1\u01f8\u01ff"+
		"\u0206\u020f\u0214\u0219\u021c\u0223\u022a\u0231\u0238\u023f\u0246\u0248"+
		"\u024d\u025c\u0265\u026a\u026e\u0273\u0281\u0286\u028c\u0293\u02a3\u02a7"+
		"\u02b1\u02b4\u02b9\u02bf\u02c8\u02cf\u02d2\u02de\u02eb\u02ef\u02f8\u02fd"+
		"\u0301\u0309\u0314\u0320\u0327\u0330\u0336\u0345\u0353\u0368\u037c\u037f"+
		"\u0385\u038b\u0391\u0396\u039a\u039f\u03a1\u03a4\u03a7\u03aa\u03b2\u03be"+
		"\u03ce\u03db\u03e5\u03ec\u03ef\u03f2\u03f6\u03ff\u0409\u040e\u0411\u0414"+
		"\u0428\u042b\u0434\u0441\u044b\u0450\u045a\u0462\u0467\u046e\u0477\u047c"+
		"\u0483\u0487\u048e\u0498\u049d\u04a4\u04ac\u04b4\u04bd\u04c1\u04d0\u04d8"+
		"\u04e3\u04e7\u04ea\u04f0\u04f6\u04ff\u0509\u050d\u0511\u0515\u0527\u053d"+
		"\u0544\u054b\u0551\u0558\u055c\u0562\u058d\u0594";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}