
fun main(){
    print("ingres la posicion x1: ")
    val x1= readLine()!!.toDouble()
    print("ingrese la posicion x2: ")
    val x2= readLine()!!.toDouble()
    print("ingrese la posicion y1: ")
    val y1= readLine()!!.toDouble()
    print("ingrese la posicon y2: ")
    val y2= readLine()!!.toDouble()
    val acos= 6371* (Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*(Math.cos(y1-y2))))
    print("LA distancia ed de $acos km")



}