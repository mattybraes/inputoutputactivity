package com.example.inputoutact1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.inputoutact1.R.id.nameTxt

class MainActivity : AppCompatActivity() {

     enum class Languages {
        ENGLISH,
        NDEBELE,
        PEDI,
        SOTHO,
        SWATI,
        TSONGA,
        TSWANA,
        VENDA,
        XHOSA,
        ZULU,
        AFRIKAANS
     }
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val clickmebutton = findViewById<Button>(R.id.clickmebutton)
        val welcomeTxt = findViewById<TextView>(R.id.nameTxt)
        val nameTxtField = findViewById<EditText>(R.id.displayTxt)

        // get the button using the id we set on the user interface
        // val clickMeButton = findViewById<Button>(R.id.clickmebutton)

        // add code to the code to the button that happens when it is clicked
        clickmebutton?.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Button clicked", Toast.LENGTH_LONG
            ).show()
            welcomeTxt.text = "Welcome ${nameTxtField.text}"
            //welcomeTxt.text = "Welcome" * nameTxtField.text

            //switching between 2 languages. zulu and english
            val zuluSwitch = findViewById<Switch>(R.id.zuluSwitch)
            //when button is clicked the code is activated
            var greeting: String
            var age = 18
            var zulu: Boolean = zuluSwitch.isChecked
//            if (zulu)
//                greeting = "Sawubona, ${nameTxtField}!"
//            else {
//                if ((nameTxtField.text.toString() == "bobby boon" ||
//                            nameTxtField.text.toString() == "bob")
//                    && age > 18)
//
//                {
//                    greeting = "yo, ${nameTxtField}!"
//
//                    greeting = "Greetings, ${nameTxtField}!"
//                } else {
//                    greeting = "greetings, ${nameTxtField.text}!"
//                }
//
//
//
//                welcomeTxt.text = greeting


            }



            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }