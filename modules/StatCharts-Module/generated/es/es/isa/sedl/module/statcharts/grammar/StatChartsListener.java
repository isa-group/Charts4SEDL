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

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StatChartsParser}.
 */
public interface StatChartsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StatChartsParser#boxPlot}.
	 * @param ctx the parse tree
	 */
	void enterBoxPlot(@NotNull StatChartsParser.BoxPlotContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#boxPlot}.
	 * @param ctx the parse tree
	 */
	void exitBoxPlot(@NotNull StatChartsParser.BoxPlotContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#postprocestingStep}.
	 * @param ctx the parse tree
	 */
	void enterPostprocestingStep(@NotNull StatChartsParser.PostprocestingStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#postprocestingStep}.
	 * @param ctx the parse tree
	 */
	void exitPostprocestingStep(@NotNull StatChartsParser.PostprocestingStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#exeArguments}.
	 * @param ctx the parse tree
	 */
	void enterExeArguments(@NotNull StatChartsParser.ExeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#exeArguments}.
	 * @param ctx the parse tree
	 */
	void exitExeArguments(@NotNull StatChartsParser.ExeArgumentsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#analysesBlock}.
	 * @param ctx the parse tree
	 */
	void enterAnalysesBlock(@NotNull StatChartsParser.AnalysesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#analysesBlock}.
	 * @param ctx the parse tree
	 */
	void exitAnalysesBlock(@NotNull StatChartsParser.AnalysesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#sizingSentence}.
	 * @param ctx the parse tree
	 */
	void enterSizingSentence(@NotNull StatChartsParser.SizingSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#sizingSentence}.
	 * @param ctx the parse tree
	 */
	void exitSizingSentence(@NotNull StatChartsParser.SizingSentenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#resultExecution}.
	 * @param ctx the parse tree
	 */
	void enterResultExecution(@NotNull StatChartsParser.ResultExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#resultExecution}.
	 * @param ctx the parse tree
	 */
	void exitResultExecution(@NotNull StatChartsParser.ResultExecutionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull StatChartsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull StatChartsParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#stakeholder}.
	 * @param ctx the parse tree
	 */
	void enterStakeholder(@NotNull StatChartsParser.StakeholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#stakeholder}.
	 * @param ctx the parse tree
	 */
	void exitStakeholder(@NotNull StatChartsParser.StakeholderContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#fileExec}.
	 * @param ctx the parse tree
	 */
	void enterFileExec(@NotNull StatChartsParser.FileExecContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#fileExec}.
	 * @param ctx the parse tree
	 */
	void exitFileExec(@NotNull StatChartsParser.FileExecContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#moduleImports}.
	 * @param ctx the parse tree
	 */
	void enterModuleImports(@NotNull StatChartsParser.ModuleImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#moduleImports}.
	 * @param ctx the parse tree
	 */
	void exitModuleImports(@NotNull StatChartsParser.ModuleImportsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#centralTendencyMeasurementSF}.
	 * @param ctx the parse tree
	 */
	void enterCentralTendencyMeasurementSF(@NotNull StatChartsParser.CentralTendencyMeasurementSFContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#centralTendencyMeasurementSF}.
	 * @param ctx the parse tree
	 */
	void exitCentralTendencyMeasurementSF(@NotNull StatChartsParser.CentralTendencyMeasurementSFContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#stakeholderFrom}.
	 * @param ctx the parse tree
	 */
	void enterStakeholderFrom(@NotNull StatChartsParser.StakeholderFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#stakeholderFrom}.
	 * @param ctx the parse tree
	 */
	void exitStakeholderFrom(@NotNull StatChartsParser.StakeholderFromContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#ctmFunction}.
	 * @param ctx the parse tree
	 */
	void enterCtmFunction(@NotNull StatChartsParser.CtmFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#ctmFunction}.
	 * @param ctx the parse tree
	 */
	void exitCtmFunction(@NotNull StatChartsParser.CtmFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#factorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFactorDeclaration(@NotNull StatChartsParser.FactorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#factorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFactorDeclaration(@NotNull StatChartsParser.FactorDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#outcomes}.
	 * @param ctx the parse tree
	 */
	void enterOutcomes(@NotNull StatChartsParser.OutcomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#outcomes}.
	 * @param ctx the parse tree
	 */
	void exitOutcomes(@NotNull StatChartsParser.OutcomesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#descriptiveHypothesis}.
	 * @param ctx the parse tree
	 */
	void enterDescriptiveHypothesis(@NotNull StatChartsParser.DescriptiveHypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#descriptiveHypothesis}.
	 * @param ctx the parse tree
	 */
	void exitDescriptiveHypothesis(@NotNull StatChartsParser.DescriptiveHypothesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#otherParam}.
	 * @param ctx the parse tree
	 */
	void enterOtherParam(@NotNull StatChartsParser.OtherParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#otherParam}.
	 * @param ctx the parse tree
	 */
	void exitOtherParam(@NotNull StatChartsParser.OtherParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#treatmentStep}.
	 * @param ctx the parse tree
	 */
	void enterTreatmentStep(@NotNull StatChartsParser.TreatmentStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#treatmentStep}.
	 * @param ctx the parse tree
	 */
	void exitTreatmentStep(@NotNull StatChartsParser.TreatmentStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull StatChartsParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull StatChartsParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#protocolStep}.
	 * @param ctx the parse tree
	 */
	void enterProtocolStep(@NotNull StatChartsParser.ProtocolStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#protocolStep}.
	 * @param ctx the parse tree
	 */
	void exitProtocolStep(@NotNull StatChartsParser.ProtocolStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#numericSet}.
	 * @param ctx the parse tree
	 */
	void enterNumericSet(@NotNull StatChartsParser.NumericSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#numericSet}.
	 * @param ctx the parse tree
	 */
	void exitNumericSet(@NotNull StatChartsParser.NumericSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#procBody}.
	 * @param ctx the parse tree
	 */
	void enterProcBody(@NotNull StatChartsParser.ProcBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#procBody}.
	 * @param ctx the parse tree
	 */
	void exitProcBody(@NotNull StatChartsParser.ProcBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#experimentContext}.
	 * @param ctx the parse tree
	 */
	void enterExperimentContext(@NotNull StatChartsParser.ExperimentContextContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#experimentContext}.
	 * @param ctx the parse tree
	 */
	void exitExperimentContext(@NotNull StatChartsParser.ExperimentContextContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#factorDeclarationType}.
	 * @param ctx the parse tree
	 */
	void enterFactorDeclarationType(@NotNull StatChartsParser.FactorDeclarationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#factorDeclarationType}.
	 * @param ctx the parse tree
	 */
	void exitFactorDeclarationType(@NotNull StatChartsParser.FactorDeclarationTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#pairIV}.
	 * @param ctx the parse tree
	 */
	void enterPairIV(@NotNull StatChartsParser.PairIVContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#pairIV}.
	 * @param ctx the parse tree
	 */
	void exitPairIV(@NotNull StatChartsParser.PairIVContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#extraneousDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtraneousDeclaration(@NotNull StatChartsParser.ExtraneousDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#extraneousDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtraneousDeclaration(@NotNull StatChartsParser.ExtraneousDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(@NotNull StatChartsParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(@NotNull StatChartsParser.MappingContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#preProcessingDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPreProcessingDefinition(@NotNull StatChartsParser.PreProcessingDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#preProcessingDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPreProcessingDefinition(@NotNull StatChartsParser.PreProcessingDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#measurementStep}.
	 * @param ctx the parse tree
	 */
	void enterMeasurementStep(@NotNull StatChartsParser.MeasurementStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#measurementStep}.
	 * @param ctx the parse tree
	 */
	void exitMeasurementStep(@NotNull StatChartsParser.MeasurementStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#exeDescription}.
	 * @param ctx the parse tree
	 */
	void enterExeDescription(@NotNull StatChartsParser.ExeDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#exeDescription}.
	 * @param ctx the parse tree
	 */
	void exitExeDescription(@NotNull StatChartsParser.ExeDescriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#grouping}.
	 * @param ctx the parse tree
	 */
	void enterGrouping(@NotNull StatChartsParser.GroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#grouping}.
	 * @param ctx the parse tree
	 */
	void exitGrouping(@NotNull StatChartsParser.GroupingContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#population}.
	 * @param ctx the parse tree
	 */
	void enterPopulation(@NotNull StatChartsParser.PopulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#population}.
	 * @param ctx the parse tree
	 */
	void exitPopulation(@NotNull StatChartsParser.PopulationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#statisticFunctionParam}.
	 * @param ctx the parse tree
	 */
	void enterStatisticFunctionParam(@NotNull StatChartsParser.StatisticFunctionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#statisticFunctionParam}.
	 * @param ctx the parse tree
	 */
	void exitStatisticFunctionParam(@NotNull StatChartsParser.StatisticFunctionParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#designBlocking}.
	 * @param ctx the parse tree
	 */
	void enterDesignBlocking(@NotNull StatChartsParser.DesignBlockingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#designBlocking}.
	 * @param ctx the parse tree
	 */
	void exitDesignBlocking(@NotNull StatChartsParser.DesignBlockingContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(@NotNull StatChartsParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(@NotNull StatChartsParser.FieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#datasetSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDatasetSpecification(@NotNull StatChartsParser.DatasetSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#datasetSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDatasetSpecification(@NotNull StatChartsParser.DatasetSpecificationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#freedom_degrees}.
	 * @param ctx the parse tree
	 */
	void enterFreedom_degrees(@NotNull StatChartsParser.Freedom_degreesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#freedom_degrees}.
	 * @param ctx the parse tree
	 */
	void exitFreedom_degrees(@NotNull StatChartsParser.Freedom_degreesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull StatChartsParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull StatChartsParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#statisticFunctionFilter}.
	 * @param ctx the parse tree
	 */
	void enterStatisticFunctionFilter(@NotNull StatChartsParser.StatisticFunctionFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#statisticFunctionFilter}.
	 * @param ctx the parse tree
	 */
	void exitStatisticFunctionFilter(@NotNull StatChartsParser.StatisticFunctionFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#experimentPreamble}.
	 * @param ctx the parse tree
	 */
	void enterExperimentPreamble(@NotNull StatChartsParser.ExperimentPreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#experimentPreamble}.
	 * @param ctx the parse tree
	 */
	void exitExperimentPreamble(@NotNull StatChartsParser.ExperimentPreambleContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#treatment}.
	 * @param ctx the parse tree
	 */
	void enterTreatment(@NotNull StatChartsParser.TreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#treatment}.
	 * @param ctx the parse tree
	 */
	void exitTreatment(@NotNull StatChartsParser.TreatmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(@NotNull StatChartsParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(@NotNull StatChartsParser.RoleContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#rankingSF}.
	 * @param ctx the parse tree
	 */
	void enterRankingSF(@NotNull StatChartsParser.RankingSFContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#rankingSF}.
	 * @param ctx the parse tree
	 */
	void exitRankingSF(@NotNull StatChartsParser.RankingSFContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#procDef}.
	 * @param ctx the parse tree
	 */
	void enterProcDef(@NotNull StatChartsParser.ProcDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#procDef}.
	 * @param ctx the parse tree
	 */
	void exitProcDef(@NotNull StatChartsParser.ProcDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#variabilityMeasureSF}.
	 * @param ctx the parse tree
	 */
	void enterVariabilityMeasureSF(@NotNull StatChartsParser.VariabilityMeasureSFContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#variabilityMeasureSF}.
	 * @param ctx the parse tree
	 */
	void exitVariabilityMeasureSF(@NotNull StatChartsParser.VariabilityMeasureSFContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#configurationBlock}.
	 * @param ctx the parse tree
	 */
	void enterConfigurationBlock(@NotNull StatChartsParser.ConfigurationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#configurationBlock}.
	 * @param ctx the parse tree
	 */
	void exitConfigurationBlock(@NotNull StatChartsParser.ConfigurationBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#extraneous}.
	 * @param ctx the parse tree
	 */
	void enterExtraneous(@NotNull StatChartsParser.ExtraneousContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#extraneous}.
	 * @param ctx the parse tree
	 */
	void exitExtraneous(@NotNull StatChartsParser.ExtraneousContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull StatChartsParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull StatChartsParser.DocumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#outcomeList}.
	 * @param ctx the parse tree
	 */
	void enterOutcomeList(@NotNull StatChartsParser.OutcomeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#outcomeList}.
	 * @param ctx the parse tree
	 */
	void exitOutcomeList(@NotNull StatChartsParser.OutcomeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#execStart}.
	 * @param ctx the parse tree
	 */
	void enterExecStart(@NotNull StatChartsParser.ExecStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#execStart}.
	 * @param ctx the parse tree
	 */
	void exitExecStart(@NotNull StatChartsParser.ExecStartContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#associationalHypothesis}.
	 * @param ctx the parse tree
	 */
	void enterAssociationalHypothesis(@NotNull StatChartsParser.AssociationalHypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#associationalHypothesis}.
	 * @param ctx the parse tree
	 */
	void exitAssociationalHypothesis(@NotNull StatChartsParser.AssociationalHypothesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#structuredProcedureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructuredProcedureDefinition(@NotNull StatChartsParser.StructuredProcedureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#structuredProcedureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructuredProcedureDefinition(@NotNull StatChartsParser.StructuredProcedureDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#experimentType}.
	 * @param ctx the parse tree
	 */
	void enterExperimentType(@NotNull StatChartsParser.ExperimentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#experimentType}.
	 * @param ctx the parse tree
	 */
	void exitExperimentType(@NotNull StatChartsParser.ExperimentTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#measurement}.
	 * @param ctx the parse tree
	 */
	void enterMeasurement(@NotNull StatChartsParser.MeasurementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#measurement}.
	 * @param ctx the parse tree
	 */
	void exitMeasurement(@NotNull StatChartsParser.MeasurementContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#groupsExpresion}.
	 * @param ctx the parse tree
	 */
	void enterGroupsExpresion(@NotNull StatChartsParser.GroupsExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#groupsExpresion}.
	 * @param ctx the parse tree
	 */
	void exitGroupsExpresion(@NotNull StatChartsParser.GroupsExpresionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull StatChartsParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull StatChartsParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#runtimes}.
	 * @param ctx the parse tree
	 */
	void enterRuntimes(@NotNull StatChartsParser.RuntimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#runtimes}.
	 * @param ctx the parse tree
	 */
	void exitRuntimes(@NotNull StatChartsParser.RuntimesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#library}.
	 * @param ctx the parse tree
	 */
	void enterLibrary(@NotNull StatChartsParser.LibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#library}.
	 * @param ctx the parse tree
	 */
	void exitLibrary(@NotNull StatChartsParser.LibraryContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#procedureStep}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStep(@NotNull StatChartsParser.ProcedureStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#procedureStep}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStep(@NotNull StatChartsParser.ProcedureStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(@NotNull StatChartsParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(@NotNull StatChartsParser.ArgContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#oldStatisticFunctionFilter}.
	 * @param ctx the parse tree
	 */
	void enterOldStatisticFunctionFilter(@NotNull StatChartsParser.OldStatisticFunctionFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#oldStatisticFunctionFilter}.
	 * @param ctx the parse tree
	 */
	void exitOldStatisticFunctionFilter(@NotNull StatChartsParser.OldStatisticFunctionFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull StatChartsParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull StatChartsParser.EnumDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#intervalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(@NotNull StatChartsParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#intervalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(@NotNull StatChartsParser.IntervalLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#outcome}.
	 * @param ctx the parse tree
	 */
	void enterOutcome(@NotNull StatChartsParser.OutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#outcome}.
	 * @param ctx the parse tree
	 */
	void exitOutcome(@NotNull StatChartsParser.OutcomeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(@NotNull StatChartsParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(@NotNull StatChartsParser.EmailContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#ccFunction}.
	 * @param ctx the parse tree
	 */
	void enterCcFunction(@NotNull StatChartsParser.CcFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#ccFunction}.
	 * @param ctx the parse tree
	 */
	void exitCcFunction(@NotNull StatChartsParser.CcFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#statisticFunctionValue}.
	 * @param ctx the parse tree
	 */
	void enterStatisticFunctionValue(@NotNull StatChartsParser.StatisticFunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#statisticFunctionValue}.
	 * @param ctx the parse tree
	 */
	void exitStatisticFunctionValue(@NotNull StatChartsParser.StatisticFunctionValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#samplingType}.
	 * @param ctx the parse tree
	 */
	void enterSamplingType(@NotNull StatChartsParser.SamplingTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#samplingType}.
	 * @param ctx the parse tree
	 */
	void exitSamplingType(@NotNull StatChartsParser.SamplingTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(@NotNull StatChartsParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(@NotNull StatChartsParser.VariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#preprocessingStep}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessingStep(@NotNull StatChartsParser.PreprocessingStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#preprocessingStep}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessingStep(@NotNull StatChartsParser.PreprocessingStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#subjects}.
	 * @param ctx the parse tree
	 */
	void enterSubjects(@NotNull StatChartsParser.SubjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#subjects}.
	 * @param ctx the parse tree
	 */
	void exitSubjects(@NotNull StatChartsParser.SubjectsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#procedureStepType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStepType(@NotNull StatChartsParser.ProcedureStepTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#procedureStepType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStepType(@NotNull StatChartsParser.ProcedureStepTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(@NotNull StatChartsParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(@NotNull StatChartsParser.UrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#moduleImport}.
	 * @param ctx the parse tree
	 */
	void enterModuleImport(@NotNull StatChartsParser.ModuleImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#moduleImport}.
	 * @param ctx the parse tree
	 */
	void exitModuleImport(@NotNull StatChartsParser.ModuleImportContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(@NotNull StatChartsParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(@NotNull StatChartsParser.FilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#chartType}.
	 * @param ctx the parse tree
	 */
	void enterChartType(@NotNull StatChartsParser.ChartTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#chartType}.
	 * @param ctx the parse tree
	 */
	void exitChartType(@NotNull StatChartsParser.ChartTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#chart}.
	 * @param ctx the parse tree
	 */
	void enterChart(@NotNull StatChartsParser.ChartContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#chart}.
	 * @param ctx the parse tree
	 */
	void exitChart(@NotNull StatChartsParser.ChartContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#constantsBlock}.
	 * @param ctx the parse tree
	 */
	void enterConstantsBlock(@NotNull StatChartsParser.ConstantsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#constantsBlock}.
	 * @param ctx the parse tree
	 */
	void exitConstantsBlock(@NotNull StatChartsParser.ConstantsBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(@NotNull StatChartsParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(@NotNull StatChartsParser.OutputsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#confidenceIntervalSF}.
	 * @param ctx the parse tree
	 */
	void enterConfidenceIntervalSF(@NotNull StatChartsParser.ConfidenceIntervalSFContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#confidenceIntervalSF}.
	 * @param ctx the parse tree
	 */
	void exitConfidenceIntervalSF(@NotNull StatChartsParser.ConfidenceIntervalSFContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#pearsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterPearsonFunction(@NotNull StatChartsParser.PearsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#pearsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitPearsonFunction(@NotNull StatChartsParser.PearsonFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#notes}.
	 * @param ctx the parse tree
	 */
	void enterNotes(@NotNull StatChartsParser.NotesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#notes}.
	 * @param ctx the parse tree
	 */
	void exitNotes(@NotNull StatChartsParser.NotesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#detailedDesign}.
	 * @param ctx the parse tree
	 */
	void enterDetailedDesign(@NotNull StatChartsParser.DetailedDesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#detailedDesign}.
	 * @param ctx the parse tree
	 */
	void exitDetailedDesign(@NotNull StatChartsParser.DetailedDesignContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#analysesExecution}.
	 * @param ctx the parse tree
	 */
	void enterAnalysesExecution(@NotNull StatChartsParser.AnalysesExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#analysesExecution}.
	 * @param ctx the parse tree
	 */
	void exitAnalysesExecution(@NotNull StatChartsParser.AnalysesExecutionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(@NotNull StatChartsParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(@NotNull StatChartsParser.InputsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#experimentalProcedure}.
	 * @param ctx the parse tree
	 */
	void enterExperimentalProcedure(@NotNull StatChartsParser.ExperimentalProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#experimentalProcedure}.
	 * @param ctx the parse tree
	 */
	void exitExperimentalProcedure(@NotNull StatChartsParser.ExperimentalProcedureContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#factorDeclarationUnits}.
	 * @param ctx the parse tree
	 */
	void enterFactorDeclarationUnits(@NotNull StatChartsParser.FactorDeclarationUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#factorDeclarationUnits}.
	 * @param ctx the parse tree
	 */
	void exitFactorDeclarationUnits(@NotNull StatChartsParser.FactorDeclarationUnitsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#vmFunction}.
	 * @param ctx the parse tree
	 */
	void enterVmFunction(@NotNull StatChartsParser.VmFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#vmFunction}.
	 * @param ctx the parse tree
	 */
	void exitVmFunction(@NotNull StatChartsParser.VmFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(@NotNull StatChartsParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(@NotNull StatChartsParser.AnnotationsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#factorDeclarationRange}.
	 * @param ctx the parse tree
	 */
	void enterFactorDeclarationRange(@NotNull StatChartsParser.FactorDeclarationRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#factorDeclarationRange}.
	 * @param ctx the parse tree
	 */
	void exitFactorDeclarationRange(@NotNull StatChartsParser.FactorDeclarationRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#nhstSF}.
	 * @param ctx the parse tree
	 */
	void enterNhstSF(@NotNull StatChartsParser.NhstSFContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#nhstSF}.
	 * @param ctx the parse tree
	 */
	void exitNhstSF(@NotNull StatChartsParser.NhstSFContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull StatChartsParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull StatChartsParser.IdListContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#scatterPlot}.
	 * @param ctx the parse tree
	 */
	void enterScatterPlot(@NotNull StatChartsParser.ScatterPlotContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#scatterPlot}.
	 * @param ctx the parse tree
	 */
	void exitScatterPlot(@NotNull StatChartsParser.ScatterPlotContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#designAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDesignAssignment(@NotNull StatChartsParser.DesignAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#designAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDesignAssignment(@NotNull StatChartsParser.DesignAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#bodyTempDiff}.
	 * @param ctx the parse tree
	 */
	void enterBodyTempDiff(@NotNull StatChartsParser.BodyTempDiffContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#bodyTempDiff}.
	 * @param ctx the parse tree
	 */
	void exitBodyTempDiff(@NotNull StatChartsParser.BodyTempDiffContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#analyses}.
	 * @param ctx the parse tree
	 */
	void enterAnalyses(@NotNull StatChartsParser.AnalysesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#analyses}.
	 * @param ctx the parse tree
	 */
	void exitAnalyses(@NotNull StatChartsParser.AnalysesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#postProcessing}.
	 * @param ctx the parse tree
	 */
	void enterPostProcessing(@NotNull StatChartsParser.PostProcessingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#postProcessing}.
	 * @param ctx the parse tree
	 */
	void exitPostProcessing(@NotNull StatChartsParser.PostProcessingContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#protocol}.
	 * @param ctx the parse tree
	 */
	void enterProtocol(@NotNull StatChartsParser.ProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#protocol}.
	 * @param ctx the parse tree
	 */
	void exitProtocol(@NotNull StatChartsParser.ProtocolContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#whereDSSpec}.
	 * @param ctx the parse tree
	 */
	void enterWhereDSSpec(@NotNull StatChartsParser.WhereDSSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#whereDSSpec}.
	 * @param ctx the parse tree
	 */
	void exitWhereDSSpec(@NotNull StatChartsParser.WhereDSSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#analysesBlocks}.
	 * @param ctx the parse tree
	 */
	void enterAnalysesBlocks(@NotNull StatChartsParser.AnalysesBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#analysesBlocks}.
	 * @param ctx the parse tree
	 */
	void exitAnalysesBlocks(@NotNull StatChartsParser.AnalysesBlocksContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#fdParam}.
	 * @param ctx the parse tree
	 */
	void enterFdParam(@NotNull StatChartsParser.FdParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#fdParam}.
	 * @param ctx the parse tree
	 */
	void exitFdParam(@NotNull StatChartsParser.FdParamContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(@NotNull StatChartsParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(@NotNull StatChartsParser.ConstantsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#executionProcedureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterExecutionProcedureDefinition(@NotNull StatChartsParser.ExecutionProcedureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#executionProcedureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitExecutionProcedureDefinition(@NotNull StatChartsParser.ExecutionProcedureDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#pieChart}.
	 * @param ctx the parse tree
	 */
	void enterPieChart(@NotNull StatChartsParser.PieChartContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#pieChart}.
	 * @param ctx the parse tree
	 */
	void exitPieChart(@NotNull StatChartsParser.PieChartContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#pretreatmentClause}.
	 * @param ctx the parse tree
	 */
	void enterPretreatmentClause(@NotNull StatChartsParser.PretreatmentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#pretreatmentClause}.
	 * @param ctx the parse tree
	 */
	void exitPretreatmentClause(@NotNull StatChartsParser.PretreatmentClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#ofDSSpec}.
	 * @param ctx the parse tree
	 */
	void enterOfDSSpec(@NotNull StatChartsParser.OfDSSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#ofDSSpec}.
	 * @param ctx the parse tree
	 */
	void exitOfDSSpec(@NotNull StatChartsParser.OfDSSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#settings}.
	 * @param ctx the parse tree
	 */
	void enterSettings(@NotNull StatChartsParser.SettingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#settings}.
	 * @param ctx the parse tree
	 */
	void exitSettings(@NotNull StatChartsParser.SettingsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#implicitAssociationalHypothesis}.
	 * @param ctx the parse tree
	 */
	void enterImplicitAssociationalHypothesis(@NotNull StatChartsParser.ImplicitAssociationalHypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#implicitAssociationalHypothesis}.
	 * @param ctx the parse tree
	 */
	void exitImplicitAssociationalHypothesis(@NotNull StatChartsParser.ImplicitAssociationalHypothesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#statisticFunctionParamVariable}.
	 * @param ctx the parse tree
	 */
	void enterStatisticFunctionParamVariable(@NotNull StatChartsParser.StatisticFunctionParamVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#statisticFunctionParamVariable}.
	 * @param ctx the parse tree
	 */
	void exitStatisticFunctionParamVariable(@NotNull StatChartsParser.StatisticFunctionParamVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(@NotNull StatChartsParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(@NotNull StatChartsParser.FormatContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#unstructuredProcedureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnstructuredProcedureDefinition(@NotNull StatChartsParser.UnstructuredProcedureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#unstructuredProcedureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnstructuredProcedureDefinition(@NotNull StatChartsParser.UnstructuredProcedureDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#outcomeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOutcomeDeclaration(@NotNull StatChartsParser.OutcomeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#outcomeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOutcomeDeclaration(@NotNull StatChartsParser.OutcomeDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#runtime}.
	 * @param ctx the parse tree
	 */
	void enterRuntime(@NotNull StatChartsParser.RuntimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#runtime}.
	 * @param ctx the parse tree
	 */
	void exitRuntime(@NotNull StatChartsParser.RuntimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#functionalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalDeclaration(@NotNull StatChartsParser.FunctionalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#functionalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalDeclaration(@NotNull StatChartsParser.FunctionalDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#histogram}.
	 * @param ctx the parse tree
	 */
	void enterHistogram(@NotNull StatChartsParser.HistogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#histogram}.
	 * @param ctx the parse tree
	 */
	void exitHistogram(@NotNull StatChartsParser.HistogramContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#executionConf}.
	 * @param ctx the parse tree
	 */
	void enterExecutionConf(@NotNull StatChartsParser.ExecutionConfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#executionConf}.
	 * @param ctx the parse tree
	 */
	void exitExecutionConf(@NotNull StatChartsParser.ExecutionConfContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#analysesExecBlock}.
	 * @param ctx the parse tree
	 */
	void enterAnalysesExecBlock(@NotNull StatChartsParser.AnalysesExecBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#analysesExecBlock}.
	 * @param ctx the parse tree
	 */
	void exitAnalysesExecBlock(@NotNull StatChartsParser.AnalysesExecBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#files}.
	 * @param ctx the parse tree
	 */
	void enterFiles(@NotNull StatChartsParser.FilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#files}.
	 * @param ctx the parse tree
	 */
	void exitFiles(@NotNull StatChartsParser.FilesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#extensionPointStep}.
	 * @param ctx the parse tree
	 */
	void enterExtensionPointStep(@NotNull StatChartsParser.ExtensionPointStepContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#extensionPointStep}.
	 * @param ctx the parse tree
	 */
	void exitExtensionPointStep(@NotNull StatChartsParser.ExtensionPointStepContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#designSampling}.
	 * @param ctx the parse tree
	 */
	void enterDesignSampling(@NotNull StatChartsParser.DesignSamplingContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#designSampling}.
	 * @param ctx the parse tree
	 */
	void exitDesignSampling(@NotNull StatChartsParser.DesignSamplingContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#correlationCoeficientSF}.
	 * @param ctx the parse tree
	 */
	void enterCorrelationCoeficientSF(@NotNull StatChartsParser.CorrelationCoeficientSFContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#correlationCoeficientSF}.
	 * @param ctx the parse tree
	 */
	void exitCorrelationCoeficientSF(@NotNull StatChartsParser.CorrelationCoeficientSFContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(@NotNull StatChartsParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(@NotNull StatChartsParser.FieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#explicitAssociationalHypothesis}.
	 * @param ctx the parse tree
	 */
	void enterExplicitAssociationalHypothesis(@NotNull StatChartsParser.ExplicitAssociationalHypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#explicitAssociationalHypothesis}.
	 * @param ctx the parse tree
	 */
	void exitExplicitAssociationalHypothesis(@NotNull StatChartsParser.ExplicitAssociationalHypothesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#statisticFunction}.
	 * @param ctx the parse tree
	 */
	void enterStatisticFunction(@NotNull StatChartsParser.StatisticFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#statisticFunction}.
	 * @param ctx the parse tree
	 */
	void exitStatisticFunction(@NotNull StatChartsParser.StatisticFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#explicitDifferentialHypothesis}.
	 * @param ctx the parse tree
	 */
	void enterExplicitDifferentialHypothesis(@NotNull StatChartsParser.ExplicitDifferentialHypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#explicitDifferentialHypothesis}.
	 * @param ctx the parse tree
	 */
	void exitExplicitDifferentialHypothesis(@NotNull StatChartsParser.ExplicitDifferentialHypothesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#regresion}.
	 * @param ctx the parse tree
	 */
	void enterRegresion(@NotNull StatChartsParser.RegresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#regresion}.
	 * @param ctx the parse tree
	 */
	void exitRegresion(@NotNull StatChartsParser.RegresionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#configuration}.
	 * @param ctx the parse tree
	 */
	void enterConfiguration(@NotNull StatChartsParser.ConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#configuration}.
	 * @param ctx the parse tree
	 */
	void exitConfiguration(@NotNull StatChartsParser.ConfigurationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#byDSSpec}.
	 * @param ctx the parse tree
	 */
	void enterByDSSpec(@NotNull StatChartsParser.ByDSSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#byDSSpec}.
	 * @param ctx the parse tree
	 */
	void exitByDSSpec(@NotNull StatChartsParser.ByDSSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#roles}.
	 * @param ctx the parse tree
	 */
	void enterRoles(@NotNull StatChartsParser.RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#roles}.
	 * @param ctx the parse tree
	 */
	void exitRoles(@NotNull StatChartsParser.RolesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(@NotNull StatChartsParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(@NotNull StatChartsParser.ValuesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#regresionBlock}.
	 * @param ctx the parse tree
	 */
	void enterRegresionBlock(@NotNull StatChartsParser.RegresionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#regresionBlock}.
	 * @param ctx the parse tree
	 */
	void exitRegresionBlock(@NotNull StatChartsParser.RegresionBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#ncfactors}.
	 * @param ctx the parse tree
	 */
	void enterNcfactors(@NotNull StatChartsParser.NcfactorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#ncfactors}.
	 * @param ctx the parse tree
	 */
	void exitNcfactors(@NotNull StatChartsParser.NcfactorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#rFunction}.
	 * @param ctx the parse tree
	 */
	void enterRFunction(@NotNull StatChartsParser.RFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#rFunction}.
	 * @param ctx the parse tree
	 */
	void exitRFunction(@NotNull StatChartsParser.RFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#analFunctions}.
	 * @param ctx the parse tree
	 */
	void enterAnalFunctions(@NotNull StatChartsParser.AnalFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#analFunctions}.
	 * @param ctx the parse tree
	 */
	void exitAnalFunctions(@NotNull StatChartsParser.AnalFunctionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#execEnd}.
	 * @param ctx the parse tree
	 */
	void enterExecEnd(@NotNull StatChartsParser.ExecEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#execEnd}.
	 * @param ctx the parse tree
	 */
	void exitExecEnd(@NotNull StatChartsParser.ExecEndContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#design}.
	 * @param ctx the parse tree
	 */
	void enterDesign(@NotNull StatChartsParser.DesignContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#design}.
	 * @param ctx the parse tree
	 */
	void exitDesign(@NotNull StatChartsParser.DesignContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#structValue}.
	 * @param ctx the parse tree
	 */
	void enterStructValue(@NotNull StatChartsParser.StructValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#structValue}.
	 * @param ctx the parse tree
	 */
	void exitStructValue(@NotNull StatChartsParser.StructValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#hypothesisDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterHypothesisDeclaration(@NotNull StatChartsParser.HypothesisDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#hypothesisDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitHypothesisDeclaration(@NotNull StatChartsParser.HypothesisDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#repUrl}.
	 * @param ctx the parse tree
	 */
	void enterRepUrl(@NotNull StatChartsParser.RepUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#repUrl}.
	 * @param ctx the parse tree
	 */
	void exitRepUrl(@NotNull StatChartsParser.RepUrlContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#exeFunctionTypes}.
	 * @param ctx the parse tree
	 */
	void enterExeFunctionTypes(@NotNull StatChartsParser.ExeFunctionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#exeFunctionTypes}.
	 * @param ctx the parse tree
	 */
	void exitExeFunctionTypes(@NotNull StatChartsParser.ExeFunctionTypesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(@NotNull StatChartsParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(@NotNull StatChartsParser.ProjectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#exeFunction}.
	 * @param ctx the parse tree
	 */
	void enterExeFunction(@NotNull StatChartsParser.ExeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#exeFunction}.
	 * @param ctx the parse tree
	 */
	void exitExeFunction(@NotNull StatChartsParser.ExeFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull StatChartsParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull StatChartsParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#variablesBlock}.
	 * @param ctx the parse tree
	 */
	void enterVariablesBlock(@NotNull StatChartsParser.VariablesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#variablesBlock}.
	 * @param ctx the parse tree
	 */
	void exitVariablesBlock(@NotNull StatChartsParser.VariablesBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#extensionPoint}.
	 * @param ctx the parse tree
	 */
	void enterExtensionPoint(@NotNull StatChartsParser.ExtensionPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#extensionPoint}.
	 * @param ctx the parse tree
	 */
	void exitExtensionPoint(@NotNull StatChartsParser.ExtensionPointContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#factorList}.
	 * @param ctx the parse tree
	 */
	void enterFactorList(@NotNull StatChartsParser.FactorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#factorList}.
	 * @param ctx the parse tree
	 */
	void exitFactorList(@NotNull StatChartsParser.FactorListContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#singleConf}.
	 * @param ctx the parse tree
	 */
	void enterSingleConf(@NotNull StatChartsParser.SingleConfContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#singleConf}.
	 * @param ctx the parse tree
	 */
	void exitSingleConf(@NotNull StatChartsParser.SingleConfContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExecution(@NotNull StatChartsParser.ExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExecution(@NotNull StatChartsParser.ExecutionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#customDesignBlock}.
	 * @param ctx the parse tree
	 */
	void enterCustomDesignBlock(@NotNull StatChartsParser.CustomDesignBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#customDesignBlock}.
	 * @param ctx the parse tree
	 */
	void exitCustomDesignBlock(@NotNull StatChartsParser.CustomDesignBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#explicitProtocol}.
	 * @param ctx the parse tree
	 */
	void enterExplicitProtocol(@NotNull StatChartsParser.ExplicitProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#explicitProtocol}.
	 * @param ctx the parse tree
	 */
	void exitExplicitProtocol(@NotNull StatChartsParser.ExplicitProtocolContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull StatChartsParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull StatChartsParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#exeValuation}.
	 * @param ctx the parse tree
	 */
	void enterExeValuation(@NotNull StatChartsParser.ExeValuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#exeValuation}.
	 * @param ctx the parse tree
	 */
	void exitExeValuation(@NotNull StatChartsParser.ExeValuationContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#libraries}.
	 * @param ctx the parse tree
	 */
	void enterLibraries(@NotNull StatChartsParser.LibrariesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#libraries}.
	 * @param ctx the parse tree
	 */
	void exitLibraries(@NotNull StatChartsParser.LibrariesContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#groups}.
	 * @param ctx the parse tree
	 */
	void enterGroups(@NotNull StatChartsParser.GroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#groups}.
	 * @param ctx the parse tree
	 */
	void exitGroups(@NotNull StatChartsParser.GroupsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#executionBlock}.
	 * @param ctx the parse tree
	 */
	void enterExecutionBlock(@NotNull StatChartsParser.ExecutionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#executionBlock}.
	 * @param ctx the parse tree
	 */
	void exitExecutionBlock(@NotNull StatChartsParser.ExecutionBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#differentialHypothesis}.
	 * @param ctx the parse tree
	 */
	void enterDifferentialHypothesis(@NotNull StatChartsParser.DifferentialHypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#differentialHypothesis}.
	 * @param ctx the parse tree
	 */
	void exitDifferentialHypothesis(@NotNull StatChartsParser.DifferentialHypothesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull StatChartsParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull StatChartsParser.PairContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#versionNumber}.
	 * @param ctx the parse tree
	 */
	void enterVersionNumber(@NotNull StatChartsParser.VersionNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#versionNumber}.
	 * @param ctx the parse tree
	 */
	void exitVersionNumber(@NotNull StatChartsParser.VersionNumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#factors}.
	 * @param ctx the parse tree
	 */
	void enterFactors(@NotNull StatChartsParser.FactorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#factors}.
	 * @param ctx the parse tree
	 */
	void exitFactors(@NotNull StatChartsParser.FactorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#implicitDifferentialHypothesis}.
	 * @param ctx the parse tree
	 */
	void enterImplicitDifferentialHypothesis(@NotNull StatChartsParser.ImplicitDifferentialHypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#implicitDifferentialHypothesis}.
	 * @param ctx the parse tree
	 */
	void exitImplicitDifferentialHypothesis(@NotNull StatChartsParser.ImplicitDifferentialHypothesisContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#friedmanFunction}.
	 * @param ctx the parse tree
	 */
	void enterFriedmanFunction(@NotNull StatChartsParser.FriedmanFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#friedmanFunction}.
	 * @param ctx the parse tree
	 */
	void exitFriedmanFunction(@NotNull StatChartsParser.FriedmanFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#nhstFunction}.
	 * @param ctx the parse tree
	 */
	void enterNhstFunction(@NotNull StatChartsParser.NhstFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#nhstFunction}.
	 * @param ctx the parse tree
	 */
	void exitNhstFunction(@NotNull StatChartsParser.NhstFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#newStatisticFunctionFilter}.
	 * @param ctx the parse tree
	 */
	void enterNewStatisticFunctionFilter(@NotNull StatChartsParser.NewStatisticFunctionFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#newStatisticFunctionFilter}.
	 * @param ctx the parse tree
	 */
	void exitNewStatisticFunctionFilter(@NotNull StatChartsParser.NewStatisticFunctionFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#designBlock}.
	 * @param ctx the parse tree
	 */
	void enterDesignBlock(@NotNull StatChartsParser.DesignBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#designBlock}.
	 * @param ctx the parse tree
	 */
	void exitDesignBlock(@NotNull StatChartsParser.DesignBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#ciFunction}.
	 * @param ctx the parse tree
	 */
	void enterCiFunction(@NotNull StatChartsParser.CiFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#ciFunction}.
	 * @param ctx the parse tree
	 */
	void exitCiFunction(@NotNull StatChartsParser.CiFunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link StatChartsParser#hypothesis}.
	 * @param ctx the parse tree
	 */
	void enterHypothesis(@NotNull StatChartsParser.HypothesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatChartsParser#hypothesis}.
	 * @param ctx the parse tree
	 */
	void exitHypothesis(@NotNull StatChartsParser.HypothesisContext ctx);
}