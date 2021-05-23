package com.bukky.delighta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import com.bukky.delighta.databinding.ActivityMainBinding


//class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
//    private val adapter = ViewAdapter()
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        adapter.setupContacts(mutableListOf(ContactsData("Bukky", "0000000000"),
//                ContactsData("Wunmi", "0800000000")))
//
//
//        setUpData(binding)
//
//    }
//
//    private fun setUpData(binding: ActivityMainBinding) {
//        binding.contactRv.adapter = adapter
//        binding.contactRv.addItemDecoration(DividerItemDecoration(this, GridLayoutManager.VERTICAL))
//        val builder = AlertDialog.Builder(this)
//        val inflater = this.layoutInflater
//        val view = inflater.inflate(R.layout.activity_login, null)
//        builder.setView(view)
//
//        val name = view.findViewById<TextView>(R.id.nameC)
//        val number = view.findViewById<TextView>(R.id.phoneNum)
//        val save = view.findViewById<TextView>(R.id.savebtn)
//        number.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                save.isEnabled = s?.length == 11
//            }
//
//            override fun afterTextChanged(s: Editable?) {
//
//            }
//
//        })
//        val alertDialog = builder.create()
//        save.setOnClickListener {
//            val contactList = ContactsData(name.text.toString(), number.text.toString())
//            val contacts = mutableListOf(contactList)
//            adapter.setupContacts(contacts)
//            alertDialog.dismiss()
//        }
//
//
//        binding.floatbutton.setOnClickListener {
//            alertDialog.show()
//        }
//
//    }
//}

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter = ViewAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpData(binding)

    }

    private fun setUpData(binding: ActivityMainBinding) {
        binding.contactRv.adapter = adapter
        binding.contactRv.addItemDecoration(DividerItemDecoration(this, GridLayoutManager.VERTICAL))
        val builder = AlertDialog.Builder(this)
        val inflater = this.layoutInflater
        val view = inflater.inflate(R.layout.activity_sign_up, null)
        builder.setView(view)

        val name = view.findViewById<TextView>(R.id.nameC)
        val number = view.findViewById<TextView>(R.id.phoneNum)
        val signup = view.findViewById<TextView>(R.id.sign_up)
        val login = view.findViewById<TextView>(R.id.login)
        number.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                login.isEnabled

            }

            override fun afterTextChanged(s: Editable?) {
            }

        })

        val alertDialog = builder.create()
        login.setOnClickListener {
            val contactList = ContactsData(name.text.toString(), number.text.toString())
            val contacts = mutableListOf(contactList)
            adapter.setupContacts(contacts)
            alertDialog.dismiss()
        }


        binding.floatbutton.setOnClickListener {
            alertDialog.show() }

    }
}
