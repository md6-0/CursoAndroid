package com.mdn.androidmaster.ejerciciosAndroidOficial

fun main() {

    val child = 5
    val adult = 28
    val senior = 87
    val other = -34
    val isMonday = true

    println("Price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("Price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("Price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    println("Price for a person aged $other is \$${ticketPrice(other, isMonday)}.")

}

fun ticketPrice(age: Int, isMonday: Boolean): Int = when (age) {
    in 0..12 -> 15
    in 13..60 -> if (isMonday) 25 else 30
    in 61..100 -> 20
    else -> -1
}
