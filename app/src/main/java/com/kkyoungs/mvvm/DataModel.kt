package com.kkyoungs.mvvm

interface DataModel {
    fun getData(query: String, accuracy: Any, page: Int, size: Int)
}