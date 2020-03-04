package com.bojun.chart.interfaces.dataprovider;

import com.bojun.chart.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
