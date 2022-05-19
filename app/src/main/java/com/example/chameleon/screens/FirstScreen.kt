package com.example.chameleon.screens

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chameleon.R
import com.example.chameleon.navigation.AppScreens

@Composable
fun FirstScreen(navController: NavController){
    Scaffold {
        //Llama al navController y permite navegar
        bodyContent(navController)
    }
}

@Composable
fun bodyContent(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
        myComponent(navController)
    }
}

@Composable
fun BorderExample(navController: NavController, text: String) {
    OutlinedButton(
        onClick = {navController.navigate(route = AppScreens.SecondScreen.route) },
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
        Text(text = text,
            color = Color(0xFF20EF2F),
            style = MaterialTheme.typography.h6)
    }
    Spacer(modifier = Modifier.height(8.dp))
    TextButton(
        onClick = { navController.navigate(route = AppScreens.SecondScreen.route) },
        colors = ButtonDefaults.textButtonColors(
            contentColor = Color(0xFF0B7C13)
        )
    ) {
        Text("Registrarse")
    }
}


@Composable
fun myText(text: String){
    Text(text, fontSize = 30.sp,
        color = Color.White,
        style = MaterialTheme.typography.h1)
}


@Composable
fun myImage() {
    Image(
        painterResource(R.drawable.icono),
        "Test image",
        modifier = Modifier
            .size(120.dp)

    )
}

@Composable
fun myComponent(navController: NavController){
    Column(modifier = Modifier
        .padding(start = 8.dp)
        .size(2500.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        myImage()
        myText("¡Bienvenido a Chameleon!")
        Spacer(modifier = Modifier.height(8.dp))
        myText("¿Preparado?")
        Spacer(modifier = Modifier.height(25.dp))
        BorderExample(navController, "Acceder")
    }
}





