## SwipeBackActivity Android最简单最便捷的快速集成左滑返回

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

```
 如果不需要左滑返回只需在当前activity的onCreate()中设置一下即可
 //设置此页面不可左滑返回
 setSwipeBackEnable(false) 
```

### Step 4. 修改清单文件中主题
```
  让自己的style继承AppTheme.Activity.Translucent.NoActionBar
  <!-- Base application theme. -->
  <style name="AppTheme" parent="AppTheme.Activity.Translucent.NoActionBar">
     <!-- Customize your theme here. -->
     <item name="colorPrimary">@color/colorPrimary</item>
     <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
     <item name="colorAccent">@color/colorAccent</item>
  </style>

```

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
