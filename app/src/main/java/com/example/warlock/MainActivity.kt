package com.example.warlock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.warlock.ui.theme.ComposewarlockTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Warlock")
        }
    }
}

@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
}

@Preview
@Composable
fun DefaultPreview() {
    ComposewarlockTheme {
        MessageCard("Warlock")
    }
}