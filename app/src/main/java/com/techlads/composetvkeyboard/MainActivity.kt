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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.techlads.composetvkeyboard.custom.CustomTextField
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
                ) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .background(
                                color = MaterialTheme.colorScheme.primary
                            )
                            .weight(1F)
                            .fillMaxSize()
                    ) {
                        Text("Try this keyboard 😄")
                    }
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .background(color = MaterialTheme.colorScheme.primaryContainer)
                            .weight(1F)
                            .fillMaxSize()
                    ) {
                        Column(modifier = Modifier.padding(24.dp)) {
                            val username = remember { mutableStateOf(TextFieldValue(text = "")) }
                            CustomTextField(textState = username)
                            Spacer(modifier = Modifier.height(24.dp))
                            KeyboardView(
                                textFieldState = username,
                                focusFirstKey = true,
                                modifier = Modifier.shadow(8.dp),
                                onAction = {

                                }
                            ) {}
                        }
                    }
                }
            }
        }
    }
}
