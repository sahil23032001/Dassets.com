package com.example.dassets

data class MarketStatus(
    val index: String,
    val last: Double,
    val market: String,
    val marketStatus: String,
    val marketStatusMessage: String,
    val percentChange: Double,
    val tradeDate: String,
    val variation: Double
)