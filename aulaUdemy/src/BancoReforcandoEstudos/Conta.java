package BancoReforcandoEstudos;

public class Conta extends Cliente implements Servico {

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
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
		return false;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;

	}

	@Override
	public boolean transferir(Banco.Conta contaDestino, double valor) {
		// TODO Auto-generated method stub
		return false;
	}
}
