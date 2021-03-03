package com.tencent.xxplayer.ui.activity

import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toolbar
import com.tencent.xxplayer.R
import com.tencent.xxplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        setContentView(R.layout.activity_main)
        initToolbar()
    }

    override fun initData() {

    }

    override fun initListener() {
    }

    private fun initToolbar() {
        //https://www.aidemx.cn/1051.html
        toolbar.title = "自研XXPlayer"
        toolbar.inflateMenu(R.menu.menu_toolbar)
        toolbar.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.menu_setting -> {
                    println("1. println ")
                }
                R.id.menu_about -> {
                    println("2. println ")
                }
            }
            true
        }
    }
}