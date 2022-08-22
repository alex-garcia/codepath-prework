package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //User can tap a button to change the text color of the label
        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Alex", "Tapped on button")
            //User can tap a button to change the text color of the label
            findViewById<TextView>(R.id.textView).setTextColor( getResources().getColor(R.color.white))
        }

    }
}