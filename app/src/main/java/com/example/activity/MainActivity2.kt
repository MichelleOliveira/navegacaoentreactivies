package com.example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val val1 = intent.getStringExtra("entrada1")
        saida1.text = val1;
        val sp = getSharedPreferences("teste", 0)
        val val2 = sp.getString("entrada2", null)
        saida2.text = val2;
    }
}