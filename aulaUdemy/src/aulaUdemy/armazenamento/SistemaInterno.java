package aulaUdemy.armazenamento;

public class SistemaInterno {

	public void autenticaUsuario(FuncionarioAutenticavel fa) {
		
		String login = "user";
		String senha = "1234";
		
		if(fa.autentica(login, senha) == true) {
			System.out.println("Seja bem vindo ao sistema");
		}
		else {
			System.out.println("Acesso negado");
		}
	}
}
