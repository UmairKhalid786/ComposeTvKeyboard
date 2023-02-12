package com.techlads.composetvkeyboard.custom

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun CustomTextField(modifier: Modifier = Modifier, textState: MutableState<TextFieldValue>) {
    val username = remember { textState }
    Box(
        modifier = modifier
            .border(
                BorderStroke(1.dp, Color.LightGray),
                shape = MaterialTheme.shapes.small
            )
            .defaultMinSize(minWidth = 300.dp)
            .padding(16.dp)
    ) {
        if (username.value.text.isEmpty())
            Text(text = "Start typing 😀")
        Text(username.value.text)
    }
}