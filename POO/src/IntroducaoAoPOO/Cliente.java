package IntroducaoAoPOO;

public class Cliente {
	
	String nome, telefone;
	int codigo;
	boolean dinheiro;
	
	public void comprar() {
		if(this.dinheiro == true) {
			System.out.println("Parabéns, você adquiriu o produto!");
		}else if(this.dinheiro == false) { 
			System.out.println("Que pena, seu saldo está insuficiente. ");
		}
	}
	
	public void visualizarProduto() {
		System.out.println("Visualizando produtos");
	}
	
	public void adicionarSaldo() {
		this.dinheiro = true;
	}
	
	public void removerSaldo() {
		this.dinheiro = false;
	}
	
	public void estado() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("Codigo do cliente: "+this.codigo);
		
	}
}
