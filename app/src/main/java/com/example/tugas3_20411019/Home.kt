package com.example.tugas3_20411019

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnShare)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Implisit Intent
        val url ="https://github.com/eliaitlay"
        val implicitBtnShare =findViewById<Button>(R.id.btnShare)

        implicitBtnShare.setOnClickListener{
            val implicitIntentnt=Intent(Intent.ACTION_VIEW,Uri.parse(url))
            startActivity(implicitIntentnt)
        }
    }
}