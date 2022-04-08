package Polimorfismo;

public abstract class Animal {

	private String nome, som, locomover;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmitirSom() {
		return som;
	}
	public void setEmitirSom(String som) {
		this.som = som;
	}
	public String getLocomover() {
		return locomover;
	}
	public void setLocomover(String locomover) {
		this.locomover = locomover;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public abstract void emitirSom(); 
	
	
}
