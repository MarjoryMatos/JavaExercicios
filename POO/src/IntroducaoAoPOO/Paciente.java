package IntroducaoAoPOO;

public class Paciente {
	
	String nome, cpf, diagnostico;
	boolean alta;
	
	public void pacienteLiberado() {
		if(this.alta == true) {
			System.out.println("Você recebeu alta e está liberado!");
		}
		else if(this.alta == false) {
			System.out.println("Você ainda não recebeu alta, aguarde para ser liberado");
		}
	}
	
	public void altaPaciente() {
		this.alta = true;
	}
	
	public void semAlta() {
		this.alta = false;
		System.out.println("Você ainda não recebeu alta, aguarde para ser liberado");
	}

	public void status() {
		System.out.println("Nome do paciente: " +this.nome);
		System.out.println("CPF do paciente " +this.cpf);
		System.out.println("Diagnostico " +this.diagnostico);
		System.out.println("O paciente está recebeu alta? " +this.alta);
	}
}
