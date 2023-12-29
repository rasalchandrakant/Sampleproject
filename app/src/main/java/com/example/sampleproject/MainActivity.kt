package com.example.sampleproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sampleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private fun createfakedata(): MutableList<String> {
        val list = mutableListOf<String>()
        for (i in 0..7) {
            list.add("item $i")
            list.add("item")
        }
        return list
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val listnum = mutableListOf<NumberItem>()

        for (i in 0..7) {
            listnum.add(NumberItem(text = "hello"))
            listnum.add(NumberItem(text = "world"))

        }


        val numberAdapter = DataAdapter(listnum)
        binding.rv.layoutManager=LinearLayoutManager(this)
        binding.rv.adapter = numberAdapter


    }
}