fun main() {

    // Utilizando a função filter()

    // A funçao filter Ex:
    // Vamos	supor	que
    //nesta mesma lista	 nós quiséssemos aplicar um	 filtro	 e	 obter
    //somente	números	pares.	Isso	é	possível	com	o	seguinte	código:

    // criando lista mutável

    val lista = mutableListOf(1,2,3,4)

    // pegando numeros pares

    val numerosPares = lista.filter { it % 2 == 0 }

    // imprimindo numeros pares da lista

    println(numerosPares)

}