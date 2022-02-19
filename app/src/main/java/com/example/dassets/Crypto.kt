package com.example.dassets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_crypto.*
import okhttp3.*
import java.io.IOException
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.coin_layer.*


class Crypto(): AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crypto)
        coin_recycler_view.layoutManager= LinearLayoutManager(this)

        fetchmodel()
    }
    fun fetchmodel() {
        val url="http://api.coinlayer.com/api/live?access_key=d1e59c574bea5942e30bdc2b2411302a&target=INR&symbols=BTC,ETH,DOGE,BNB,USDT"
        val request =Request.Builder().url(url).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object :Callback{
            override fun onResponse(call: Call? , response: Response) {
                val body=response?.body()?.string()
                val gson = GsonBuilder().create()
                val feed = gson.fromJson(body,Rates::class.java)
                runOnUiThread{
                    coin_recycler_view.adapter=MainAdapter(feed)
                }
            }

            override fun onFailure(call: Call, e: IOException) {

            }
        })
    }
    }





