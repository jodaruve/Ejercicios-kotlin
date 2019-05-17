fun main(){
    print("ingrese un texto: ")
    val a= readLine()!!
    val b= a.length
    val c= a[b-2]
    print("LA penultima palabra fue: $c")
}