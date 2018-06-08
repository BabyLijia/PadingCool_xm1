package com.example.asus.padingcool_xm.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asus.padingcool_xm.activity.Main2_lunboActivity;
import com.example.asus.padingcool_xm.activity.Main3_ShouyeActivity;

import java.util.List;

public class VPadapter extends PagerAdapter {
    private List<ImageView> mimgList;
    private Context context;

    public VPadapter(List<ImageView> mimgList, Context context) {
        this.mimgList = mimgList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mimgList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mimgList.get(position));
        if(position==mimgList.size()-1){
            mimgList.get(position).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SharedPreferences shouye = context.getSharedPreferences("Shouye", 0);
                    SharedPreferences.Editor edit = shouye.edit();
                    edit.putInt("lunbo",1);
                    edit.commit();
                    context.startActivity(new Intent(context,Main3_ShouyeActivity.class));
                }
            });
        }
        return mimgList.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(mimgList.get(position));
    }
}
