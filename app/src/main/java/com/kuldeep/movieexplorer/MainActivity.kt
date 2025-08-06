package com.kuldeep.movieexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.kuldeep.movieexplorer.navigation.AppNavHost
import com.kuldeep.movieexplorer.presentation.ui.theme.MovieExplorerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieExplorerTheme {
                val navController = rememberNavController()
                AppNavHost(navController = navController)
            }
        }
    }
}