package com.techlads.composetvkeyboard.keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.domain.model.Key
import com.techlads.composetvkeyboard.domain.model.KeysDataSource
import com.techlads.composetvkeyboard.domain.model.UtilityKey
import com.techlads.composetvkeyboard.utilities.*

@Composable
fun KeyboardView(
    modifier: Modifier = Modifier,
    textFieldState: MutableState<TextFieldValue>?,
    onKeyPress: (key: Key) -> Unit
) {
    val isUppercase = remember { mutableStateOf(true) }
    val keys = remember { mutableStateOf(KeysDataSource().normalKeys) }

    LazyVerticalGrid(
        modifier = modifier
            .background(
                MaterialTheme.colorScheme.surface, MaterialTheme.shapes.medium
            )
            .padding(8.dp), columns = GridCells.Fixed(10)
    ) {
        items(keys.value.size, span = { index ->
            GridItemSpan(keys.value[index].span)
        }) { index ->
            KeyboardButton(key = keys.value[index], isUppercaseEnable = isUppercase.value) {
                if (it is UtilityKey.Uppercase) {
                    isUppercase.toggle()
                } else {
                    onKeyPress(it)
                    processKeys(it, textFieldState)
                }
            }
        }
    }
}

fun processKeys(it: Key, textFieldState: MutableState<TextFieldValue>?) {
    if (it.isBackspace()) {
        textFieldState?.updateAndRemoveLastChar()
    } else if (it.isClear()) {
        textFieldState?.clear()
    } else {
        textFieldState?.append(it.text)
    }
}

@Preview
@Composable
fun KeyboardViewPreview() {
    KeyboardView(textFieldState = null) {}
}