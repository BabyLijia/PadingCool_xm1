package com.example.asus.padingcool_xm.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    //模板：每个activity需要使用的方法
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //todo 初始化P层
        init();
    }
    //
    private void init() {
        setContentView(getLayoutId());
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    public abstract int getLayoutId();

}
