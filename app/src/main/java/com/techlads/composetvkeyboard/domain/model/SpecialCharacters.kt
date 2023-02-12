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
    object Dollar : SpecialCharacters(KEYCODE_UNKNOWN, "$")
    object Plus : SpecialCharacters(KEYCODE_UNKNOWN, "+")
    object And : SpecialCharacters(KEYCODE_UNKNOWN, "&")
    object ParenthesesBracketsLeft: SpecialCharacters(KEYCODE_UNKNOWN, "(")
    object ParenthesesBracketsRight: SpecialCharacters(KEYCODE_UNKNOWN, ")")
    object BackSlash: SpecialCharacters(KEYCODE_UNKNOWN, "/")
    object MoreOperators: SpecialCharacters(KEYCODE_UNKNOWN, "=/<")
    object Asterisk: SpecialCharacters(KEYCODE_UNKNOWN, "*")
    object Quotes: SpecialCharacters(KEYCODE_UNKNOWN, "\"")
    object SingleQuotes: SpecialCharacters(KEYCODE_UNKNOWN, "\'")
    object Colon: SpecialCharacters(KEYCODE_UNKNOWN, ":")
    object Semicolon: SpecialCharacters(KEYCODE_UNKNOWN, ";")
    object Exclamation : SpecialCharacters(KEYCODE_UNKNOWN, "!")
    object Question : SpecialCharacters(KEYCODE_UNKNOWN, "?")
    object Percent : SpecialCharacters(KEYCODE_UNKNOWN, "%")
    object Hash : SpecialCharacters(KEYCODE_UNKNOWN, "#")
    object Ampersat : SpecialCharacters(KEYCODE_AT, "@")
    object Comma : SpecialCharacters(KEYCODE_COMMA, ",")
}