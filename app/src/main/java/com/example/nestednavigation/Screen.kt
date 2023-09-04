package com.example.nestednavigation

const val ROOT_ROUTE ="root"
const val HOME_ROUTE ="home"
const val AUTH_ROUTE ="auth"

sealed class Screen(val route:String) {
    object Home:Screen(route = "home_screen")
    object Detail:Screen(route = "detail_screen")
    object Login:Screen(route = "login_screen")
    object SignUp:Screen(route = "signUp_screen")
}