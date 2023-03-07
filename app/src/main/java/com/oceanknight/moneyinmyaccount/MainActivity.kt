package com.oceanknight.moneyinmyaccount

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.oceanknight.moneyinmyaccount.ui.page.HomeEntry

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            HomeEntry(name = "Oceanknight")
        }

    }
}