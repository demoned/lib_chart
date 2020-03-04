
package com.bojun.chartdemo;

import android.support.v7.app.AppCompatActivity;


/**
 * Base class of all Activities of the Demo Application.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected final String[] months = new String[]{
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"
    };

    protected float getRandom(float range, float start) {
        return (float) (Math.random() * range) + start;
    }
}
