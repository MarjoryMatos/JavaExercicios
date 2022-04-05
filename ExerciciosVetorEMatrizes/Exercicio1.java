import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int s[] = new int[5], numMaior=0, i;
		
		Scanner num = new Scanner(System.in);
		
		for(i=0; i < 5; i++ ) {
			System.out.println("Digite um numero: ");
			s[i] = num.nextInt();
			if(s[i]> numMaior) {
				numMaior = s[i];
			}
		}
		System.out.println("seula");
		
		for(i=0; i<5;i++) {
			System.out.println(s[i]+"\t");
	}
		System.out.println("O maior é " +numMaior);
	}

}
