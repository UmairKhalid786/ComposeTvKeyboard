package com.techlads.composetvkeyboard.domain.model

interface Key {
    val code: Int
    val text: String
    val span: Int
}