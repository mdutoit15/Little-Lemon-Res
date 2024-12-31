package com.example.mainlittlelemonresapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainlittlelemonresapp.R

@Composable
fun MenuItem() {

    val karlaFamFont = FontFamily(Font(R.font.karla_regular))

    Column {
        Card(
            colors = CardDefaults.cardColors(colorResource(R.color.grey)),
            modifier = Modifier
                .fillMaxHeight(0.28f)
                .fillMaxWidth()
                .padding(
                    start = 10.dp,
                    end = 10.dp
                )
        ) {
            Row {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(0.65f)
                        .padding(start = 5.dp)
                ) {
                    Text(
                        stringResource(R.string.greekSalad),
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .padding(
                                top = 10.dp,
                                start = 5.dp
                            )
                    )
                    Text(
                        stringResource(R.string.greekSalad_description),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Thin
                        ),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .padding(
                                top = 2.dp,
                                start = 5.dp,
                                end = 5.dp
                            )
                    )
                    Text(
                        stringResource(R.string.greekSalad_price),
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier
                            .padding(
                                start = 5.dp,
                                top = 5.dp
                            )
                    )
                }

                Image(
                    painter = painterResource(R.drawable.greek_salad),
                    contentDescription = "Greek Salad",
                    contentScale = ContentScale.Crop,
                )
            }
        }
    }
}