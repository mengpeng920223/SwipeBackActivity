package com.mengpeng.swipebackactivity;

/**
 * 创建:  MengPeng
 * 日期:  2017/5/22 , 上午11:52.
 * 作用:
 */
public interface SwipeBackInterface {

    public abstract SwipeBackLayout getSwipeBackLayout();

    public abstract void setSwipeBackEnable(boolean enable);

    public abstract void scrollToFinishActivity();

}
