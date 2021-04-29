package PolimorfismoSegundaEtapa;

public abstract class Animal {

	protected Double peso;
	protected int idade;
	protected int membros;

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}

	public void locomover() {
	}

	public void alimentar() {

	}

	public void emitirSom() {

	}
}
