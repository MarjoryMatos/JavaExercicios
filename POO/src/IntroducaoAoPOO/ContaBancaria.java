package IntroducaoAoPOO;

public class ContaBancaria {
	
	String nome, cpf, conta, agencia;
	boolean ativa, desativarConta;
	double saldo;
	
	public void sacar() {
		if(this.ativa == true) {
			if(this.saldo > 0) {
				System.out.println("Seu dinheiro sair� no console, aguarde...");
			}
			else if(this.saldo < 0) {
				System.out.println("Voc� n�o saldo suficiente para o saque.");
			}
			 if(this.ativa == false) {
				System.out.println("Sua conta est� inativa, por favor procure o seu gerente.");
			}
		}
	}
	
	public void ativarConta() {
		ativa = true;
	}
	
	public void desativarConta() {
		ativa = false;
		System.out.println("Sua conta est� inativa, por favor procure o seu gerente.");
	}
	
	public void adicionarSaldo() {
		saldo = 1000;
	}
	
	public void status() {
		System.out.println("Nome do cliente " +this.nome);
		System.out.println("Nome do cliente " +this.cpf);
		System.out.println("N�mero da conta " +this.conta);
		System.out.println("Numero da agencia " +this.agencia);
		System.out.println("A conta est� ativa? " +this.ativa);
		System.out.println("Saldo em conta: " +this.saldo);
	}

}
