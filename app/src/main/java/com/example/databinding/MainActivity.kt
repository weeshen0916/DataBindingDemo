package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p = Person("Ali", "abc@gmail.com", "12345" ,"20 Jalan ABC")
            binding.personDetail = p
           /* binding.tvName.text = "Ali"
            binding.tvAddress.text = "20 Jalan ABC"
            binding.tvEmail.text = "abc@gmail.com"
            binding.tvIC.text = "12345"*/
        }
        binding.btnSecond.setOnClickListener(){
            var p = Person("Abu", "efg@gmail.com", "67890" ,"40 Jalan ABC")
            binding.personDetail = p
        }
    }
}

