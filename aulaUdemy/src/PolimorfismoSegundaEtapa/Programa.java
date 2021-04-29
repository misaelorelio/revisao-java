package PolimorfismoSegundaEtapa;

public class Programa {

	public static void main(String[] args) {
		
		Mamifero mamifero = new Mamifero();
		mamifero.locomover();
		mamifero.idade = 2;
		mamifero.alimentar();
		mamifero.emitirSom();
		
		System.out.println(mamifero.idade);

	}

}
