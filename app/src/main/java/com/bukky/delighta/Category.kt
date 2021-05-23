package com.bukky.delighta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.inflate
import com.bukky.delighta.databinding.ActivityCategoryBinding
import java.util.*

class Category :AppCompatActivity() {
    private lateinit var binding: ActivityCategoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }


    fun choiceAction (view: View){
        Intent(this,MainActivity::class.java ).also {
//            it.putStringArrayListExtra()
            startActivity(it)
        }

    }

}