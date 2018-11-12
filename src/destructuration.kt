data class Mago(val nombre: String? = null, val magia: String? = null, val gremio: String? = null)
data class Enojado(val grito: String, val fuerza: Boolean, val paguer: Int)

fun enojarse(grito: String, dragonForce: Boolean, power: Int): Enojado {
    if (dragonForce) {
        return Enojado("AHORA SI PUTOS", true, 1000000)
    } else return Enojado("Aun no me enojo", false, 1000)
}

fun main(args: Array<String>) {
    var (name, power, clan) = Mago()
    name = "Natsu"
    power = "Fuego"
    println(name)
    val (grito, force, poder) = enojarse("", false, 1000)
    println(grito)
    println(force)
    println(poder)
}