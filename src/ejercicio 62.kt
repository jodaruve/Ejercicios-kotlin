//61
fun main(){

    val inicio: Int
    val final: Int
    var suma = 0

    println("--> Este programa le mostrara los numeros naturales con base en el rango ingresado. Tenga en cuenta que el inicio del rango debe ser menor que el final")
    println("--> Por favor ingrese el inicio del rango: ")
    inicio = readLine()!!.toInt()
    println("--> por favor ingrese el fianl del rango: ")
    final = readLine()!!.toInt()

    if(inicio < final) {
        for (numero in inicio..(final)){
            suma = suma + numero
            println("Numero natural: $numero")
        }
        println("La suma de los numeros naturales mostrados es: $suma")
    }
    else
        println("El inicio del rango es mayor que el final. Por favor intentelo nuevamente")
}
