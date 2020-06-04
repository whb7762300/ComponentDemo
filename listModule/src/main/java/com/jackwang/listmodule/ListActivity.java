package com.jackwang.listmodule;

import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.jackwang.commonlib.BaseActivity;
import com.jackwang.commonlib.RouterConstants;

import butterknife.BindView;

/**
 * Created by wanghb on 2020/6/2.
 */
@Route(path = RouterConstants.LIST_ACTIVITY)
public class ListActivity extends BaseActivity {
    @Autowired
    String name;
    @BindView(R2.id.tv)
    TextView tv;

    @Override
    public int getResId() {
        return R.layout.activity_list;
    }

    @Override
    public void init() {
        tv.setText("我就是butterknife测试的");
        Log.e("hehe", name);
    }
}
