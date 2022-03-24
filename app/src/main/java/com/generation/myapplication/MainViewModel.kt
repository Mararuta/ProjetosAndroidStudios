package com.generation.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    var cont  =  MutableLiveData (0)
    fun adicionar (){
        cont.value = cont.value!! + 1

    }
}