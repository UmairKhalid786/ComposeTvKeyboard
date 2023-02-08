package com.techlads.composetvkeyboard.utilities

import com.techlads.composetvkeyboard.domain.model.Key
import com.techlads.composetvkeyboard.domain.model.NumericUtilityKey
import com.techlads.composetvkeyboard.domain.model.UtilityKey

fun Key.isBackspace() = this is UtilityKey.Backspace || this is NumericUtilityKey.Backspace
fun Key.isArrowLeft() = this is UtilityKey.Left
fun Key.isArrowRight() = this is UtilityKey.Right
fun Key.toCase(upper: Boolean) = if (upper) text.uppercase() else text.lowercase()
fun List<Key>.toCase(upper: Boolean) = forEach { it.toCase(upper) }