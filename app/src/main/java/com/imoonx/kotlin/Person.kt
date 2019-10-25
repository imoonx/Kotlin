package com.imoonx.kotlin

import android.annotation.SuppressLint

/**
 * Created by 36238 on 2019/10/25 星期五
 */
class Person {

    var lastName: String = "imoonx"
        @SuppressLint("DefaultLocale")
        get() = field.toUpperCase()

    var age: Int = 0
        set(value) {
            field = if (value > 10) {
                -1
            } else {
                value
            }
        }
}