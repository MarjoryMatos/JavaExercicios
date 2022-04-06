package IntroducaoAoPOO;

public class ProdutoEletronico {
	
	String nome;
	boolean instalado, internet;
	
	public void instalar() {
		if(internet == true) {
			System.out.println("Instalando o jogo");
			instalado = true;
		}
		else if(internet == false) {
			System.out.println("Conecte-se a internet para prosseguir com a instação");
		}
	}
	
	public void conectarInternet() {
		internet = true;
	}
	
	public void desconectarInternet() {
		internet = false;
	}
	
	public void status() {
		System.out.println("Nome: " +this.nome);
		System.out.println("A internet está conectada? " +this.internet);
		System.out.println("Foi instalado? "+this.instalado);
	}
	

}
