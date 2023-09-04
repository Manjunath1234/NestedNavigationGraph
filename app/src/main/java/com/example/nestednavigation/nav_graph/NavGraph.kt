package com.example.nestednavigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.nestednavigation.HOME_ROUTE
import com.example.nestednavigation.ROOT_ROUTE
import com.example.nestednavigation.Screen


@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navHostController = navController)
        authNavGraph(navHostController = navController)
    }
}