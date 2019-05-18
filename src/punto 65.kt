fun main() {

    var num: Int
    var pares = 0
    var impares = 0
    var promedio_p = 0
    var promedio_i = 0
    var cont_p = 0
    var cont_i = 0

    try {
        println("--> Bienvenido. Este programa funcionara mientras el numero ingresado sea diferente de 0 ")
        print("--> Por favor ingrese un numero ")
        num = readLine()!!.toInt()

        while (num != 0) {
            if (num % 2 == 0) {
                pares = pares + num
                cont_p = cont_p + 1
            } else {
                impares = impares + num
                cont_i = cont_i + 1
            }
            println("--> Por favor ingrese un numero ")
            num = readLine()!!.toInt()
        }
        promedio_p = pares / cont_p
        promedio_i = impares / cont_i
        println("El promedio de los numeros pares es: $promedio_p")
        println("El promedio de los numeros impares es: $promedio_i")

    }catch (e:Exception){
        println("error de digitacion")
    }
}