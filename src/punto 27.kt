fun main(){
    print("ingrese un numero para evaluarlo: ")
    val a= readLine()!!.toInt()
    val b= a%2
    if (b ==0){
        print("El numerl es par")
    }else{
        print("El numero no es par: ")
    }

}
