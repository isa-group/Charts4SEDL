grammar StatCharts;

import SEDL4People;

@header {
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
}

@lexer::members {
	//public static final int COMMENTS = 2; 
}

@parser::members{
       
}

options
{
    
} 

/*=====================================
            SYNTACTICAL RULES
 ======================================*/



chart: chartType EOF;

chartType: scatterPlot | histogram | boxPlot | pieChart;

scatterPlot: SCATTERPLOT  datasetSpecification VS ID;

histogram: HISTOGRAM  datasetSpecification (SHOW (SIGMA_BANDS (AND NORMAL_DISTRIBUTION)| NORMAL_DISTRIBUTION))?;

boxPlot: BOXPLOT datasetSpecification ;

pieChart: PIECHART  datasetSpecification;


datasetSpecification: statisticFunctionFilter;
/*=====================================
            LEXICAL RULES
 ======================================*/


SCATTERPLOT: 'ScatterPlot';

HISTOGRAM: 'Histogram';

BOXPLOT: 'BoxPlot';

PIECHART: 'PieChart';

VS: 'VS';

SHOW: 'show';

AND: 'and';

SIGMA_BANDS: 'sigma_bands';

NORMAL_DISTRIBUTION: 'normal_distribution';

WS : [ \t\r\n]+ -> channel(HIDDEN) ;