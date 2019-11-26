package com.example.recycleview_011

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recycleView : RecyclerView? = null

    var foodMenuText = arrayOf(
        "Cake Roll",
        "Muffin",
        "Choux Cream",
        "White cake ball (White ball)",
        "Warabi Mochi",
        "Macaron",
        "French Toast",
        "Cheese Pie",
        "Mousse cake",
        "Daifuku",
        "Dango",
        "Scones"
    )


    var foodMenuImage = arrayOf<Int>(

        R.drawable.images1,
        R.drawable.images2,
        R.drawable.images3,
        R.drawable.images4,
        R.drawable.images5,
        R.drawable.images6,
        R.drawable.images7,
        R.drawable.images8,
        R.drawable.images9,
        R.drawable.images10,
        R.drawable.images11,
        R.drawable.images12
    )
    var context  = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.menuRecycleview) as RecyclerView
        recycleView!!.layoutManager = LinearLayoutManager(context)
        recycleView!!.setLayoutManager(GridLayoutManager(context,2))
        var myAdapter = MyAdapterRecycleView(foodMenuText,foodMenuImage,context)
        recycleView!!.adapter = myAdapter

    }
}
