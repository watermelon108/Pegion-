package com.pegion.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pegion.app.ui.screens.home.HomeScreen
import com.pegion.app.ui.screens.player.PlayerScreen

object Routes {
    const val HOME = "home"
    const val PLAYER = "player/{url}"
    fun createPlayerRoute(url: String) = "player/$url"
}

@Composable
fun PegionNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.HOME) {
        composable(Routes.HOME) {
            HomeScreen(
                onPlayVideo = { url ->
                    navController.navigate(Routes.createPlayerRoute(url))
                }
            )
        }
        composable(Routes.PLAYER) { backStackEntry ->
            val videoUrl = backStackEntry.arguments?.getString("url") ?: ""
            PlayerScreen(videoUrl = videoUrl, onBack = { navController.popBackStack() })
        }
    }
}
