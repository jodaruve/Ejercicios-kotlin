fun main(){
    print("Primera nota: ")
    val nota1= readLine()!!.toFloat()
    print("Segunda nota: ")
    val nota2= readLine()!!.toFloat()
    print("Tercera nota: ")
    val nota3= readLine()!!.toFloat()
    print("Cuarta nota: ")
    val nota4= readLine()!!.toFloat()
    print("Quinta nota: ")
    val nota5= readLine()!!.toFloat()
    print("El resultado de su promedio es: ")
    println(((nota1*0.15)+(nota2*0.20)+(nota3*0.15)+(nota4*0.30)+nota5*0.20))
}