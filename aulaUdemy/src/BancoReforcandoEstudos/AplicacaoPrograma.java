package BancoReforcandoEstudos;

public class AplicacaoPrograma {

	public static void main(String[] args) {
		
		Conta c2 = new Conta();
		c2.setSaldo(2000);
		
		Conta conta = new Conta();
		conta.setNumeroConta(123);
		conta.setSaldo(3000);
		conta.depositar(100);
		if(conta.sacar(200) == true) {
			System.out.println("Operação realizada com sucesso");
		}
		else{
			System.out.println("Saldo insuficiente");
		};
		
		if(conta.transferir(c2,1000) == true) {
			System.out.println("Operação realizada com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		
		
		
		
		System.out.println(conta.getSaldo());
		System.out.println(conta.getNumeroConta());
		System.out.println(c2.getSaldo());
	}

}
