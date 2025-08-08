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
import com.example.meditation.home.features.FeatureSection

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview(showBackground = true)
fun HomeScreen() {

    val features = listOf(
        Feature(
            title = "Sleep Meditation",
            iconId = R.drawable.ic_headphone,
            lightColor = colorResource(R.color.purple_200_light),
            mediumColor = colorResource(R.color.purple_200_medium),
            darkColor = colorResource(R.color.purple_200_dark)
        ),
        Feature(
            title = "Tips for Anxiety",
            iconId = R.drawable.ic_videocam,
            lightColor = colorResource(R.color.cyan_deep_light),
            mediumColor = colorResource(R.color.cyan_deep_medium),
            darkColor = colorResource(R.color.cyan_deep_dark)
        ),
        Feature(
            title = "Sleep Meditation",
            iconId = R.drawable.ic_headphone,
            lightColor = colorResource(R.color.orange_deep_light),
            mediumColor = colorResource(R.color.orange_deep_medium),
            darkColor = colorResource(R.color.orange_deep_dark)
        ),
        Feature(
            title = "Tips for Anxiety",
            iconId = R.drawable.ic_videocam,
            lightColor = colorResource(R.color.yellow_gold_soft_light),
            mediumColor = colorResource(R.color.yellow_gold_soft_medium),
            darkColor = colorResource(R.color.yellow_gold_soft_dark)
        ),
        Feature(
            title = "Tips for Anxiety",
            iconId = R.drawable.ic_videocam,
            lightColor = colorResource(R.color.green_forest_soft_light),
            mediumColor = colorResource(R.color.green_forest_soft_medium),
            darkColor = colorResource(R.color.green_forest_soft_dark)
        )
    )

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
                FeatureSection(features)
        }
    }

}