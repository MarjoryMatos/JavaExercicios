package Polimorfismo;

public class Cachorro extends Animal{
	
	private String nome;
	private int idade;
	
	@Override
	
	
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
	
	public void emitirSom() {
		System.out.println("Au au");
	}
	
	public void locomover() {
		System.out.println("Correndo...");
	}
	
	
}
