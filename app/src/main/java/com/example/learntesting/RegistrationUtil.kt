package com.example.learntesting

object RegistrationUtil {

    private val existingUsers = listOf("Andrii","Vasil")


    /*
    input is not valid
        wrong or empty or taken
        username/password/confirmedOne
        password too short <8
        */

    fun validateRegistrationInput(
        username:String,
        password:String,
        confirmedPassword:String
    ):Boolean{



        return true
    }

}