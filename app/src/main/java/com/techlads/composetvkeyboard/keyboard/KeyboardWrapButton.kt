package com.techlads.composetvkeyboard.keyboard

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.domain.model.Key

@Composable
fun SuggestionButton(key: Key, textFieldState: MutableState<TextFieldValue>?,
                     onKeyPress: (key: Key) -> Unit){
    KeyboardButton(
        modifier = Modifier
            .height(30.dp),
        key = key,
        requestFocus = false,
        isUppercaseEnable = false,
        isToggle = false,
        wrapContent = true
    ) {
        onKeyPress(it)
        processKeys(it, textFieldState, false)
    }
}