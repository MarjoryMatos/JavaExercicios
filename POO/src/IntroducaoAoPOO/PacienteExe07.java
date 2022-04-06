package IntroducaoAoPOO;

public class PacienteExe07 {
	
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		
		paciente1.nome = "Maicon";
		paciente1.cpf = "16497856";
		paciente1.diagnostico ="Gripe";
		paciente1.altaPaciente();
		paciente1.pacienteLiberado();
		paciente1.status();
		
		System.out.println("---------------------");
		
		paciente2.nome = "Monique Lima";
		paciente2.cpf = "4597558";
		paciente2.diagnostico ="Tuberculose";
		paciente2.semAlta();
		paciente2.status();
		
		
		
		
	}

}
