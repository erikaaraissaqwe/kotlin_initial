/*
Exercício 5
Dadas as funções abaixo:
1. Na função main, faça chamadas normais das funções de alta ordem passando as funções soma,
multiplica e raizQuadrada como parâmetro de acordo com a equivalência dos parâmetros.
2. Na função main, faça chamadas das funções de alta ordem passando expressões lambdas
equivalentes as funções soma, multiplica e raizQuadrada.
 */

// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun soma1(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}
// Main
fun main() {
    println("Chamadas do primeiro passo")
    // 1. Chamadas do primeiro passo
    println(processaInteiros(6, 9, ::soma1))
    println(processaInteiros(5, 87,::multiplica))
    println(processaInteiro(25, ::raizQuadrada))


    println("\nChamadas do segundo passo - Parte 1")
    // 2. Chamadas do segundo passo
    println(processaInteiros(6, 9) { a, b -> a + b})
    println(processaInteiros(5, 87) { a, b -> a * b})


    println(processaInteiro(25) { num ->
        for (n in 1..num)
            if (n * n == num) return@processaInteiro n

        return@processaInteiro -1
    })

    //equivalentes
    println("\nChamadas do segundo passo - Parte 2")
    println(processaInteiros(6, 9) { a, b -> soma(a, b)})
    println(processaInteiros(5, 87) { a, b -> multiplica(a, b)})

    println(processaInteiro(25) {a -> raizQuadrada(a)})

}