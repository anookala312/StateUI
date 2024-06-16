package com.jetbrains.greeting

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Counter()
        }
    }
}

@Preview
@Composable
fun Counter(){
    val counter = remember { mutableStateOf(0) }
    Column {
        Text(text = "Current Count is: ${counter.value}")
        Row {
            Button(onClick = { counter.value++}) {
                Text(text = "+")
            }
            Button(onClick = { if(counter.value>0) counter.value--}) {
                Text(text = "-")
            }
        }
    }
}