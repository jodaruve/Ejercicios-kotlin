fun main(){
    var cont1=0
    var cont2=0
    var cont3=0
    var cont4=0
    print("ingrese un valor: ")
    val ciclo= readLine()!!.toInt()
    while (cont1<=ciclo){
        if (cont1==0){
            cont2+=1
        }else if(cont1<100){
            cont3+=1
        }else{
            cont4+=1
        }
        cont1+=1
    }
    print("La cantidad de numeros que fueron 0 son $cont2 \nLa cantida de numero que fueron menores a 100 son: $cont3 \n y por ultimo los numero mayores a 100 son: $cont4")
}
