fun main(){
    var cont100=0
    var cont80=0
    while (cont100<=100 || cont80<=80){
        print("ingrese un numero postivo: ")
        val a= readLine()!!.toFloat()
        if (a>-1){
            if ((a.toInt())%2==0){
                cont100+=1
            }
            else if((a.toInt())==5){
                cont80+=1
            }
        }
        else{
            print("El numero es negativo por lo cual no es valido")
        }
    }
    println ("La cantidad de pares fueron $cont100 \nLa catida de 5 fueron $cont80")
}