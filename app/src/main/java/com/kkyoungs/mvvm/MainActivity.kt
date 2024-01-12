package com.kkyoungs.mvvm

import com.kkyoungs.mvvm.databinding.ActivityMainBinding

class MainActivity(override val viewModel: MainViewModel) : BaseKotlinActivity<ActivityMainBinding, MainViewModel>() {
    /**
     * 데이터 바인딩
     */
    override val laResourceId: Int
        get() = R.layout.activity_main

    override fun initAfterBinidng() {
        TODO("Not yet implemented")
    }

    override fun initDataBinding() {
        TODO("Not yet implemented")
    }

    override fun initStartView() {
        TODO("Not yet implemented")
    }
}