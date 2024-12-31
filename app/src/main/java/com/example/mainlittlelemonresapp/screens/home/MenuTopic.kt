package com.example.mainlittlelemonresapp.screens.home

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainlittlelemonresapp.R

@Composable
fun MenuCat() {
    Row(
        modifier = Modifier
            .padding(
                start = 5.dp,
                top = 5.dp,
                bottom = 5.dp
            )
    ) {
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_pink)),
            modifier = Modifier
                .padding(end = 5.dp)
        ) {
            Text(
                text = stringResource(R.string.menu_all),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    /* fontFamily = FontFamily(
                        Font(R.font.karla_regular)
                    ) */
                )
            )
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_pink)),
            modifier = Modifier
                .padding(end = 5.dp)
        ) {
            Text(
                text = stringResource(R.string.menu_starter),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    /* fontFamily = FontFamily(
                        Font(R.font.karla_regular)
                    ) */
                )
            )
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_pink)),
            modifier = Modifier
                .padding(end = 5.dp)
        ) {
            Text(
                text = stringResource(R.string.menu_main),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    /* fontFamily = FontFamily(
                        Font(R.font.karla_regular)
                    ) */
                )
            )
        }
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(colorResource(R.color.dark_pink)),
            modifier = Modifier
                .padding(end = 5.dp)
        ) {
            Text(
                text = stringResource(R.string.menu_dessert),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.ExtraBold,
                    /* fontFamily = FontFamily(
                        Font(R.font.karla_regular)
                    ) */
                )
            )
        }
    }
}