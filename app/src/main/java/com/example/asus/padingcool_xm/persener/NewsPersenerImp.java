package com.example.asus.padingcool_xm.persener;

import com.example.asus.padingcool_xm.bean.StartEntity;
import com.example.asus.padingcool_xm.model.NewsModelImp;
import com.example.asus.padingcool_xm.view.IView;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class NewsPersenerImp implements NewsPersener {
    public IView iView;
    public NewsModelImp newsModelImp;

    //关联
    public NewsPersenerImp(IView iView) {
        this.iView = iView;
        newsModelImp = NewsModelImp.getInstense();
    }

    @Override
    public void getDataShouye() {
        newsModelImp.getDataShouye()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<StartEntity>() {
                    @Override
                    public void call(StartEntity shouye) {
                        iView.getUpdataUi(1,shouye);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {

                    }
                });

    }
}
