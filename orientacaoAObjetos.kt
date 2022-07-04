//Para	 se	 criar	 um	 objeto	 em	Kotlin	 devemos	 criar	 uma classe.
//Uma	 classe	 é	 onde	 colocaremos	 a	 programação	 do	 objeto.
//Programaremos	 suas	 propriedades	 e	 seus	 métodos	 e,	 através	 da
//classe,	podemos	criar	instâncias	deste	objeto.	Pense	na	classe	como
//um	molde	para	criação	do	objeto,	de	modo	que	na	programação	eu
//posso	ter	uma	classe	e,	desta	classe,	criar	N	objetos.
//Para	se	criar	uma	classe	em	Kotlin	utilizamos	a	palavra		class
//seguida	pelo	nome	da	classe,	veja	um	exemplo:

open class Carro{

//    Toda	a	programação	da	classe	ficará	entre	os	parênteses	(	{	}	)
//    que	 indicam	 seu	 início	 e	 fim.	 Para	 definir	 suas	 propriedades,
//    podemos	criar	variáveis	em	seu	escopo:

    var cor: String = ""
    var modelo: String = ""

    // criando os metodos

    fun acelerar(){
        println("${this.modelo} Acelerando")
    }


    fun frear(){
        println("${this.modelo} Freando")
    }

//    Desta	 forma,	 implementamos	 2	 métodos	 na	 classe,	 o
//    acelerar		e	o		frear	.	Perceba	 que	a	Programação	Orientada	a
//    Objetos	simplesmente	é	uma	abstração,	nesse	caso,	uma	abstração
//    de	um	carro.

}

//O	conceito	de	herança	em	OO	é	bem	parecido	com	o	conceito
//de	herança	no	mundo	 real.	Assim	como	uma	pessoa	pode	herdar
//características	genéticas	de	seus	pais,	em	programação,	uma	classe
//pode	herdar	características	e	métodos	de	outra	classe!
//Para	 esse	 caso,	 seria	 a	 solução	 perfeita.	 Poderíamos	 então	 criar
//uma	nova	classe		CarroEspecial		 e	fazer	 uma	herança	 da	 classe
//Carro		e	somente	implementar	as	propriedades	e	métodos	novos.


//Desta	forma,	a	classe		CarroEspecial		herda	automaticamente
//todas	as	propriedades	e	métodos	da	classe		Carro	,	e	implementa
//um	método	novo.	Mas	para	isso	funcionar,	a	classe		Carro		 deve
//permitir	a	explicitamente	que	se	faça	herança	dela.
//Para	 isso,	 devemos	 utilizar	 a	 palavra	 	open		 na	 definição	 da
//classe,	 assim:	 	open	 class	 Carro

class carroEspecial : Carro(){
    fun fazerDrift(){
        println("${this.modelo} esta Fazendo Drift")
    }
}

fun main() {
//    o.	A	grande	vantagem	dessa	forma	de	programar	é	que,
//    agora,	 sempre	 que	 eu	 quiser	 utilizar	 este	 objeto,	 basta	 criar	 uma
//    instância	dele:		val	c	=	Carro()	,	então	através	da	variável		c		eu
//    tenho	acesso	às	propriedades	e	métodos:

    var carro1 = carroEspecial()
    carro1.modelo = "Nissan Skyline"
    carro1.fazerDrift()

}