package IntroducaoAoPOO;

public class ClienteExe01 {
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		
		c1.nome = "Victor";
		c1.codigo = 1;
		c1.adicionarSaldo();
		c1.telefone = "11-9999-9999";
		c1.estado();
		c1.visualizarProduto();
		c1.comprar();
		
		System.out.println("---------------------");
		
		c2.nome = "Marcela";
		c2.codigo = 2;
		c2.telefone = "11-9999-8888";
		c2.estado();
		c2.visualizarProduto();
		c2.removerSaldo();
		c2.comprar();
		
		
	}

}
