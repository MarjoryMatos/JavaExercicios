package Exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner numero = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.print("Digite um numero: ");
			a = numero.nextInt();
		
		System.out.print("Digite o segundo numero: ");
			b = numero.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
			c = numero.nextInt();
			
		if(a >= b & a >= c & b >= c) {
			System.out.print("A ordem crescente é " + c + b + a);
		} else if (a >= b & a >= c & c >= b) {
			System.out.print("A ordem crescente é " + b + c + a);
		} else  if(b >= a & b >= c & a >= c){
			System.out.print("A ordem crescente é " + c + a + b);
		}else if(b >= a & b >= c & c >= a) {
			System.out.print("A ordem crescente é " + a + c + b);
		}else if(c >= a & c >= b & a >= b) {
			System.out.print("A ordem crescente é " + b + a + c);
		}else if( c >= a & c >= b & b >= a) {
			System.out.print("A ordem crescente é " + a + b + c);
		}
	
		
	}

}
