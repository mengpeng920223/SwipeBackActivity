package com.mengpeng.swipebackactivity;

import android.os.Bundle;

public class BaseActivity extends SwipeBackAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setStatusBarLightMode(this);
    }
}
