package com.kkyoungs.mvvm

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

// 다른 클래스에서 해당 부분이 필요하다면 단순히 get()을 해주면 팩토리로 만든 클래스가 쏙 하고 들어감.


var retrofit = module {
    single<KakaoSearchService> {
        Retrofit.Builder()
            .baseUrl("https://dapi.kakao.com")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KakaoSearchService::class.java)
    }
}
var modelPart = module {
    factory<DataModel>{
        DataModelImpl(get())
    }
}

var viewModelPart = module {
    viewModel{
        MainViewModel(get())
    }
}

var myDiModule = listOf(modelPart, viewModelPart)