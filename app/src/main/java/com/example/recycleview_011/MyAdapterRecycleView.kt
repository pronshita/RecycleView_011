package com.example.recycleview_011

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.model.view.*

class MyAdapterRecycleView(var datatext: Array<String>
                           ,var imgId:Array<Int>
                           ,var context:Context):
    RecyclerView.Adapter<ViewHolder>()

{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.model,parent,false))
    }

    override fun getItemCount(): Int {
        return datatext.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.imgView.setImageResource(imgId.get(position))
        holder?.nameView.text = datatext.get(position)
    }

}
class ViewHolder(view:View):RecyclerView.ViewHolder(view){
    var imgView = view.imgFood
    var nameView = view.tvFood
}