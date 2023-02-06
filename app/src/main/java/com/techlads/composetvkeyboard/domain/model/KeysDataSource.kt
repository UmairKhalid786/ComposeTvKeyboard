package com.techlads.composetvkeyboard.domain.model

import com.techlads.composetvkeyboard.domain.model.Alphabets.*
import com.techlads.composetvkeyboard.domain.model.SpecialCharacters.*
import com.techlads.composetvkeyboard.domain.model.UtilityKey.*

class KeysDataSource {
    val normalKeys: List<Key> by lazy { constructNormalKeys() }
    val numericKeys: List<Key> by lazy { constructNumericKeys() }

    private fun constructNumericKeys(): List<Key> {
        val keys = mutableListOf<Key>()
        // Row one
        keys.add(Digit("1", "1"))
        keys.add(Digit("2", "2"))
        keys.add(Digit("3", "3"))
        keys.add(Dash)
        // Row two
        keys.add(Digit("4", "4"))
        keys.add(Digit("5", "5"))
        keys.add(Digit("6", "6"))
        keys.add(NumericUtilityKey.Space)
        // Row three
        keys.add(Digit("7", "7"))
        keys.add(Digit("8", "8"))
        keys.add(Digit("9", "9"))
        keys.add(NumericUtilityKey.Backspace)
        // Row four
        keys.add(Dot)
        keys.add(Digit("0", "0"))
        keys.add(Comma)
        keys.add(NumericUtilityKey.RightArrow)

        return keys
    }
    private fun constructNormalKeys(): List<Key> {
        val keys = mutableListOf<Key>()
        // Row one
        keys.addAll(generateNumericKeys())
        // Row two
        keys.add(Q)
        keys.add(W)
        keys.add(E)
        keys.add(R)
        keys.add(T)
        keys.add(Y)
        keys.add(U)
        keys.add(I)
        keys.add(O)
        keys.add(P)

        // Row three
        keys.add(A)
        keys.add(S)
        keys.add(D)
        keys.add(F)
        keys.add(G)
        keys.add(H)
        keys.add(J)
        keys.add(K)
        keys.add(L)
        keys.add(Dot)

        // Row four
        keys.add(Uppercase)
        keys.add(Z)
        keys.add(X)
        keys.add(C)
        keys.add(V)
        keys.add(B)
        keys.add(N)
        keys.add(M)
        keys.add(Comma)
        keys.add(Backspace)

        // Row five
        keys.add(Numeric)
        keys.add(Left)
        keys.add(Right)
        keys.add(Space)
        keys.add(Dash)
        keys.add(Underscore)
        keys.add(RightArrow)

        return keys
    }

    private fun generateNumericKeys(): List<Key> {
        val keys = mutableListOf<Key>()
        repeat(9) {
            val keyText = (1 + it).toString()
            keys.add(Digit(keyText, keyText))
        }
        keys.add(Digit("0", "0"))
        return keys
    }
}