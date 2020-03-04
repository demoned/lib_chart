package com.bojun.chart.interfaces.dataprovider;

import com.bojun.chart.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
