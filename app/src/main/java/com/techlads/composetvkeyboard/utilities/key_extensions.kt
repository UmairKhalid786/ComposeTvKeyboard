package com.techlads.composetvkeyboard.utilities

import com.techlads.composetvkeyboard.domain.model.Key
import com.techlads.composetvkeyboard.domain.model.NumericUtilityKey
import com.techlads.composetvkeyboard.domain.model.UtilityKey

fun Key.isBackspace() = this is UtilityKey.Backspace || this is NumericUtilityKey.Backspace
fun Key.isClear() = this is UtilityKey.Clear
fun Key.handleCaseMode(isUppercaseEnabled: Boolean) =
    if (isUppercaseEnabled)
        text.uppercase()
    else
        text.lowercase()