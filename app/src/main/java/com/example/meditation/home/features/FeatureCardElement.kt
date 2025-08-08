package com.example.meditation.home.features

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.example.meditation.R

@Composable
fun FeatureCardElement() {
    val features = listOf(
        Feature(
            title = "Sleep Meditation",
            iconId = R.drawable.ic_headphone,
            lightColor = colorResource(R.color.purple_200_light),
            mediumColor = colorResource(R.color.purple_200_medium),
            darkColor = colorResource(R.color.purple_200_dark)
        ),
        Feature(
            title = "Night Relaxation",
            iconId = R.drawable.ic_moon,
            lightColor = colorResource(R.color.blue_powder_light),
            mediumColor = colorResource(R.color.blue_powder_medium),
            darkColor = colorResource(R.color.blue_powder_dark)
        ),
        Feature(
            title = "Body Relaxation",
            iconId = R.drawable.ic_body_relaxation,
            lightColor = colorResource(R.color.pink_lush_light),
            mediumColor = colorResource(R.color.pink_milk_dark),
            darkColor = colorResource(R.color.pink_lush_dark)
        ),
        Feature(
            title = "Nature Healing",
            iconId = R.drawable.ic_nature,
            lightColor = colorResource(R.color.green_forest_soft_light),
            mediumColor = colorResource(R.color.green_forest_soft_medium),
            darkColor = colorResource(R.color.green_forest_soft_dark)
        ),
        Feature(
            title = "Tips for Anxiety",
            iconId = R.drawable.ic_videocam,
            lightColor = colorResource(R.color.cyan_deep_light),
            mediumColor = colorResource(R.color.cyan_deep_medium),
            darkColor = colorResource(R.color.cyan_deep_dark)
        )
    )

    FeatureSection(features)
}