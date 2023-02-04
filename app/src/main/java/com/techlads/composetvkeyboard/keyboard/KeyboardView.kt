package com.techlads.composetvkeyboard.keyboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.techlads.composetvkeyboard.keyboard.model.Key

@Composable
fun KeyboardView(){
    val numbers = (9 downTo 1).toMutableList().also { it.add(0) }

    LazyVerticalGrid(
        columns = GridCells.Fixed(10)
    ) {
        items(numbers.size) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                KeyboardButton(key = Key("0", "0"))
            }
        }
    }
}

@Preview
@Composable
fun KeyboardViewPreview() {
    KeyboardView()
}