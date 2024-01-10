package com.kkyoungs.mvvm

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseKotlinViewModel :ViewModel() {
    /**
     * RxJava 의 observing을 위한 부분.
     * addDisposable을 이용하여 추가하면 됨.
     */
    private val compositeDisposable = CompositeDisposable()

    /**
     * 기본적으로 RXJAVA 의 Observable들은 compositeDisposable에 추가를 해주고, 뷰 모델이 없어질때 까지 추가했던 것들을 지워줘야한다.
     * ViewModel은 View 와의 생명주기를 공유하기 때문에 View가 부서질 때 ViewModel의 onCleared() 호출, 그에 따라 옵저버블들이 전부 클리어됨
     */
    fun addDisposable(disposable: Disposable){
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}