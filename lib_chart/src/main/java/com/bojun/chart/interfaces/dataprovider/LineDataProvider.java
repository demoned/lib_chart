package com.bojun.chart.interfaces.dataprovider;

import com.bojun.chart.components.YAxis;
import com.bojun.chart.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
