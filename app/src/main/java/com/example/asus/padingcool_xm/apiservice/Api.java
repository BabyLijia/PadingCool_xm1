package com.example.asus.padingcool_xm.apiservice;

import com.example.asus.padingcool_xm.bean.StartEntity;

import retrofit2.http.GET;
import rx.Observable;

public interface Api {
    //http://www.ipanda.com/kehuduan/xzbqy/index.json
    @GET("xzbqy/index.json")
    Observable<StartEntity> getShouye();
    //todo 有新的请求需写新的方法
}
