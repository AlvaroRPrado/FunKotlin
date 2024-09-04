package funcoes

object Rectangle{
    fun printArea(with: Int, height: Int): Unit{
        val area = calucuteArea(with, height)
        println("Essa area é :$area")
    }

    fun calucuteArea(with: Int, height: Int): Int{
        return with * height
    }
}

fun main(){

    val string = "Hello"
    val length = string.take(3)
    println(length)
    println()
    val  result = Rectangle

    println(result.printArea(88, 68))
    println()
    println(result.printArea(9, 6))

}