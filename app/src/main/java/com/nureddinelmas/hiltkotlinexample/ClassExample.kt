package com.nureddinelmas.hiltkotlinexample

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(@FirstImplementor private val myInterface: MyInterface,
                                       private val gson : Gson,
                                       @SecondImplementor private val mySecondInterfaceImplementor: SecondInterfaceImplementor)
{
    fun myFunction() : String {
        return "Working ${myInterface.myprint()}"
    }


    fun secondFunction() :String{
        return "Working ${mySecondInterfaceImplementor.myprint()}"
    }
}