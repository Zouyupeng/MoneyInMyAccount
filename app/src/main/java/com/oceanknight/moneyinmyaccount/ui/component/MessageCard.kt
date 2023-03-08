package com.oceanknight.moneyinmyaccount.ui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.oceanknight.moneyinmyaccount.R

class MessageCard(title: String = "Oceanknight", body: String) {
    var title = title
    val body = body
}

@Composable
fun MessageCard(messageCard: MessageCard) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        shadowElevation = 5.dp,
        modifier = Modifier.padding(all = 8.dp)
    ) {
        Row(
            modifier = Modifier.padding(all = 8.dp)
        ){
            Image(
                painterResource(id = R.drawable.head_180x180),
                contentDescription = "profile picture",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.secondary, shape = CircleShape)
            )
            Spacer(Modifier.padding(horizontal = 8.dp))
            Column {
                Text(
                    text = messageCard.title,
                    color = MaterialTheme.colorScheme.outlineVariant,
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.padding(vertical = 4.dp))
                Text(
                    text = messageCard.body,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}