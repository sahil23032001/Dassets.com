package com.example.dassets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_stocks.*
import okhttp3.*
import java.io.IOException


class Stocks: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stocks)
        recyle.layoutManager= LinearLayoutManager(this)
        fetchmodel()
    }
    fun fetchmodel() {
        val request = Request.Builder()
            .url("https://nse-data1.p.rapidapi.com/nifty_fifty_indices_data")
            .get()
            .addHeader("x-rapidapi-host", "nse-data1.p.rapidapi.com")
            .addHeader("x-rapidapi-key", "3a6f7b038dmsh04fa282620ec924p16cd0cjsnca0e31bd12c4")
            .build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call?, response: Response) {
                val body=response?.body()?.string()
                val gson = GsonBuilder().create()
                val feeds = gson.fromJson(body,stockmodels::class.java)
                runOnUiThread{
                    recyle.adapter=Stockad(feeds)
                }


            }

            override fun onFailure(call: Call, e: IOException) {

            }
        })
    }
}
