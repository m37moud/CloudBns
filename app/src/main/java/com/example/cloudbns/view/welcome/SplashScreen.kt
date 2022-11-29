package com.example.cloudbns.view.welcome

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cloudbns.ui.navigation.MainActions
import androidx.compose.foundation.Image
import com.example.cloudbns.R
import kotlinx.coroutines.delay
import androidx.compose.runtime.produceState


@SuppressLint("ProduceStateDoesNotAssignValue")
@Composable
fun SplashScreenView(actions: MainActions) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.size(128.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo"
            )
        }
    }

    produceState(initialValue = -1) {
        delay(3000)
        actions.gotoOnBoarding()
    }
}