fun main(){
    var suma = 0
    var numero: Int

    for(num in 0..9){
        println("--> Por favor ingrese un numero: ")
        numero = readLine()!!.toInt()
        suma = suma + numero
    }
    val promedio = suma / 10
    println("--> la suma de los numeros mostrados es: $suma")
    println("--> El promedio de los numeros ingresados es: $promedio")
}