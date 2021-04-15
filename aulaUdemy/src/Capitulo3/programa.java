package Capitulo3;

public class programa {

	public static void main(String[] args) {
		
		Filme filme = new Filme();
		filme.codigo = 123;
		filme.nome = "A era ado gelo";
		filme.valor = 2.50;
		filme.retirarFilme();
		
		if(filme.disponivel == true) {
			System.out.println("Filme disponível");
		}
		else {
			System.out.println("Filme indisponível");
		}
		
		filme.devolverFilme();
		if(filme.disponivel == true) {
			System.out.println("Filme disponível");
		}
		else {
			System.out.println("Filme indisponível");
		}
		
		Filme filme2 = new Filme();
		filme2.codigo = 234;
		filme2.nome = "A era ado gelo 2";
		filme2.valor = 2.50;
		
		System.out.println(filme.codigo);
		System.out.println(filme.nome);
		System.out.println(filme.valor);
		
		System.out.println(filme2.codigo);
		System.out.println(filme2.nome);
		System.out.println(filme2.valor);
	}

}
