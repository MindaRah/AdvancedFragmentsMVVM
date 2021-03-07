package com.example.advancedfragmentsmvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RadioViewModel: ViewModel() {

    //timer - counting live data
    //LiveData<Int> is not Mutable
    val countLiveData: MutableLiveData<Int> = MutableLiveData()

    //start the counter
    init {
        Thread {
            // i in 0 until 1000 -> 0 to 999
            //i in 0..1000 -> 0 to 1000
            for(i in 1..1000){
                Thread.sleep(1000)
                countLiveData.postValue(i)
            }
        }.start()
    }
}