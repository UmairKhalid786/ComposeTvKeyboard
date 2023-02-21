package com.techlads.composetvkeyboard.domain.model

import android.view.KeyEvent.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.SpaceBar
import androidx.compose.ui.graphics.vector.ImageVector
import com.techlads.composetvkeyboard.data.KeysConstants

sealed class NumericUtilityKey(
    override val icon: ImageVector,
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : UtilityKey(icon, code, text, span) {

    object Backspace : NumericUtilityKey(
        Icons.Outlined.ArrowBack,
        KEYCODE_BACK,
        KeysConstants.BACK_SPACE_KEY
    )

    object Space : NumericUtilityKey(
        Icons.Outlined.SpaceBar,
        KEYCODE_SPACE,
        KeysConstants.SPACE_KEY
    )

    object RightArrow :
        NumericUtilityKey(
            Icons.Outlined.ArrowForward,
            KEYCODE_UNKNOWN,
            KeysConstants.RIGHT_ARROW_KEY
        )
}