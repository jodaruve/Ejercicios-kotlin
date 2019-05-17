fun main(){
    print("Ingrese la altura: ")
    val h= readLine()!!.toDouble()
    val g=10
    val vo=0
    val base=vo+(2*g*h)
    val vf= Math.sqrt(base)
    val t= (vf*vo)/g
    print("El tiempo de caida es de $t")

}