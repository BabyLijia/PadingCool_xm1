package com.example.asus.padingcool_xm.message;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

//构造者模式
public class RetrofitMessage {
    public static String BASE_URL=Contont.BASE_URL;
    private Retrofit retrofit;

    public Retrofit build() {
        initRetrofit();
        return retrofit;
    }

    private void initRetrofit() {
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
