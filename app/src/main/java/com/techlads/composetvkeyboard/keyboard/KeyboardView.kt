package com.techlads.composetvkeyboard.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.domain.model.KeysDataSource

@Composable
fun KeyboardView(modifier: Modifier = Modifier) {
    val keys = remember { KeysDataSource().normalKeys }
    LazyVerticalGrid(
        modifier = modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(8.dp),
        columns = GridCells.Fixed(10)
    ) {
        items(keys.size, span = { index ->
            GridItemSpan(keys[index].span)
        }) { index ->
            KeyboardButton(key = keys[index]) {}
        }
    }
}

@Composable
fun NumericKeyboardView(modifier: Modifier = Modifier) {
    val keys = remember { KeysDataSource().numericKeys }
    LazyVerticalGrid(
        modifier = modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(8.dp),
        columns = GridCells.Fixed(4)
    ) {
        items(keys.size) { index ->
            KeyboardButton(key =  keys[index]) {}
        }
    }
}

@Preview
@Composable
fun KeyboardViewPreview() {
    KeyboardView()
}