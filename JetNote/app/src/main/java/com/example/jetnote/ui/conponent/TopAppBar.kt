package com.example.jetnote.ui.conponent

import androidx.compose.runtime.Composable

import android.icu.text.CaseMap
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopAppBar(
    title: String,
    icon: ImageVector,
    onIconClick: () -> Unit,
) {

}

@Preview
@Composable
private fun TopAppBarPreview() {
    TopAppBar(title = "JetNotes", icon = Icons.Filled.List,onIconClick = {}
    )

}
