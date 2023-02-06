package com.techlads.composetvkeyboard.domain.model

import com.techlads.composetvkeyboard.domain.model.Alphabets.*
import com.techlads.composetvkeyboard.domain.model.SpecialCharacters.*
import com.techlads.composetvkeyboard.domain.model.UtilityKey.*

class KeysDataSource {
    val normalKeys: List<Key> by lazy { constructLowerKeys() }

    private fun constructLowerKeys(): List<Key> {
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