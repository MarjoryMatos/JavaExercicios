package Polimorfismo;

public class Cavalo extends Animal{
	
	private String nome;
	private int idade;
	
	
	@Override
	
	public void emitirSom() {
		System.out.println("Pocotó");
	}
	
	public void locomover() {
		System.out.println("Correndo...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
