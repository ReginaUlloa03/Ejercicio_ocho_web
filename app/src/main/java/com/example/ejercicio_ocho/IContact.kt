package com.example.ejercicio_ocho

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.PUT

interface IContact {
    companion object {
        const val url = "http://192.168.1.73:4567"
    }

    @GET("/contactos")
    fun getPersonas(): Call<List<Contact>>

    @PUT("/contacto")
    fun addPersona(@Body contact: Contact): Call<Boolean>

    @PUT("/modificar")
    fun modifyPersona(@Body contact: Contact): Call<Boolean>

    @HTTP(method = "DELETE", path = "/eliminar", hasBody = true)
    fun deletePersona(@Body contact: Contact): Call<Boolean>

}