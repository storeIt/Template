package com.example.template.util.messaging

class User (
        var name: String
) : MessageMenager<String>() {

    private val usersWithEmails: MutableList<User> = mutableListOf()

    constructor(
            name: String,
            email: String
    ) : this(name) {
        usersWithEmails.add(User(name, email))
    }

    constructor(
            name: String,
            email: String,
            event: Event
    ) : this(name, email){

    }

    private fun setMessageReceiver(user: User, event: Event){

        

    }


}