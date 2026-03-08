package com.example.firstscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstscreen.ui.theme.FirstScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstScreenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.movil),
                            contentDescription = null,
                            modifier = Modifier.size(400.dp),
                            contentScale = ContentScale.Fit
                        )

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 40.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Texts("Hello")

                            Spacer(modifier = Modifier.height(16.dp))

                            Text(
                                text = "Welcome To Little Drop, where you manage your daily tasks",
                                fontSize = 19.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Gray,
                                textAlign = TextAlign.Center
                            )

                            Spacer(modifier = Modifier.height(40.dp))

                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(50.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFF3E24A6)
                                )

                            ) {
                                Text(
                                    text = "Login",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(20.dp))

                            OutlinedButton(
                                onClick = {
                                    setContent {
                                        RegisterScreen()
                                    }
                                },
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(50.dp),
                                border = BorderStroke(1.dp, Color(0xFF6200EE))
                            ) {
                                Text(
                                    text = "Sign Up",
                                    color = Color(0xFF6200EE),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Texts(
    content: String,
    textColor: Color = Color.Black
) {
    Text(
        text = content,
        color = textColor,
        fontSize = 35.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif
    )
}