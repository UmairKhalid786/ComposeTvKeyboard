package com.techlads.composetvkeyboard.utilities

import com.techlads.composetvkeyboard.domain.model.Key
import com.techlads.composetvkeyboard.domain.model.NumericUtilityKey
import com.techlads.composetvkeyboard.domain.model.TextUtilityKey
import com.techlads.composetvkeyboard.domain.model.UtilityKey

fun Key.isBackspace() = this is UtilityKey.Backspace || this is NumericUtilityKey.Backspace
fun Key.isUppercase() = this is UtilityKey.Uppercase
fun Key.isAction() = this is UtilityKey.ActionArrow
fun Key.isNumeric() = this is TextUtilityKey.Numeric
fun Key.isAbc() = this is TextUtilityKey.ABC
fun Key.isClear() = this is UtilityKey.Clear
fun Key.isSpecialCharacters() = this is TextUtilityKey.SpecialCharacters
fun Key.handleCaseMode(isUppercaseEnabled: Boolean) =
    if (isUppercaseEnabled)
        text.uppercase()
    else
        text.lowercase()