package com.example.hello

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnCurrentClick(@Suppress("UNUSED_PARAMETER") v: View) {
        val txtResult = findViewById<TextView>(R.id.txtResult)
        txtResult.text = Date().toString()
    }
}
