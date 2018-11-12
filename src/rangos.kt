fun main(args: Array<String>) {
    var decenas = 10
    var unidades = 1
    for (k in 1..10) {
        println("MULTIPLOS DEL $unidades desde el 1 hasta el $decenas")
        for (i in unidades..decenas step unidades) {
            println(i)
        }
        decenas += 10
        unidades++

    }

}