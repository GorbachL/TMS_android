package homeWork5

import java.util.*

fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
    return (a <= r && b <= s) || (b <= r && a <= s) ||
            (a <= r && c <= s) || (c <= r && a <= s) ||
            (c <= r && b <= s) || (b <= r && c <= s)
}

fun main() {
    val a: Int
    val b: Int
    val c: Int
    val r: Int
    val s: Int
    val inp = Scanner(System.`in`)
    println("Brick:")
    print("a=")
    a = inp.nextInt()
    print("b=")
    b = inp.nextInt()
    print("c=")
    c = inp.nextInt()
    println("Rectangular hole:")
    print("r=")
    r = inp.nextInt()
    print("s=")
    s = inp.nextInt()
    if (brickPasses(a, b, c, r, s)) println("Passes!") else println("Doesn't Pass!")
}
