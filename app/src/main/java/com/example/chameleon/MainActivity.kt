package com.example.chameleon

import android.content.res.Configuration
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chameleon.ui.theme.ChameleonTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.Theme_Chameleon)
        super.onCreate(savedInstanceState)
        //Todo lo que situemos dentro de setContent seran elementos composable(Que conforman la UI de la APP)
        setContent {
            ChameleonTheme(darkTheme = true) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Black)
                )
                myComponent()
            }

        }
    }
}
//@Composable le indica a la app que este sera un elemento grafico(Se puede pintar, repintar y reutilizar)
@Composable
fun myText(text: String){
    Text(text, fontSize = 30.sp,
        color = White,
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
fun myComponent(){
    Column(modifier = Modifier
        .padding(start = 8.dp)
        .size(2500.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        myImage()
        myText("¡Bienvenido a Chameleon!")
        Spacer(modifier = Modifier.height(8.dp))
        myText("¿Preparado?")
    }
}


@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewTexts(){
    ChameleonTheme {
        myComponent()
    }
}

