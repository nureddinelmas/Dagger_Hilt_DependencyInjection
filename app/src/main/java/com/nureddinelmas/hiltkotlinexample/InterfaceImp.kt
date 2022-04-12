package com.nureddinelmas.hiltkotlinexample

import javax.inject.Inject

class InterfaceImp @Inject constructor() : MyInterface {

    override fun myprint(): String {
        return "Merhaba Interface"
    }
}