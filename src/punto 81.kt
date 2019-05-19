fun main(){
    var x=""
    print("ingrese un numero: ")
    val n= readLine()!!.toInt()
    for (i in 0..n){
        for(W in 0..i-1){
            x=x+"@"

        }
        x=x+"\n"
    }
    print(x)
}