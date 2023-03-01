package com.techlads.composetvkeyboard.domain.model

sealed class Alphabets(
    override val text: String,
    override val span: Int = 1
) : Key, Cloneable {
    object A : Alphabets("a")
    object B : Alphabets("b")
    object C : Alphabets("c")
    object D : Alphabets("d")
    object E : Alphabets("e")
    object F : Alphabets("f")
    object G : Alphabets("g")
    object H : Alphabets("h")
    object I : Alphabets("i")
    object J : Alphabets("j")
    object K : Alphabets("k")
    object L : Alphabets("l")
    object M : Alphabets("m")
    object N : Alphabets("n")
    object O : Alphabets("o")
    object P : Alphabets("p")
    object Q : Alphabets("q")
    object R : Alphabets("r")
    object S : Alphabets("s")
    object T : Alphabets("t")
    object U : Alphabets("u")
    object V : Alphabets("v")
    object W : Alphabets("w")
    object X : Alphabets("x")
    object Y : Alphabets("y")
    object Z : Alphabets("z")
}