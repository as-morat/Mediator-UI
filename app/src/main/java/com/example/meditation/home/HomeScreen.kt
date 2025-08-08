package com.example.meditation.home

import androidx.compose.foundation.ExperimentalFoundationApi
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
import com.example.meditation.home.features.Feature
import com.example.meditation.home.features.FeatureCardElement
import com.example.meditation.home.features.FeatureSection

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview(showBackground = true)
fun HomeScreen() {
    Box(
        Modifier.background(
            brush = Brush.linearGradient(
                listOf(
                    colorResource(R.color.green_mint_medium),
                    colorResource(R.color.purple_lilac_medium),
                    colorResource(R.color.cyan_pastel_medium)
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
            FeatureCardElement()
        }
    }

}