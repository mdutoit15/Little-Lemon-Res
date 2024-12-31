package com.example.mainlittlelemonresapp.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.mainlittlelemonresapp.extra.TopBar

@Composable
fun Home(navController : NavHostController) {
    Column {
        TopBar(navController)
        Hero()
        MenuCat()
        MenuItem()
    }
}