package pacoteJava;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
		
		float[] media = new float[3];
		float n1,n2,n3,somaMedia=0,mg;
		int x;//variavel de looping
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;//media na posicao 0 vai calcular tudo isso
			System.out.println("\nMedia: "+media[x]);
			somaMedia+= media[x];
		}
		mg = somaMedia/3;
		System.out.println("\nMedia geral: " +mg);
		
	}

}
