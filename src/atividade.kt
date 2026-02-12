fun main() {

    val array = intArrayOf(1,2,3,4,5)

//    questao1(3)
//    valorNumero(0)
//    idadePessoa(59)
//    tabuada(10)
//    somarArray(12, 14, 19, 42, 32)
//    lista()
//    dobrar(12)
//    media(25, 37, 92)
//    trasformador(4.00)
//    maiorArray(1,2,3,4,5)
//    somaPares(array)
//    mutiplos()
//    listas()
//    compras()
//    somaMaior()
//        fatorial()

    val item = listOf(
        Produto("alicate", 8.0),
        Produto("chave", 27.0),
        Produto("furadeira", 18.88)
    )

        val usuario = ContaBancaria("pedrinho")

        usuario.depositarValor(500.0)
        usuario.valorsacado(200.0)
        usuario.consutarSaldo()
        usuario.valorsacado(100.0)

       var result = item.maxBy { it.preco }

        println("a ${result.item},e o item mais caro custa ${result.preco}")

      val maria = Pessoa()

        maria.nome = "Maria"
        maria.idade = 17
        maria.cidade = "Jandira"




  val gerente = Gerente()

    gerente.nome = "Carlos"
    gerente.salario = 1200.0

  val funcionario = Funcionario()

  funcionario.nome = "Ford"
  funcionario.salario = 1200.0


  println("o gerente ${gerente.nome} recebe ${gerente.salario}, ganha 20% a mais q o funcionario ${funcionario.nome} com o salario ${funcionario.salario}")
}

// questao 1
fun questao1(a : Int){

    val x = 2

    if (a % x == 0){
        println("par")
    }else
    println("impar")
}

// questao 2



fun valorNumero(numero: Int){

    if (numero > 0){
        println("possitivo")
    }else if(numero == 0){
        println("zero")
    }else{
        println("negativo")
    }


}

// questao 3

fun idadePessoa(idade : Int){

     if (idade < 12){
         println("Criança")
     }else if (idade >= 12 && idade <= 17){
         println("Adolecente")
     }else if (idade >= 18 && idade <= 59){
         println("Adulto")
     }else if (idade > 0){
         println("Numero invalido")
     }else {
         println("Idoso")
     }

}
// questao 4

fun tabuada(a: Int){

    val intervaloInt = 1 .. 10

    for (i in intervaloInt) {
        println("$a" + " + " + "$i " + "= " + (a * i) )
    }
}

// questao 5


fun somarArray(a: Int, b: Int, c: Int, d: Int, e: Int) {

    val array = arrayOf(a,b,c,d,e)

    var soma = (array.sum())

    println(soma)

}

// questao 6

fun maiorArray(a: Int, b: Int, c: Int, d: Int, e: Int) {


    val array = arrayOf(a,b,c,d,e)

    val soma = (array.max() ?: 0)


    println(soma)
}

// questao 7
fun lista(){

    val intervaloRecresivo = 10 downTo 1


    for (i in intervaloRecresivo) {
        println(i)
    }

}
// questao 8
fun somaPares(array: IntArray) {

    val x = 2
    var soma = 0
    for (i in array){

        if (i % x == 0){
            soma += i
        }
    }
    println(soma)

}
//questao 9

fun dobrar(a: Int) {

    val soma = a * 2


    println(soma)
}
// questao 10

fun media(a: Int, b: Int, c: Int) {

    val media = ((a + b + c )/ 3)

    println(media)
}
// questao 11

fun trasformador(c: Double){

    val f = (c * 1.8 + 32)
    println(f)

}
// questao 12
fun mutiplos(){
    val lista = (1 .. 100).toList()


    for(numero in lista){
        if (numero % 3 == 0){
            println("Batata")
        }else if(numero % 5 == 0){
            println("quente")
        }else if(numero % 3 == 0 && numero % 5 == 0){
            println("batataQuente")
        }else{
            println("numero")
        }
    }

}
// questao 13
fun listas(){
    val lista = listOf(1,2,3,4,5)

    val array = mutableListOf<Int>()

    for (numero in lista){
        if (numero % 2 !== 0){
                array.add(numero)
        }

    }
    println(array)
    println(lista)
}
// total compra 14
fun compras(){
    val itens: List<Double> = listOf(1.0,2.0,3.0,4.0,5.0)

     val total = itens.sum()

    println(total)

}
// questao 15
fun somaMaior(){
    val idades = listOf<Int>(27, 10, 19, 56, 70)

    val somaIdade = mutableListOf<Int>()
    for (i in idades){
        if(i >= 18){
            somaIdade.add(i)
        }
    }


    println(somaIdade.sum())
}
fun fatorial(){
    val numero = 5


    val fatorial = 1 .. numero

    val result = fatorial.reduce { acc, mutiplicador -> acc * mutiplicador }

    println(result)
}



