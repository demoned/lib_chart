package com.bojun.chart.interfaces.dataprovider;

import com.bojun.chart.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
