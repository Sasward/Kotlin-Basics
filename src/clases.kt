data class Persona(var name: String,var edad:Int,var salario:Int,var nuip:Long) {
}

fun main(args: Array<String>) {
    val sebas = Persona("Sebastian",19,700000,1037669751)
    println("Sebastian tiene ${sebas.edad}")
    sebas.edad = 19
    val sebasGrande = sebas.copy(edad = 28)
    println("Sebastian cumple ${sebas.edad}")
    println(sebas.toString())
    println(sebasGrande.toString())

}