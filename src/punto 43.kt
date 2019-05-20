fun main() {
    var cont = 0

    var cont1 = 0

    var cont2 = 0

    for (i in 1..4) {
        if (i == 1) {
            print("ingrese un numero: ")
            val a = readLine()!!.toInt()
            cont += a
        }
        if (i == 2) {
            print("ingrese un numero: ")
            val b = readLine()!!.toInt()
            cont1 += b
        }
        if (i == 3) {
            print("ingrese un numero: ")
            val c = readLine()!!.toInt()
            cont2 += c
        }
    }
    if (cont < cont1 && cont1 < cont2) {
        print("los numeros estan acendiendo")
    } else if (cont > cont1 && cont1 > cont2) {
        print("los numero decienden ")
    } else {
        print(" no se puede determinar")
    }
}