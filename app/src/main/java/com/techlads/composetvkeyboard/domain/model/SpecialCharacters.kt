package com.techlads.composetvkeyboard.domain.model
import android.view.KeyEvent.*

sealed class SpecialCharacters(
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : Key {
    object Dot : SpecialCharacters(KEYCODE_NUMPAD_DOT, ".")
    object Underscore : SpecialCharacters(KEYCODE_UNKNOWN, "_")
    object Dash : SpecialCharacters(KEYCODE_UNKNOWN, "-")
    object Exclamation : SpecialCharacters(KEYCODE_UNKNOWN, "!")
    object Hash : SpecialCharacters(KEYCODE_UNKNOWN, "#")
    object Ampersat : SpecialCharacters(KEYCODE_AT, "@")
    object Comma : SpecialCharacters(KEYCODE_COMMA, ",")
}