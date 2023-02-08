package com.techlads.composetvkeyboard.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.domain.model.Key
import com.techlads.composetvkeyboard.domain.model.KeysDataSource
import com.techlads.composetvkeyboard.domain.model.UtilityKey
import com.techlads.composetvkeyboard.utilities.toCase

@Composable
fun KeyboardView(modifier: Modifier = Modifier, onKeyPress: (key: Key) -> Unit) {
    val isUppercase = remember { mutableStateOf(true) }
    val normalKeys = remember { mutableStateOf(listOf<Key>()) }

    LaunchedEffect(Unit) {
        normalKeys.value = KeysDataSource().normalKeys.apply { toCase(isUppercase.value) }
    }

    LazyVerticalGrid(
        modifier = modifier
            .background(MaterialTheme.colorScheme.surface)
            .padding(8.dp),
        columns = GridCells.Fixed(10)
    ) {
        val keys = normalKeys.value
        items(keys.size, span = { index ->
            GridItemSpan(keys[index].span)
        }) { index ->
            KeyboardButton(key = keys[index]) {
                if (it is UtilityKey.Uppercase) {
                    isUppercase.value = !isUppercase.value
                } else
                    onKeyPress(it)
            }
        }
    }
}

@Preview
@Composable
fun KeyboardViewPreview() {
    KeyboardView {}
}