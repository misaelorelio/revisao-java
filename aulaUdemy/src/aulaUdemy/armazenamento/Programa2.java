package aulaUdemy.armazenamento;

public class Programa2 {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.setRg("212121212");
		f1.setDepartamento("Estágiario");
		f1.salario = 1299.0;
		f1.calculaSalario();
		
		Gerente g1 = new Gerente(); 
		g1.departamento = "vendas";
		g1.setDataEntrada("12/32/4321");
		g1.nome = "Misael";
		g1.estaNaEmpresa = true;
		g1.setLogin("123");
		g1.setSenha("123");
		g1.setSalario(5000.0);
		
		g1.autentica("123", "124");		
		
		System.out.println(f1.getSalario());
		System.out.println(f1.bonifica());
		System.out.println(f1.getRg());
		System.out.println(g1.getDataEntrada());
		System.out.println(g1.nome);
		System.out.println(g1.departamento);
		System.out.println(g1.bonifica());
		System.out.println(g1.getSalario());
	}

}
