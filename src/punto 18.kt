fun main(){
    print("ingrese el valor de la primera masa: ")
    val m1= readLine()!!.toFloat()
    print("ingrese el valor de la segunda masa: ")
    val m2= readLine()!!.toFloat()
    print("ingrese el valor de la aceleracio: ")
    val aceleracion= readLine()!!.toFloat()
    print("la fuerza 1 es de: ")
    println(m1*aceleracion)
    print("la fuerza 2 es de: ")
    println(m2*aceleracion)
    print("la fuerza total es de: ")
    println((m1*aceleracion)+(m2*aceleracion))
}