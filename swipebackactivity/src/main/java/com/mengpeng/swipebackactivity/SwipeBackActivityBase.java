package com.mengpeng.swipebackactivity;

import android.app.Activity;

/**
 * 创建:  MengPeng
 * 日期:  2017/5/22 , 上午11:52.
 * 作用:
 */
public interface SwipeBackActivityBase {

    public abstract SwipeBackLayout getSwipeBackLayout();

    public abstract void setSwipeBackEnable(boolean enable);

    public abstract void setStatusBarCorlor(Activity activity, int colorId);

    public abstract void scrollToFinishActivity();

}
