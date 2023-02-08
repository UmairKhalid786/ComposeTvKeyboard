package com.techlads.composetvkeyboard.utilities

import androidx.compose.ui.text.input.TextFieldValue

fun TextFieldValue.removeLastCharOrEmpty(): TextFieldValue {
    val length = text.length - 1
    return TextFieldValue(if (length >= 0) text.take(length) else "")
}