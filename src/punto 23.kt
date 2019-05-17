fun main(){
    print("ingrese el valor en seg: ")
    val seg= readLine()!!.toFloat()
    val min= seg/60
    val hora= min/60
    print("La respuesta es: $hora : $min : $seg")

}