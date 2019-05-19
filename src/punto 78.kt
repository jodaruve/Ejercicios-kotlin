fun main() {
    var bolsas = 0
    var pesos = 0
    var peso = 0
    var pesado = 0
    var liviano = 0
    while (bolsas != -1 && peso<18001) {
        print("ingrese el peso de la bolsa: ")
        val a = readLine()!!.toInt()
        if (a > pesado) {
            pesado = a
        }
        if (a < liviano) {
            liviano = a
        }
        if (a + peso <= 18000) {
            if (a <= 500) {
                if (a > 0 && a < 25) {
                    bolsas += 1
                    peso = peso + a

                } else if (a >= 25 && a < 300) {
                    bolsas += 1
                    peso = peso + a
                    pesos = pesos + (a * 1500)
                } else if (a >= 300 && a <= 500) {
                    bolsas += 1
                    peso = peso + a
                    pesos = pesos + (a * 2500)
                }
            }
            else {
                println("Esta bolsa no sera ingresada a la nave por exceder los 500kg ")
            }
        }
        else {
            println("esto no sera ingresado por excedr el peso de la nave")
        if(peso>18000){
            break
        }
        }
    }
    val promedio= peso/bolsas
    val dolares= pesos/3400
    println("la cantida de bolsas ingresada esde: $bolsas \nEl peso total es de: $peso que en rpomedio seria $promedio \nEl bulto mas pesado fue de $pesado \nEl menos pesado es de $liviano \nEl valor a pagar es de: $pesos que en dolares serian $dolares")
}