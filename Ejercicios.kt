// Ejercicio 1
fun calcularPromedio(lista: List<Int>): Int {
    if (lista.isEmpty()) {
        throw IllegalArgumentException("La lista no puede estar vacía")
    }

    val suma = lista.reduce { acc, num -> acc + num }
    return suma / lista.size
}
//Ejercicio 3
fun isPalindrome(input: String) : Boolean {
    return input == input.reversed()
}
fun performOperation(a: Int, b: Int, operation:(Int, Int)-> Int): Int{
    return operation (a,b)
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val promedio = calcularPromedio(numeros)
    println("El promedio es: $promedio")
    //Ejercicio 2
    val numerosImpares = numeros.filter {it %2 != 0}
    println("Numeros impares $numerosImpares")
    var String = "reconocer"
    println("$String es palíndromo: ${isPalindrome(String)}")
    //Ejercicio 4
    val nombres = listOf("Hugo", "Eduardo","Javier")
    val nombresSaludo = nombres.map{"¡Hola, $it !"}

    nombresSaludo.forEach {println(it)}

    //Llamar funcion ejercicio 5
    val suma = {x: Int, y: Int -> x+y}
    val resultado = performOperation(4,3, suma)
    println("Resultado: $resultado")
}
