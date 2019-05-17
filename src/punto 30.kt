fun main(){
    print("valor de la venta: ")
    val valor= readLine()!!.toFloat()
    if (valor<150000){
        val a= valor*0.19
        print("El valor del iva con un 19% tiene un valor de: $a" )
    }else if (valor>150000){
        val a=valor*0.15
        print("el valor del iva del 19% mas el descuento del 5% es de: $a")
    }
}