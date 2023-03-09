package com.oceanknight.moneyinmyaccount.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController

@Composable
fun ReplayNavigation() {
    val navController = rememberNavController()
    val navigationActions = remember(navController) {

    }
}