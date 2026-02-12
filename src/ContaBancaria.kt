import kotlin.collections.plusAssign

class ContaBancaria(var nomeTitular: String) {

    private var saldo: Double = 0.0

    fun depositarValor(valorDepositado: Double) {
        saldo += valorDepositado

    }
    fun valorsacado(valorSaque: Double) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque
        }else{
            println("Saldo Insuficiente")
        }
    }

    fun consutarSaldo() {
        println("seu saldo e ${saldo}")
    }
}


