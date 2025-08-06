package com.kuldeep.movieexplorer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kuldeep.movieexplorer.presentation.ui.screens.DetailScreen
import com.kuldeep.movieexplorer.presentation.ui.screens.HomeScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    /**
     * setup NavHost
     *
     * @param navController it passes navController object
     * @param startDestination it contains the information of the first screen
     */
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable(route = "home") {
            HomeScreen(onMovieClick = {
                navController.navigate("details")
            })
        }
        composable(route = "details") {
            DetailScreen()
        }
    }
}