package com.imoonx.kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.imoonx.util.XLog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        desc.text = getString(R.string.app_name)
        desc.setOnClickListener {
            Toast.makeText(this, MainActivity::class.simpleName, Toast.LENGTH_LONG).show()
            XLog.e(MainActivity::class.java, MainActivity::class.simpleName ?: "123456")
        }

        //匿名函数
        val sumLambda: (String, String) -> String = { x, y -> x + y }
        XLog.e(MainActivity::class.java, sumLambda("123456", "7890"))

        for (i in 4 downTo 1) XLog.e(MainActivity::class.java, "i=$i")

        val text = """
                    |多行字符串
                    |多行字符串
                    |imoonx
                    """.trimMargin()
        XLog.e(MainActivity::class.java, text)

        when (val x = 3) {
            1 -> {
                XLog.e(MainActivity::class.java, "x == $x")
            }
            2 -> {
                XLog.e(MainActivity::class.java, "x == $x")
            }
            else -> { // 注意这个块
                XLog.e(MainActivity::class.java, "x != 1 , x != 2 x is $x")
            }
        }

        val person = Person()
        person.lastName = "wang"
        XLog.e(MainActivity::class.java, person.lastName)

        person.age = 1
        XLog.e(MainActivity::class.java, "${person.age}")

        person.age = 11
        XLog.e(MainActivity::class.java, "${person.age}")
    }
}