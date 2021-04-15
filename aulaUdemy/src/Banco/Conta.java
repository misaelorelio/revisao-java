package Banco;

public class Conta {

	int numeroConta;
	Cliente titular;
	double saldo;

	boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}else {
			return false;
		}
	}

	void depositar(double valor) {
		saldo = saldo + valor;
	}

	boolean transferir(Conta contaDestino, double valor) {
		if(saldo >= valor) {
		saldo -= valor;
		contaDestino.saldo += valor;
		return true;
		}
		else {
			return false;
			
		}
	}
}