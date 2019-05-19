fun main(){
    var inicio=0
    var pares= 0
    var impares=0
    var postivos=0
    var negativos =0
    var multi8=0
    print("ingrese un numero para el rango de evaluacion: ")
    val ciclo= readLine()!!.toInt()
    while (inicio<=ciclo){
        if(inicio%2==0){
            pares+=1
        }
        else if(inicio%2!=0){
            impares+=1
        }
        else if(inicio%8==0){
            multi8+=1
        }
        else if(inicio<0){
            negativos+=1
        }
        else if(inicio>0){
            postivos+=1
        }
       inicio+=1
    }
    print("Los numero paraes fueron: $pares \nLos numeros impares fueron: $impares \nLa cantida de positivos fueron:$postivos \nLa cantida de negativos fueron: $negativos \nY por ultimo la cantida de multiplos de 8 fueron: $multi8")
}