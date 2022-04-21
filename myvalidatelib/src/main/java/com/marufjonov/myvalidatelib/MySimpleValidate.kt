package com.marufjonov.myvalidatelib

import android.content.Context
import android.widget.EditText
import android.widget.Toast

object MySimpleValidate {

    fun checkConfirmPassword(context: Context, editText1: EditText, editText2: EditText){

        var password = editText1.text.toString()
        var confirmPassword = editText2.text.toString()

        if (password.isEmpty()){
            editText1.error = "Please enter password"
        } else if (confirmPassword.isEmpty()){
            editText1.error = "Please confirm password"
        }else {
            if (password.equals(confirmPassword)){
                Toast.makeText(context, "Parol mos keldi", Toast.LENGTH_SHORT).show()

            }else{
                editText2.error = "Please the enter the right password"
            }
        }

    }


    fun checkEmail(etEmail: EditText){
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail.text.toString()).matches()){

        }else {
            etEmail.error = "Invalid Email"
        }

    }
}