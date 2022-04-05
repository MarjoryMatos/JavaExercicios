package Exercicio1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner idade = new Scanner (System.in);
		
		int idadePessoa;
		
		System.out.print("Digite sua idade: ");
		idadePessoa = idade.nextInt();
	
		if(idadePessoa >= 10 & idadePessoa <= 14) {
			System.out.print("Categoria infatil ");
		}else if(idadePessoa >= 15 & idadePessoa <=17) {
			System.out.print("Categoria Juvenil ");
		}else if(idadePessoa >=18 & idadePessoa <= 25) {
			System.out.print("Categoria adulto ");
		}else 
			System.out.print("Categoria adulto ");

	}

}
