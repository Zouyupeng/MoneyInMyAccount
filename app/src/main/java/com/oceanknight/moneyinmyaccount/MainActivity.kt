package com.oceanknight.moneyinmyaccount

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.oceanknight.moneyinmyaccount.ui.component.ReplayNavigation
import com.oceanknight.moneyinmyaccount.ui.component.TopNavigationBarItem
import com.oceanknight.moneyinmyaccount.ui.page.MessageList
import com.oceanknight.moneyinmyaccount.ui.theme.ExamplesTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ExamplesTheme{
//                MessageList()
//                TopNavigationBarItem()
                ReplayNavigation()
            }

        }
    }
}