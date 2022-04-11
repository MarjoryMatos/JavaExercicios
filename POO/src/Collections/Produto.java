package Collections;

import java.util.ArrayList;

public class Produto {
	
	public static void main(String[] args) {
		
		ArrayList<String> estoque = new ArrayList<>();
		
		
		//adicionado elementos
		System.out.println("Adicionando produtos: ");
		estoque.add("Arroz");
		estoque.add("Feijão");
		estoque.add("Macarrão");
		estoque.add("Farofinha");
		
		System.out.println(estoque);
		System.out.println();
		
		//inserindo elementos
		System.out.println("Inserindo produtos e atualizando elementos: ");
		estoque.set(3, "Arroz");
		estoque.set(1, "Feijão");
		
		System.out.println(estoque);
		System.out.println();
		
		
		//removendo elementos
		System.out.println("Removendo produtos: ");
		estoque.remove(2);
		estoque.remove(1);
		
		
		System.out.println(estoque);
		System.out.println();
		
		//remove todos os dados do Array
		System.out.println("Removendo todos os dados do Array");
		estoque.clear();
		System.out.println(estoque);
		
		
	}

}
