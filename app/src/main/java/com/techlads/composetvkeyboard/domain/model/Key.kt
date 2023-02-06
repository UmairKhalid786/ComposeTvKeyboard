package com.techlads.composetvkeyboard.domain.model

sealed interface Key {
    val id: String
    val text: String
    val span: Int
}