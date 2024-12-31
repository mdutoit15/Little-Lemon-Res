package com.example.mainlittlelemonresapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mainlittlelemonresapp.R

@Composable
fun Hero() {
    Column(
        modifier = Modifier
            .background(colorResource(R.color.green))
            .fillMaxWidth()
            .fillMaxHeight(0.445f)
            .padding(
                start = 15.dp,
                end = 15.dp
            )
    ) {
        Row {
            Column {
                Text(
                    text = stringResource(R.string.store),
                    style = TextStyle(
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Medium,
                        color = colorResource(R.color.yellow)
                    )
                )
                Text(
                    text = stringResource(R.string.town),
                    style = TextStyle(
                        fontSize = 30.sp,
                        color = Color.White
                    )
                )
                Text(
                    text = stringResource(R.string.store_description),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(start = 10.dp, end = 10.dp)
                )
            }
            Image(
                painter = painterResource(R.drawable.hero_image),
                contentDescription = "Hero Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxHeight(0.6f)
                    .width(350.dp)
                    .padding(start = 25.dp)
                    .align(Alignment.Bottom)
                    .border(2.dp, Color.Yellow)
            )
        }
        Searchbar()
    }
}

@Composable
fun Searchbar() {

    val searchBar = remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column{
        OutlinedTextField(
            value = searchBar.value,
            onValueChange = { searchBar.value = it },
            label = {
                Text(
                    text = stringResource(R.string.searchbar),
                    color = Color.White,
                )
            },
            colors = TextFieldDefaults.colors(colorResource(R.color.green)),
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HeroPreview() {
    Hero()
}