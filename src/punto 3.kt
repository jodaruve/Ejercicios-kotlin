
fun main(){
    print("Ingrese un numero:" )
    try {
       val reader = readLine()!!

       val Exponente = 2
       val cuadrado = Math.pow(reader.toDouble(), Exponente.toDouble())
       print("El cuadrado del numero es:  ")
       print(cuadrado)
   }catch(e:Exception){
       print("Error de digitacion")
   }

}