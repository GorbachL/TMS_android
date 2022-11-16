package homeWorkKotlinList

/*
* Найти скалярное произведение двух векторов равной размерности,
* представленные в виде списков a и b. Скалярное произведение считать по формуле:
* C = a1b1 + a2b2 + ... + aNbN. Произведение пустых векторов считать равным 0.
*/

fun main() {
    val a = listOf(1, 2, 3)
    val b = listOf(1, 2, 3)
    times(a, b)  //The result is: 14
}

fun times(a: List<Int>, b: List<Int>): Int {
    var result = 0
    var i = 0

    for (element in a) {
        result += element * b[i]
        i++
    }
    println("The result is: $result")
    return result
}