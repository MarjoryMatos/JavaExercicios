package IntroducaoAoPOO;

public class Funcionario {
	String nome, cargo, rf;
	
	boolean ativo;
	
	public void baterPonto() {
		if(this.ativo == true) {
			System.out.println("Ponto batido, bom trabalho!");
		}
		else if(this.ativo == false) {
			System.out.println("Algo est� incorreto, por favor procure o recursos humanos");
		}
	}
	
	public void ativarFuncionario() {
		this.ativo = true;
	}
	
	public void desativarFuncionario() {
		this.ativo = false;
	}
	
	public void status() {
		System.out.println("Nome: " +this.nome);
		System.out.println("Numero do funcion�rio: " +this.rf);
		System.out.println("Cargo: " +this.cargo);
		System.out.println("O funcion�rio est� ativo? " +this.ativo);
	}
}
