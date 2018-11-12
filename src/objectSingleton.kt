object validaciones{
    fun pass(passwd: String):Boolean = passwd.isNotEmpty() && passwd.length > 10
    fun esNume(dato: Any): Boolean = dato is Int
}

class Universal{
    fun hablar(habla:String) = print(habla)
    companion object {
        fun Create(): Universal = Universal()
    }
}


fun main(args: Array<String>) {
    val claseUniEnMain = Universal.Create()
    val hola = Universal()
    hola.hablar("HOLAAAAAAAA")
    println("Ingresa una contraseña")
    val input = readLine()
    println(validaciones.pass(input!!))
    println("Ingresa cualquier cosa")
    try {
        val dato:Any = readLine()?.toInt() ?: ""
        println(validaciones.esNume(dato))
    }catch(e:NumberFormatException){
        print(e)}


}