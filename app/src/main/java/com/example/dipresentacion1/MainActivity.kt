package com.example.dipresentacion1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dipresentacion1.ui.theme.Dipresentacion1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingPreview()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    var scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray).verticalScroll(scrollState)
    ) {

            Image(
                painter = painterResource(id = R.drawable.fotoperfil),
                contentDescription = "Imagen",
                modifier = Modifier
                    .size(200.dp)
                    .fillMaxSize().align(Alignment.CenterHorizontally).padding(top = 20.dp)
            )
            Text(
                text = "David Castillo",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
                fontSize = 50.sp
            )

            Text(
                text = "Actualmente estoy cursando el segundo año de formacion profesional en desarrollo de aplicacion multiplataforma en el instituto CIFP Txurdinaga, tengo un gran interes por las nuevas tecnologias y me gustan los videojuegos",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            )

            Column(modifier = Modifier.padding(top = 20.dp, start = 5.dp, end = 5.dp)) {
                Row(modifier = Modifier.padding(bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_book_24),
                        contentDescription = "si",
                        modifier = Modifier.size(90.dp)
                    )

                    Column() {

                        Text(
                            text = "Estudios",
                            textAlign = TextAlign.Center,

                            fontSize = 30.sp
                        )
                        Text(
                            text = "Graduado de bachiller en ciencias, Cursando desarrollo de aplicaciones multiplataforma",
                            textAlign = TextAlign.Start,
                            fontSize = 15.sp
                        )
                    }

                }
                Row(modifier = Modifier.padding(bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_gamepad_24),
                        contentDescription = "si",
                        modifier = Modifier.size(90.dp)
                    )

                    Column() {

                        Text(
                            text = "Hobby",
                            textAlign = TextAlign.Center,

                            fontSize = 30.sp
                        )
                        Text(
                            text = "Los videojugeos. Nier:Automata, Sagas Souls, Ace Attorney y muchos otros",
                            textAlign = TextAlign.Start,
                            fontSize = 15.sp
                        )
                    }
                }
                Row(modifier = Modifier.padding(bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.baseline_code_24),
                        contentDescription = "si",
                        modifier = Modifier.size(90.dp)
                    )

                    Column() {

                        Text(
                            text = "Tecnologias",
                            textAlign = TextAlign.Center,

                            fontSize = 30.sp
                        )
                        Text(
                            text = "Telefonos, computadoras, IA, desarrollo de aplicaciones",
                            textAlign = TextAlign.Start,
                            fontSize = 15.sp
                        )
                    }
                }

            }

            Row(
                modifier = Modifier
                    .padding(top = 30.dp, bottom = 20.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(id = R.drawable.linkedin),
                    contentDescription = "si",
                    modifier = Modifier.size(90.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.githublogo),
                    contentDescription = "si",
                    modifier = Modifier.size(90.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.instagramlogo),
                    contentDescription = "si",
                    modifier = Modifier.size(90.dp)
                )
            }


    }
}