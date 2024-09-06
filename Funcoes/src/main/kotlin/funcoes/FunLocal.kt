package funcoes
/*
* Objetivo deste exercicio e entender as funções locais, e
* também criar funções mais limpa para ter um codigo mais facil
* de entender*/
fun fizzbuzz(start: Int, end: Int): Unit {
    for (k in start .. end){
        if (k % 3 == 0 && k % 5 == 0)
            println("Fizz Buzz")
        else if (k % 3 == 0)
            println("Fizz")
        else if (k % 5 == 0)
            println("Buzz")
        else
            println(k)
    }
}

fun fizzbuzz2(start: Int, end: Int): Unit{

    fun isFizz(k: Int): Boolean = k % 3 == 0
    fun isBuzz(k: Int): Boolean = k % 5 == 0

    for (k in start .. end) {
        if (isFizz(k) && isBuzz(k))
            println("Fizz Buzz")
        else if (isFizz(k))
            println("Fizz")
        else if (isBuzz(k))
            println("Buzz")
        else
            println(k)
    }
}

fun fizzbuzz3(start: Int, end: Int): Unit{

    for (k in  start .. end){

        fun isFizz(): Boolean = k % 3 == 0
        fun isBuzz(): Boolean = k % 5 == 0

        if (isFizz() && isBuzz())
            println("Fizz Buzz")
        else if (isFizz())
            println("Fizz")
        else if (isBuzz())
            println("Buzz")
        else
            println(k)
    }
}

fun fizzbuzz4(start: Int, end: Int): Unit{
    for (k in start .. end){

        fun isFizz(): Boolean = k % 3 == 0
        fun isBuzz(): Boolean = k % 5 == 0

        when{
            isFizz() && isBuzz() -> println("Fizz Buzz")
            isFizz() -> println("Fizz")
            isBuzz() -> println("Buzz")
            else -> println(k)
        }

    }
}
fun main(){
    val result = fizzbuzz(12, 16)
    println(result)

    val result2 = fizzbuzz2(12, 16)
    println(result2)

    val result3 = fizzbuzz3(12, 16)
    println(result3)

    println("Resultado do quarta função")
    val result4 = fizzbuzz4(9, 16)
    println(fizzbuzz4(9, 15))
    println(result4)



}