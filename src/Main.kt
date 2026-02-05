//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//    val texto = "Boa tarde bolsonaro"

//    println(texto.length)
//    println(texto.uppercase())
//    println(texto.contains("bolsonaro"))

//    val nome = "joao"
//    val idade = 25
//
//
//    println("Boa tarde $nome! amanha voce faz ${idade+1} anos!" )


//    val poema = """
//            Mussum Ipsum, cacilds vidis litro abertis.
//            Mussum Ipsum, cacilds vidis litro abertis.
//            Mussum Ipsum, cacilds vidis litro abertis.
//        """.trimIndent()
//
//    println(poema)


////////////////////////////////////////////////////////////////

//    val letra = 'j'
//
//
//
//    println("O nome joao começa com a letra $letra")


//////////////////////////////////////////////////
//    val corinthiasAcesso = false
//    val saopauloAcesso = true
//
//    println(corinthiasAcesso.or(saopauloAcesso))



///////////////////////////////////////////////////
//    val populacao = 2_000_000_000L
//    println(populacao)



//////////////////////////////////////////////////
//    val peso = 73.1F

//    val x: Int = 10
//    val z = 5.0
//    val h = 10
//
//    val resultado = h / z
//    val y: Double = x.toDouble()
//
//        println(resultado)

/////////////////////////////////////////////////
//
//    val idade = 17
//
//
//    var mensagem =
//    if (idade >= 18){
//        println("Boa")
//        "maior de idade"
//    }else{
//        println("Mals")
//        "menor de idade"
//    }
//
//
//    println(mensagem)



    ////////////////////////////////////////////////////////////////




//    val dia = 2
//
//    when (dia) {
//
//        1 -> { println(texto); println("dia: $dia/ou/Domingo ") }
//        2 -> println("dia: $dia/ou/Segunda")
//        3 -> println("dia: $dia/ou/Terça")
//        else -> println("outro dia ?")
//    }




   /////////////////////////////////////////////////////////////////





//    val nota = 7
//
//    val mensage = when (nota) {
//
//        10, 9, 8 -> println("nota: $nota Parabéns otima nota continue assim!!!")
//        7,6 -> println("nota: $nota Passou de ano continue assim!!!")
//        5 -> println("nota: $nota Passou de ano mais tente melhorar")
//        else -> println("nota: $nota Reprovado!!!")
//    }
//    println(mensage)



 ///////////////////////////////////////////////////////////////////////

//    var texto: String? = "Joao"
//
//    texto = null
//
//    println(texto?.length)

//////////////////////////////////////////////////////////////////////////


//    val numeros = ar(1,2,3,4,5)
//
//
//    println(numeros[2])
//
//    numeros[2] = 50
//
//    numeros[5] =
//
//    println(numeros[2])


    ///////////////////////////////////////////////////////////////


//    var frutas = mutableListOf("pera","mecherrica","maça")
//
//    frutas.add("caju")
//    frutas.add("caju")
//    println(frutas[2])
//    println(frutas)
//
//    frutas.removeAt(0)
//
//    println(frutas)
//
//    var cor = setOf("marrom", "preto", "branco", "rosa")
//
//
//    var cores =mutableSetOf("äzul", "rosa", "preto")
//
//    cores.add("rose")
//    cores.add("rose")
//
//    println(cores)

////////////////////////////////////////////////////////////////////


//    var produtos = mutableMapOf(
//            "pc" to "computador",
//            "cl" to "celular",
//
//    )
//    println(produtos)
//
//
//    println(produtos["pc"])
//    produtos["nt"] = "notebook"

//    var i = 0
//    val nome = "breno"

//    while (i < 10) {
//        print("winer balondor $nome 202$i\n")
//
//        i++
//    }

////////////////////////////////////////////////////////////////////////

//    for (i in 1 .. 10){
//        println(i)
//    }
//
//
//
//    val carros = listOf("camaro", "corsa", "fusca", "civic")
//
//
//    for ((indice, carro) in carros.withIndex()){
//        println("no indice $indice temos o carro  $carro")
//    }



    //////////////////////////////////////////////////////////////////////////////////


//    val intervaloInt = 1 .. 10
//    val intervaloAlfabeto = "a" .. "z"
//    val intervaloAntecessor = 1 until  10
//    val intervaloRecresivo = 10 downTo 1
//    val intervaloDeDois = 1 .. 10 step 2

//    for (i in intervaloInt) {
//        println(i)
//    }

//    for (i in intervaloAntecessor) {
//        println(i)
//    }

//    for (i in intervaloRecresivo) {
//        println(i)
//    }

//    for (i in intervaloDeDois) {
//        println(i)
//    }


    //////////////////////////////////////////////////////////////////////////////////////////////////


//    val lista = listOf("cekta", "corsa", "fusca", "500", "Kwid")
//
//
//    //chama o indece do carro
//    for (carro in lista.indices) {
//        println(carro)
//    }
//
//    // tras o modelo do carro e a possiçao do index
//    for ((index, carro) in lista.withIndex()) {
//        println("O modelo $carro esta na posiççao $index ")
//    }



    // FUNÇOES

//    fun mandaSalve(nome : String = "mano", salve: String = "salve"){
//        println("eae mano " + nome + "! " + salve)
//    }
//
//    mandaSalve("pedro")
//    mandaSalve(salve = "irmao suave")
//    mandaSalve("pedro", salve = "LINDAO")
//    mandaSalve()
//
//
//
//    fun somar(a : Int, b : Int){
//        println(a + b)
//    }
//
//  val resposta = somar(5, 5)
//
//
//    println(resposta)
//
////    fun pagaOpix(a : Boolean){
////
////        if (a === true){
////            println("Pago, Breno amado pelo Vini")
////        }else{
////            println("Ta devendo fdp, PAGAAAAAAAAAA")
////        }
////    }
////
////    pagaOpix(false)
//
    ///////////////////////////////////////////////////////////////////////
    val intervalo = (1 .. 10).toList()
    val lista = listOf(1,2,3,4,5,6,7,8,9,10)

//    val numeros = intervalo.toList()

//    val pares = intervalo.filter{ intervalo -> intervalo % 2 == 0}
//
//    val impares = intervalo.filter{ intervalo -> intervalo % 3 == 0}
//
//    val dobrados = intervalo.map{ numero -> numero * 3 }

//    val result = lista.reduce { acumulador, numero ->
//        acumulador + numero
//
//    }

    val result = lista.reduce { maiorValor, numero ->
       if (numero > maiorValor){
           numero
       }else{
           maiorValor
       }
    }
    println(result)


    val numeros = listOf(1,2,3,4,5,6,7,8,9,10)

    val somarDobroDosPares = numeros
        .filter { numeros -> numeros % 2 == 0 }
        .map { numeroPar -> numeroPar * 2 }
        .reduce { somarDobroDosPares, numeropardobrado ->
            somarDobroDosPares + numeropardobrado }
    println(somarDobroDosPares)
}
