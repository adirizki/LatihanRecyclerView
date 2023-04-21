package com.example.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var adapter: MyContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent =  arrayListOf(
            MyContact("20102156","Rizki Mugi Setya Adi","082138603047"),
            MyContact("20102007","Alif Alpian Sahrul Muharom","085793571194"),
            MyContact("20102043","Aulia Romadhoni","085336033787"),
            MyContact("20102087","Dewa Adji Kusuma","089526782265"),
            MyContact("20102125","Firda Kamal","085658634210"),
            MyContact("20102153","Hardian Alkori","081289954094"),
            MyContact("20102156","Rizki Mugi Setya Adi","082138603047"),
            MyContact("20102007","Alif Alpian Sahrul Muharom","085793571194"),
            MyContact("20102043","Aulia Romadhoni","085336033787"),
            MyContact("20102087","Dewa Adji Kusuma","089526782265"),
            MyContact("20102125","Firda Kamal","085658634210"),
            MyContact("20102153","Hardian Alkori","081289954094"),
            MyContact("20102156","Rizki Mugi Setya Adi","082138603047"),
            MyContact("20102007","Alif Alpian Sahrul Muharom","085793571194"),
            MyContact("20102043","Aulia Romadhoni","085336033787"),
            MyContact("20102087","Dewa Adji Kusuma","089526782265"),
            MyContact("20102125","Firda Kamal","085658634210"),
            MyContact("20102153","Hardian Alkori","081289954094")
        )

        adapter = MyContactAdapter(listStudent)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter

    }
}