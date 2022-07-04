//Podemos	definir	uma	função	como	um	conjunto	de	comandos
//agrupados	 em	 um	 bloco,	 que	 recebe	 um	 nome	 e,	 através	 deste
//nome,	 pode	 ser	 chamado	 em	 outras	 partes	 do	 código.	Na	 prática
//utilizamos	funções	para	separar	melhor	nossa	lógica.

// criando uma função para somar dois números

fun soma(n1: Int, n2: Int): Int{
    return n1+n2
}

// criando outra função para ação de subtração

fun subtracao(n1: Int, n2: Int): Int{
    return n1-n2
}

fun helloWord(texto: String){
    println(texto)
}

//Um	 recurso	 bem	 interessante	 da	 linguagem	 são	 as	 SingleExpression
// functions	 (Funções	de	expressão	única).	Esse	 recurso
//simplifica	 a	 definição	 de	 uma	 função	 quando	 ela	 possui	 apenas
//uma	 linha,	 não	 sendo	 necessário	 o	 uso	 das	 chaves	 (	{	 }	).	 As
//mesmas	funções	 	somar		 e	 	imprimir		 poderiam	 ser	 escritas	 da
//seguinte	maneira:

fun soma2(n1: Int, n2: Int) = n1+n2

fun ola(Texto: String) = println(Texto)

fun main() {
    println(soma(1,2))
    println(subtracao(2,1))

    helloWord("Ola Mundo")

    println(soma2(1,3))

    ola("ola")

}