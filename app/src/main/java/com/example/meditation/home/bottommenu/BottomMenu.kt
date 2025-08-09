package com.example.meditation.home.bottommenu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditation.R

@Composable
fun BottomMenu(
    list: List<BottomMenuContent>,
    activeHighlightColor: Color = colorResource(R.color.purple_500_dark),
    activeTextColor: Color = Color.Blue,
    inactiveTextColor: Color = colorResource(R.color.black_dark),
    initializeSelectedItemIndex: Int = 0
) {
    var selectedItemIndex by remember { mutableIntStateOf(initializeSelectedItemIndex) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        colorResource(R.color.green_forest_soft),
                        colorResource(R.color.cyan_pastel),
                    )
                )
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        list.forEachIndexed { index, item ->
            Column(
                modifier = Modifier
                    .clickable { selectedItemIndex = index }
                    .padding(4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = item.iconId),
                    contentDescription = item.title,
                    tint = if (selectedItemIndex == index) activeHighlightColor else inactiveTextColor,
                    modifier = Modifier.size(24.dp)
                )
                Text(
                    text = item.title,
                    fontSize = 12.sp,
                    color = if (selectedItemIndex == index) activeTextColor else inactiveTextColor
                )
            }
        }
    }
}
