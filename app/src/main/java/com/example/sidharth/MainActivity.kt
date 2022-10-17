package com.example.sidharth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.sidharth.ui.theme.SidharthTheme

// you need to import this Column class first
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

// for adding images

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SidharthTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    thisCanBeAnyName()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

// Greeting is just a function name!
// fun is kotlins way of declaring functions!

// shift + f9 to build
// shift + f10 to run

// VIM oh yeahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!!!! <3

@Composable
fun thisCanBeAnyName() {
    Row {
        Image(
            painter = painterResource(R.drawable.sid),
            // desc about image
            contentDescription = "this_is_sid",
            // ;)
        )
        Column {
            Text(text = "Welcome to GDSC!")
            Text(text = "How to align in Column")
        }
    }
}


// so preview can be used to view composable functions!
// you need preview for composable functions where you pass value!
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SidharthTheme {
        Greeting("peeps!")
    }
}