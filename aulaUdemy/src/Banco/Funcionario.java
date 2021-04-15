package Banco;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	double ganhoAnual;
	
	
	void bonifica(double valor) {
		salario += valor;
	}
	void demite () {
		estaNaEmpresa = false;
	}
	
	double ganhoAnual() {
		return  salario * 12;
	}
}
