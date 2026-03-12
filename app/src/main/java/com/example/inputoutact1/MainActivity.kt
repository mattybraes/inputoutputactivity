package com.example.inputoutact1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickmebutton =findViewById<Button>(R.id.clickmebutton)
        val welcomeTxt = findViewById<TextView>(R.id.displayTxt)
        val nameTxtField = findViewById<EditText>(R.id.nameTxt)


        // get the button using the id we set on the user interface
        // val clickMeButton = findViewById<Button>(R.id.clickmebutton)

        // add code to the code to the button that happens when it is clicked
        clickMeButton?.setOnClickListener {
            Toast.makeText(this@MainActivity,
                   "Button clicked", Toast.LENGTH_LONG).show()
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}