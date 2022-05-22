package com.example.tugasakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobil = arrayOf("Avanza", "Xenia", "Lexus", "Xpander", "Porsche", "Skyline")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, mobil)

        val lv_mobil = findViewById<ListView>(R.id.lv_mobil)

        lv_mobil.adapter = adapter
        lv_mobil.setOnItemClickListener {parent, view, position, id ->
            Toast.makeText(this, "Ini adalah mobil ${mobil[position]}", Toast.LENGTH_SHORT).show()
        }

    }
}