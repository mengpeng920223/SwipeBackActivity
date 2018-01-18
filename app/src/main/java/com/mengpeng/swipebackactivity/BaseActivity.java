package com.mengpeng.swipebackactivity;

import android.os.Bundle;

public class BaseActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStatusBarColor("#33ff0000");
        StatusBarUtils.setStatusBarLightMode(this);
    }
}
