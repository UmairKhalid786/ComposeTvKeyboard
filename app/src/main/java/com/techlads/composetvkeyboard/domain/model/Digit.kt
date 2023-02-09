package com.techlads.composetvkeyboard.domain.model

import android.view.KeyEvent

sealed class Digit(
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : Key {
    object Zero : Digit(KeyEvent.KEYCODE_0, "0")
    object One : Digit(KeyEvent.KEYCODE_1, "1")
    object Two : Digit(KeyEvent.KEYCODE_2, "2")
    object Three : Digit(KeyEvent.KEYCODE_3, "3")
    object Four : Digit(KeyEvent.KEYCODE_4, "4")
    object Five : Digit(KeyEvent.KEYCODE_5, "5")
    object Six : Digit(KeyEvent.KEYCODE_6, "6")
    object Seven : Digit(KeyEvent.KEYCODE_7, "7")
    object Eight : Digit(KeyEvent.KEYCODE_8, "8")
    object Nine : Digit(KeyEvent.KEYCODE_9, "9")
}