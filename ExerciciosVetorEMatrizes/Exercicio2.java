import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		Random num = new Random();
		
		int dado[] = new int[10], total =0, maior = 0, i, media, cont = 0;
		
		for (i = 0; i < 10; i++){
			dado[i] = num.nextInt(6)+1;
			total +=dado[i];
			if(dado[i] > maior) {
				maior = dado[i];
			}
		}
		media = total /10;
		for(i = 0; i < 10; i++) {
			System.out.println(dado[i]+"\t");
			if(dado[i]==maior) {
				cont++;
			}
		}
		System.out.println("A m�dia dos n�meros lan�ados foi "+ media);
		System.out.println("O Maior n�mero lan�ado foi "+maior+ " e ele apareceu "+cont+ " vezes");
	}

}
