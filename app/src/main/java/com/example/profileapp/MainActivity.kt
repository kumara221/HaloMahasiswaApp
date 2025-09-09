package com.example.profileapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HaloMahasiswaScreen(nama = ", perkenalkan nama saya Abiyyu Kumara Nayottama")
        }
    }
}

@Composable
fun HaloMahasiswaScreen(nama: String) {
    var teks by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = teks,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            teks = "Halo $nama"
        }) {
            Text(text = "Tampilkan Halo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HaloMahasiswaPreview() {
    HaloMahasiswaScreen(nama = "Abiyyu Kumara Nayottama")
}
