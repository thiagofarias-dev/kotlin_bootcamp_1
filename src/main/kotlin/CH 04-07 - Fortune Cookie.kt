fun main() {
    for (i in 1..10) {                          // laço para repetição de 10 vezes
        val fortune = getFortuneCookie()            // chama a função que retorna o conteúdo do cookie
        println("Your fortune is: $fortune")
        if (fortune.contains("Take it easy")) break  // sai do laço caso a variável contenha "Take easy"
    }
}

fun getFortuneCookie(): String {
    val fortuneList = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1       // recebe a entrada do usuário, transforma para Int, se for nulo, seta o valor em 1
    return fortuneList[birthday.rem(fortuneList.size)]      // retorna o valor do cookie com base no index do array, que é escolhido pelo restante da divisão
}
