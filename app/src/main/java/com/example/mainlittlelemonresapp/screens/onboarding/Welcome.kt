package com.example.mainlittlelemonresapp.screens.onboarding

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.mainlittlelemonresapp.R
import com.example.mainlittlelemonresapp.extra.TopBar3
import com.example.mainlittlelemonresapp.navigation.Home

@Composable
fun Onboard(navController: NavHostController) {

    val context = LocalContext.current

    val firstName = remember {
        mutableStateOf(TextFieldValue(""))
    }

    val lastName = remember {
        mutableStateOf(TextFieldValue(""))
    }

    val userEmail = remember {
        mutableStateOf(TextFieldValue(""))
    }

    val userPassword = remember {
        mutableStateOf(TextFieldValue(""))
    }

    val sharePref = context
        .getSharedPreferences("sharePref", Context.MODE_PRIVATE)

    fun updateUserInfo(
        firstName: String,
        lastName: String,
        userEmail: String,
        userPassword: String,
        sharePref: SharedPreferences
    ) {
        val editor = sharePref.edit()
        editor.putString("firstName", firstName)
        editor.putString("lastName", lastName)
        editor.putString("userEmail", userEmail)
        editor.putString("userPassword", userPassword)
        editor.apply()
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        // .padding(top = 40.dp)
    ) {
        TopBar3()
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .background(colorResource(R.color.green))
        ) {
            Text(
                text = "Tell us more about yourself",
                color = Color.White,
                fontSize = 20.sp
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
        ) {
            Text(
                text = "Personal Details:",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 15.dp, start = 15.dp)
            )
        }

        OutlinedTextField(
            value = firstName.value,
            onValueChange = {firstName.value = it},
            label = {
                Text("First Name")
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(
                    top = 5.dp,
                    bottom = 10.dp,
                    start = 10.dp,
                    end = 10.dp
                )
                .align(Alignment.CenterHorizontally),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next
            )
        )
        OutlinedTextField(
            value = lastName.value,
            onValueChange = {lastName.value = it},
            label = {
                Text("Last Name")
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(
                    top = 5.dp,
                    bottom = 10.dp,
                    start = 10.dp,
                    end = 10.dp
                )
                .align(Alignment.CenterHorizontally),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next
            )
        )
        OutlinedTextField(
            value = userEmail.value,
            onValueChange = {userEmail.value = it},
            label = {
                Text("Email")
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(
                    top = 5.dp,
                    bottom = 10.dp,
                    start = 10.dp,
                    end = 10.dp
                )
                .align(Alignment.CenterHorizontally),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Next
            )
        )
        OutlinedTextField(
            value = userPassword.value,
            onValueChange = {userPassword.value = it},
            label = {
                Text("Password")
            },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(
                    top = 5.dp,
                    bottom = 20.dp,
                    start = 10.dp,
                    end = 10.dp
                )
                .align(Alignment.CenterHorizontally),
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Go
            )
        )

        OutlinedButton(
            onClick = {
                if (
                    firstName.value.text.isBlank()
                    || lastName.value.text.isBlank()
                    || userEmail.value.text.isBlank()
                    || userPassword.value.text.isBlank()
                ) {

                    Toast.makeText(
                        context, "Please fill in all the details", Toast.LENGTH_LONG
                    ).show()

                } else {
                    updateUserInfo(
                        firstName.value.text,
                        lastName.value.text,
                        userEmail.value.text,
                        userPassword.value.text,
                        sharePref)

                    navController.navigate(Home.route)

                    Toast.makeText(
                        context, "Welcome", Toast.LENGTH_LONG
                    ).show()
                }
            },
            colors = ButtonDefaults.buttonColors(colorResource(R.color.yellow)),
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(5.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Register",
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}