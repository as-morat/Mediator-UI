package com.example.meditation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meditation.R

@Composable
@Preview(showBackground = true)
fun HomeScreen() {

    Box(
        Modifier.background(
            brush = Brush.linearGradient(
                listOf(
                    colorResource(R.color.green_mint),
                    colorResource(R.color.purple_lilac),
                    colorResource(R.color.cyan_pastel)
                )
            )
        )
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier.padding(vertical = 32.dp)
        ) {
            Greet()
            ChipSection(listOf("Sweet Sleep", "Isonomia", "Depression", "Anxiety", "Exercise"))
            CurrentMeditation()
        }
    }

}