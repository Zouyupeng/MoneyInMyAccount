package com.oceanknight.moneyinmyaccount

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.oceanknight.moneyinmyaccount.ui.page.HomeEntry
import com.oceanknight.moneyinmyaccount.ui.theme.ExamplesTheme

class MainActivity : ComponentActivity() {

    var num = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamplesTheme{
                HomeEntry("Oceanknight", "Compose 学习中")
            }

        }
    }
}