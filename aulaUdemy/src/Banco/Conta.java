package Banco;

public class Conta {

	private int numeroConta;
	private Cliente titular;
	private double saldo;

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	void depositar(double valor) {
		saldo = saldo + valor;
	}

	boolean transferir(Conta contaDestino, double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			contaDestino.saldo += valor;
			return true;
		} else {
			return false;

		}
	}
}