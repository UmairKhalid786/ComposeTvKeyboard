package com.techlads.composetvkeyboard.domain.model

sealed class Digit(
    override val text: String,
    override val span: Int = 1
) : Key {
    object Zero : Digit("0")
    object One : Digit("1")
    object Two : Digit("2")
    object Three : Digit("3")
    object Four : Digit("4")
    object Five : Digit("5")
    object Six : Digit("6")
    object Seven : Digit("7")
    object Eight : Digit("8")
    object Nine : Digit("9")
}