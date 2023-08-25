package com.example.yemekleruygulamasi.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yemekleruygulamasi.model.Yemekler
import com.example.yemekleruygulamasi.repo.YemeklerDaoRepository

class AnasayfaViewModel:ViewModel() {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    var yrepo=YemeklerDaoRepository()
    init {
        yemekleriYukle()
        yemeklerListesi=yrepo.yemekleriGetir()

    }
    fun  yemekleriYukle(){
        yrepo.tumYemekleriAl()
    }
}