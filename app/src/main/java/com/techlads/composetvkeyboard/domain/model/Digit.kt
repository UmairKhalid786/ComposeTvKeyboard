package com.techlads.composetvkeyboard.domain.model
import android.view.KeyEvent

sealed class Digit(
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : Key {
    object Zero : Digit(KeyEvent.KEYCODE_0, "0")
    object NumPadZero : Digit(KeyEvent.KEYCODE_NUMPAD_0, "0")
    object One : Digit(KeyEvent.KEYCODE_1, "1")
    object NumPadOne : Digit(KeyEvent.KEYCODE_NUMPAD_1, "1")
    object Two : Digit(KeyEvent.KEYCODE_2, "2")
    object NumPadTwo : Digit(KeyEvent.KEYCODE_NUMPAD_2, "2")
    object Three : Digit(KeyEvent.KEYCODE_3, "3")
    object NumPadThree : Digit(KeyEvent.KEYCODE_NUMPAD_3, "3")
    object Four : Digit(KeyEvent.KEYCODE_4, "4")
    object NumPadFour : Digit(KeyEvent.KEYCODE_NUMPAD_4, "4")
    object Five : Digit(KeyEvent.KEYCODE_5, "5")
    object NumPadFive : Digit(KeyEvent.KEYCODE_NUMPAD_5, "5")
    object Six : Digit(KeyEvent.KEYCODE_6, "6")
    object NumPadSix : Digit(KeyEvent.KEYCODE_NUMPAD_6, "6")
    object Seven : Digit(KeyEvent.KEYCODE_7, "7")
    object NumPadSeven : Digit(KeyEvent.KEYCODE_NUMPAD_7, "7")
    object Eight : Digit(KeyEvent.KEYCODE_8, "8")
    object NumPadEight : Digit(KeyEvent.KEYCODE_NUMPAD_8, "8")
    object Nine : Digit(KeyEvent.KEYCODE_9, "9")
    object NumPadNine : Digit(KeyEvent.KEYCODE_NUMPAD_9, "9")
}