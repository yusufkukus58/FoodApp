package com.example.yemekleruygulamasi.model


data class Yemekler(
    var yemek_id: Int,
    var yemek_adi: String,
    var yemek_resim_adi: String,
    var yemek_fiyat: Int
) {
}