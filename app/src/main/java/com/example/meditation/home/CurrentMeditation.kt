package com.example.meditation.home

import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.meditation.R

@Composable
fun CurrentMeditation() {
    val context = LocalContext.current
    Row (
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(brush = Brush.linearGradient(
                listOf(
                    colorResource(R.color.purple_200),
                    colorResource(R.color.magenta_soft),
                    colorResource(R.color.pink_lush)
                )
            ))
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
        ,
        Arrangement.SpaceBetween,
        Alignment.CenterVertically
    ){
        Column {
            Text("Daily Thought",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                fontWeight = FontWeight.SemiBold
                )
            Spacer(modifier = Modifier.height(8.dp))

            Text("Meditation  3-10 min",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            )
        }

        Box(
            Modifier.size(40.dp)
                .clickable{
                    Toast.makeText(context,"Do Meditation", LENGTH_SHORT).show()
                }
                .clip(CircleShape)
                .background(Color.Magenta)
                .padding(10.dp),
            Alignment.Center
        ){
            Icon(
                painter = painterResource(R.drawable.play),
                "Play Icon",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}