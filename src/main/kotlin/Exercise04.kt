/*
Exercício 4
Crie uma função de alta ordem genérica (xpto) que receba como parâmetro qualquer uma das duas
funções dadas no exercício 1 (soma e cat) e solte a seguinte saída.

fun main() {
println(xpto(2, 3, ::soma))
println(xpto("Jo", "ão", ::cat))
}

Saída
5
João
 */
fun soma2(i: Int, j: Int) = i + j

fun cat2(i: String, j: String): String = "${i}${j}"


fun main() {
    println(xpto(2, 3, ::soma2))
    println(xpto("Jo", "ão", ::cat2))

    println(xpto(2, 3, ::soma2))
    println(xpto("Jo", "ão", ::cat2))
}

fun <T> xpto(i: T, j: T, operacao: (T, T) -> T) = operacao(i, j)


