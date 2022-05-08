package com.example.todoinmyhour.viewmodel

import com.example.todoinmyhour.data.TodoAuth
import com.example.todoinmyhour.data.UserData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


private lateinit var mAuth: FirebaseAuth
private lateinit var mDbRef: DatabaseReference

class AuthMethods(override var name: String?, override var email: String, var password: String) : TodoAuth {


    override var uid: String
        get() = TODO("Not yet implemented")
        set(value) {}


    override fun authLogin() {
/*        mAuth.createUserWithEmailAndPassword(email, password.addOnCompleteListener(this) { task ->
                if (task.isSuccessful)  {
                    // Sign in success, update UI with the signed-in user's information
                    //Jump to Home
                    addUserToDatab ase(name, email, mAuth.currentUser?.uid!!)
                    *//*val intent = Intent(this@SignUp, MainActivity::class.java)
                    finish()
                    startActivity(intent)*//*
                } else {
                    // If sign in fails, display a message to the user.
                    //Toast.makeText(View. , "asfsdas", Toast.LENGTH_SHORT).show()
                }
            }*/

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            task ->
                if (task.isSuccessful){
                    name?.let { addUserToDatabase(it, email, uid) }
                }else{

                }
        }

    }

    override fun authSignUp() {
        TODO("Not yet implemented")
    }

    private fun addUserToDatabase(name: String, email: String, uid: String) {
        mDbRef = FirebaseDatabase.getInstance().reference

        mDbRef.child("user").child(uid).setValue(UserData(name, email, uid,))
    }

}