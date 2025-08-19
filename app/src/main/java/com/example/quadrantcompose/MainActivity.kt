package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantComposeTheme {
                Surface(modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()){
                QuadrantTemplate()
                }
            }
        }
    }
}

@Composable
fun QuadrantTemplate(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 45.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines."
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF)) // Couleur 1
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
             {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object"
                )
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8)) // Couleur 1
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Row composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence."
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence."
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuadrantComposeTheme {
    QuadrantTemplate()
    }
}