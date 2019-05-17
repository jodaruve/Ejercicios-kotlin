fun main(){
    print("ingrese el valor de la aceleracion: ")
    val aceleration= readLine()!!.toFloat()
    print("ingrese el valor de la velocidad en segundos: ")
    val velocidad= readLine()!!.toFloat()
    print("La velocidad final del objeto es: ")
    println(aceleration*velocidad)
}