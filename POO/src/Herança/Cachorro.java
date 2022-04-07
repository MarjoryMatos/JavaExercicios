package Herança;

public class Cachorro extends Animal {
	private boolean correr = false;
	
	public void animalCorrer() {
		this.correr= true;
		System.out.println("O Animal está correndo");
	}
	
	public void parado() {
		if(this.correr == true) {
			this.correr = false;
			System.out.println("O animal está parado.");
		}
		else if(this.correr == false) {
			this.correr = true;
			System.out.println("O animal já está parado");
		}
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
	

}
