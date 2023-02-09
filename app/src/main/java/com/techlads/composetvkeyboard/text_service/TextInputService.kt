package com.techlads.composetvkeyboard.text_service

import android.view.KeyEvent.*
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.text.input.*
val customPlatformTextInputService = object : PlatformTextInputService {
    var onEditCommand: ((List<EditCommand>) -> Unit)? = null
    var onImeActionPerformed: ((ImeAction) -> Unit)? = null
    var imeAction: ImeAction? = null

    override fun stopInput() {
        this.onEditCommand = null
        this.onImeActionPerformed = null
        this.imeAction = null
    }

    override fun updateState(oldValue: TextFieldValue?, newValue: TextFieldValue) {

    }

    override fun showSoftwareKeyboard() {}

    override fun startInput(
        value: TextFieldValue,
        imeOptions: ImeOptions,
        onEditCommand: (List<EditCommand>) -> Unit,
        onImeActionPerformed: (ImeAction) -> Unit
    ) {
        this.onEditCommand = onEditCommand
        this.onImeActionPerformed = onImeActionPerformed
        this.imeAction = imeAction
    }

    override fun hideSoftwareKeyboard() {}

    override fun notifyFocusedRect(rect: Rect) {}

    @Suppress("UNUSED_PARAMETER")
    fun onKeyPressed(keyCode: Int, char: Char) {
        onEditCommand?.let {
            when (keyCode) {
                KEYCODE_DPAD_LEFT -> {
                    it.invoke(listOf(MoveCursorCommand(-1)))
                }
                KEYCODE_DPAD_RIGHT -> {
                    it.invoke(listOf(MoveCursorCommand(1)))
                }
                KEYCODE_BACK -> {
                    it.invoke(listOf(BackspaceCommand()))
                }
                KEYCODE_ENTER -> {
                    if (imeAction == ImeAction.None) {
                        it.invoke(listOf(CommitTextCommand("\n", 1)))
                    } else
                        onImeActionPerformed?.invoke(imeAction!!)
                }
                else -> Unit
            }
        }
    }

    @Suppress("UNUSED_PARAMETER")
    fun onKeyReleased(keyCode: Int, char: Char) {

    }

    private fun Char.isPrintable(): Boolean {
        val block = Character.UnicodeBlock.of(this)
        return (!Character.isISOControl(this)) &&
                block != null &&
                block != Character.UnicodeBlock.SPECIALS
    }

    fun onKeyTyped(char: Char) {
        onEditCommand?.let {
            if (char.isPrintable()) {
                it.invoke(listOf(CommitTextCommand(char.toString(), 1)))
            }
        }
    }
}

//import androidx.compose.ui.text.input.*
//
//package androidx.ui.input
//
//import androidx.annotation.RestrictTo
//import androidx.ui.engine.geometry.Rect
//
///**
// * The input session token.
// *
// * The positive session token means the input session is alive. The session may be expired though.
// * The zero session token means no session.
// * The negative session token means the input session could not be established with some errors.
// */
//typealias InputSessionToken = Int
//
///**
// * A special session token which represents there is no active input session.
// * @hide
// */
//@RestrictTo(RestrictTo.Scope.LIBRARY)
//const val NO_SESSION: InputSessionToken = 0
//
///**
// * A special session token which represents the session couldn't be established.
// * @hide
// */
//@RestrictTo(RestrictTo.Scope.LIBRARY)
//const val INVALID_SESSION: InputSessionToken = -1
//
///**
// * Provide a communication with platform text input service.
// *
// * Open for testing purpose.
// * @hide
// */
//@RestrictTo(RestrictTo.Scope.LIBRARY)
//open class TextInputService(val platformTextInputService: PlatformTextInputService) {
//
//    private var nextSessionToken: Int = 1
//    private var currentSessionToken: InputSessionToken = NO_SESSION
//
//    private inline fun ignoreIfExpired(token: InputSessionToken, block: () -> Unit) {
//        if (token > 0 && token == currentSessionToken) {
//            block()
//        }
//    }
//
//    /**
//     * Start text input session for given client.
//     */
//    open fun startInput(
//        initModel: InputState,
//        keyboardType: KeyboardType,
//        imeAction: ImeAction,
//        onEditCommand: (List<EditOperation>) -> Unit,
//        onImeActionPerformed: (ImeAction) -> Unit
//    ): InputSessionToken {
//        platformTextInputService.startInput(
//            initModel,
//            keyboardType,
//            imeAction,
//            onEditCommand,
//            onImeActionPerformed)
//        currentSessionToken = nextSessionToken++
//        return currentSessionToken
//    }
//
//    /**
//     * Stop text input session.
//     */
//    open fun stopInput(token: InputSessionToken) = ignoreIfExpired(token) {
//        platformTextInputService.stopInput()
//    }
//
//    /**
//     * Request showing onscreen keyboard
//     *
//     * There is no guarantee nor callback of the result of this API. The software keyboard or
//     * system service may silently ignores this request.
//     */
//    open fun showSoftwareKeyboard(token: InputSessionToken) = ignoreIfExpired(token) {
//        platformTextInputService.showSoftwareKeyboard()
//    }
//
//    /*
//     * Notify the new editor model to IME.
//     */
//    open fun onStateUpdated(token: InputSessionToken, model: InputState) = ignoreIfExpired(token) {
//        platformTextInputService.onStateUpdated(model)
//    }
//
//    /**
//     * Notify the focused rectangle to the system.
//     */
//    open fun notifyFocusedRect(token: InputSessionToken, rect: Rect) = ignoreIfExpired(token) {
//        platformTextInputService.notifyFocusedRect(rect)
//    }
//}
//
///**
// * An interface for text input service.
// * @hide
// */
//@RestrictTo(RestrictTo.Scope.LIBRARY)
//interface PlatformTextInputService {
//    /**
//     * Start text input session for given client.
//     */
//    fun startInput(
//        initModel: InputState,
//        keyboardType: KeyboardType,
//        imeAction: ImeAction,
//        onEditCommand: (List<EditOperation>) -> Unit,
//        onImeActionPerformed: (ImeAction) -> Unit
//    )
//
//    /**
//     * Stop text input session.
//     */
//    fun stopInput()
//
//    /**
//     * Request showing onscreen keyboard
//     *
//     * There is no guarantee nor callback of the result of this API.
//     */
//    fun showSoftwareKeyboard()
//
//    /*
//     * Notify the new editor model to IME.
//     */
//    fun onStateUpdated(model: InputState)
//
//    /**
//     * Notify the focused rectangle to the system.
//     */
//    fun notifyFocusedRect(rect: Rect)
//}