package com.jackwang.component1;

import android.content.Intent;
import android.net.Uri;
import android.widget.TextView;

import com.jackwang.commonlib.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_jump)
    TextView tvJump;

    @Override
    public int getResId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {

    }

    @OnClick(R.id.tv_jump)
    public void onViewClicked() {
        //只有通过intent uri形式或者外部网页url跳转的时候 SchemeFilterActivity才会有启动
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("whb://demo/app/list?name=lisi"));
        startActivity(intent);
        //ARouter.getInstance().build(Uri.parse("whb://demo/app/list?name=lisi")).navigation();
        //ARouter.getInstance().build(RouterConstants.LIST_ACTIVITY).navigation();
    }
}