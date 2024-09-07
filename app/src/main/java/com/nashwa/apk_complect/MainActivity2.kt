package com.nashwa.apk_complect

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var kalkulator: Button
    lateinit var Loginpage: Button
    lateinit var listView : Button
    lateinit var btnRvbuku : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        kalkulator = findViewById(R.id.kalkulator)
        Loginpage = findViewById(R.id.Loginpage)
        listView = findViewById(R.id.listView)
        btnRvbuku = findViewById(R.id.btnRvbuku)

        kalkulator.setOnClickListener() {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        Loginpage.setOnClickListener(){
            val intent = Intent(this, loginPage::class.java)
            startActivity(intent)
        }
        listView.setOnClickListener(){
            val intent = Intent(this, list_view::class.java)
            startActivity(intent)
        }
        btnRvbuku.setOnClickListener(){
            val intent = Intent(this, RecycleviewActivity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}