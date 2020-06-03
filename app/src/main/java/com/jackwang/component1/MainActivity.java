package com.jackwang.component1;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jackwang.commonlib.RouterConstants;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_jump)
    TextView tvJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tv_jump)
    public void onViewClicked() {
        Log.e("hehe", "点击了");
        ARouter.getInstance().build(RouterConstants.LIST_ACTIVITY).navigation();
    }
}