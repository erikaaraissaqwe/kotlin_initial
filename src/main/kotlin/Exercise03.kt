/*
Exercício 3
Dadas as funções abaixo e as chamadas na função main. Crie duas funções (foo e bar) de alta ordem
que recebam essas funções como parâmetro e soltem a seguinte saída.

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}$
{j}" fun main() {
println(foo(10, 20, ::soma))
println(bar("Ped", "ro", ::cat))
}

Saída
30
Pedro

 */

fun soma(i: Int, j: Int) = i + j

fun cat(i: String, j: String): String = "${i}${j}"


fun main() {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
    println(foo(340, 20, ::soma))
    println(bar("Ped", "ro Teste", ::cat))
}

fun bar(s: String, s1: String, operacao: (String, String) -> String) = operacao(s, s1)

fun foo(int1: Int, int2: Int, operacao: (Int, Int) -> Int) = operacao(int1, int2)

