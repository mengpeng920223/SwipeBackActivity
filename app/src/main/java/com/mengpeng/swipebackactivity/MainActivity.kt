package com.mengpeng.swipebackactivity

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //设置此页面不可左滑返回
        setSwipeBackEnable(false)

        //跳转到下一页
        textView.setOnClickListener({
            startActivity(Intent(this, Main1Activity::class.java))
        })

    }
}
