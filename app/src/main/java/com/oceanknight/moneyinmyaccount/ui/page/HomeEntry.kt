package com.oceanknight.moneyinmyaccount.ui.page

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeEntry(clicks: Int, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Log.d("Button : " , clicks.toString())
        Text("$clicks")
    }
}