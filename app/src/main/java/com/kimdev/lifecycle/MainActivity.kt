package com.kimdev.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var button1: Button
    lateinit var button2: Button

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)

        button1.setOnClickListener {
            textView.text = "${++counter}"
        }

        //q: what is it: View! ?


        button2.setOnClickListener {
            var intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.d("LifeCycle", "First activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle", "First activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "First activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle", "First activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle", "First activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle", "First activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle", "First activity onRestart")
    }
}