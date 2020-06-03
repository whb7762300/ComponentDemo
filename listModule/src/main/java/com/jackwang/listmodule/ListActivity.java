package com.jackwang.listmodule;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jackwang.commonlib.BaseApplication;
import com.jackwang.commonlib.RouterConstants;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wanghb on 2020/6/2.
 */
@Route(path = RouterConstants.LIST_ACTIVITY)
public class ListActivity extends AppCompatActivity {

    @BindView(R2.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        BaseApplication.getInstance();
        tv.setText("我就是butterknife测试的");
    }
}
