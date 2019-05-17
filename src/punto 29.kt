fun  main(){
    print("ingrese el numero a evaluar: ")
    val a= readLine()!!.toInt()
    val b= a%2
    if(a>0 && b==0 ){
        print("Es par positivo")
    }else if(a<0 && b==0){
        print("Es par negativo")
    }else if(a>0 && b!=0){
        print("Es impar positivo ")
    }else if(a<0 && b!=0){
        print("Es impar negativo")
    }
}