package PolimorfismoSegundaEtapa;

public class Ave extends Animal {

	private String corPena;

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	public void fazerNinho() {
		System.out.println("Fazer ninho");
	}

	public void locomover() {
		System.out.println("Voando");
	}

	public void alimentar() {
		System.out.println("Insetos, Frutas");
	}

	public void emitirSom() {
		System.out.println("Som de pássaro");
	}
}
