package com.example.meditation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.meditation.R
import com.example.meditation.ui.theme.h2

@Composable
fun Greet(
    name: String = "A S H"
) {
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().padding(15.dp)
    ){
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text("Good Morning $name",
                style = MaterialTheme.typography.h2.copy(
                    colorResource(R.color.deep_purple)
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text("Wish you have a good day !!",
                style = MaterialTheme.typography.bodySmall.copy(
                    brush = Brush.linearGradient(listOf(
                        colorResource(R.color.cyan_deep),
                        colorResource(R.color.purple_200)
                    )
                    ),
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Icon(
            painterResource(R.drawable.magnifier),
            "Search Icon",
            modifier = Modifier.size(24.dp),
            tint = Color.Unspecified
        )
    }
}