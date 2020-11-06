package com.example.projectandroid

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ClientAPI {

    @FormUrlEncoded
    @POST("customer")
    fun insertCustomer(
        @Field("Cus_username") Cus_username: String,
        @Field("Cus_password") Cus_password: String,
        @Field("Cus_email") Cus_email: String
    ): Call<Customer>

    @FormUrlEncoded
    @POST("login")
    fun login123(
        @Field("Cus_username") Cus_username: String,
        @Field("Cus_password") Cus_password: String
    ): Call<Customer>
    /*companion object {
        fun create(): API{
            val cusClient: API = Retrofit.Builder()
                .baseUrl("http://10.0.2.0:3000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(API::class.java)
            return cusClient
        }
    }*/

}
