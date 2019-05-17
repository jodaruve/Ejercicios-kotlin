fun main(){
    print("Ingrese el valor de la aceleracion: ")
    val aceleracion= readLine()!!.toFloat()
    print("Ingrese el valor de tiempo en seg: ")
    val tiempo= readLine()!!.toFloat()
    val respuesta= (aceleracion*Math.pow(tiempo.toDouble(), 2.toDouble()))/2
    print("El valor de la distancia es de: $respuesta")
}