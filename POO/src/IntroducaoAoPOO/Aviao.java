package IntroducaoAoPOO;

public class Aviao {
	boolean voando, abastecido, desabastecido;
	String modelo;
	
	public void voar() {
		if(this.abastecido == true) {
			this.voando=true;
			System.out.println("O avi�o est� abastecido, preparem-se o avi�o est� iniciando o voo");
			
		}
		else if(this.desabastecido == false)
			System.out.println("O avi�o est� desabastecido, ele precisa est� abastecido para voar");
	}
	public void abastecido() {
		this.abastecido = true;
	}
	public void desabastecido() {
		this.abastecido = false;
	}
	public void pousar() {
		if(this.voando == true) {
			System.out.println("Preparecem, estamos pousando");
		}
		else
			System.out.println("O avi�o j� est� pousado!");
	}
	
	public void estado() {
		System.out.println("O modelo do avi�o �: "+this.modelo);
		
		
	}
}
