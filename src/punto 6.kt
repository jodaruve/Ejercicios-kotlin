fun main(){
    print("Ingesar el primer numero: ")
    val a= readLine()!!.toInt()
    print("Ingresar el segundo numero: ")
    val b= readLine()!!.toInt()
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(Math.pow(a.toDouble(),b.toDouble()).toInt())

}