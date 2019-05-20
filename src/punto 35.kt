fun main(){
    val list= mutableListOf<Float>()
    for (i in 0..2){
        print("ingrese un valor: ")
        val a= readLine()!!.toFloat()
        list.add(a)
    }
    val mayor= list.max()
    val menor= list.min()
    print("El mayor de los 3 numeros fue: $mayor \nY el menor es $menor")
}