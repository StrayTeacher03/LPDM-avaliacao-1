package com.example.lpdmatividade1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lpdmatividade1.ui.theme.LPDMAtividade1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LPDMAtividade1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.logo)
    Column(modifier = modifier.background(Color(0xFFE0F7FA)).padding(horizontal = 5.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = image,
            contentDescription = null
        )
        Box() {
            Image(
                painter = painterResource(R.drawable.fundo),
                contentDescription = null
            )
            Text(
                text = "Erga-se",
                fontSize = 100.sp
            )
        }
        Text(
            text = "Keslley Antonio de Almeida Dornelas Junior",
            fontSize = 30.sp
        )
        Text(
            text = "Desenvolvedor Mobile",
            fontSize = 25.sp
        )
        Text(
            text = "Sobre:",
            fontSize = 20.sp
        )
        Text(
            text = "Amo fazer apps para celular, mas meu pc está pedindo arrego",
            fontSize = 20.sp
        )
        CriarRegistro(R.drawable.telefone, "Celular Pessoal: +55 (35) 99999-9999")
        CriarRegistro(R.drawable.telefone, "Celular Comercial: +55 (35) 99959-5465")
        CriarRegistro(R.drawable.email, "Email Comercial: keslleyjrdevelop@gmail.com")
    }
}

@Composable
fun CriarRegistro(icone: Int, texto: String, modifier: Modifier = Modifier) {
    Row(modifier=modifier) {
        Image(
            painter = painterResource(icone),
            contentDescription = null
        )
        Text(
            text = texto,
            fontSize = 20.sp
        )
    }
}

