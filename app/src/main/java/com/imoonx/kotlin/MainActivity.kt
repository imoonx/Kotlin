package com.imoonx.kotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        desc.text = getString(R.string.app_name)
        desc.setOnClickListener {
            Toast.makeText(this, MainActivity::class.simpleName, Toast.LENGTH_LONG).show()
            Log.e(MainActivity::class.simpleName, MainActivity::class.simpleName ?: "123456")
        }
    }
}