package com.oceanknight.moneyinmyaccount

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.oceanknight.moneyinmyaccount.ui.page.Conversation
import com.oceanknight.moneyinmyaccount.ui.page.MessageCard
import com.oceanknight.moneyinmyaccount.ui.theme.ExamplesTheme

class MainActivity : ComponentActivity() {

    var messages = mutableListOf(
        MessageCard("Oceanknight", "Compose学习中"),
        MessageCard("Oceanknight", "Kotlin学习中"),
        MessageCard("Oceanknight", "Espresso学习中"),
        MessageCard("Oceanknight", "Compose学习中\n\n\n换行*3"),
        MessageCard("Oceanknight", "Compose学习中，长出一点点"),
        MessageCard("Oceanknight", "Compose学习中"),
        MessageCard("Oceanknight", "Compose学习中"),
        MessageCard("Oceanknight", "Compose学习中"),
        MessageCard("Oceanknight", "Compose学习中"),
        MessageCard("Oceanknight", "Compose学习中"),)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ExamplesTheme{
                Conversation(messages)
            }

        }
    }
}