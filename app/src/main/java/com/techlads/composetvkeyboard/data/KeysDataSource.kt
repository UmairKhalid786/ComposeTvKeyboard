package com.techlads.composetvkeyboard.data

import com.techlads.composetvkeyboard.domain.model.UtilityKey.*
import com.techlads.composetvkeyboard.domain.model.SpecialCharactersKey.*
import com.techlads.composetvkeyboard.domain.model.Digit.*
import com.techlads.composetvkeyboard.domain.model.Alphabets.*
import com.techlads.composetvkeyboard.domain.model.Key
import com.techlads.composetvkeyboard.domain.model.NumericUtilityKey
import com.techlads.composetvkeyboard.domain.model.SuggestionKey
import com.techlads.composetvkeyboard.domain.model.TextUtilityKey.*

object KeysDataSource {
    val normalKeys: List<Key> by lazy { constructNormalKeys() }
    val numericMiniKeys: List<Key> by lazy { constructNumericMiniKeys() }
    val numericKeys: List<Key> by lazy { constructNumericKeys() }
    val specialCharactersKeys: List<Key> by lazy { constructSpecialCharactersKeys() }
    val toggleKeys: List<Key> by lazy { createToggleButtonsList() }
    val emailSuggestions: List<Key> by lazy { createEmailSuggestions() }

    private fun createEmailSuggestions(): List<Key> = SuggestionHandler.emails.map {
        SuggestionKey(it, 3)
    }

    private fun createToggleButtonsList() = mutableListOf<Key>().apply {
        add(Uppercase)
    }

    private fun constructSpecialCharactersKeys() = mutableListOf<Key>().apply {
        // Row one
        add(Tide)
        add(Grave)
        add(Pipe)
        add(Bullet)
        add(Root)
        add(PI)
        add(Division)
        add(Multiple)
        add(Paragraph)
        add(Triangle)

        // Row two
        add(Pound)
        add(Cent)
        add(Euro)
        add(Yen)
        add(Caret)
        add(Degree)
        add(Equal)
        add(CurlyBracketLeft)
        add(CurlyBracketRight)
        add(Backlash)

        // Row three
        add(Numeric)
        add(Percent)
        add(CopyRight)
        add(RegisterTrademark)
        add(CheckMark)
        add(BoxBracketLeft)
        add(BoxBracketRight)
        add(ArrowLeft)
        add(ArrowRight)
        add(NumericUtilityKey.Backspace)

        // Row five
        add(ABC)
        add(Clear)
        add(Dot)
        add(Space)
        add(Comma)
        add(ActionArrow)
    }

    private fun constructNumericKeys() = mutableListOf<Key>().apply {
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
        add(Ampersat)
        add(Hash)
        add(Dollar)
        add(Underscore)
        add(And)
        add(Dash)
        add(Plus)
        add(ParenthesesBracketsLeft)
        add(ParenthesesBracketsRight)
        add(BackSlash)

        // Row three
        add(SpecialCharacters)
        add(Asterisk)
        add(Quotes)
        add(SingleQuotes)
        add(Colon)
        add(Semicolon)
        add(Exclamation)
        add(Question)
        add(Percent)
        add(NumericUtilityKey.Backspace)

        // Row five
        add(ABC)
        add(Clear)
        add(Underscore)
        add(Space)
        add(Dash)
        add(ActionArrow)
    }

    private fun constructNumericMiniKeys() = mutableListOf<Key>().apply {
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
        add(Clear)
        add(Underscore)
        add(Space)
        add(Dash)
        add(ActionArrow)
    }
}