open class Funcionario(
    var nome: String = "",
    var salario: Double = 0.0
    ) {
    open fun mostrarSalario(): Double {
        return salario
    }
}