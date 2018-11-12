fun main(args: Array<String>) {
    val c = "Hola"
    definetipo(c)
}

fun definetipo(data: Any){
    if (data is String){
        println(data.length)
    }
    else if(data is Int){
        print(data*3)
    }
    else if(data is Boolean) {
        print(data.toString())
    }
}