import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}!")
    dayOfWeek()
    println()

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${ if (temperature >50) "fried" else "safe" } fish"
    println(message)

}

fun dayOfWeek() {
    var day = ""          //declarando variável 'day' e inicializando como String

    println("What day is it today?")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) { //utilizando a biblioteca JAVA Calendar para pegar o dia da semana
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
    }

    println("Today is $day!")
}