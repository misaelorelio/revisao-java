package aulaUdemy.armazenamento;

public class Gerente extends Funcionario {


	public double bonifica() {
		return salario * 0.15;
	}

	public Boolean calculaSalario() {
		if (this.salario > 1300) {
			this.salario = this.salario - (this.salario * 0.12);
			return true;
		} else {
			System.out.println("Valor inv�lido");
			return false;
		}

	}

	public Boolean calculaSalario(double horaExtra) {
		if (this.salario > 1300) {
			double valorHoraExtra = (this.salario / 30) / 8 * horaExtra;
			this.salario = this.salario - (this.salario * 0.11) + valorHoraExtra;
			return true;
		} else {
			System.out.println("Valor inv�lido");
			return false;
		}
	}

	

}
