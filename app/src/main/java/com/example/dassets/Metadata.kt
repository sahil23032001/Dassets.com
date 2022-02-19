package com.example.dassets

data class Metadata(
    val change: Double,
    val ffmc_sum: Double,
    val high: Double,
    val indexName: String,
    val last: Double,
    val low: Double,
    val `open`: Double,
    val percChange: Double,
    val previousClose: Double,
    val timeVal: String,
    val totalTradedValue: Double,
    val totalTradedVolume: Int,
    val yearHigh: Double,
    val yearLow: Double
)