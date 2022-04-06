package IntroducaoAoPOO;

public class AviaoExe02 {
	
	public static void main(String[] args) {
		Aviao boening = new Aviao();
		Aviao airbus = new Aviao();
		
		boening.modelo = "Boening 247";
		airbus.modelo = "Airbus A318";
		
		boening.estado();
		boening.abastecido();
		boening.voar();
		boening.pousar();
		
		System.out.println("---------------------");
		
		airbus.estado();
		airbus.desabastecido();
		airbus.voar();
		
		
		
		
	}

}
