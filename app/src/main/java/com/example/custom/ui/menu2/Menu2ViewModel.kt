package com.example.custom.ui.menu2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Menu2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is menu2 Fragment"
    }
    val text: LiveData<String> = _text
}