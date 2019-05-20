fun main(){
    val list= mutableListOf<Float>()
    for (i in 0..2){
        print("ingrese un valor: ")
        val a= readLine()!!.toFloat()
        list.add(a)
    }
    val mayor= list.max()
    print("El mayor de los 3 numeros fue: $mayor")
}