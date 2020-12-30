package com.example.template.networking

import retrofit2.Retrofit


/**
 * Base Retrofit service, providing basic configuration and responsible for calling creating and maintainting
 * the [API interface][serviceInterface] implementation, based on [OkHttpClient]
 *
 * @see Retrofit
 *
 */
class BackendService {


    private val retrofit = Retrofit.Builder()
            // TODO set baseUrl
            .baseUrl("")
            // TODO add Kotlin serialization converter
//            .addConverterFactory()
            .build()
}