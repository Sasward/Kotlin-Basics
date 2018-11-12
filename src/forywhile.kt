import org.omg.CORBA.Object

fun main(args: Array<String>) {
    var Warriors = mutableListOf<Any>()
    val Goku = Guerrero("Goku","Saiyan",true)
    val Krillin = Guerrero("Krillin","Humano",true)
    val Freezer = Guerrero("Freezer","Raza de Freezer",false)
    Warriors.run {
        add(Goku)
        add(Freezer)
        add(Krillin)
    }

    for (hola in Warriors) println(hola)

    var sum: Long = 0
    var input: String? = ""
    do {
        println("Ingrese un número")
        input = readLine()
        sum += input?.toLong() ?: 0
    }while(input != "0")

    println("La suma es $sum")



}