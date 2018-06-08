package com.example.asus.padingcool_xm.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.example.asus.padingcool_xm.R;
import com.example.asus.padingcool_xm.bean.StartEntity;
import com.example.asus.padingcool_xm.bean.TabBean;
import com.example.asus.padingcool_xm.persener.NewsPersenerImp;
import com.example.asus.padingcool_xm.view.IView;

import java.io.UnsupportedEncodingException;
import java.util.List;

import butterknife.ButterKnife;

public class Main1Activity extends BaseActivity implements IView {

    private NewsPersenerImp newsPersenerImp;
    private ImageView mimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        initView();
        ButterKnife.bind(this);
        newsPersenerImp = new NewsPersenerImp(this);
        newsPersenerImp.getDataShouye();

        SharedPreferences shouye = getSharedPreferences("Shouye", 0);
        int lunbo = shouye.getInt("lunbo", -1);
        if(lunbo!=-1){
            startActivity(new Intent(Main1Activity.this,Main3_ShouyeActivity.class));
        }else {
            startActivity(new Intent(Main1Activity.this,Main2_lunboActivity.class));
        }
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mimg = (ImageView) findViewById(R.id.mimg);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main1;
    }

    @Override
    public void getUpdataUi(int code,StartEntity shouye) {
       switch (code){
           case 1:
               List<TabBean> tab = shouye.getTab();
               for (int i = 0; i < tab.size(); i++) {
                   TabBean tabBean = tab.get(i);
                   String title = tabBean.getTitle();
                   String url = tabBean.getUrl();
                   String str = null;
                   try {
                       str = new String(title.getBytes(), "UTF-8");
                   } catch (UnsupportedEncodingException e) {
                       e.printStackTrace();
                   }
                   Log.e("TAG",url+"++++"+str);

               }
               break;

       }
    }
}
