package com.example.mainlittlelemonresapp.extra

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mainlittlelemonresapp.R
import com.example.mainlittlelemonresapp.navigation.Home
import com.example.mainlittlelemonresapp.navigation.Profile

@Composable
fun TopBar(navController : NavHostController) {
    Column {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.03f)
                .background(colorResource(R.color.yellow))
        ) {}

        Row {
            Image(
                painter = (painterResource(R.drawable.logo2)),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(300.dp)
                    .align(Alignment.CenterVertically)
                    .padding(start = 50.dp)
            )
            IconButton(
                onClick = {
                    navController.navigate(Profile.route)
                },
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        bottom = 10.dp,
                        start = 10.dp
                    )
            ) {
                Icon(
                    painter = painterResource(R.drawable.user),
                    contentDescription = "Back Icon",
                )
            }
        }
    }
}

@Composable
fun TopBar2(navController : NavHostController) {
    Column {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.03f)
                .background(colorResource(R.color.yellow))
        ) {}
        Row {
            IconButton(
                onClick = {},
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        bottom = 10.dp,
                        start = 10.dp
                    )
            ) {
                IconButton (
                    onClick = { navController.navigate(Home.route) }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back Button"
                    )
                }
            }
            Image(
                painter = (painterResource(R.drawable.logo2)),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(300.dp)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
fun TopBar3() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.03f)
                .background(colorResource(R.color.yellow))
        ) {}
        Image(
            painter = (painterResource(R.drawable.logo2)),
            contentDescription = "Logo",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .padding(
                    top = 10.dp,
                    bottom = 10.dp
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Bar() {
    TopBar3()
}