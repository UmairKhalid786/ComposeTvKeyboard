package com.techlads.composetvkeyboard.keyboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.keyboard.model.Key

@Composable
fun KeyboardButton(key: Key) {
    Card(
        shape = MaterialTheme.shapes.extraSmall,
        modifier = Modifier
            .aspectRatio(1F)
            .padding(4.dp)
    ) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            Text(text = key.text)
        }
    }
}

@Preview
@Composable
fun KeyboardButtonPreview() {
    KeyboardButton(Key("00", "2"))
}