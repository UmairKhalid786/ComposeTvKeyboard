package com.techlads.composetvkeyboard.domain.model

import com.techlads.composetvkeyboard.domain.model.UtilityKey.*
import com.techlads.composetvkeyboard.domain.model.SpecialCharacters.*
import com.techlads.composetvkeyboard.domain.model.Digit.*
import com.techlads.composetvkeyboard.domain.model.Alphabets.*

class KeysDataSource {
    val normalKeys: List<Key> by lazy { constructNormalKeys() }
    val numericKeys: List<Key> by lazy { constructNumericKeys() }

    private fun constructNumericKeys() = mutableListOf<Key>().apply {
        // Row one
        add(One)
        add(Two)
        add(Three)
        add(Dash)

        // Row two
        add(Four)
        add(Five)
        add(Six)
        add(NumericUtilityKey.Space)

        // Row three
        add(Seven)
        add(Eight)
        add(Nine)
        add(NumericUtilityKey.Backspace)

        // Row four
        add(Dot)
        add(Zero)
        add(Comma)
        add(NumericUtilityKey.RightArrow)
    }

    private fun constructNormalKeys() = mutableListOf<Key>().apply {
        // Row one
        add(One)
        add(Two)
        add(Three)
        add(Four)
        add(Five)
        add(Six)
        add(Seven)
        add(Eight)
        add(Nine)
        add(Zero)

        // Row two
        add(Q)
        add(W)
        add(E)
        add(R)
        add(T)
        add(Y)
        add(U)
        add(I)
        add(O)
        add(P)

        // Row three
        add(A)
        add(S)
        add(D)
        add(F)
        add(G)
        add(H)
        add(J)
        add(K)
        add(L)
        add(Dot)

        // Row four
        add(Uppercase)
        add(Z)
        add(X)
        add(C)
        add(V)
        add(B)
        add(N)
        add(M)
        add(Comma)
        add(Backspace)

        // Row five
        add(Numeric)
        add(Left)
        add(Right)
        add(Space)
        add(Dash)
        add(Underscore)
        add(RightArrow)
    }
}