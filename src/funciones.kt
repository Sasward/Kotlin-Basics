fun suma(x: Int, y: Int): Int = x + y
fun max(x: Int, y: Int): Int = if (x > y) x else y
fun main(args: Array<String>) {
    val y = 5
    val x = 90
    println("La suma de $y y $x es: ${suma(x, y)}")
    println("el número mas grande entre $x y $y es: ${max(y, x)}")
}
