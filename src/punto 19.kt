fun main(){
    print("ingres la posicion x1: ")
    val x1= readLine()!!.toFloat()
    print("ingrese la posicion x2: ")
    val x2= readLine()!!.toFloat()
    print("ingrese la posicion y1: ")
    val y1= readLine()!!.toFloat()
    print("ingrese la posicon y2: ")
    val y2= readLine()!!.toFloat()
    val base= ((x2-x1)+(y2-y1))
    val respuesta= Math.sqrt(base.toDouble())
    print("La distancia es de: $respuesta")
}