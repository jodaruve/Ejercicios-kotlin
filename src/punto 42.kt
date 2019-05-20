fun main() {
    print("ingrese un numero: ")
    val a = readLine()!!.toInt()

    if (a >= 100000) {
        print("no sebes leer?, mete bien el numero con la condicion dada")
    } else if (0 < a && a < 10) {
        print("el numero tiene 1 digitos")
    } else if (a >= 10 && a < 100) {
        print("el numero es de 2 digitos")
    } else if (a >= 100 && a < 1000) {
        print("El numero es de 3 digitos")
    } else if (a >= 1000 && a < 10000) {
        print("El numero es de 4 digitos")
    } else if (a >= 10000 && a < 100000) {
        print("El numero es de 5 digitos")
    }
}