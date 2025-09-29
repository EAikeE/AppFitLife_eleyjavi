package com.example.appfitlife

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.appfitlife.ui.MainScreen
import com.example.appfitlife.ui.theme.AppFitLifeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFitLifeTheme {
                MainScreen()
            }
        }
    }
}
