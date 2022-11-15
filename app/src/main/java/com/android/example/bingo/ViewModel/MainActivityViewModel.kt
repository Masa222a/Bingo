package com.android.example.bingo.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.example.bingo.BingoManager

class MainActivityViewModel : ViewModel() {
    val result = MutableLiveData<String>()
    val stockNumber = MutableLiveData<String>()

    init {
        result.value = ""
        stockNumber.value = ""
    }

    val bingo = BingoManager()
    fun buttonTapped() {
        result.value = bingo.start()
        stockNumber.value = bingo.result()
    }
}