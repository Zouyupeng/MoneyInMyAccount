package com.oceanknight.moneyinmyaccount.ui.page

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.oceanknight.moneyinmyaccount.R

@Composable
fun HomeEntry(firstRow : String, secondRow : String) {
    Row(
        modifier = Modifier.padding(all = 8.dp)
    ){
        Image(
            painterResource(id = R.drawable.moji_emm),
            contentDescription = "profile picture",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colorScheme.secondary, shape = CircleShape)
        )
        Spacer(Modifier.padding(horizontal = 8.dp))
        Column {
            Text(
                text = firstRow,
                color = MaterialTheme.colorScheme.outlineVariant
            )
            Spacer(modifier = Modifier.padding(vertical = 4.dp))
            Text(secondRow)
        }
    }
}