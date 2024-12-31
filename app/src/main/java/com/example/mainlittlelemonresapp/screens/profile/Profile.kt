package com.example.mainlittlelemonresapp.screens.profile

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
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
import androidx.navigation.NavHostController
import com.example.mainlittlelemonresapp.R
import com.example.mainlittlelemonresapp.extra.TopBar2
import com.example.mainlittlelemonresapp.navigation.Welcome

@Composable
fun Profile(navController : NavHostController) {

    val context = LocalContext.current

    val sharePref = context
        .getSharedPreferences("sharePref", Context.MODE_PRIVATE)

    val firstName = remember {
        mutableStateOf(
            TextFieldValue(
                sharePref.getString("firstName", "")
                    ?: "" )
        )
    }

    val lastName = remember {
        mutableStateOf(
            TextFieldValue(sharePref.getString("lastName", "")
                ?: "" ))
    }

    val userEmail = remember {
        mutableStateOf(
            TextFieldValue(sharePref.getString("userEmail", "")
                ?: "" ))
    }

    val userPassword = remember {
        mutableStateOf(
            TextFieldValue(sharePref.getString("userPassword", "")
                ?: "" ))
    }

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
    ) {
        TopBar2(navController)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.1f)
                .background(colorResource(R.color.green))
        ) {
            Text(
                text = "Your Personal Details",
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
                Log.d("AAA", firstName.toString())
                Log.d("BBB", lastName.toString())
                Log.d("CCC", userEmail.toString())
                Log.d("DDD", userPassword.toString())

                val editor = sharePref.edit()
                editor.putString("userName", firstName.value.text)
                editor.putString("userSurname", lastName.value.text)
                editor.putString("userEmail", userEmail.value.text)
                editor.putString("userPassword", userPassword.value.text)
                editor.apply()

                updateUserInfo(
                    firstName.value.text,
                    lastName.value.text,
                    userEmail.value.text,
                    userPassword.value.text,
                    sharePref)

                navController.navigate(Welcome.route)

                Toast.makeText(
                    context, "See you soon", Toast.LENGTH_LONG
                ).show()
            },
            colors = ButtonDefaults.buttonColors(colorResource(R.color.yellow)),
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(5.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Log Out",
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}