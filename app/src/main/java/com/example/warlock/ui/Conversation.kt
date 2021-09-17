package com.example.warlock.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.warlock.data.Message
import com.example.warlock.data.SampleData
import com.example.warlock.ui.theme.ComposewarlockTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message)
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    ComposewarlockTheme {
        Conversation(SampleData.conversationSample)
    }
}
