package com.example.warlock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.warlock.data.SampleData
import com.example.warlock.ui.Conversation
import com.example.warlock.ui.theme.ComposewarlockTheme

/**
 * https://developer.android.google.cn/jetpack/compose/tutorial
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposewarlockTheme {
                Conversation(SampleData.conversationSample)
            }
        }
    }
}