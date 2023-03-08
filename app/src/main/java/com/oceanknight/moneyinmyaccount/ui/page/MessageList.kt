package com.oceanknight.moneyinmyaccount.ui.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun MessageList() {
    var messageCards = mutableListOf(
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

    LazyColumn {
        items(messageCards.size) { index ->
            MessageCard(messageCard = messageCards[index])
        }
    }
}
