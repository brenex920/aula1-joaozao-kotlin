fun main() {

    val array = intArrayOf(1,2,3,4,5)

    questao1(3)
    valorNumero(0)
    idadePessoa(59)
    tabuada(10)
    somarArray(12, 14, 19, 42, 32)
    lista()
    dobrar(12)
    media(25, 37, 92)
    trasformador(4.00)
    maiorArray(1,2,3,4,5)
    somaPares(array)
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
