package com.techlads.composetvkeyboard.utilities

import androidx.compose.runtime.MutableState
import androidx.compose.ui.text.input.TextFieldValue

fun TextFieldValue.removeLastCharOrEmpty(): TextFieldValue {
    val length = text.length - 1
    return TextFieldValue(if (length >= 0) text.take(length) else "")
}

fun MutableState<TextFieldValue>.updateWith(text: String?) {
    value = TextFieldValue(text = text ?: return)
}

fun MutableState<Boolean>.toggle() {
    value = !value
}

fun MutableState<TextFieldValue>.clear() {
    updateWith("")
}

fun MutableState<TextFieldValue>.updateAndRemoveLastChar() {
    updateWith(value.removeLastCharOrEmpty())
}

fun MutableState<TextFieldValue>.updateWith(value: TextFieldValue?) {
    updateWith(value?.text)
}

fun MutableState<TextFieldValue>.append(newText: String?) {
    updateWith(value.text.plus(newText))
}