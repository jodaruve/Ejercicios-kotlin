fun main(){
    print("ingrese un valor: ")
    val uno= readLine()!!.toFloat()
    print("ingrese un valor: ")
    val dos= readLine()!!.toFloat()
    print("ingrese un valor: ")
    val tres= readLine()!!.toFloat()
    if(uno+dos>tres){
        print("la suma del priemo por el segundo es mayor al tercero")
    }
    else if(tres> uno+dos){
        print("El tercero es mayor a las suma del primero mas el segundo")

    }
    else{
        print("son iguales")
    }


}