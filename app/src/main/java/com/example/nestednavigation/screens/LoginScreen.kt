package com.example.nestednavigation.screens


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nestednavigation.HOME_ROUTE
import com.example.nestednavigation.Screen


@Composable
fun LogInScreen(navHostController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "LogIn",
                fontSize = MaterialTheme.typography.headlineMedium.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Cyan,
                modifier = Modifier.clickable {
                    navHostController.navigate(Screen.SignUp.route)
                }
            )
            Spacer(modifier = Modifier.size(100.dp))
            Text("Go To Detail",
                modifier = Modifier.clickable {

                    navHostController.popBackStack()
                    navHostController.navigate(Screen.Detail.route)
                /*navHostController.navigate(HOME_ROUTE){
                        popUpTo(HOME_ROUTE)
                    }*/
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Preview
@Composable
fun  LogInScreenPreview(){
    LogInScreen(navHostController = rememberNavController())
}