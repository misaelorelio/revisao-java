package Banco;

public interface Servicos {

	boolean sacar(double valor);

	void depositar(double valor);

	boolean transferir(Conta contaDestino, double valor);

}
