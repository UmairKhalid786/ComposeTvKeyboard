package com.techlads.composetvkeyboard.domain.model

import android.view.KeyEvent.*

sealed class SpecialCharactersKey(
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : Key {
    object Dot : SpecialCharactersKey(KEYCODE_NUMPAD_DOT, ".")
    object Underscore : SpecialCharactersKey(KEYCODE_UNKNOWN, "_")
    object Dash : SpecialCharactersKey(KEYCODE_UNKNOWN, "-")
    object Dollar : SpecialCharactersKey(KEYCODE_UNKNOWN, "$")
    object Plus : SpecialCharactersKey(KEYCODE_UNKNOWN, "+")
    object And : SpecialCharactersKey(KEYCODE_UNKNOWN, "&")
    object ParenthesesBracketsLeft : SpecialCharactersKey(KEYCODE_UNKNOWN, "(")
    object ParenthesesBracketsRight : SpecialCharactersKey(KEYCODE_UNKNOWN, ")")
    object BackSlash : SpecialCharactersKey(KEYCODE_UNKNOWN, "/")
    object Asterisk : SpecialCharactersKey(KEYCODE_UNKNOWN, "*")
    object Quotes : SpecialCharactersKey(KEYCODE_UNKNOWN, "\"")
    object SingleQuotes : SpecialCharactersKey(KEYCODE_UNKNOWN, "\'")
    object Colon : SpecialCharactersKey(KEYCODE_UNKNOWN, ":")
    object Semicolon : SpecialCharactersKey(KEYCODE_UNKNOWN, ";")
    object Exclamation : SpecialCharactersKey(KEYCODE_UNKNOWN, "!")
    object Question : SpecialCharactersKey(KEYCODE_UNKNOWN, "?")
    object Percent : SpecialCharactersKey(KEYCODE_UNKNOWN, "%")
    object Hash : SpecialCharactersKey(KEYCODE_UNKNOWN, "#")
    object Ampersat : SpecialCharactersKey(KEYCODE_AT, "@")
    object Comma : SpecialCharactersKey(KEYCODE_COMMA, ",")

    object Tide : SpecialCharactersKey(KEYCODE_UNKNOWN, "~")
    object Grave : SpecialCharactersKey(KEYCODE_UNKNOWN, "`")
    object Pipe : SpecialCharactersKey(KEYCODE_UNKNOWN, "|")
    object Bullet : SpecialCharactersKey(KEYCODE_UNKNOWN, "∙")
    object Root : SpecialCharactersKey(KEYCODE_UNKNOWN, "√")
    object PI : SpecialCharactersKey(KEYCODE_UNKNOWN, "π")
    object Division : SpecialCharactersKey(KEYCODE_UNKNOWN, "÷")
    object Multiple : SpecialCharactersKey(KEYCODE_UNKNOWN, "×")
    object Paragraph : SpecialCharactersKey(KEYCODE_UNKNOWN, "¶")
    object Triangle : SpecialCharactersKey(KEYCODE_UNKNOWN, "△")

    object Pound : SpecialCharactersKey(KEYCODE_UNKNOWN, "£")
    object Cent : SpecialCharactersKey(KEYCODE_UNKNOWN, "¢")
    object Euro : SpecialCharactersKey(KEYCODE_UNKNOWN, "€")
    object Yen : SpecialCharactersKey(KEYCODE_UNKNOWN, "¥")
    object Caret : SpecialCharactersKey(KEYCODE_UNKNOWN, "^")
    object Degree : SpecialCharactersKey(KEYCODE_UNKNOWN, "°")
    object Equal : SpecialCharactersKey(KEYCODE_UNKNOWN, "=")
    object CurlyBracketLeft : SpecialCharactersKey(KEYCODE_UNKNOWN, "{")
    object CurlyBracketRight : SpecialCharactersKey(KEYCODE_UNKNOWN, "}")
    object Backlash : SpecialCharactersKey(KEYCODE_UNKNOWN, "\\")

    object CopyRight : SpecialCharactersKey(KEYCODE_UNKNOWN, "©")
    object RegisterTrademark : SpecialCharactersKey(KEYCODE_UNKNOWN, "®")
    object CheckMark : SpecialCharactersKey(KEYCODE_UNKNOWN, "✓")
    object BoxBracketLeft : SpecialCharactersKey(KEYCODE_UNKNOWN, "[")
    object BoxBracketRight : SpecialCharactersKey(KEYCODE_UNKNOWN, "]")
    object ArrowLeft : SpecialCharactersKey(KEYCODE_UNKNOWN, "<")
    object ArrowRight : SpecialCharactersKey(KEYCODE_UNKNOWN, ">")
}