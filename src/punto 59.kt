//59
fun main(){

    val veces: Int

    println("--> Este programa le mostrara la cantidad de numeros naturales que usted desee")


    println("--> Por favor ingrese la cantidad de numeros naturaes que quiere ver: ")
    veces = readLine()!!.toInt()
    for(i in 0..veces-1)
        println("Numero natural: $i")

}