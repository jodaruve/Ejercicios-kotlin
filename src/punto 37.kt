fun main(){
    print("Ingresar un año: ")
    val ano= readLine()!!.toInt()
    if(ano%4==0 || (ano%100!=0 && ano%400==0)){
        print("El año: $ano Es biciesto")
    }
    else{
        print("El año: $ano no es biciesto")
    }
}