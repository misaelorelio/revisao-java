package BancoReforcandoEstudos;

public class Conta implements Servico {

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

	@Override
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		else {
		return false;
		}
	}

	@Override
	public void depositar(double valor) {
		saldo +=valor;
		
	}

	@Override
	public boolean transferir(Conta contaDestino, double valor) {
		if(saldo >= valor) {
			saldo =  saldo - valor;
			contaDestino.saldo += valor;
			return true;
		}
		else {
		return false;
		}
	}

}
