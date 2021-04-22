package aulaUdemy.armazenamento;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;
	boolean estaNaEmpresa;
	double ganhoAnual;

	void calculaSalario(double valor) {
		this.salario = valor - (valor * 0.06);
	}

	void calculaSalario(double valor, double horaExtra) {
		double valorHoraExtra = (valor / 30) / 8 * horaExtra;
		this.salario = valor - (valor * 0.06) + valorHoraExtra;
	}

	void bonifica(double valor) {
		salario += valor;
	}

	void demite() {
		estaNaEmpresa = false;
	}

	double ganhoAnual() {
		return salario * 12;
	}

}
