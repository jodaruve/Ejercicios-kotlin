fun main() {

    val list = mutableListOf<Float>()
    var cont=1
    for (i in 0..4) {
        print("Ingrese la nota: ")
        val a = readLine()!!.toFloat()
        list.add(a)
        cont+=1

    }
    val promedio= list.average()
    if (promedio>=0 && promedio<=5){
        if (promedio>=4.5 ){
            print("Felicitaciones aprobo con un promedio de $promedio")

        }
        else if(promedio<4.5 && promedio>=3){
            print("paso con un promedio de $promedio")
        }
        else if(promedio<3 && promedio>2 ){
            print("perdio  pero puede habilitar")
        }
        else{
            print("Fuera de la universidad")
        }
    }

}
