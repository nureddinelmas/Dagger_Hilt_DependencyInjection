package com.nureddinelmas.hiltkotlinexample

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
// Constructor Injection
class Muzisyenler @Inject constructor(instrument: Instrument, band: Band) {

    fun sing(){
        println("working...")
    }
}