package com.hello.shayriapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.shayriapp.R
import com.example.shayriapp.ui.theme.primaryColor

import com.hello.shayriapp.routing.ShayriRoutingItems

import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navHostController: NavHostController) {
    LaunchedEffect(key1 = true) {
        delay(1000)
        navHostController.navigate(ShayriRoutingItems.CategoryScreenItem.route)
    }
    Surface {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {

            Box(modifier = Modifier.fillMaxSize().padding(start = 20.dp), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.hanumanbg),
                    modifier = Modifier.size(650.dp), contentDescription = null,
                )
            }
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 60.dp), contentAlignment = Alignment.BottomCenter) {
                CircularProgressIndicator(
                    modifier = Modifier.size(40.dp),
                    strokeWidth = 5.dp,
                    color = Color.White
                )
            }
        }

    }
}