package Heran�a;

public class Preguica extends Animal {
	
	private boolean subirNaArvore = true;
	
	public void subirNaArvore() {
		this.subirNaArvore = true;
		System.out.println("O pregui�inha est� dormindo na �rvore");
	}
	
	public void acordou() {
		if(this.subirNaArvore==true) {
			this.subirNaArvore = false;
			System.out.println("O pregui�inha desceu");
		}
		else 
			System.out.println("O pregui�inha n�o est� na �rvore");
	}

	public boolean isSubirNaArvore() {
		return subirNaArvore;
	}

	public void setSubirNaArvore(boolean subirNaArvore) {
		this.subirNaArvore = subirNaArvore;
	}
	
	

}
