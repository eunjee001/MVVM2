package com.kkyoungs.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseKotlinActivity <T: ViewDataBinding, R: BaseKotlinViewModel> : AppCompatActivity(){
    lateinit var viewDataBinding: T
    abstract val laResourceId:Int
    abstract val viewModel: R

    /**
     * 레이아웃을 띄운 직후 호출
     * 뷰나 액티비티의 속성 등을 초기화
     * ex) 리사이클러뷰, 툴바, 드로어뷰 ,, 등등
     */
    abstract fun initStartView()

    /**
     * 두번째로 호출.
     * 데이터 바인딩 및 rxjava 설정
     * ex) rxjava observe, databinding observe..
     */
    abstract fun initDataBinding()

    /**
     * 바인딩 이후에 할 일을 여기에 구현.
     * 그외에 설정할 것이 있으면 이곳에서 설정
     * 클릭 리스너도 이곳에서 설정
     */
    abstract fun initAfterBinidng()

    private var isSetBackButtonVaild = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding = DataBindingUtil.setContentView(this, laResourceId)

        initStartView()
        initDataBinding()
        initAfterBinidng()
    }

}