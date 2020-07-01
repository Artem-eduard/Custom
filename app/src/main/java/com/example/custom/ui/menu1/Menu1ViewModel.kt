package com.example.custom.ui.menu1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Menu1ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is menu1 Fragment"
    }
    val text: LiveData<String> = _text
}