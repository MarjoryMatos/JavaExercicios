package Exercicio1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		float numeroDigitado, elevado;
		
		System.out.print("Digite um numero: ");
		numeroDigitado = numero.nextInt();
		
		if(numeroDigitado % 2 == 0) {
			System.out.print("Este numero é par");
			System.out.println(" E sua raiz quadrada é ");
			double raiz = Math.sqrt(numeroDigitado);
			System.out.print("A raiz quadrada é: "+ raiz);
		}else {
			System.out.print("Este numero é impar");
			elevado = numeroDigitado * numeroDigitado;
			System.out.print(" E este numero " +numeroDigitado +" elevado ao quadrado é "+elevado);
		}
	
	}

}
