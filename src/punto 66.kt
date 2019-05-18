fun main() {
    print("ingrese un valor entero : ")
    val a = readLine()!!.toInt()
    if (a <= 0) {
        while (a <= 0) {
            print("ingrese un valor enetero: ")
            val b = readLine()!!.toInt()
            if (b > 0) {
                print("El numero es: $b")
                break
            }
        }
    } else {
        print("El numero es: $a")

    }
}