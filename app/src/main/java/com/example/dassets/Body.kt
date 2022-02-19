package com.example.dassets

data class Body(
    val advance: Advance,
    val `data`: List<Data>,
    val date30dAgo: String,
    val date365dAgo: String,
    val marketStatus: MarketStatus,
    val metadata: Metadata,
    val name: String,
    val timestamp: String
)