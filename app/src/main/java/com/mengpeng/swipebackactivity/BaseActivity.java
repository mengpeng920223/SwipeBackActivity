package com.mengpeng.swipebackactivity;

import android.os.Bundle;

public class BaseActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setStatusBarLightMode(this);
    }
}
