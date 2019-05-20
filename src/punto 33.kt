fun main(){
    val list= mutableListOf<Float>()
    for (i in 0..1){
        print("ingrese un valor: ")
        val a= readLine()!!.toFloat()
        list.add(a)
    }
    val mayor= list.max()
    print("El mayor de los 2 numeros fue: $mayor")
}