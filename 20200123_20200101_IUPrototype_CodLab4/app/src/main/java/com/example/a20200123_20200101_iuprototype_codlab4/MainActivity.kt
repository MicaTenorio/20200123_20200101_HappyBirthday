package com.example.a20200123_20200101_iuprototype_codlab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a20200123_20200101_iuprototype_codlab4.ui.theme._20200123_20200101_IUPrototype_CodLab4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _20200123_20200101_IUPrototype_CodLab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrototipoScreen()
                }
            }
        }
    }
}

@Composable
fun PrototipoScreen() {
    Column(Modifier.fillMaxWidth()) {
        ComposableInfoCard(
            title = "DESARROLLO DE SISTEMAS MOVILES",
            description = "MICAELA ALESSANDRA BRAVO TENORIO\nYERALDIN IVON VALLE MENDOZA",
            modifier = Modifier.weight(1f),
        )
        ComposableInfoCard2(modifier = Modifier.weight(1f))
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.logo_unmsm)
        val widthDp = 200 // Ancho en dp
        val heightDp = 200 // Alto en dp
        Image(painter = image, contentDescription = null, Modifier.size(widthDp.dp,heightDp.dp))
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun ComposableInfoCard2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 200.dp)
    ) {
        ComposableInfoCard3("+51 987456321",modifier)
        ComposableInfoCard3("micaela.bravo@unmsm.edu.pe",modifier)
        ComposableInfoCard3("yeraldin.valle@unmsm.edu.pe",modifier)
    }
}

@Composable
private fun ComposableInfoCard3(
    title: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 40.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        val image = painterResource(R.drawable.logo_unmsm)
        val widthDp = 40 // Ancho en dp
        val heightDp = 40 // Alto en dp
        Image(painter = image, contentDescription = null, Modifier.size(widthDp.dp,heightDp.dp))
        Text(
            text = title,
            modifier = Modifier.padding()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _20200123_20200101_IUPrototype_CodLab4Theme {
        PrototipoScreen()
    }
}