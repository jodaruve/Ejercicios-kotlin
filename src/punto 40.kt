fun main(){
    print("digiste ususario: ")
    val a= readLine()!!
    print("digite contraseña: ")
    val b= readLine()
    val usuario="pancho@gmail.com"
    val contrasena="panchoConQueso2000"
    if (a!=usuario){
        print("El usuario es incorrecto")
    }
    else{
        print("El usuario es correcto")
    }


    if (b!=contrasena){
        print("la contraseña no es valida")
    }
    else{
        print("la contraseña es valida")
    }
}