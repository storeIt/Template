package com.example.template.util.messaging

data class Message<T>(
        val title: String? = null,
        val description: T? = null,
        val attachment: Any? = null
)