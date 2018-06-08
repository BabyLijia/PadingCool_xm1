package com.example.asus.padingcool_xm.model;

import com.example.asus.padingcool_xm.bean.StartEntity;
import com.example.asus.padingcool_xm.message.RetrofitMessage;

import rx.Observable;

public interface NewsModel {
    //初始化一个Retrofit的封装类
     RetrofitMessage mRetrofitMessage=new RetrofitMessage();
    //自定义一个方法解析数据
    Observable<StartEntity> getDataShouye();
    //todo 新的请求添加方法

}
