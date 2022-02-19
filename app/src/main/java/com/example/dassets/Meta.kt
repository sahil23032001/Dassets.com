package com.example.dassets

data class Meta(
    val activeSeries: List<String>,
    val companyName: String,
    val debtSeries: List<String>,
    val industry: String,
    val isCASec: Boolean,
    val isDebtSec: Boolean,
    val isDelisted: Boolean,
    val isETFSec: Boolean,
    val isFNOSec: Boolean,
    val isSLBSec: Boolean,
    val isSuspended: Boolean,
    val isin: String,
    val symbol: String,
    val tempSuspendedSeries: List<String>
)