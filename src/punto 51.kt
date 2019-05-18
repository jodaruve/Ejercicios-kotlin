fun main(){
    print("ingrese un texto: ")
    val a= readLine()!!
    val b= a.length
    val c= a[b-2]
    print("La penultima palabra fue: $c")
}