package com.kkyoungs.mvvm

import com.kkyoungs.mvvm.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity() : BaseKotlinActivity<ActivityMainBinding, MainViewModel>() {
    /**
     * 데이터 바인딩
     */
    override val laResourceId: Int
        get() = R.layout.activity_main
    
    override val viewModel: MainViewModel by viewModel()
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