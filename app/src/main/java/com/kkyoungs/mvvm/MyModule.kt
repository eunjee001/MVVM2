package com.kkyoungs.mvvm

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

// 다른 클래스에서 해당 부분이 필요하다면 단순히 get()을 해주면 팩토리로 만든 클래스가 쏙 하고 들어감.

var modelPart = module {
    factory<DataModel>{
        DataModelImpl()
    }
}

var viewModelPart = module {
    viewModel{
        MainViewModel(get())
    }
}

var myDiModule = listOf(modelPart, viewModelPart)