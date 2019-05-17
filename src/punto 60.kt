// 60
fun main(){

    val limite: Int
    var numero = 0

    println("--> Este programa seguira la siguiente secuencia (1 -2 3 -4 5 -6 …) hasta en numero que desee ")

    println("Por favor ingrese el limite de la secuencia: ")
    limite = readLine()!!.toInt()

    for(num in 1..limite + 1) {
        if (num % 2 == 0) {
            numero = num * -1
            println(numero)
        }else{
            println(num)
        }
    }
}