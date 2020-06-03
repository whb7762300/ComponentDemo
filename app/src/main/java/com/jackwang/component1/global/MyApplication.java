package com.jackwang.component1.global;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jackwang.commonlib.BaseApplication;
import com.jackwang.component1.BuildConfig;

/**
 * Created by wanghb on 2020/6/2.
 */

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
