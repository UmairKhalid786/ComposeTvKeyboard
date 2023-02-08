package com.techlads.composetvkeyboard

import android.os.Bundle
import android.util.Log
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
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.keyboard.KeyboardView
import com.techlads.composetvkeyboard.keyboard.NumericKeyboardView
import com.techlads.composetvkeyboard.theme.Material3Theme
import com.techlads.composetvkeyboard.utilities.isArrowLeft
import com.techlads.composetvkeyboard.utilities.isArrowRight
import com.techlads.composetvkeyboard.utilities.isBackspace
import com.techlads.composetvkeyboard.utilities.removeLastCharOrEmpty

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("tt_tt", "pp")
        super.onCreate(savedInstanceState)
        setContent {
            App()
            Log.e("tt", "pp")
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
                            TvTextField(value = username, label = "Hi") {
                                username.value = it
                            }
                            CustomTextField(textState = username)
                            KeyboardView {
                                if (it.isBackspace()) {
                                    username.value = username.value.removeLastCharOrEmpty()
                                } else if (it.isArrowLeft()) {
                                    val value = username.value.text
                                    username.value = TextFieldValue(
                                        text = value,
                                        selection = TextRange(username.value.selection.start - 1)
                                    )
                                }else if (it.isArrowRight()) {
                                    val value = username.value.text
                                    username.value = TextFieldValue(
                                        text = value,
                                        selection = TextRange(username.value.selection.start + 1)
                                    )
                                } else {
                                    val value = username.value.text.plus(it.text)
                                    username.value = TextFieldValue(
                                        text = value
                                    )
                                }
                            }
                            NumericKeyboardView(Modifier.width(200.dp)) {

                            }
                        }
                    }
                }
            }
        }
    }
}