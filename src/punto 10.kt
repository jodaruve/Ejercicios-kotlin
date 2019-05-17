fun main(){
    print("Ingrese el valor del radio: ")
    val radio= readLine()!!.toInt()
    val perimetro= 3.14*radio*2
    val area= 2*Math.pow(radio.toDouble(),2.toDouble())
    print("El perimetro del circulo es de: ")
    println(perimetro)
    print("El area es de: ")
    println(area)
}