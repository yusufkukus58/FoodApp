package com.example.yemekleruygulamasi.repo

import androidx.lifecycle.MutableLiveData
import com.example.yemekleruygulamasi.model.Yemekler
import com.example.yemekleruygulamasi.model.YemeklerCevap
import com.example.yemekleruygulamasi.retrofit.ApiUtils
import com.example.yemekleruygulamasi.retrofit.YemeklerDaoInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class YemeklerDaoRepository {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    var yemeklerDaoInterface:YemeklerDaoInterface

    init {
        yemeklerDaoInterface = ApiUtils.getYemeklerDaoInterface()
        yemeklerListesi = MutableLiveData()
    }

    fun yemekleriGetir():MutableLiveData<List<Yemekler>> {
        return yemeklerListesi
    }

    fun tumYemekleriAl(){
        yemeklerDaoInterface.tumYemekler().enqueue(object : Callback<YemeklerCevap>{
            override fun onResponse(call: Call<YemeklerCevap>, response: Response<YemeklerCevap>) {
                val liste = response.body()?.yemekler
                yemeklerListesi.value = liste
            }
            override fun onFailure(call: Call<YemeklerCevap>?, t: Throwable?) {}
        })
    }
    }