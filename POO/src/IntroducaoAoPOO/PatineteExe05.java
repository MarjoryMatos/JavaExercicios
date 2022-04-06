package IntroducaoAoPOO;

public class PatineteExe05 {
	
	public static void main(String[] args) {
		Patinete patinete1 = new Patinete();
		Patinete patinete2 = new Patinete();
		
		
		patinete1.cor = "Azul";
		patinete1.tamanho = "Medio";
		patinete1.rodas();
		patinete1.andar();
		patinete1.status();
		
		System.out.println("-----------------");
		
		patinete2.cor = "Vermelho";
		patinete2.tamanho = "Grande";
		patinete2.semRodas();
		patinete2.andar();
		patinete2.status();
		
		
		
		
	}

}
