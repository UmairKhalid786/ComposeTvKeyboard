package com.techlads.composetvkeyboard.domain.model

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Numbers
import androidx.compose.ui.graphics.vector.ImageVector

sealed class TextUtilityKey(
    override val icon: ImageVector,
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : UtilityKey(icon, code, text, span) {

    object Numeric : TextUtilityKey(
        Icons.Outlined.Numbers,
        KeyEvent.KEYCODE_NUM,
        KeysConstants.NUMERIC_KEY
    )
}