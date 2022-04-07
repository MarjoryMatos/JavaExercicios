package Herança;

public class Cavalo extends Animal {
	
	private boolean correr = false;
	
	public void animalCorrer() {
		this.correr = true;
		System.out.println("O cavalo está correndo");
	}
	
	public void parado() {
		if(this.correr = false) {
			System.out.println("O cavalo está parado");
		}
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
}
