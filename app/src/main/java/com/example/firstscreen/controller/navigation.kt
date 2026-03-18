package com.example.firstscreen.controller

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firstscreen.screens.MainScreen
import com.example.firstscreen.screens.login
import com.example.firstscreen.screens.register
import com.example.firstscreen.welcome

@Composable
fun navigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            welcome(navController)
        }
        composable("login") {
            login(navController)
        }
        composable("signup") {
            register(navController)
        }

        composable("mainScreen") {
            MainScreen(navController)
        }
    }
}