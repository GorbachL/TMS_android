package homeWork5

/*
Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
вернуть строку вида: «21 год», «32 года», «12 лет».
*/

fun main() {
    for (i in 1..200) {
        println(ageDescription(i))
    }
}

fun ageDescription(age: Int): String {
    return when {
        age in 11..14 -> "$age лет"
        age in 111..114 -> "$age лет"
        age % 10 == 0 -> "$age лет"
        age % 10 == 1 -> "$age год"
        age % 10 < 5 -> "$age года"
        else -> "$age лет"
    }
}
