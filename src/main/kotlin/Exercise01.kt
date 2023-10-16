/*
Exercício 1
Dado o código abaixo, a partir da lista já criada crie uma lista que contenha somente os cursos que
tenham a palavra Sistemas em qualquer parte do nome. Imprima essa nova lista no formato dado
como exemplo.

val listaCursos: MutableList<String> = mutableListOf(
"Sistemas para Dispositivos Móveis",
"Análise e Desevolvimento de Sistemas")
listaCursos.add("Técnico em Informática para Internet")
listaCursos.add("Manutenção de Aeronaves")
listaCursos.add("Técnico em Células")
listaCursos.add("Processos Gerenciais")

Saída

0 – Sistemas para Dispositivos Móveis
1 – Análise e Desenvolvimento de Sistemas

*/

fun main(){
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos de sistemas Gerenciais")
    listaCursos.add("Processos Gerenciais")
    listaCursos.add("Técnico em Células SISTEMAS 2")

    listaCursos.filter { nome -> nome.contains("Sistemas", ignoreCase = true) }.forEachIndexed{ index, nome -> println("$index - $nome") }
}

