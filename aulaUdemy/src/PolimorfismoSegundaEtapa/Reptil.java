package PolimorfismoSegundaEtapa;

public class Reptil {

	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	public void locomover() {
		System.out.println("Rastejando");
	}

	public void alimentar() {
		System.out.println("Insetos");
	}

	public void emitirSom() {
		System.out.println("Som de R�ptil");
	}
}
