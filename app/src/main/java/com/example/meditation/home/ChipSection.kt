package com.example.meditation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.meditation.R

@Composable
fun ChipSection(
    chips: List<String>
) {
    var selectChipSet by remember { mutableIntStateOf(0) }

    LazyRow {
        itemsIndexed(chips) { index, chip ->
            Box(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
                    .clickable {
                        selectChipSet = index
                    }
                    .background(
                        brush = if (selectChipSet == index) {
                            Brush.linearGradient(
                                listOf(
                                    colorResource(R.color.magenta_deep),
                                    colorResource(R.color.deep_orange)
                                )
                            )
                        } else {
                            Brush.linearGradient(
                                listOf(
                                    colorResource(R.color.teal_200),
                                    colorResource(R.color.black_fade)
                                )
                            )
                        },
                        RoundedCornerShape(14.dp)
                    )
                    .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(14.dp))
                    .padding(15.dp)
            ) {
                Text(
                    chip,
                    style = MaterialTheme.typography.labelLarge,
                    color =  Color.White
                )
            }
        }
    }
}
