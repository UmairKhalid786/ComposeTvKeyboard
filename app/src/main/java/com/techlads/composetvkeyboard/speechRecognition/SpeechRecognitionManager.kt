package com.techlads.composetvkeyboard.speechRecognition

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


private const val RECORD_AUDIO_PERMISSION_CODE: Int = 10001

object SpeechRecognitionManager {

    private var speechRecognizer: SpeechRecognizer? = null
    private var mListener: ResultListener? = null

    fun startListening(
        activity: Activity,
        listener: ResultListener
    ) {
        setListener(activity, listener)

        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
            )
            putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1)
            putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
        }
        speechRecognizer?.startListening(intent)
    }

    private fun setListener(
        activity: Activity,
        listener: ResultListener
    ) {
        requestPermission(activity)
        mListener = listener
    }

    private fun requestPermission(context: Activity) {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO)
            != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                context,
                arrayOf(Manifest.permission.RECORD_AUDIO), RECORD_AUDIO_PERMISSION_CODE
            )
        } else {
            initializeSpeechRecognizer(context)
        }
    }

    private fun initializeSpeechRecognizer(context: Activity) {
        if (SpeechRecognizer.isRecognitionAvailable(context)) {
            speechRecognizer = SpeechRecognizer.createSpeechRecognizer(context)
            speechRecognizer?.setRecognitionListener(object : RecognitionListener {

                override fun onReadyForSpeech(p0: Bundle?) {
                    Toast.makeText(context, "Speak now...", Toast.LENGTH_SHORT).show()
                }

                override fun onBeginningOfSpeech() {}

                override fun onRmsChanged(p0: Float) {}

                override fun onBufferReceived(p0: ByteArray?) {}

                override fun onEndOfSpeech() {}

                override fun onError(error: Int) {
                    Toast.makeText(
                        context,
                        "Error: Encountered error while recognition $error",
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onResults(results: Bundle) {
                    // Called when final recognition results are available
                    val voiceResults =
                        results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION) ?: return

                    if (voiceResults.isNotEmpty()) {
                        mListener?.onResult(voiceResults[0])
                    }
                }

                override fun onPartialResults(p0: Bundle?) {}

                override fun onEvent(p0: Int, p1: Bundle?) {}
            })
        }
    }

    interface ResultListener {
        fun onResult(result: String)
    }
}