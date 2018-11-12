fun main(args: Array<String>) {
    val Goku = Guerrero<Any>("Goku", "Saiyan", true)
    val Krillin = Guerrero<Any>("Krillin", "Humano", true)
    val Freezer = Guerrero<Any>("Freezer", "Raza de Freezer", false)
    whoIs(Goku)
    whoIs(Freezer)
    whoIs(Krillin)
    println("Ingrese un número entero")
    var nume:Int = readLine()!!.toInt()
    rango(nume)
}

fun whoIs(guerrero: Guerrero<Any>) {
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