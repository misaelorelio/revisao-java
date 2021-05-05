package BancoReforcandoEstudos;

public class AplicacaoPrograma {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumeroConta(123);
		conta.setSaldo(3000);
		conta.sacar(200);
		conta.nome = "Misael";
		conta.cpf = "03303030303";
		
		
		System.out.println(conta.cpf);
		System.out.println(conta.nome);
		System.out.println(conta.getSaldo());
		System.out.println(conta.getNumeroConta());

	}

}
