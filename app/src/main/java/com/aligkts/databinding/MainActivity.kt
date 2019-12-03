package com.aligkts.databinding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.aligkts.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val myName: Name = Name ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.ad = myName
        binding.doneButton.setOnClickListener{
            addName(it)
        }
    }

    private fun addName(view: View){
        binding.apply{
            ad?.isim= editName.text.toString()
            textName.text = editName.text
            editName.visibility = View.GONE
            doneButton. visibility = View.GONE
            textName.visibility = View. VISIBLE
        }
    }
}
