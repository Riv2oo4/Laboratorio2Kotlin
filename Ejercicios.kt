fun calcularPromedio(lista: List<Int>): Int {
    if (lista.isEmpty()) {
        throw IllegalArgumentException("La lista no puede estar vacía")
    }

    val suma = lista.reduce { acc, num -> acc + num }
    return suma / lista.size
}
fun isPalindrome(input: String) : Boolean {
    return input == input.reversed()
}

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val promedio = calcularPromedio(numeros)
    println("El promedio es: $promedio")
    val numerosImpares = numeros.filter {it %2 != 0}
    println("Numeros impares $numerosImpares")
    var String = "reconocer"
    println("$String es palíndromo: ${isPalindrome(String)}")
}
