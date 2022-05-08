package com.example.todoinmyhour.data

interface TodoAuth {

    var name: String?
    var email: String
    var uid: String

    fun authLogin()
    fun authSignUp()

}