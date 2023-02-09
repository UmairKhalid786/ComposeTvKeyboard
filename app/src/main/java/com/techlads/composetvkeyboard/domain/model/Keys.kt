//package com.techlads.composetvkeyboard.domain.model//package com.techlads.composetvkeyboard.domain.model
//
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.outlined.*
//import androidx.compose.ui.graphics.vector.ImageVector
//import com.techlads.composetvkeyboard.domain.model.KeysConstants.BACK_SPACE_KEY
//import com.techlads.composetvkeyboard.domain.model.KeysConstants.LEFT_KEY
//import com.techlads.composetvkeyboard.domain.model.KeysConstants.NUMERIC_KEY
//import com.techlads.composetvkeyboard.domain.model.KeysConstants.RIGHT_ARROW_KEY
//import com.techlads.composetvkeyboard.domain.model.KeysConstants.RIGHT_KEY
//import com.techlads.composetvkeyboard.domain.model.KeysConstants.SPACE_KEY
//import com.techlads.composetvkeyboard.domain.model.KeysConstants.UPPER_CASE_KEY
//
//private object KeysConstants {
//    const val UPPER_CASE_KEY = "upper_case_utility_key"
//    const val BACK_SPACE_KEY = "back_utility_key"
//    const val NUMERIC_KEY = "numeric_utility_key"
//    const val LEFT_KEY = "left_utility_key"
//    const val RIGHT_KEY = "right_utility_key"
//    const val SPACE_KEY = "space_utility_key"
//    const val RIGHT_ARROW_KEY = "underscore_utility_key"
//}
//
//sealed class Alphabets(
//    override val id: String,
//    override val text: String,
//    override val span: Int = 1
//) : Key {
//    object A : Alphabets("a", "a", 1)
//    object B : Alphabets("b", "b", 1)
//    object C : Alphabets("c", "c", 1)
//    object D : Alphabets("d", "d", 1)
//    object E : Alphabets("e", "e", 1)
//    object F : Alphabets("f", "f", 1)
//    object G : Alphabets("g", "g", 1)
//    object H : Alphabets("h", "h", 1)
//    object I : Alphabets("i", "i", 1)
//    object J : Alphabets("j", "j", 1)
//    object K : Alphabets("k", "k", 1)
//    object L : Alphabets("l", "l", 1)
//    object M : Alphabets("m", "m", 1)
//    object N : Alphabets("n", "n", 1)
//    object O : Alphabets("o", "o", 1)
//    object P : Alphabets("p", "p", 1)
//    object Q : Alphabets("q", "q", 1)
//    object R : Alphabets("r", "r", 1)
//    object S : Alphabets("s", "s", 1)
//    object T : Alphabets("t", "t", 1)
//    object U : Alphabets("u", "u", 1)
//    object V : Alphabets("v", "v", 1)
//    object W : Alphabets("w", "w", 1)
//    object X : Alphabets("x", "x", 1)
//    object Y : Alphabets("y", "y", 1)
//    object Z : Alphabets("z", "z", 1)
//}
//
//sealed class com.techlads.composetvkeyboard.domain.model.SpecialCharacters(
//    override val id: String,
//    override val text: String,
//    override val span: Int = 1
//) : Key {
//    object Dot : com.techlads.composetvkeyboard.domain.model.SpecialCharacters(".", ".")
//    object Underscore : com.techlads.composetvkeyboard.domain.model.SpecialCharacters("_", "_")
//    object Dash : com.techlads.composetvkeyboard.domain.model.SpecialCharacters("-", "-")
//    object Exclamation : com.techlads.composetvkeyboard.domain.model.SpecialCharacters("!", "!")
//    object Hash : com.techlads.composetvkeyboard.domain.model.SpecialCharacters("#", "#")
//    object Ampersat : com.techlads.composetvkeyboard.domain.model.SpecialCharacters("@", "@")
//    object Comma : com.techlads.composetvkeyboard.domain.model.SpecialCharacters(",", ",")
//}
//
//sealed class UtilityKey(
//    open val icon: ImageVector,
//    override val id: String,
//    override val text: String,
//    override val span: Int = 1
//) : Key {
//    object Uppercase : UtilityKey(Icons.Outlined.ArrowUpward, UPPER_CASE_KEY, UPPER_CASE_KEY, 1)
//    object Backspace : UtilityKey(Icons.Outlined.ArrowBack, BACK_SPACE_KEY, BACK_SPACE_KEY, 1)
//    object Numeric : UtilityKey(Icons.Outlined.Numbers, NUMERIC_KEY, NUMERIC_KEY, 1)
//    object Left : UtilityKey(Icons.Outlined.ArrowLeft, LEFT_KEY, LEFT_KEY, 1)
//    object Right : UtilityKey(Icons.Outlined.ArrowRight, RIGHT_KEY, RIGHT_KEY, 1)
//    object Space : UtilityKey(Icons.Outlined.SpaceBar, SPACE_KEY, SPACE_KEY, 3)
//    object RightArrow : UtilityKey(Icons.Outlined.ArrowForward, RIGHT_ARROW_KEY, RIGHT_ARROW_KEY, 2)
//}
//
//sealed class NumericUtilityKey(
//    override val icon: ImageVector,
//    override val id: String,
//    override val text: String,
//    override val span: Int = 1
//) : UtilityKey(icon, id, text, span) {
//    object Backspace : NumericUtilityKey(Icons.Outlined.ArrowBack, BACK_SPACE_KEY, BACK_SPACE_KEY)
//    object Space : NumericUtilityKey(Icons.Outlined.SpaceBar, SPACE_KEY, SPACE_KEY)
//    object RightArrow :
//        NumericUtilityKey(Icons.Outlined.ArrowForward, RIGHT_ARROW_KEY, RIGHT_ARROW_KEY)
//}
//
//class Digit(
//    override val id: String,
//    override val text: String,
//    override val span: Int = 1
//) : Key
