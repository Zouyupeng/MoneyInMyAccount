package com.oceanknight.moneyinmyaccount.ui.page

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable

@Composable
fun Conversation(messageCards: List<MessageCard>) {
    LazyColumn {
        items(messageCards.size) { index ->
            MessageCard(messageCard = messageCards[index])
        }
    }
}
