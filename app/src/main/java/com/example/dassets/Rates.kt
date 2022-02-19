package com.example.dassets


data class Rates(
    val privacy: String,
    val rates: RatesX,
    val success: Boolean,
    val target: String,
    val terms: String,
    val timestamp: Int
)