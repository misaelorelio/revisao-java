package aulaUdemy.array;

public class Programa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		empresa.razaoSocial = "Orelio";
		empresa.cnpj = "2121212121";
		empresa.funcionarios = new Funcionario[5];

		Funcionario f1 = new Funcionario();
		f1.nome = "Misael";
		f1.rg = "21212121212";
		f1.dataEntrada = "22/09/5677";
		f1.departamento = "Agronomia";
		f1.estaNaEmpresa = true;
		f1.salario = 2000.0;

		Funcionario f2 = new Funcionario();
		f2.nome = "Angelo";
		f2.rg = "21212121212";
		f2.dataEntrada = "22/09/5677";
		f2.departamento = "Agronomia";
		f2.estaNaEmpresa = true;
		f2.salario = 2000.0;

		Funcionario f3 = new Funcionario();
		f3.nome = "Amanda";
		f3.rg = "21212121212";
		f3.dataEntrada = "22/09/5677";
		f3.departamento = "Agronomia";
		f3.estaNaEmpresa = true;
		f3.salario = 2000.0;

		Funcionario f4 = new Funcionario();
		f4.nome = "Eude";
		f4.rg = "21212121212";
		f4.dataEntrada = "22/09/5677";
		f4.departamento = "Agronomia";
		f4.estaNaEmpresa = true;
		f4.salario = 2000.0;

		Funcionario f5 = new Funcionario();
		f5.nome = "Pedro";
		f5.rg = "21212121212";
		f5.dataEntrada = "22/09/5677";
		f5.departamento = "Agronomia";
		f5.estaNaEmpresa = true;
		f5.salario = 2000.0;
		
		System.out.println(empresa.cnpj);
		System.out.println(empresa.razaoSocial);
		
		
		
		
		for(Funcionario fun: empresa.funcionarios) {
			
			
			System.out.println(fun.nome);
			System.out.println(fun.rg);
			System.out.println(fun.dataEntrada);
			System.out.println(fun.estaNaEmpresa);
			System.out.println(fun.salario);
			
		}
	}
}
