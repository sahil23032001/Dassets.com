package com.example.dassets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.coin_layer.view.*

class MainAdapter(val feed:Rates): RecyclerView.Adapter<CustomViewHolders>(){

    val name= listOf("BNB","BTC","USDT","ETH","DOGE")
    val final1= feed.rates.BNB
    val final2= feed.rates.BTC
    val final3 = feed.rates.USDT
    val final4=feed.rates.ETH
    val final5=feed.rates.DOGE
    val finalmainframe= listOf(final1,final2,final3,final4,final5)
    override fun getItemCount(): Int {
        return finalmainframe.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolders {
        val layoutInflater =LayoutInflater.from(parent?.context)
        val cellForRow= layoutInflater.inflate(R.layout.coin_layer,parent,false)
        return CustomViewHolders(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolders, position: Int) {
        val prices =finalmainframe.get(position)
        val names = name.get(position)
        holder?.view?.price?.text= prices.toString()
        holder?.view?.coin?.text= names
    }
}
class CustomViewHolders(val view :View): RecyclerView.ViewHolder(view){

}