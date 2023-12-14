package com.example.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.bottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bNav.selectedItemId = R.id.search

        binding.bNav.setOnItemSelectedListener {

          when(it.itemId){
              R.id.save -> Toast.makeText(this,"Save", Toast.LENGTH_SHORT).show()
              R.id.search -> Toast.makeText(this,"Search", Toast.LENGTH_SHORT).show()
              R.id.sync -> Toast.makeText(this,"Sync", Toast.LENGTH_SHORT).show()
          }
            true
        }
    }

}