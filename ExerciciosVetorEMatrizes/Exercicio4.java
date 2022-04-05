import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int m[][][] = new int [3][3][3];
		int  x, y,z,  soma=0, somaDi=0;
		
		for(x = 0; x < 3; x++){
			for(y = 0; y < 3; y++) {
				for(z= 0; z < 3; z++) {
					System.out.println("Digite um número ");
					m[x][y][z] = read.nextInt();
				}
			}
				
			for(x = 0; x <3; x++) {
				for(y = 0; y < 3; y++) {
					for(z= 0; z < 3; z++) {
					soma +=m[x][y][z];
				}
			}
			System.out.println("A soma de todas as matrizes é "+ soma);
			for(x = 0; x < 2; x++) {
				for(y = 0; y < 2; y++) {
					for(z= 0; z < 2; z++) {
						somaDi += m[x][x][x];
					}
				}	
			}
			System.out.println("A soma diagonal principal é " + somaDi);
		}
		

	}

}
}