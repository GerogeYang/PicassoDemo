package com.tcl.picassodemo;

import android.util.Log;

/**
 * 项目名：   PicassoDemo
 * 包名：     com.tcl.picassodemo
 * 文件名：   TLog
 * 创建者：   Mr Yang
 * 创建时间： 2018/5/5 21:44
 * 描述：     重写Log方法
 */

public class TLog {
    private static final String TAG = "Debug-YJ-";
    public static boolean isDebug = true;

    public static void d(String tag, String msg){
        if (isDebug){
            Log.d(TAG+tag, msg);
        }
    }

    public static void v(String tag, String msg){
        if (isDebug){
            Log.v(TAG+tag, msg);
        }
    }

    public static void i(String tag, String msg){
        if (isDebug){
            Log.i(TAG+tag, msg);
        }
    }

    public static void e(String tag, String msg){
        if (isDebug){
            Log.e(TAG+tag, msg);
        }
    }
}
