fun saludo(saludo: String = "Hola a todos") {
    println(saludo)
}

fun otrafuncion(num: Int = 0, bool: Boolean = true) {

}

fun main(args: Array<String>) {
    saludo()
    saludo("Alv todos que mas guey")
    otrafuncion()
    otrafuncion(bool = false)
    otrafuncion(90,false)
    otrafuncion( bool = true ,num=90)
}