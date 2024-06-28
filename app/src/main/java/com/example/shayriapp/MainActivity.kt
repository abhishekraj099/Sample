package com.example.shayriapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.shayriapp.ui.theme.ShayriAPpTheme
import com.hello.shayriapp.routing.ShayriRouting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShayriAPpTheme {
                val navHostController = rememberNavController()
                ShayriRouting(navHostController = navHostController)
            }
        }
    }
}