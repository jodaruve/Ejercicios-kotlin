fun main(){
    print("Ingrese un numero de 4 digitos: ")
    val a= readLine()!!.toInt()
    val b= a/1000
    val c=b.toInt()
    val d=c*1000
    val e=a-d
    val f=e/100
    val g=f.toInt()
    val h=g*10
    val i=g*100
    val j=e-i
    val k=j/10
    val m= k.toInt()
    val n=m*100
    val ñ=m*10
    val o=j-ñ
    val p=o*1000
    val q=p+c+h+n
    print("El valor ordenado al reves es: $q")


}
