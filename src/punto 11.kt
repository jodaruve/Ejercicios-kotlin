fun main(){
    print("Ingrese el valor de un lado: ")
    val lado= readLine()!!.toFloat()
    val base= (lado*6)-((1/2))
    val area= Math.pow(base.toDouble(),2.toDouble())
    val AreaT= Math.sqrt(area)
    print("El area del hexagono es de: ")
    println(AreaT)
}