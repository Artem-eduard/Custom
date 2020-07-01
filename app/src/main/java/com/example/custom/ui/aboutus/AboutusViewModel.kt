package com.example.custom.ui.aboutus

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutusViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "About Us Page"
    }
    val text: LiveData<String> = _text
}