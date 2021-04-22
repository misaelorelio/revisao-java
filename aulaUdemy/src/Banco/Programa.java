package Banco;

public class Programa {

	public static void main(String[] args) {
		
		/*Conta conta = new Conta();
		conta.numeroConta = 1;
		conta.titular = "misael";
		conta.saldo = 500.0;
		if(conta.sacar(200) == true) {
			System.out.println("Operação realizada com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		Conta conta2 = new Conta();
		conta2.numeroConta = 2;
		conta2.titular = "Amanda";
		conta2.saldo = 200.0;
		if (conta.transferir(conta2, 200.0) == true) {
			System.out.println("Operação realizada com sucesso");
		}
		else{
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(conta.numeroConta);
		System.out.println(conta.titular);
		System.out.println(conta.saldo);
		
		System.out.println(conta2.numeroConta);
		System.out.println(conta2.titular);
		System.out.println(conta2.saldo);
	}*/
		/*Funcionario funcionario = new Funcionario();
		funcionario.nome = "Misael";
		funcionario.rg = "1234566777";
		funcionario.dataEntrada = "21/04/2021";
		funcionario.departamento = "Ti";
		funcionario.estaNaEmpresa = true;
		funcionario.salario = 2000.0;
		funcionario.bonifica(200);
		funcionario.demite();
		
		System.out.println(funcionario.nome);
		System.out.println(funcionario.salario);
		System.out.println(funcionario.estaNaEmpresa);
		System.out.println(funcionario.ganhoAnual());*/
		
		Cliente cliente = new Cliente();
		cliente.nome = "Misael";
		cliente.cpf = "0920202020";
		
		Conta conta = new Conta();
		conta.setNumeroConta (123);
		conta.setTitular(cliente);
		conta.setSaldo(1000); 
		
		
		System.out.println(conta.getTitular().nome);
		System.out.println(conta.getTitular().cpf);
		System.out.println(conta.getNumeroConta());
		System.out.println(conta.getSaldo());
		
		
		
	}		
}
