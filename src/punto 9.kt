fun main(){
    print("cuanto fue el valor de la compra?: ")
    val compra= readLine()!!.toInt()
    val iva = compra*0.16
    print("El valor de la compra fue: ")
    print(compra)
    print(" el cual tiene un iva de: ")
    print(iva)
    print(" y el valor total es de: ")
    print(compra+iva)
}