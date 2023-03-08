package com.oceanknight.moneyinmyaccount.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun TopNavigationBarItem() {
    val menuItems = listOf("1", "2", "3", "4", "我的")

    var itemSelect by remember {
        mutableStateOf(0)
    }


    NavigationBar(modifier = Modifier.fillMaxWidth()) {
        menuItems.forEachIndexed() { index, replyDestination ->
            NavigationBarItem(
                selected = itemSelect == index,
                onClick = { itemSelect = index },
                icon = {
                    Icon(
                        modifier = Modifier.size(22.dp),
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = null
                    )
                }
            )
        }
    }
}