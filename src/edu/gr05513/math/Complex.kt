package edu.gr05513.math

import kotlin.math.absoluteValue

// re + i * im
class Complex(
    var re: Double = 0.0,
    var im: Double = 0.0,
) {

    operator fun plus(other: Complex): Complex {
        return Complex(this.re + other.re, im + other.im)
    }

    operator fun minus(other: Complex): Complex {
        return Complex(this.re - other.re, im - other.im)
    }

    // z1 * z2 = (a + b i)(c + d i) = ac + adi + bci - bd = (ac - bd) + (ad + bc)i
    operator fun times(other: Complex): Complex {
        return Complex(
            this.re * other.re - this.im * other.im,
            this.re * other.im + this.im * other.re,
        )
    }

    override fun toString(): String = buildString{
        if (re != 0.0 || im == 0.0) {
            append(re)
        }
        if (im != 0.0){
            if (im > 0.0) {
                if (re != 0.0) append("+")
            }
            else append("-")
            if (im.absoluteValue != 1.0) {
                append(im.absoluteValue)
            }
            append("i")
        }
    }
}