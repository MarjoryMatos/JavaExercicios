package Exercicio1;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner (System.in);
		
		int numero1, numero2, numero3;
		
		System.out.print("Digite um numero: ");
			numero1 = numero.nextInt();
		
		System.out.print("Digite o segundo numero: ");
			numero2 = numero.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
			numero3 = numero.nextInt();
			
		if(numero2 > numero1 & numero2 > numero3) {
			System.out.print("O maior numero é " + numero2);
		} else if (numero3 > numero1 & numero3 > numero2) {
			System.out.print("O maior numero é " + numero3);
		} else  {
			System.out.print("O maior numero é " + numero1);
		}
	}

}
