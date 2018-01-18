package com.mengpeng.swipebackactivity;

import android.os.Bundle;
import android.view.View;

public class Main2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.aa);
    }

    public void onClick(View view) {
        setStatusBarColor("#330000ff");
    }
}
