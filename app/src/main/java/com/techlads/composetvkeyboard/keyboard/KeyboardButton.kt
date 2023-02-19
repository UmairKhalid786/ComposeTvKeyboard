package com.techlads.composetvkeyboard.keyboard

import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.domain.model.Digit
import com.techlads.composetvkeyboard.domain.model.Key
import com.techlads.composetvkeyboard.domain.model.TextUtilityKey
import com.techlads.composetvkeyboard.domain.model.UtilityKey
import com.techlads.composetvkeyboard.theme.md_theme_dark_onPrimary
import com.techlads.composetvkeyboard.utilities.handleCaseMode
import com.techlads.composetvkeyboard.utilities.toggle
import kotlinx.coroutines.launch

@Composable
fun KeyboardButton(
    key: Key,
    requestFocus: Boolean,
    isUppercaseEnable: Boolean = false,
    isToggle: Boolean = false,
    onClick: (key: Key) -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isToggleEnable = remember { mutableStateOf(isToggle) }
    val coroutineScope = rememberCoroutineScope()
    val focusRequester = remember { FocusRequester() }

    Button(
        onClick = {
            if (isToggle) {
                isToggleEnable.toggle()
            }
            onClick(key)
            coroutineScope.launch {
                focusRequester.requestFocus()
            }
        },
        contentPadding = PaddingValues(0.dp),
        shape = MaterialTheme.shapes.extraSmall,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isFocused || isToggleEnable.value) md_theme_dark_onPrimary else MaterialTheme.colorScheme.primaryContainer,
            contentColor = if (isFocused || isToggleEnable.value) MaterialTheme.colorScheme.primaryContainer else md_theme_dark_onPrimary
        ),
        modifier = Modifier
            .aspectRatio((key.span.toFloat() / 1F))
            .padding(4.dp)
            .focusRequester(focusRequester)
            .focusable(interactionSource = interactionSource)
    ) {
        when (key) {
            is TextUtilityKey -> {
                Text(text = key.text, style = MaterialTheme.typography.bodySmall)
            }
            is UtilityKey -> {
                Icon(
                    key.icon,
                    contentDescription = key.text,
                    modifier = Modifier.size(16.dp)
                )
            }
            else -> {
                Text(
                    text = key.handleCaseMode(isUppercaseEnable),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }

    LaunchedEffect(key1 = Unit) {
        if (requestFocus) {
            focusRequester.requestFocus()
        }
    }
}

@Preview
@Composable
fun KeyboardButtonPreview() {
    KeyboardButton(Digit.Zero, false) {}
}