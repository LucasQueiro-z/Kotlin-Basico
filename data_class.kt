//Durante	 o	 desenvolvimento	 de	 software,	 é	 muito	 comum
//utilizar	classes	de	dados.	São	classes	que	geralmente	não	possuem
//nenhum	método,	somente	propriedades,	e	nos	ajudam	a	transitar	e
//organizar	os	dados	em	uma	aplicação.
//Imagine	a	modelagem	de	um	usuário	de	um	aplicativo.	Vamos
//supor	 que	 este	 usuário	 terá	 um	nome,	 um	 e-mail	 e	 também	 uma
//senha.	 Podemos	modelar	 uma	 classe	 para	isso	 e,	 como	 será	 uma
//classe	 somente	 para	guardar	 essas	informações,	 ela	pode	 ser	 uma
//data	class	.

//A	 grande	 vantagem	 das	 classes	 de	 dados	 em	 Kotlin	 é	 a	 sua
//simplificação	 de	 implementação.	 Podemos	 criar	 essa	 classe
//somente	com	uma	linha	de	código!	Veja:

data class usuario(var nome: String, var email: String, var senha: String)

val novo_usuario = usuario("Lucas", "lucas@gmail.com", "123")

fun main() {

    println(novo_usuario)

}