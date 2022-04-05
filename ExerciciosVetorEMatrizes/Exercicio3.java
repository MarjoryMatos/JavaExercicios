//import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		//Random num = new Random();
		
		int n1 [][] = new int [4][6];
		int n2 [][] = new int [4][6];
		int m3 [][] = new int [4][6];
		
		int x, y;
		
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6; y++) {
				System.out.println("Digite um número: ");
				n1[x][y] = read.nextInt();
						}
			
		}
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6; y++) {
				System.out.println("Digite um número: ");
				n2[x][y] = read.nextInt();
			}
		
		}
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6; y++) {
				m3[x][y] = n1[x][y]+n2[x][y];
				System.out.println(m3[x][y]);		
			}
		}
		
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 6; y++) {
				m3[x][y] = n1[x][y]-n2[x][y];
				System.out.println(m3[x][y]);		
			}
		}
	}
}