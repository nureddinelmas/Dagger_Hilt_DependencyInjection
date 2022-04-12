package com.nureddinelmas.hiltkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var lars: Muzisyenler

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var instrument = Instrument()
        var band = Band()
        val  james = Muzisyenler(instrument, band)
        james.sing()

         */

        lars.sing()

        println(myClass.myFunction())
        println(myClass.secondFunction())


    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment(){
    @Inject
    lateinit var sami : Muzisyenler
}