fun main(){
    try {
       print("ingrese el numero decimal: ")
       val float = readLine()!!.toFloat()
       val entero = float.toInt()
       val sobra = float - entero
       print("El entero de ese numero es: ")
       println(entero)
       print("El flotante de ese numero es: ")
       println(sobra)
   }catch (e:Exception){
       print("A ingresado algo mal, vuelva a intentarlo")
   }
}