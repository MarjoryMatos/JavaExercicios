package IntroducaoAoPOO;

public class Patinete {
	String cor, tamanho;
	boolean  rodas, andando;
	
	public void andar() {
		if(this.rodas == true) {
			System.out.println("Andando...");
			this.andando = true;			
		}
		else if(this.rodas == false) {
			System.out.println("Seu patinete est� sem rodas, adicione rodas para andar!");
		}
	}
	
	public void parar() {
		if(this.andando == true) {
			System.out.println("Parando patinete, cuidado!");
		}
		else if(this.andando == false) {
			System.out.println("Seu patinete j� est� parado.");
		}
	}
	
	public void rodas() {
		this.rodas=true;
	}
	
	
	public void semRodas() {
		this.rodas = false;
	}
	
	public void status() {
		System.out.println("A cor do patinete �: " +this.cor);
		System.out.println("O tamanho do patinete � " + this.tamanho);
		System.out.println("Est� andando? " +this.andando);
		System.out.println("Tem rodas? " +this.rodas);
	}
}
