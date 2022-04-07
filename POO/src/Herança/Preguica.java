package Herança;

public class Preguica extends Animal {
	
	private boolean subirNaArvore = true;
	
	public void subirNaArvore() {
		this.subirNaArvore = true;
		System.out.println("O preguiçinha está dormindo na árvore");
	}
	
	public void acordou() {
		if(this.subirNaArvore==true) {
			this.subirNaArvore = false;
			System.out.println("O preguiçinha desceu");
		}
		else 
			System.out.println("O preguiçinha não está na árvore");
	}

	public boolean isSubirNaArvore() {
		return subirNaArvore;
	}

	public void setSubirNaArvore(boolean subirNaArvore) {
		this.subirNaArvore = subirNaArvore;
	}
	
	

}
