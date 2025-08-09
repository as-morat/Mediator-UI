package com.example.meditation.home.bottommenu

import androidx.compose.runtime.Composable
import com.example.meditation.R

@Composable
fun BottomMenuElement() {
    val itemValue = listOf(
        BottomMenuContent(
            "Home",
            R.drawable.ic_home
        ),
        BottomMenuContent(
            "Meditate",
            R.drawable.ic_bubble
        ),
        BottomMenuContent(
            "Sleep",
            R.drawable.ic_sleep
        ),
        BottomMenuContent(
            "Music",
            R.drawable.ic_music
        ),
        BottomMenuContent(
            "profile",
            R.drawable.ic_profile
        ),

    )
    BottomMenu(itemValue)
}