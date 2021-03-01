package com.tencent.xxplayer.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * ClassName: BaseFragment
 * Description: 所有fragment的基类
 */
open abstract class BaseFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return initView(inflater, container, savedInstanceState)
    }


    protected abstract fun initView(inflater: LayoutInflater?, container: ViewGroup?,
                                    savedInstanceState: Bundle?): View?
    protected abstract fun initListener()
    protected abstract fun initData()
}