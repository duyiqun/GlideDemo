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

    public void getStatic(View v) {
        Glide.with(this)
                .load("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png")
                .crossFade(1000)
                .centerCrop()
                .into(mMyPic);
    }

    public void getDynamic(View v) {
        Glide.with(this)
                .load("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3747120523,2884131724&fm=21&gp=0.jpg")
                .into(mMyPic);
    }
}
