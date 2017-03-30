package com.qun.glidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView mMyPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mMyPic = (ImageView) findViewById(R.id.iv_mypic);
    }

    //加载静态图片
    public void getStatic(View v) {
        Glide.with(this)
                .load("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png")
                .crossFade(1000)
                .centerCrop()
                .into(mMyPic);
    }

    //加载动态图片
    public void getDynamic(View v) {
        Glide.with(this)
                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490895397413&di=45e1b1226e6683d3ed4e1695597ba95b&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01030a577df93e0000018c1b455222.gif")
                .into(mMyPic);
    }
}
