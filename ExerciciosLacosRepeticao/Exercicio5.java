package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num, soma = 0;
		
		do {
			System.out.println("Digite um n�mero ");
			num = leia.nextInt();
			soma +=num;
			
		}while (num != 0);
		
		System.out.println("A soma dos n�meros digitados � " +soma);
	}

}
