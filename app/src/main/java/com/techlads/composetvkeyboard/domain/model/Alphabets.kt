package com.techlads.composetvkeyboard.domain.model

import android.view.KeyEvent.*

sealed class Alphabets(
    override val code: Int,
    override val text: String,
    override val span: Int = 1
) : Key, Cloneable {
    object A : Alphabets(KEYCODE_A, "a")
    object B : Alphabets(KEYCODE_B, "b")
    object C : Alphabets(KEYCODE_C, "c")
    object D : Alphabets(KEYCODE_D, "d")
    object E : Alphabets(KEYCODE_E, "e")
    object F : Alphabets(KEYCODE_F, "f")
    object G : Alphabets(KEYCODE_G, "g")
    object H : Alphabets(KEYCODE_H, "h")
    object I : Alphabets(KEYCODE_I, "i")
    object J : Alphabets(KEYCODE_J, "j")
    object K : Alphabets(KEYCODE_K, "k")
    object L : Alphabets(KEYCODE_L, "l")
    object M : Alphabets(KEYCODE_M, "m")
    object N : Alphabets(KEYCODE_N, "n")
    object O : Alphabets(KEYCODE_O, "o")
    object P : Alphabets(KEYCODE_P, "p")
    object Q : Alphabets(KEYCODE_Q, "q")
    object R : Alphabets(KEYCODE_R, "r")
    object S : Alphabets(KEYCODE_S, "s")
    object T : Alphabets(KEYCODE_T, "t")
    object U : Alphabets(KEYCODE_U, "u")
    object V : Alphabets(KEYCODE_V, "v")
    object W : Alphabets(KEYCODE_W, "w")
    object X : Alphabets(KEYCODE_X, "x")
    object Y : Alphabets(KEYCODE_Y, "y")
    object Z : Alphabets(KEYCODE_Z, "z")
}