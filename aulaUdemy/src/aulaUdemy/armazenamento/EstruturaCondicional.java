package aulaUdemy.armazenamento;

public class EstruturaCondicional {

	public static void main(String[] args) {

		/*double numero = 5;
		if (numero % 2 == 0) {
			System.out.println("é par");
		} else {
			System.out.println("é impar");
		}

	}*/
		
		int idade = 16;
		boolean amigoDoDno = true;
		if(idade >= 18 || amigoDoDno == true) {
			System.out.println("pode entrar");
		}
		else {
			System.out.println("não pode entrar");
		}
	}
}

