package com.example.mainlittlelemonresapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mainlittlelemonresapp.navigation.NavigationComp
import com.example.mainlittlelemonresapp.screens.home.Home
import com.example.mainlittlelemonresapp.screens.onboarding.Onboard
import com.example.mainlittlelemonresapp.screens.profile.Profile
import com.example.mainlittlelemonresapp.ui.theme.MainLittleLemonResAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navControllerM = rememberNavController()
            MainLittleLemonResAppTheme {
                NavigationComp(navControllerM)
            }
        }
    }
}