package com.example.chameleon.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chameleon.R
import com.example.chameleon.navigation.AppScreens

@Composable
fun SecondScreen(navController: NavController){
    Scaffold {
        //Llama al navController y permite navegar
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        SecondComponent(navController)
    }
}

@Composable
fun SecondButton(navController: NavController) {
    OutlinedButton(
        onClick = {navController.navigate(route = AppScreens.FirstScreen.route) },
        modifier= Modifier.size(200.dp,50.dp),
        border = BorderStroke(
            width = 3.dp,
            brush = Brush.horizontalGradient(
                listOf(
                    Color(0xFF20EF2F),
                    Color(0xFFFAFAFA)
                )
            )
        )
    ) {
        Text("Regresar",
            color = Color(0xFF20EF2F),
            style = MaterialTheme.typography.h6)
    }
}

@Composable
fun SecondText(text: String, font: TextUnit){
    Text(
        color = Color.White,
        fontSize = font,
        modifier = Modifier
            .fillMaxWidth(),
        text = text,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.h1)


}


@Composable
fun SecondImage() {
    Image(
        painterResource(R.drawable.icono),
        "Test image",
        modifier = Modifier
            .size(120.dp)

    )
}

@Composable
fun ConstructionImage() {
    Image(
        painterResource(R.drawable.site_under_construction),
        "Test image",
        modifier = Modifier
            .size(150.dp)

    )
}

@Composable
fun SecondComponent(navController: NavController){
    Column(modifier = Modifier
        .padding(start = 8.dp)
        .size(2500.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        SecondImage()
        SecondText("App en desarrollo" +
                        "", 30.sp)
        Spacer(modifier = Modifier.height(8.dp))
        SecondText("Esta app se encuentra en desarrollo, está desarrollada con el SDK de Android" +
                        " y lenguaje Kotlin usando el conjunto de librerias Jetpack." +
                        "", 20.sp)
        Spacer(modifier = Modifier.height(8.dp))
        //ConstructionImage()
        Spacer(modifier = Modifier.height(25.dp))
        SecondButton(navController)
    }
}

