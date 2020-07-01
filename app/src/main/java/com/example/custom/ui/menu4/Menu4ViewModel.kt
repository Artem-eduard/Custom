package com.example.custom.ui.menu4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Menu4ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is menu4 Fragment"
    }
    val text: LiveData<String> = _text
}