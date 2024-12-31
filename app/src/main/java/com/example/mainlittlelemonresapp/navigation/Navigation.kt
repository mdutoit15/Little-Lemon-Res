package com.example.mainlittlelemonresapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mainlittlelemonresapp.screens.home.Home
import com.example.mainlittlelemonresapp.screens.onboarding.Onboard
import com.example.mainlittlelemonresapp.screens.profile.Profile

@Composable
fun NavigationComp(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Welcome.route
    ) {
        composable(Welcome.route) {
            Onboard(navController)
        }

        composable(Home.route) {
            Home(navController)
        }

        composable(Profile.route) {
            Profile(navController)
        }
    }
}