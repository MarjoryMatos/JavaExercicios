package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int idade, sexo, psi, pessoas = 1, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos =0, nervososMaior = 0, calmasMenor=0;
		
		Scanner ent = new Scanner(System.in);
		Scanner genero = new Scanner(System.in);
		Scanner humor = new Scanner(System.in);
		
		while(pessoas <=  5) {
			System.out.print("Digite sua idade ");
			idade = ent.nextInt();
		
			System.out.print("Digite seu gênero (1 para FEMINO / 2 para Masculino / 3 para Outros");
			sexo = genero.nextInt();
		
			System.out.print("Digite seu humor (1 para CALMA / 2 para NERVOSA / 3 para AGRESSIVA");
			psi = humor.nextInt();
			pessoas++;
			
			if(psi ==1 ) {
				pessoasCalmas++;
				
				if(idade < 18) {
					calmasMenor++;
				}
				else if(sexo ==3) {
					outrosCalmos++;
				}
				
			}
			
			if(psi == 2) {
				if(sexo == 1) {
					mulheresNervosas++;
					
				}
				if(idade >= 40) {
					nervososMaior++;
				}
			}
			if(sexo == 2 && psi == 3) {
				homensAgressivos++;
			}
			
		}
		
		System.out.println("A quantidade de pessoas calmas são " +pessoasCalmas);
		System.out.println("A quantidade de Mulheres nervosas são " +mulheresNervosas);
		System.out.println("A quantidade de homens agressivos são " +homensAgressivos);
		System.out.println("A quantidade de 'Outros' calmos é " +outrosCalmos);
		System.out.println("A quantidade de pessoas nervosas com mais de 40 anos é " +nervososMaior);
		System.out.println("A quantidade de pessoas calmas com menos de 18 é " +calmasMenor);
	}

}
