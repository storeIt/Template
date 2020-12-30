package com.example.template.util.messaging

data class Message<T>(
        val title: String? = null,
        val description: T? = null,
        val attachment: Any? = null
)


interface MessageListener<T> {
    fun onMessageReceived(message: T)
}

abstract class MessageMenager<T> {

    private val users = ArrayList<User>()

    private fun unregisterFromReceiving(user: User) {

    }

    private fun saveMessage() {

    }

    fun send(message: T, callback: MessageListener<T>) {

        callback.onMessageReceived(message)
    }

    public fun sendToAll(message: T) {

    }

    private fun sendOnEvent(message: T, event: Event) {

        when (event) {
            Event.BIRTHDAY -> TODO()
            Event.CHRISTMAS -> TODO()
            Event.INDEPENDENCE_DAY -> TODO()
            Event.NEW_YEAR -> TODO()
            Event.ALL -> TODO()
        }
    }


}