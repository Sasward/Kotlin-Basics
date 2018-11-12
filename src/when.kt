fun main(args: Array<String>) {
    val Goku = Guerrero("Goku", "Saiyan", true)
    val Krillin = Guerrero("Krillin", "Humano", true)
    val Freezer = Guerrero("Freezer", "Raza de Freezer", false)
    whoIs(Goku)
    whoIs(Freezer)
    whoIs(Krillin)
    tipo(Goku)
    tipo(5)
    tipo("Hola, ¿Cómo estas?")

}

fun whoIs(guerrero: Guerrero) {
    when (guerrero.nombre) {
        "Goku" -> println("Hola, soy goku")
        "Freezer" -> println("Malditos saiyans")
        else -> println("Aun no llega nadie")
    }
}
fun rango(nume:Int){
    when(nume){
        in 1..10 -> println("Es un numero del 1 al 10")
        in 10..1000 -> print("Es un número del 10 al 1000")
        else -> println("Maldito Revolucionario")
    }
}

fun tipo(algo:Any){
    when(algo){
        is String -> println("Es un String que dice : $algo")
        is Int -> rango(algo)
        else -> println("Maldito Revolucionario")
    }
}