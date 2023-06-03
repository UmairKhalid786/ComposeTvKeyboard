@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.techlads.composetvkeyboard.keyboard.widgets

import android.app.Activity
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Icon
import androidx.tv.material3.IconButton
import com.techlads.composetvkeyboard.speechRecognition.SpeechRecognitionManager
import com.techlads.composetvkeyboard.speechRecognition.SpeechRecognitionManager.ResultListener

@Composable
fun AudioButton(onResult: (text: String) -> Unit) {
    val context = LocalContext.current
    val speechRecognizer = remember {
        SpeechRecognitionManager
    }
    IconButton(onClick = {
        speechRecognizer.startListening(context as Activity, object : ResultListener {
            override fun onResult(text: String) {
                onResult(text)
            }
        })
    }) {
        Icon(
            imageVector = Icons.Default.Mic,
            contentDescription = "Audio Button"
        )
    }
}


@Preview
@Composable
fun AudioButtonPrev() {
    AudioButton {}
}