package Polimorfismo;

public class TesteAnimais {
	public static void main(String[] args) {
	
		Cachorro dog = new Cachorro();
		Cavalo peDePano = new Cavalo();
		Preguica sid = new Preguica();
	
		dog.setNome("Doguito");
		dog.getNome();
		dog.setIdade(2);
		dog.getIdade();
		System.out.println(dog.getNome());
		System.out.println( dog.getIdade()+" anos");;
		dog.emitirSom();
		dog.locomover();
		System.out.println();
		peDePano.setNome("Pé de Pano");
		peDePano.getNome();
		peDePano.setIdade(6);
		peDePano.getIdade();
		System.out.println(peDePano.getNome());
		System.out.println( peDePano.getIdade()+" anos");;
		peDePano.emitirSom();
		peDePano.locomover();
		System.out.println();
		sid.setNome("Sid");
		sid.getNome();
		sid.setIdade(5);
		sid.getIdade();
		System.out.println(sid.getNome());
		System.out.println(sid.getIdade()+" anos");;
		sid.emitirSom();
		sid.locomover();
		
}	

}
	