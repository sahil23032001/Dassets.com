package com.example.dassets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.coin_layer.view.*

class Stockad(val feed:stockmodels): RecyclerView.Adapter<CustomViewHolders>(){

    val final1= feed.body.data.get(2)
    val final2= feed.body.data.get(3)
    val final3= feed.body.data.get(4)
    val final4= feed.body.data.get(5)
    val final5= feed.body.data.get(6)
    val finname= listOf(final1.symbol,final2.symbol,final3.symbol,final4.symbol,final5.symbol)
    val fin= listOf(final1.lastPrice,final2.lastPrice,final3.lastPrice,final4.lastPrice,final5.lastPrice)




    override fun getItemCount(): Int {
        return fin.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolders {
        val layoutInflater =LayoutInflater.from(parent?.context)
        val cellForRow= layoutInflater.inflate(R.layout.coin_layer,parent,false)
        return CustomViewHolders(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolders, position: Int) {
        val prices =fin.get(position)
        val names = finname.get(position)
        holder?.view?.price?.text= prices.toString()
        holder?.view?.coin?.text= names



    }
}
class CustomViewHolder(val view :View): RecyclerView.ViewHolder(view){

}