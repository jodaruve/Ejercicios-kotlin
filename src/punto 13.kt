fun main(){
    print("Ingrese el valor 1: ")
    var a= readLine()!!
    print("Ingrese el valor 2: ")
    var b= readLine()!!
    print(a)
    println(b)
    var c=a
    a= b
    b = c
    print(a)
    println(b)

}