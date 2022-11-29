package com.example.cloudbns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cloudbns.ui.navigation.NavGraph
import com.example.cloudbns.ui.theme.CloudBnsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CloudBnsTheme {
                // A surface container using the 'background' color from the theme
                VegetablesOrderAppUIMain()
            }
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun VegetablesOrderAppUIMain() {

    CloudBnsTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            NavGraph()
        }
    }

}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CloudBnsTheme {
        VegetablesOrderAppUIMain()
    }
}