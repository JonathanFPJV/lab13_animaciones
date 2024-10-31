package com.example.lab13_animaciones

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppAnimacion() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedVisibility()  // Cambiado a AnimatedVisibilityExample para que coincida
            Spacer(modifier = Modifier.height(16.dp))
            ColorAnimation()  // Aquí se llama directamente a ColorAnimation
            Spacer(modifier = Modifier.height(16.dp))
            SizeAndPositionAnimation()  // Aquí se llama directamente a SizeAndPositionAnimation
        }
    }
}