package com.example.mainlittlelemonresapp.navigation

interface Destinations {
    val route: String
}

object Welcome : Destinations {
    override val route = "onboarding"
}

object Home : Destinations {
    override val route = "home"
}

object Profile : Destinations {
    override val route = "profile"
}