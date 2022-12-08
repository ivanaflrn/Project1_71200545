package com.example.tiketpesawat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kotaAsal = findViewById<Spinner>(R.id.kotaAsal).selectedItem
        val kotaTuj = findViewById<Spinner>(R.id.kotaTuj).selectedItem
        val tgl = findViewById<DatePicker>(R.id.tgl)
        val btnNext = findViewById<Button>(R.id.next)

        btnNext.setOnClickListener {
            val hari = tgl.dayOfMonth.toString()
            val bulan = tgl.month.toString()
            val tahun = tgl.year.toString()
            val semua = hari+"-"+bulan+"-"+tahun

            val intent = Intent(this, Keberangkatan::class.java)
            intent.putExtra("kotaasal", kotaAsal.toString())
            intent.putExtra("kotaTujuan", kotaTuj.toString())
            intent.putExtra("tanggal", semua)
            startActivity(intent)
        }

//        val jam = findViewById<Spinner>(R.id.jam).selectedItem
//        val kelas = findViewById<Spinner>(R.id.kelas).selectedItem
//        val btnSelesai = findViewById<Button>(R.id.selesai)

    }

}
