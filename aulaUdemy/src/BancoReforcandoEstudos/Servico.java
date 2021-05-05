package BancoReforcandoEstudos;

import Banco.Conta;

public interface Servico {

	boolean sacar(double valor);

	void depositar(double valor);

	boolean transferir(Conta contaDestino, double valor);
}
