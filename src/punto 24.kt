fun main(){
    print("ingrese la cantidad de dinero a extraer: ")
    val valor= readLine()!!.toInt()
    val bill50=valor/50000
    val residuo50=valor%50000
    val bill20=residuo50/20000
    val residuo20=residuo50%20000
    val bill10=residuo20/10000
    val residuo10=residuo20%10000
    val bill5=residuo10/5000
    val residuo5=residuo10%5000
    println("La cantidad de billetes de 50000 son: $bill50,")
    println("la cantidad de billetes de 20000 es: $bill20")
    println("la cantidad de billetes de 10 es: $bill10")
    println("y la cantidad de billetes de 5000 es: $bill5")
}