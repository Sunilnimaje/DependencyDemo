package com.example.dependencydemo2

open class MathsActivity {
/*    var a = 0
    var b = 0

//    init {
//        this.a = a
//        this.b = b
//    }*/

    fun Addition(a: Int, b: Int): Int {
        return a + b
    }

    fun Subtraction(a: Int, b: Int): Int {
        return a - b
    }

    fun Multiplication(a: Int, b: Int): Int {
        return a * b
    }

    fun Divition(a: Int, b: Int): Float {
        return (a / b).toFloat()
    }


}