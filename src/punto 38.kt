fun main(){

    var cont1=100000
    print("poner la cantidad de kilometrsoa recorrer. ")
    val a= readLine()!!.toInt()
    print("La cantidad de dias de estancias: ")
    val b= readLine()!!.toInt()
    if (a>=2) {
        cont1 = cont1 + (5000 * (a - 1))
    }
    if (a>10000) {
        cont1 = cont1 * 85/100
    }
    println("El calor de su pasaje sera: ",cont1)
}