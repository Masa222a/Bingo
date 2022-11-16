package com.android.example.bingo.View

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.android.example.bingo.BingoManager
import com.android.example.bingo.databinding.ActivityMainBinding
import com.android.example.bingo.viewModel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    val mainActivityViewModel: MainActivityViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding
    var bingo = BingoManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.lifecycleOwner = this
        binding.viewModel = mainActivityViewModel
    }

}
