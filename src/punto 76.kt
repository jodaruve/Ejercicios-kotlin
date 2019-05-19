fun main(){
    var contador=0
    var divison=0
    print("ingrese el valor que quiere evaluar: ")
    val numerador= readLine()!!.toInt()
    while(contador<=numerador){
        contador+=1
        if(numerador%contador==0){
            println("un factor es $contador")
            divison+=1

        }

    }
    print("La cantida de factores es los cuales se puede dividir es: $divison")
}