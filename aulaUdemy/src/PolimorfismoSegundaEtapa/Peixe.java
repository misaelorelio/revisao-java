package PolimorfismoSegundaEtapa;

public class Peixe extends Animal {

	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public void soltarBolha() {
		System.out.println("Bolha");
	}
	
	public void locomover() {
		System.out.println("Nadando");
	}

	public void alimentar() {
		System.out.println("Vegetais, ração");
	}

	public void emitirSom() {
		System.out.println("Som de peixe");
	}
}
