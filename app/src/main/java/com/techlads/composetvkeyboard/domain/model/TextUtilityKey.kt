package com.techlads.composetvkeyboard.domain.model

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Numbers
import androidx.compose.ui.graphics.vector.ImageVector
import com.techlads.composetvkeyboard.data.KeysConstants

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

    object SpecialCharacters : TextUtilityKey(
        Icons.Outlined.Numbers,
        KeyEvent.KEYCODE_NUM,
        KeysConstants.SPECIAL_CHARACTERS_KEY
    )

    object ABC : TextUtilityKey(
        Icons.Outlined.Numbers,
        KeyEvent.KEYCODE_TV_TELETEXT,
        KeysConstants.ABC_KEY
    )
}