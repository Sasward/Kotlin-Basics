
fun main(args: Array<String>) {
    "Hola mi nombre es Sebastian".print()
    println("-------------------")
    var lista = mutableListOf("Hola", "Estas", "Como")
    lista.swap(2,1)
    println(lista)
    println("-----------------------------------")
    // Se crea un objeto Goku de la Clase Guerrero
    var Goku = Guerrero<Any>("Goku","Sayayin", true)
    //Implementando la Extension Function se pone a gritar a Goku

    var Freezer = Guerrero<Any>("Freezer", "Raza de Freezer",false)
    Goku.gritar(Goku.nombre,Goku.esBueno)
    Freezer.gritar(Freezer.nombre,Freezer.esBueno)

}

data class Guerrero<Any>(var nombre: String, var raza: String, var esBueno: Boolean){}

//Extension function para todos los objetos de la clase Guerrero
fun <Any> Guerrero<Any>.gritar(nombre: String,esBueno: Boolean){
    if (esBueno) kotlin.io.println("Soy ${this.nombre} y vengo a acabar a los malos")
    else println("Soy ${this.nombre} y vengo a destruir a los sayayines")
}

fun String.print() {
    println(this)
}

fun <Q> MutableList<Q>.swap(index1: Int, index2: Int) {
    var temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}