package com.mengpeng.swipebackactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main1Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        setSwipeBackEnable(false);
        StatusBarUtils.fullScreen(this);
    }

    public void onClick(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }
}
