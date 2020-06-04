package com.jackwang.commonlib;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;

/**
 * Created by wanghb on 2020/6/2.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResId() != 0) {
            setContentView(getResId());
            ButterKnife.bind(this);
        }
        ARouter.getInstance().inject(this);
        init();
    }

    public abstract int getResId();

    public abstract void init();
}
