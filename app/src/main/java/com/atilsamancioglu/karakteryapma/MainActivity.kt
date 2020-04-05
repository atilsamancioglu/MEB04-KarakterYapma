package com.atilsamancioglu.karakteryapma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var isim = ""
    private var yas : Int? = null
    private var meslek = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var benimNumaram = 0


    }

    fun test() {
        //Scope - Kapsam

    }

    fun karakterYap(view: View){

        isim = isimText.text.toString()
        meslek = meslekText.text.toString()

        yas = yasText.text.toString().toIntOrNull()
        /*
        if (yas == null) {
            yas = 0
        }

         */

        /*
        yas?.let{
            val karakter = Karakter(isim,yas,meslek)
            textView.text = "İsim: ${karakter.isim} Yaş: ${karakter.yas} Meslek: ${karakter.meslek}"
        }

         */

        if (yas == null) {
            textView.text = "Yaşı Doğru Giriniz"
        } else {
            val karakter = Karakter(isim, yas!!,meslek)
            textView.text = "İsim: ${karakter.isim} Yaş: ${karakter.yas} Meslek: ${karakter.meslek}"
        }


    }

}