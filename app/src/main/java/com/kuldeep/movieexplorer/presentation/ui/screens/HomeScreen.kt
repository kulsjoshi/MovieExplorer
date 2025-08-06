package com.kuldeep.movieexplorer.presentation.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(onMovieClick: () -> Unit) {
    //create a simple box where it shows text and perform a click event
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clickable { onMovieClick() },
        contentAlignment = Alignment.Center
    ) {
        Text("This is Home Screen - Tap to Go to Details")
    }
}