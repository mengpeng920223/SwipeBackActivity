# SwipeBackActivity
Android最简单最便捷的快速集成左滑返回


### Step1:Add the JitPack repository to your build file
```
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
```
### Step 2. Add the dependency
```
dependencies {
    compile 'com.github.mengpeng920223:SwipeBackActivity:v1.1.1'
}
```

### Step 3. 只需要把你的BaseActivity继承SwipeBackActivity即可完成左滑返回功能

### Step 4. 修改订单文件中主题
```
  <style name="AppTheme.Activity.Translucent.NoActionBar" parent="AppTheme">
        <item name="windowActionBar">false</item>
        <item name="windowNoTitle">true</item>
        <item name="colorPrimaryDark">@color/white</item>
        <item name="android:windowAnimationStyle">@style/anim_activity</item>
        <item name="android:windowLightStatusBar" tools:targetApi="m">false</item>
        <!-- 设置背景透明，右滑时才能看到上一个界面，否则会看到黑屏效果-->
        <item name="android:windowIsTranslucent">true</item>
  </style>
 
  最主要的是：
  <!-- 设置背景透明，右滑时才能看到上一个界面，否则会看到黑屏效果-->
  <item name="android:windowIsTranslucent">true</item>
  或者让自己的style继承AppTheme.Activity.Translucent.NoActionBar

```

v1.1.0
- 适配沉浸式左滑返回
- 增加修改状态栏字体颜色方法
```
 //修改状态栏颜色，沉浸式
 //全局设置时在BaseActivity中的onCreate
 //单独修改时在当前的activity中的onCreate
 setStatusBarColor("#33ff0000");
 
 //设置状态栏字体颜色
 StatusBarUtils.setStatusBarLightMode(this);
 or
 StatusBarUtils.setStatusBarDarkMode(this);

```
