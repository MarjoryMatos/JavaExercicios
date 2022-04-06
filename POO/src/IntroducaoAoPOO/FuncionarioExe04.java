package IntroducaoAoPOO;

public class FuncionarioExe04 {
	
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.nome = "Fernando";
		funcionario1.cargo = "It Recruiter";
		funcionario1.rf = "125";
		funcionario1.ativarFuncionario();
		funcionario1.baterPonto();
		funcionario1.status();

		
		System.out.println("-------------------");
		
		funcionario2.nome = "Marcela";
		funcionario2.cargo = "Recepcionista";
		funcionario2.rf = "133";
		funcionario2.desativarFuncionario();
		funcionario2.baterPonto();
		funcionario2.status();

		
	}

}
