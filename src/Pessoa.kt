class Pessoa {
        var nome: String = ""
        var idade: Int = 0
        var cidade: String = ""
}

fun apresetar (pessoa: Pessoa) {
        println("${pessoa.nome} tem ${pessoa.idade} e mora em ${pessoa.cidade}")
}
