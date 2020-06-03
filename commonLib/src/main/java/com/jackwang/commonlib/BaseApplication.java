package com.jackwang.commonlib;

import android.app.Application;

/**
 * Created by wanghb on 2020/6/2.
 */

public class BaseApplication extends Application {
    private static BaseApplication context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static BaseApplication getInstance() {
        return context;
    }
}
