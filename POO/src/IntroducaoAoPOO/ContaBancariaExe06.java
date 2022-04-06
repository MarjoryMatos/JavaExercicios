package IntroducaoAoPOO;

public class ContaBancariaExe06 {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria();
		ContaBancaria conta2 = new ContaBancaria();
		
		conta1.nome = "Miguel Souza";
		conta1.cpf = "41397291";
		conta1.conta = "123456";
		conta1.agencia = "12";
		conta1.ativarConta();
		conta1.adicionarSaldo();
		conta1.sacar();
		conta1.status();
		
		System.out.println("-------------------");
		
		conta2.nome = "Mariana Dias";
		conta2.cpf= "164945893";
		conta2.conta = "54236";
		conta2.agencia = "321";
		conta2.desativarConta();
		conta2.status();
		
		
	}

}
