package com.generation.appclickcounter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var cont = MutableLiveData(0)

    fun contador(){

        cont.value = cont.value?.plus(1)

    }

    }
