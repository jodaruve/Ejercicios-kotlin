fun main() {
    var a = 0
    print("Ingrese el numero de hileras a imprimir: ")
    val n= readLine()!!.toInt()
    for (i in 0..n){
        for(l in 0..i){
            val z=i+l
            println(z.toString())

        }
        println("")

        a=a+1
    }
}