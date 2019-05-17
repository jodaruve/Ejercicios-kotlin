fun main() {
    print("Ingrese un valor: ")
    val a = readLine()!!.toFloat()
    if (a >= 1) {
        val b = a * 10
        print("El triple del numero es: $b")
    } else{
        val b= a* 1/4
        print("El cuarto del numero es: $b")
    }
}