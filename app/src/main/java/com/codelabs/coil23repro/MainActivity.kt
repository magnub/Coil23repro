package com.codelabs.coil23repro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codelabs.coil23repro.ui.theme.Coil23reproTheme
import coil.compose.AsyncImage as AsyncImage2
import coil3.compose.AsyncImage as AsyncImage3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Coil23reproTheme {
                Scaffold(modifier = Modifier.fillMaxSize().padding(top=64.dp)) { innerPadding ->
                    CoilRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CoilRow(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.weight(1f)) {
            AsyncImage2(
                model = "https://images.unsplash.com/photo-1550990256-635d8214f1c5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                contentDescription = "",
                modifier = Modifier.size(64.dp)
            )
        }
        Column(modifier = Modifier.weight(1f)) {
            AsyncImage2(
                model = "https://images.unsplash.com/photo-1551010442-094f3ac56aff?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                contentDescription = "",
                modifier = Modifier.size(64.dp)
            )
        }
        Column(modifier = Modifier.weight(1f)) {
            AsyncImage3(
                model = "https://images.unsplash.com/photo-1550990256-635d8214f1c5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                contentDescription = "",
                modifier = Modifier.size(64.dp)
            )
        }
        Column(modifier = Modifier.weight(1f)) {
            AsyncImage3(
                model = "https://images.unsplash.com/photo-1551010442-094f3ac56aff?ixlib=rb-1.2.1&q=85&fm=jpg&crop=entropy&cs=srgb&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
                contentDescription = "",
                modifier = Modifier.size(64.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Coil23reproTheme {
        CoilRow(modifier = Modifier)
    }
}