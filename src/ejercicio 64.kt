fun main(){

    val limite: Int
    var num = 0
    var suma = 0
    var promedio = 0

    println("--> Por favor ingrese la cantidad de numeros que va a digitar: ")
    limite = readLine()!!.toInt()

    for(numero in 0..limite) {
        println("--> Por favor ingrese el numero: ")
        num = readLine()!!.toInt()
        suma = suma + num
        }
    promedio = suma / limite
    println("La suma de los numeros ingresados es: $suma")
    println("El promedio de los numeros ingresados es: $promedio")
    }

