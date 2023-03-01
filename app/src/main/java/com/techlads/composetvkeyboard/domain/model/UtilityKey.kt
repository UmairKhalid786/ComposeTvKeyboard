package com.techlads.composetvkeyboard.domain.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.techlads.composetvkeyboard.data.KeysConstants

sealed class UtilityKey(
    open val icon: ImageVector,
    override val text: String,
    override val span: Int = 1
) : Key {
    object Uppercase : UtilityKey(
        Icons.Outlined.KeyboardCapslock,
        KeysConstants.UPPER_CASE_KEY
    )

    object Backspace : UtilityKey(
        Icons.Outlined.KeyboardBackspace,
        KeysConstants.BACK_SPACE_KEY
    )

    object Clear : UtilityKey(
        Icons.Outlined.Delete,
        KeysConstants.CLEAR_KEY,
        2
    )

    object Space : UtilityKey(
        Icons.Outlined.SpaceBar,
        KeysConstants.SPACE_KEY,
        3
    )

    object ActionArrow : UtilityKey(
        Icons.Outlined.Search,
        KeysConstants.SEARCH_KEY,
        2
    )
}