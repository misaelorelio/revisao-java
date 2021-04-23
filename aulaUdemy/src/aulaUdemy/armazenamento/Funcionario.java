package aulaUdemy.armazenamento;

public class Funcionario {

	protected String nome;
	protected String departamento;
	protected double salario;
	protected String dataEntrada;
	protected String rg;
	protected boolean estaNaEmpresa;
	protected double ganhoAnual;

	public Boolean calculaSalario() {
		if (this.salario <= 1300) {
			this.salario = this.salario - (this.salario * 0.06);
			return true;
		} else {
			System.out.println("Valor inválido");
			return false;
		}

	}

	public Boolean calculaSalario(double horaExtra) {
		if (this.salario <= 1300) {
			double valorHoraExtra = (this.salario / 30) / 8 * horaExtra;
			this.salario = this.salario - (this.salario * 0.06) + valorHoraExtra;
			return true;
		} else {
			System.out.println("Valor inválido");
			return false;
		}

	}

	public double bonifica() {
		return salario * 0.10;
	}

	public void demite() {
		estaNaEmpresa = false;
	}

	double ganhoAnual() {
		return salario * 12;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public double getGanhoAnual() {
		return ganhoAnual;
	}

	public void setGanhoAnual(double ganhoAnual) {
		this.ganhoAnual = ganhoAnual;
	}

}
