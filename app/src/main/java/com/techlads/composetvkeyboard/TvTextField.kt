package com.techlads.composetvkeyboard

import androidx.compose.foundation.focusable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalTextInputService
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import com.techlads.composetvkeyboard.theme.LightBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TvTextField(
    value: MutableState<TextFieldValue>,
    label: String,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardType: KeyboardType = KeyboardType.Text,
    onValueChange: (TextFieldValue) -> Unit
) {
    val defaultColor = remember {
        Color.White.copy(0.6F)
    }
    val selectedColor = remember {
        LightBlue
    }
    val selectionColor = remember { mutableStateOf(defaultColor) }

    CompositionLocalProvider(
        LocalTextInputService provides null
    ) {
        OutlinedTextField(
            value.value,
            maxLines = 1,
            textStyle = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Thin
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = selectionColor.value,
                unfocusedLabelColor = selectionColor.value
            ),
            label = { Text(text = label) },
            visualTransformation = visualTransformation,
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            onValueChange = {
                onValueChange(it)
            },
            modifier = Modifier
                .onFocusChanged { state ->
                    selectionColor.value = if (state.isFocused) {
                        selectedColor
                    } else {
                        defaultColor
                    }
                }
                .focusable(true)
        )
    }
}