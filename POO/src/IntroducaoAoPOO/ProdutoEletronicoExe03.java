package IntroducaoAoPOO;

public class ProdutoEletronicoExe03 {
	
	public static void main(String[] args) {
		ProdutoEletronico genshin = new ProdutoEletronico();
		ProdutoEletronico minecrafit = new ProdutoEletronico();
		
		genshin.nome = "Genshin Impact";
		minecrafit.nome = "Minecraft";
		
		genshin.status();
		genshin.conectarInternet();
		genshin.instalar();
		
		
		System.out.println("----------------");
		
		minecrafit.status();
		minecrafit.desconectarInternet();
		minecrafit.instalar();
		
		
		
		
	}

}
