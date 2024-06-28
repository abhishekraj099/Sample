package com.hello.shayriapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shayriapp.ui.theme.primaryColor
import com.example.shayriapp.ui.theme.primaryLight
import com.example.shayriapp.ui.theme.primaryText


@Composable
fun ShayriListScreen(navHostController: NavHostController?, title: String?) {
    Scaffold (

    ){innerpadding ->
        Surface(modifier = Modifier.padding(innerpadding)) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = primaryColor)
            ) {
                Column {

                    MainToolbar(title = title.toString()) { navHostController!!.popBackStack() }

                    val singleList = getList().filter {
                        it.title == title.toString()
                    }
                    val finalList = singleList[0]

                    LazyColumn {
                        items(
                            finalList.shayriList!!
                        ) { item ->
                            Card(modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 15.dp),
                                colors = CardDefaults.cardColors(
//                                    Text color change
                                    containerColor = primaryLight
                                )
                            ) {
                                Text(
                                    text = item, color = Color.Black,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(20.dp),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(
                                        fontSize = 24.sp
                                    )
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}