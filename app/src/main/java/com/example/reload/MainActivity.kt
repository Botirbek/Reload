package com.example.reload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapterRecycler:AdapterRecycler
    var model = ArrayList<Model>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (a in 0..6) {
            model.add(Model("Product name" + a.toString()))
        }
        adapterRecycler = AdapterRecycler(model)
        recycler.adapter = adapterRecycler;
        recycler.layoutManager = GridLayoutManager(this, 2,GridLayoutManager.VERTICAL, false)
    }
}