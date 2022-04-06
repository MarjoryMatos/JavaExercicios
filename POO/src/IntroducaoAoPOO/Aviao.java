package IntroducaoAoPOO;

public class Aviao {
	boolean voando, abastecido, desabastecido;
	String modelo;
	
	public void voar() {
		if(this.abastecido == true) {
			this.voando=true;
			System.out.println("O avião está abastecido, preparem-se o avião está iniciando o voo");
			
		}
		else if(this.desabastecido == false)
			System.out.println("O avião está desabastecido, ele precisa está abastecido para voar");
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
			System.out.println("O avião já está pousado!");
	}
	
	public void estado() {
		System.out.println("O modelo do avião é: "+this.modelo);
		
		
	}
}
