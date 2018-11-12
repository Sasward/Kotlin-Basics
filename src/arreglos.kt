import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {

    val arreglo:IntArray = intArrayOf(10,9409,389,98,0)
    var listaDeNombres = arrayListOf<String>("sebastian","santiago","Kennier")
    val lista: ArrayList<Double> = arrayListOf(
            90.0,
            232.4,
            45.5
    )

    val listaString: ArrayList<String> = arrayListOf("Hola","¿Cómo","estas?")

    val nume = arreglo[0]
    lista[0] = arreglo[1].toDouble()
    print(lista[0])

    val listamutable = mutableListOf<Int>(2,3,4,5,6,7)
    var c = 5
    listamutable.add(0,c)
    listamutable[6] = 80
    print(listamutable)

}

