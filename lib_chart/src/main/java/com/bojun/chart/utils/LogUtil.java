package com.bojun.chart.utils;


import com.orhanobut.logger.Logger;

/**
 * 日志打印工具
 */

public class LogUtil {
    private static boolean isDebugs;

    public static void init(boolean isDebug) {
        isDebugs = isDebug;
        if (isDebug) {
            Logger.init();
        }
    }

    /**
     * 设置Tag输出自定义的Info日志
     *
     * @param tag 标记
     * @param msg 信息
     */
    public static void i(String tag, String msg) {
        if (isDebugs) {
            Logger.t(tag).i(msg);
        }
    }

    /**
     * log.i
     *
     * @param msg
     */
    public static void i(String msg) {
        if (isDebugs) {
            Logger.i(msg);
        }
    }

    /**
     * log.d
     *
     * @param msg
     */
    public static void d(String msg) {
        if (isDebugs) {
            Logger.d(msg);
        }
    }

    /**
     * 设置Tag输出自定义的Debug日志
     *
     * @param tag 标记
     * @param msg 信息
     */
    public static void d(String tag, String msg) {
        if (isDebugs) {
            Logger.t(tag).d(msg);
        }
    }

    /**
     * log.e
     *
     * @param msg
     */
    public static void e(String msg) {
        if (isDebugs) {
            Logger.e(msg);
        }
    }

    /**
     * 设置Tag输出自定义的Error日志
     *
     * @param tag 标记
     * @param msg 信息
     */
    public static void e(String tag, String msg) {
        if (isDebugs) {
            Logger.t(tag).e(msg);
        }
    }

    /**
     * log.w
     *
     * @param msg
     */
    public static void w(String msg) {
        if (isDebugs) {
            Logger.w(msg);
        }
    }

    /**
     * 设置Tag输出自定义的Warn日志
     *
     * @param tag 标记
     * @param msg 信息
     */
    public static void w(String tag, String msg) {
        if (isDebugs) {
            Logger.t(tag).w(msg);
        }
    }

    /**
     * log.v
     *
     * @param msg
     */
    public static void v(String msg) {
        if (isDebugs) {
            Logger.v(msg);
        }
    }

    /**
     * 设置Tag输出自定义的Verbose日志
     *
     * @param tag 标记
     * @param msg 信息
     */
    public static void v(String tag, String msg) {
        if (isDebugs) {
            Logger.t(tag).v(msg);
        }
    }

    /**
     * log.json
     *
     * @param msg
     */
    public static void json(String msg) {
        if (isDebugs) {
            Logger.json(msg);
        }
    }

    /**
     * log.xml
     *
     * @param msg
     */
    public static void xml(String msg) {
        if (isDebugs) {
            Logger.xml(msg);
        }
    }
}
