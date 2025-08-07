package com.example.meditation.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.meditation.R

// ------------------- Font Families -------------------
val LibertinusSans = FontFamily(
    Font(R.font.libertinussans_regular, FontWeight.Normal),
    Font(R.font.libertinussans_italic, FontWeight.Light),
    Font(R.font.libertinussans_bold, FontWeight.Bold)
)

val MozillaHeadline = FontFamily(
    Font(R.font.mozillaheadline_light, FontWeight.Light),
    Font(R.font.mozillaheadline_regular, FontWeight.Normal),
    Font(R.font.mozillaheadline_medium, FontWeight.Medium),
    Font(R.font.mozillaheadline_semibold, FontWeight.SemiBold),
    Font(R.font.mozillaheadline_bold, FontWeight.Bold)
)

val Sansita = FontFamily(
    Font(R.font.sansita_regular, FontWeight.Normal),
    Font(R.font.sansita_bold, FontWeight.Bold),
    Font(R.font.sansita_black, FontWeight.Black)
)

val Sora = FontFamily(
    Font(R.font.sora_thin, FontWeight.Thin),
    Font(R.font.sora_light, FontWeight.Light),
    Font(R.font.sora_regular, FontWeight.Normal),
    Font(R.font.sora_medium, FontWeight.Medium),
    Font(R.font.sora_semibold, FontWeight.SemiBold),
    Font(R.font.sora_bold, FontWeight.Bold)
)

val SpaceGrotesk = FontFamily(
    Font(R.font.spacegrotesk_light, FontWeight.Light),
    Font(R.font.spacegrotesk_medium, FontWeight.Medium),
    Font(R.font.spacegrotesk_semibold, FontWeight.SemiBold),
    Font(R.font.spacegrotesk_bold, FontWeight.Bold)
)

// ------------------- Typography -------------------
val AppTypography = Typography(
    displayLarge = TextStyle( // H1
        fontFamily = Sansita,
        fontWeight = FontWeight.Black,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp
    ),
    displayMedium = TextStyle( // H2
        fontFamily = Sansita,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle( // H3
        fontFamily = Sansita,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle( // H4
        fontFamily = MozillaHeadline,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle( // H5
        fontFamily = MozillaHeadline,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    headlineSmall = TextStyle( // H6
        fontFamily = MozillaHeadline,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.1.sp
    ),

    // Body
    bodyLarge = TextStyle(
        fontFamily = Sora,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Sora,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Sora,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),

    // Labels
    labelLarge = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = SpaceGrotesk,
        fontWeight = FontWeight.Light,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

// ------------------- h1–h6 Aliases (Extension Properties) -------------------
val Typography.h1 get() = displayLarge
val Typography.h2 get() = displayMedium
val Typography.h3 get() = displaySmall
val Typography.h4 get() = headlineLarge
val Typography.h5 get() = headlineMedium
val Typography.h6 get() = headlineSmall
