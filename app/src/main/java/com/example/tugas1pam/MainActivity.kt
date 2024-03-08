package com.example.tugas1pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_kurang
import kotlinx.android.synthetic.main.activity_main.btn_tambah
import kotlinx.android.synthetic.main.activity_main.et_angka1
import kotlinx.android.synthetic.main.activity_main.et_angka2
import kotlinx.android.synthetic.main.activity_main.tv_hasil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengatur listener untuk tombol "Tambah"
        btn_tambah.setOnClickListener {
            // Mengambil angka dari input pengguna dan mengonversinya ke dalam bentuk string
            val nilai_angka1 = et_angka1.text.toString().toInt()
            val nilai_angka2 = et_angka2.text.toString().toInt()

            // Menjumlahkan dua angka
            val hasil = nilai_angka1 + nilai_angka2

            // Menampilkan hasil penjumlahan di TextView
            tv_hasil.text = hasil.toString()
        }

        // Mengatur listener untuk tombol "Kurang"
        btn_kurang.setOnClickListener {
            // Mengambil angka dari input pengguna dan mengonversinya ke dalam bentuk string
            val nilai_angka1 = et_angka1.text.toString().toInt()
            val nilai_angka2 = et_angka2.text.toString().toInt()

            // Pengurangan dua angka
            val hasil = nilai_angka1 - nilai_angka2

            // Menampilkan hasil Pengurangan di TextView
            tv_hasil.text = hasil.toString()
        }
    }
}