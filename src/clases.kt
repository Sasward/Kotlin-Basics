data class Persona(var name: String = "", var edad: Int = 0, var salario: Int = 0, var nuip: Long = 0) {
}

fun main(args: Array<String>) {
    val sebas = Persona("Sebastian", 19, 700000, 1037669751)
    val hola = Persona("", 0, 0, 0)
    var prueba = Persona()
    hola.name = "hola"
    hola.edad = 90
    hola.nuip = 43687226
    hola.salario = 1200000
    println("Sebastian tiene ${sebas.edad}")
    sebas.edad = 19
    val sebasGrande = sebas.copy(edad = 28)
    println("Sebastian cumple ${sebas.edad}")
    println(sebas.toString())
    println(hola.toString())
    println(prueba.toString())

}