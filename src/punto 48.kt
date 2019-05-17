fun main(){
    print("ingrese la cantidad de numeros que ingresara: ")
    val numeros= readLine()!!.toInt()
    var list= mutableListOf<String>()
    for (i in 1..numeros){
        print("Ingrese el numero: ")
        val ingreso= readLine()!!
        list.add(ingreso)
    }
    println(list)
    println(list.reversed())
}