package com.example.todoinmyhour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.todoinmyhour.viewmodel.AuthMethods

class LoginSignUp : AppCompatActivity() {

    lateinit var edEmail : EditText
    lateinit var edName: EditText
    lateinit var edPassword : EditText
    lateinit var btnLogin : Button
    lateinit var btnSignup : Button
    lateinit var authOject: AuthMethods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)

        edName = findViewById(R.id.ed_name)
        edEmail = findViewById(R.id.ed_login)
        edPassword = findViewById(R.id.ed_pass)
        btnLogin = findViewById(R.id.btn_login)
        btnSignup = findViewById(R.id.btn_signup)

        btnLogin.setOnClickListener {
            val email = edEmail.text.toString()
            val password = edPassword.text.toString()
            authOject = AuthMethods(null, email, password)
            authOject.authLogin()
        }

        btnSignup.setOnClickListener {
            edName.visibility = View.VISIBLE
            btnLogin.visibility = View.GONE
            val name = edName.text.toString()
            val email = edEmail.text.toString()
            val password = edPassword.text.toString()
            //signUp(name, email, password)
            authOject = AuthMethods(name, email, password)
            authOject.authLogin()
        }
    }
}