package com.techlads.composetvkeyboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import com.techlads.composetvkeyboard.keyboard.KeyboardView
import com.techlads.composetvkeyboard.theme.Material3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }

    @Composable
    fun App() {
        Material3Theme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray)
                ) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .weight(1F)
                            .fillMaxSize()
                    ) {
                        Text("Signup")
                    }
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .weight(1F)
                            .fillMaxSize()
                    ) {
                        Column {
                            val username = remember {
                                mutableStateOf(
                                    TextFieldValue(
                                        text = ""
                                    )
                                )
                            }
                            TvTextField(value = username, label = "Hello") {
                                username.value = it
                            }
                            KeyboardView(textFieldState = username) {}
                        }
                    }
                }
            }
        }
    }
}