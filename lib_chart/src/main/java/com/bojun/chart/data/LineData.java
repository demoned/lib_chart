
package com.bojun.chart.data;

import com.bojun.chart.interfaces.datasets.ILineDataSet;

import java.util.List;

/**
 * Data object that encapsulates all data associated with a LineChart.
 * 

 */
public class LineData extends BarLineScatterCandleBubbleData<ILineDataSet> {

    public LineData() {
        super();
    }

    public LineData(ILineDataSet... dataSets) {
        super(dataSets);
    }

    public LineData(List<ILineDataSet> dataSets) {
        super(dataSets);
    }
}
