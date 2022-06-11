package com.myapp.tourmate.viewmodels

import androidx.lifecycle.*
import kotlinx.coroutines.launch

//class SettingViewModel : ViewModel() {
//
//    private val _text = MutableLiveData<String>().apply {
//        value = "This is setting Fragment"
//    }
//    val text: LiveData<String> = _text
//}

class SettingViewModel(private val pref: SettingPreferences) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is setting Fragment"
    }
    val text: LiveData<String> = _text

    fun getThemeSettings(): LiveData<Boolean> {
        return pref.getThemeSetting().asLiveData()
    }

    fun saveThemeSetting(isDarkModeActive: Boolean) {
        viewModelScope.launch {
            pref.saveThemeSetting(isDarkModeActive)
        }
    }
}