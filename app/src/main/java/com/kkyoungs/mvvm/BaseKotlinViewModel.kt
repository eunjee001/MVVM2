package com.kkyoungs.mvvm

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class BaseKotlinViewModel :ViewModel() {
    /**
     * RxJava 의 observing을 위한 부분.
     * addDisposable을 이용하여 추가하면 됨.
     */
    private val compositeDisposable = CompositeDisposable()
    // 일회성 이벤트를 만들어 내는 라이브 이벤트
    // 뷰는 이러한 이벤트를 바인딩하고 있다가, 적절한 상황이 되면 액티비티를 호출하거나 스낵바를 만듬
//    private val snackbarMessage = SnackbarMessage()
//    private val snackbarMessageString = SnackbarMessageString()

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
    /**
     * 스낵바를 보여주고 싶으면 viewModel 에서 이 함수를 호출
     */
//    fun showSnackbar(stringResourceId:Int) {
//        snackbarMessage.value = stringResourceId
//    }
//    fun showSnackbar(str:String){
//        snackbarMessageString.value = str
//    }
//
//    /**
//     * BaseKotlinActivity 에서 쓰는 함수
//     */
//    fun observeSnackbarMessage(lifeCycleOwner: LifecycleOwner, ob:(Int) -> Unit){
//        snackbarMessage.observe(lifeCycleOwner, ob)
//    }
//    fun observeSnackbarMessageStr(lifeCycleOwner: LifecycleOwner, ob:(String) -> Unit) {
//        snackbarMessageString.observe(lifeCycleOwner, ob)
//    }
}