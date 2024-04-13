package com.example.kotlin_chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlin_chat.ui.theme.Kotlin_chatTheme

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


//Loginscreen
//Users screen
//messages
//use supabase backside
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


@Composable
fun App() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") { Login() }
        composable("chat") { Chat() }
    }
}


@Preview
@Composable
fun Login() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = androidx.compose.ui.graphics.Color.White)
            .fillMaxSize()
    ) {
        Text(
            text = "Welcome, Please Enter Details",
            modifier = Modifier.padding(25.dp),
            fontSize = 50.0.sp,

            )
        Input("Email")
        Input("Password")
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(25.dp),
            onClick = { /*TODO*/ })
        {
Text(
    text = "Login",
    modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}


@Composable
fun Chat() {

    Column {
        Text(text = "Welcome, Please Enter Details")
//        Input("Email")
//        Input("Password")
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Input(label: String) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        value = text,
        onValueChange = { text = it },
        label = { Text(label) },
        shape = RoundedCornerShape(25.dp)

    )
}
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun SimpleOutlinedTextFieldSample() {
//
//    var value by remember { mutableStateOf("Hello\nWorld\nInvisible") }
//
//    TextField(
//        value = value,
//        onValueChange = { value = it },
//        label = { Text("Enter text") },
//        maxLines = 1,
//        textStyle = TextStyle(color = androidx.compose.ui.graphics.Color.Black, fontWeight = FontWeight.Bold),
//        modifier = Modifier.padding(20.dp)
//    )
//}