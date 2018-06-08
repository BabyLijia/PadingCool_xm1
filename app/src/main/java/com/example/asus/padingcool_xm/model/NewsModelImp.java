package com.example.asus.padingcool_xm.model;

import com.example.asus.padingcool_xm.apiservice.Api;
import com.example.asus.padingcool_xm.bean.StartEntity;

import rx.Observable;

public class NewsModelImp implements NewsModel {
    public static NewsModelImp newsModelImp;
    private final Api api;

    private NewsModelImp() {
        api = mRetrofitMessage.build().create(Api.class);

    }
    public static NewsModelImp getInstense(){
        //双重加锁，单例
        if(newsModelImp==null){
            synchronized (NewsModelImp.class){
                if(newsModelImp==null){
                    newsModelImp=new NewsModelImp();
                }
            }
        }
        return newsModelImp;
    }

    @Override
    public Observable<StartEntity> getDataShouye() {
        return api.getShouye();
    }
}
