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
        //匿名函数
        val sumLambda: (String, String) -> String = { x, y -> x + y }
        Log.e(MainActivity::class.simpleName, sumLambda("123456", "7890"))
        for (i in 4 downTo 1) Log.e(MainActivity::class.simpleName, "i=$i")
        val text = """
                    |多行字符串
                    |菜鸟教程
                    |多行字符串
                    |Runoob
                    """.trimMargin()
        Log.e(MainActivity::class.simpleName, text)

        when (val x = 3) {
            1 -> {
                Log.e(MainActivity::class.simpleName, "x == $x")
            }
            2 -> {
                Log.e(MainActivity::class.simpleName, "x == $x")
            }
            else -> { // 注意这个块
                Log.e(MainActivity::class.simpleName, "x != 1 , x != 2 x is $x")
            }
        }

        val person = Person()
        person.lastName = "wang"
        Log.e(MainActivity::class.simpleName, person.lastName)

        person.age = 1
        Log.e(MainActivity::class.simpleName, "${person.age}")

        person.age = 11
        Log.e(MainActivity::class.simpleName, "${person.age}")
    }
}