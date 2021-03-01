package com.tencent.xxplayer.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.tencent.xxplayer.R
import com.tencent.xxplayer.base.BaseActivity


class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        setContentView(R.layout.activity_splash)
    }

    override fun initData() {
        Handler(Looper.getMainLooper()!!).postDelayed(Runnable{
            Intent(this, MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        },2000)//2秒后跳转至应用主界面MainActivity
    }

    override fun initListener() {
    }
}