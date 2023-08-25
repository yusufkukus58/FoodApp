package com.example.yemekleruygulamasi.retrofit

import com.example.yemekleruygulamasi.model.YemeklerCevap
import retrofit2.Call
import retrofit2.http.GET

interface YemeklerDaoInterface {
    @GET("yemekler/tumYemekleriGetir.php")
    fun tumYemekler(): Call<YemeklerCevap>
}