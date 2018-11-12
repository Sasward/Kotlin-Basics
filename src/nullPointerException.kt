fun main(args: Array<String>) {

    var b: String? = "abc"
    b = 90.toString()
    println(b?.length)
    b = null
    println(b?.length)

    var otroGoku :Guerrero? = Guerrero("Hola","Saiyan",true)
    var nombre: String? = otroGoku?.nombre
    println(nombre)
    nombre = null ?: "Estamos nulos"
    println(nombre)
}
