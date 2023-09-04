package com.example.nestednavigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigation.AUTH_ROUTE

import com.example.nestednavigation.Screen

import com.example.nestednavigation.screens.LogInScreen
import com.example.nestednavigation.screens.SignUpScreen


fun NavGraphBuilder.authNavGraph(navHostController: NavHostController){
    navigation(
        startDestination = Screen.Login.route,
        route= AUTH_ROUTE
    ){
        composable(
            route = Screen.Login.route
        ){
            LogInScreen(navHostController = navHostController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navHostController = navHostController)
        }
    }
}