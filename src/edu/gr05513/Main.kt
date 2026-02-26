package edu.gr05513

import edu.gr05513.math.Complex

fun main() {
    val z1 = Complex(1.0, 2.0) // 1 + 2i
    val z2 = Complex(2.0, -3.0) // 2 - 3i
    val z3 = Complex(3.0) // 3
    val z4 = Complex(im = -1.0) // -i
    val z5 = Complex(im = 1.0) // i
    val z6 = Complex(im = 2.0) // 2i
    println(z1)
    println(z2)
    println(z3)
    println(z4)
    println(z5)
    println(z6)

    println(z1 + z2)
    println(z1 - z2)
    println(z1 * z2)
    // TODO: Добавить
    // println(z1 / z2) (div)
    // z1 += z2 (plusAssign)
    // z1 -= z2
    // z1 *= z2
    // z1 /= z2

    // z1.abs() (нахождение модуля комплексного числа)
    // z1.arg() (аргумент комплексного числа)
    // z1.conjugate() (сопряженное комплексное число)
}