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

    object Tide : SpecialCharacters(KEYCODE_UNKNOWN, "~")
    object Grave : SpecialCharacters(KEYCODE_UNKNOWN, "`")
    object Pipe : SpecialCharacters(KEYCODE_UNKNOWN, "|")
    object Bullet : SpecialCharacters(KEYCODE_UNKNOWN, "∙")
    object Root : SpecialCharacters(KEYCODE_UNKNOWN, "√")
    object PI : SpecialCharacters(KEYCODE_UNKNOWN, "π")
    object Division : SpecialCharacters(KEYCODE_UNKNOWN, "÷")
    object Multiple : SpecialCharacters(KEYCODE_UNKNOWN, "×")
    object Paragraph : SpecialCharacters(KEYCODE_UNKNOWN, "¶")
    object Triangle : SpecialCharacters(KEYCODE_UNKNOWN, "△")

    object Pound : SpecialCharacters(KEYCODE_UNKNOWN, "£")
    object Cent : SpecialCharacters(KEYCODE_UNKNOWN, "¢")
    object Euro : SpecialCharacters(KEYCODE_UNKNOWN, "€")
    object Yen : SpecialCharacters(KEYCODE_UNKNOWN, "¥")
    object Caret : SpecialCharacters(KEYCODE_UNKNOWN, "^")
    object Degree : SpecialCharacters(KEYCODE_UNKNOWN, "°")
    object Equal : SpecialCharacters(KEYCODE_UNKNOWN, "=")
    object CurlyBracketLeft : SpecialCharacters(KEYCODE_UNKNOWN, "{")
    object CurlyBracketRight : SpecialCharacters(KEYCODE_UNKNOWN, "}")
    object Backlash : SpecialCharacters(KEYCODE_UNKNOWN, "\\")

    object CopyRight : SpecialCharacters(KEYCODE_UNKNOWN, "©")
    object RegisterTrademark : SpecialCharacters(KEYCODE_UNKNOWN, "®")
    object CheckMark : SpecialCharacters(KEYCODE_UNKNOWN, "✓")
    object BoxBracketLeft : SpecialCharacters(KEYCODE_UNKNOWN, "[")
    object BoxBracketRight : SpecialCharacters(KEYCODE_UNKNOWN, "]")
    object ArrowLeft : SpecialCharacters(KEYCODE_UNKNOWN, "<")
    object ArrowRight : SpecialCharacters(KEYCODE_UNKNOWN, ">")
}