package com.mengpeng.swipebackactivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BaseSwipeActivity extends AppCompatActivity {

    private LinearLayout title_layout;
    private TextView base_status_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_base_swipe);
        Utils.fullScreen(this);


        title_layout = findViewById(R.id.title_layout);
        base_status_bar = findViewById(R.id.base_status_bar);

        base_status_bar.setBackgroundColor(Color.parseColor("#33ff00ff"));

        base_status_bar.setHeight(Utils.getStatusBarHeight(this));

    }

//    public void setStatusBarColor(int colorId) {
//        base_status_bar.setBackgroundColor(colorId);
//    }

    /**
     * 设置状态栏的颜色
     *
     * @param color 状态栏的颜色
     */
    public void setStatusBarColor(String color) {
        base_status_bar.setBackgroundColor(Color.parseColor(color));
    }

    /**
     * 设置是否保留状态栏的高度，此时只关乎状态栏的高度，状态栏的内容依然存在
     *
     * @param isShow 设置是否保留状态栏的高度
     */
    public void isShowStatusBar(boolean isShow) {
        if (isShow) {
            base_status_bar.setHeight(Utils.getStatusBarHeight(this));
        } else {
            base_status_bar.setHeight(0);
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(layoutResID, null);
        contentView.setLayoutParams(new FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        title_layout.addView(contentView);
    }
}
