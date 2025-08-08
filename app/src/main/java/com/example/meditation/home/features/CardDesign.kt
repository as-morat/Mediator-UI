package com.example.meditation.home.features

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditation.R

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun CardDesign(
    feature: Feature
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Text(
            text = feature.title,
            style = MaterialTheme.typography.displayMedium.copy(
                shadow = Shadow(
                    color = Color.Black.copy(alpha = 0.7f),
                    offset = Offset(2f, 2f),
                    blurRadius = 4f
                ),
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 1.2.sp
            ),
            lineHeight = 26.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.TopStart)
        )
        Row (
            Modifier.align(Alignment.BottomCenter).fillMaxWidth() ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween)
        {
            Icon(
                painter = painterResource(id = feature.iconId),
                contentDescription = feature.title,
                tint = Color.Unspecified,
                modifier = Modifier
                    .size(40.dp)
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = "Start",
                color = colorResource(R.color.black_fade),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                        // Handle the click
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        brush = Brush.linearGradient(
                            listOf(
                                feature.lightColor,
                                feature.mediumColor,
                                feature.darkColor
                            )
                        )
                    )
                    .border(width = 1.dp, shape = RoundedCornerShape(10.dp), color = Color.DarkGray)
                    .padding(vertical = 6.dp, horizontal = 10.dp)
            )
        }
    }
}