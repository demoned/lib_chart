package com.bojun.chart.interfaces.dataprovider;

import com.bojun.chart.components.YAxis.AxisDependency;
import com.bojun.chart.data.BarLineScatterCandleBubbleData;
import com.bojun.chart.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
