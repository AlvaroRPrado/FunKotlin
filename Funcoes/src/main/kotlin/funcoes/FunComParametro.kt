package funcoes

//Uma função com dois parâmetros Inteiro e o tipo de retorno também é Inteiro:
fun sum(a: Int, b: Int): Int {
    return a + b
}

//Um corpo de função pode ser uma expressão. Seu tipo de retorno é inferido:
fun sum2(a: Int, b: Int) = a + b

//Uma função que não retorna nenhum valor significativo:
fun printSum(a: Int, b: Int): Unit {
    println("soma de $a + $b é ${a + b}")
}
fun main(){
val valor = sum2(23, 26)

    println(sum(43, 21))
    println()
    println("valor: $valor ")
    println()
    println(printSum(34, 355))

}