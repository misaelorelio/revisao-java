package aulaUdemy.array;

public class Empresa {

	String razaoSocial;
	String cnpj;
	Funcionario funcionarios[];
	
	void adicionarFuncionario(Funcionario funcionario) {
		for(int i =0; i < funcionarios.length; i++) {
			if(funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				
			}
		}
	}
}
