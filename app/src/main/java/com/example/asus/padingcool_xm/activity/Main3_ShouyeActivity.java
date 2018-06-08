package com.example.asus.padingcool_xm.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.asus.padingcool_xm.R;
import com.example.asus.padingcool_xm.fragment.ShouyeFragment;
import com.example.asus.padingcool_xm.fragment.Xm_CCTVFragment;
import com.example.asus.padingcool_xm.fragment.Xm_ChanaFragment;
import com.example.asus.padingcool_xm.fragment.Xm_guanchaFragment;
import com.example.asus.padingcool_xm.fragment.Xm_zhiboFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main3_ShouyeActivity extends AppCompatActivity {

    @BindView(R.id.mxmpd)
    public TextView mxmpd;
    @BindView(R.id.mtoobal)
    public Toolbar mtoobal;
    @BindView(R.id.mxongmao)
    public ImageView mxongmao;
    @BindView(R.id.mgeren)
    public ImageView mgeren;
    @BindView(R.id.mhudong)
    public ImageView mhudong;
    @BindView(R.id.mFamelayout)
    public FrameLayout mFamelayout;
    private RadioButton mshouye_rb;
    private RadioButton mguancha_rb;
    private RadioButton mzhibo_rb;
    private RadioButton mchana_rb;
    private RadioButton mcctv_rb;

    private FragmentManager manager;
    private ShouyeFragment shouyeFragment;
    private Xm_guanchaFragment xm_guanchaFragment;
    private Xm_zhiboFragment xm_zhiboFragment;
    private Xm_ChanaFragment xm_chanaFragment;
    private Xm_CCTVFragment xm_cctvFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3__shouye);
        ButterKnife.bind(this);
        setSupportActionBar(mtoobal);
        initData();

    }

    private void initData() {
        shouyeFragment = new ShouyeFragment();
        xm_guanchaFragment = new Xm_guanchaFragment();
        xm_zhiboFragment = new Xm_zhiboFragment();
        xm_chanaFragment = new Xm_ChanaFragment();
        xm_cctvFragment = new Xm_CCTVFragment();

        manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.add(R.id.mFamelayout, shouyeFragment).show(shouyeFragment).commit();
    }

    @OnClick({R.id.mshouye_rb, R.id.mguancha_rb, R.id.mzhibo_rb, R.id.mchana_rb, R.id.mcctv_rb, R.id.mgeren, R.id.mhudong})
    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.mshouye_rb:
                getSupportFragmentManager().beginTransaction().replace(R.id.mFamelayout, shouyeFragment).commit();
                break;
            case R.id.mguancha_rb:
                getSupportFragmentManager().beginTransaction().replace(R.id.mFamelayout, xm_guanchaFragment).commit();

                break;
            case R.id.mzhibo_rb:
                getSupportFragmentManager().beginTransaction().replace(R.id.mFamelayout, xm_zhiboFragment).commit();

                break;
            case R.id.mchana_rb:
                getSupportFragmentManager().beginTransaction().replace(R.id.mFamelayout, xm_chanaFragment).commit();

                break;
            case R.id.mcctv_rb:
                getSupportFragmentManager().beginTransaction().replace(R.id.mFamelayout, xm_cctvFragment).commit();

                break;
            case R.id.mgeren:

                break;
            case R.id.mhudong:

                break;
        }
    }
}
