fun main(){
    print("ingrese la masa del objeto: ")
    val masa= readLine()!!.toFloat()
    val velluz=299792458
    val respuesta= masa*(Math.pow(velluz.toDouble(),2.toDouble()))
    print("La energia del objeto es de: $respuesta")
}