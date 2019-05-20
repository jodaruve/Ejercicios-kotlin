fun main(){
    print("Digite un numero: ")
    val a= readLine()!!.toInt()
    print("ingrese un numero: ")
    val b= readLine()!!.toInt()

    if (a>=0 && a<=5 && b>=0 && b<=5) {

        print("$a $b true")
    }
    else{

    print("$a $b false")
    }
}