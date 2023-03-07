package com.oceanknight.moneyinmyaccount

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.oceanknight.moneyinmyaccount.ui.page.HomeEntry

class MainActivity : ComponentActivity() {

    var num = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            HomeEntry(num) {
                Log.d("Num : ", num.toString())
                ++num;
            }
        }
    }
}