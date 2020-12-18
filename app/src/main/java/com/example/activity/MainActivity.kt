package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun navegar(view: View) {
        val entrada1 = entrada1.text.toString()
        val entrada2 = entrada2.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("entrada1", entrada1)

        val sp = getSharedPreferences("teste", 0)
        val editor = sp.edit()
        editor.putString("entrada2", entrada2)
        editor.apply()
        startActivity(intent)
    }
}