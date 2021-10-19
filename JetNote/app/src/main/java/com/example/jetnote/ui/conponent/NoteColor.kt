package com.example.jetnote.ui.components

import androidx.compose.foundation.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun NoteColor(
    modifier: Modifier = Modifier,
    color : Color,
    size : Dp,
    border : Dp
){
    Box(
        modifier = modifier
            .size(size)
            .background(color, CircleShape)
            .border(
                BorderStroke(border,SolidColor(Color.Black)),
                CircleShape
            )
    )
}

@Preview
@Composable
fun NoteColorPreview() {
    NoteColor (
        color = Color.Red,
        size = 40.dp,
        border = 2.dp
    )
}
