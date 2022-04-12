package com.nureddinelmas.hiltkotlinexample

import javax.inject.Inject

class SecondInterfaceImplementor @Inject constructor() : MyInterface {
    override fun myprint(): String {
       return "My Second Interface Implementor"
    }
}