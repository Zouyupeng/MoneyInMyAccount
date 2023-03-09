package com.oceanknight.moneyinmyaccount.ui.component

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object ReplyRoute {
    const val INBOX = "1"
    const val ARTICLES = "2"
    const val DM = "3"
    const val GROUPS = "4"
}

data class ReplyTopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int
)

class ReplayNavigationActions (private val navController: NavHostController){
    fun navigateTo(destination: ReplyTopLevelDestination) {

    }
}