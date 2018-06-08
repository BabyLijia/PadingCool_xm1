package com.example.asus.padingcool_xm.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.asus.padingcool_xm.R;
import com.example.asus.padingcool_xm.adapter.VPadapter;

import java.util.ArrayList;
import java.util.List;

public class Main2_lunboActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<ImageView> mimgList = new ArrayList<>();
    private List<Integer> mtupian=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_lunbo);
        initView();
    }

    private void initView() {
        mtupian.add(R.drawable.a);
        mtupian.add(R.drawable.b);
        mtupian.add(R.drawable.c);

        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        for (int i = 0; i <mtupian.size(); i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(mtupian.get(i));
            mimgList.add(imageView);
        }
        VPadapter vPadapter = new VPadapter(mimgList,Main2_lunboActivity.this);
        mViewPager.setAdapter(vPadapter);
    }
}
