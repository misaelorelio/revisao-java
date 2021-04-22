package aulaUdemy.armazenamento;

public class Programa2 {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setRg("212121212");
		f1.setDepartamento("Estágiario");
		f1.calculaSalario(1000, 2);
		
		System.out.println(f1.getSalario());
		System.out.println(f1.getRg());
	}

}
