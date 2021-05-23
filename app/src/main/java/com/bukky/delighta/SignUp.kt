package com.bukky.delighta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.textfield.TextInputEditText

class SignUp : AppCompatActivity() {
    private lateinit var inputEmail: TextInputEditText
    private lateinit var inputPassword: TextInputEditText
    private lateinit var inputUsername : TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        inputEmail = findViewById(R.id.loginEt)
        inputPassword = findViewById(R.id.loginPassword)
        inputUsername = findViewById(R.id.userEt)
    }

    fun action(view: View) {
        if (!validateLogin()) {
            return
        }


        val loginData =
            SignUpData(inputEmail.text?.toString()!!, inputPassword.text?.toString()!!,inputUsername.text?.toString()!!)


    }


    private fun validateLogin(): Boolean {
        if (inputUsername.text.isNullOrEmpty()) {
            inputUsername.error = "Sign Up"
            return false
        }

        if (inputEmail.text.isNullOrEmpty()) {
            inputEmail.error = "Input Email"
            return false
        }
        if (inputPassword.text.isNullOrEmpty()) {
            inputPassword.error = "Input Password"
            return false
        }
        if (!isEmailInputValid(inputEmail.text.toString()!!)) {
            inputEmail.error = "Input Email"
            return false
        }
        if (!isEmailInputValid(inputUsername.text.toString()!!)) {
            inputUsername.error = "Input Username"
            return false
        }
        return true
    }

    private fun isEmailInputValid(email: String): Boolean {
        return email.contains("@")
    }
}
