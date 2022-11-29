fun main(args: Array<String>) { // 'args' é passado via "Program Arguments"
    println("Good ${if (args[0].toInt() < 12) "morning" else "night"}, Kotlin") // utiliza-se o '$' para chamar um parâmetro (variável, constante) ou mesmo um método, usando entre "{ ]"
}