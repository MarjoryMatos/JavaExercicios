package Heran�a;

public class Cavalo extends Animal {
	
	private boolean correr = false;
	
	public void animalCorrer() {
		this.correr = true;
		System.out.println("O cavalo est� correndo");
	}
	
	public void parado() {
		if(this.correr = false) {
			System.out.println("O cavalo est� parado");
		}
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
}
