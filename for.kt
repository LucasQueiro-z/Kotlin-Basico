fun main() {


    // percorrendo uma lista com o FOR

    // criando lista não mutavel
    val lista = listOf(1,2,3,4)

    // usando for e imprimindo um valor por vez
    for(i in lista){
        println(i)
    }

    println("*********************")

    for((indice	,valor)	in	lista.withIndex()){
        println("indice:	$indice		valor:	$valor")
    }

}