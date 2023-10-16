/*
Exercício 2
Dado o código abaixo de um Map, imprima seu conteúdo conforme mostrado na saída

val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai",
"Pedro"), Pair("Mãe", "Marcela"),
Pair("Filho", "João"),
Pair("Caçula", "Cadu"),
Pair("Pet", "Paçoca"))


Saida:

Pai: Pedro
Mãe: Marcela
Filho: João
Caçula: Cadu
Pet: Paçoca

 */

fun main(){
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai",
        "Pedro"), Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca"))

    familiaMap.forEach{println("${it.key}: ${it.value}")}
}