fun main(){
    print("ingrese el numero a evaluar: ")
    val a= readLine()!!.toFloat()
    if (a>0 ){
        print("es positivo")

    }else if( a.toInt()==0){
        print("es igual a 0")
    }else{
        print("es 0")
    }
}