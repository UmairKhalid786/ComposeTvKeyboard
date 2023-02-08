package com.techlads.composetvkeyboard.domain.model

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class UtilityKey(
    open val icon: ImageVector,
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : Key {
    object Uppercase : UtilityKey(
        Icons.Outlined.ArrowUpward,
        KeyEvent.KEYCODE_CAPS_LOCK,
        KeysConstants.UPPER_CASE_KEY
    )

    object Backspace : UtilityKey(
        Icons.Outlined.ArrowBack,
        KeyEvent.KEYCODE_BACK,
        KeysConstants.BACK_SPACE_KEY
    )

    object Numeric : UtilityKey(
        Icons.Outlined.Numbers,
        KeyEvent.KEYCODE_NUM,
        KeysConstants.NUMERIC_KEY
    )

    object Left : UtilityKey(
        Icons.Outlined.ArrowLeft,
        KeyEvent.KEYCODE_DPAD_LEFT,
        KeysConstants.LEFT_KEY
    )

    object Right : UtilityKey(
        Icons.Outlined.ArrowRight,
        KeyEvent.KEYCODE_DPAD_RIGHT,
        KeysConstants.RIGHT_KEY
    )

    object Space : UtilityKey(
        Icons.Outlined.SpaceBar,
        KeyEvent.KEYCODE_SPACE,
        KeysConstants.SPACE_KEY, 3
    )

    object RightArrow : UtilityKey(
        Icons.Outlined.ArrowForward,
        KeyEvent.KEYCODE_FORWARD,
        KeysConstants.RIGHT_ARROW_KEY, 2
    )
}