package com.example.nestednavigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nestednavigation.HOME_ROUTE

import com.example.nestednavigation.Screen
import com.example.nestednavigation.screens.HomeScreen


fun NavGraphBuilder.homeNavGraph(navHostController: NavHostController) {
     navigation(
         startDestination = Screen.Home.route,
         route = HOME_ROUTE
     ){
         composable(route = Screen.Home.route){
             HomeScreen(navHostController)
         }
     }
}