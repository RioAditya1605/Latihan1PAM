package com.example.tugas1pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.btn_kurang
import kotlinx.android.synthetic.main.activity_main.btn_tambah
import kotlinx.android.synthetic.main.activity_main.tv_hasil

class MainActivity : AppCompatActivity() {
    private var hitung = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCounter = findViewById<TextView>(R.id.tv_hasil)

        textViewCounter.text = hitung.toString()

        val buttontambah = findViewById<Button>(R.id.btn_tambah)
        val buttonkurang = findViewById<Button>(R.id.btn_kurang)

        buttontambah.setOnClickListener {
            hitung++
            textViewCounter.text = hitung.toString()
        }

        buttonkurang.setOnClickListener {
            hitung--
            textViewCounter.text = hitung.toString()
        }

    }
}