package com.kkyoungs.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kkyoungs.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /**
     * 데이터 바인딩
     */
    lateinit var mBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}