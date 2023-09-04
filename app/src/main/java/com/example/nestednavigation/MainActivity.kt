package com.example.nestednavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigation.nav_graph.SetUpNavGraph
import com.example.nestednavigation.ui.theme.NestedNavigationTheme

class MainActivity : ComponentActivity() {
    lateinit var navHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navHostController = rememberNavController()
            NestedNavigationTheme {
                SetUpNavGraph(navController = navHostController)
            }
        }
    }
}

