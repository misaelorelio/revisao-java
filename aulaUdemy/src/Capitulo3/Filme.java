package Capitulo3;

public class Filme {

	int codigo;
	String nome;
	double valor;
	boolean disponivel;
	
	void retirarFilme() {
		disponivel = false;
	}
	void devolverFilme() {
		disponivel = true;
	}
}
