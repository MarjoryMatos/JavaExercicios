package Exercicios;

import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		int idade = 0, contador21 = 0, contador50=0;
		Scanner ent = new Scanner(System.in);
			
		System.out.print("Digite uma idade");
		idade = ent.nextInt();
		
		while (idade!= -99) {
			if(idade < 21) {
				contador21++;
			}
			
			if(idade > 50) {
				contador50++;
			}
			System.out.println("Digite uma idade (para sair digite -99): ");
			idade = ent.nextInt();
		}
		
		System.out.println("O total com menos de 21 anos é: " +contador21);
		System.out.println(" O total com mais de 50 anos é " +contador50);
		
		
		
	}

}
