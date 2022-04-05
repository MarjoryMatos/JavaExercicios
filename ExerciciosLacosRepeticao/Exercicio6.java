package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num;
		float media=0, cont = 0;
		
		System.out.println("Digite um número e para finalizar digite 0");
		
		if(num %3 == 0 && num != 0) {
			soma +=num;
			cont++;
		}
			do {
				System.out.println("Digite um numero");
				num = leia.nextInt();
				if(num %3 ==0 && num != 0) {
					soma +=num;
					cont++;
				}
				media = soma /cont;
				
				
			} while(num != 0);
			System.out.println("A quantidade de números que você digitou foi " +(cont)+ "E a média desses números é "+ (media);	
	}
}