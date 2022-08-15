package pacoteJava;

import java.util.Scanner;

public class exemploWhile {

	public static void main(String[] args) {
		
		int numero, somaNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero: ");
		numero= leia.nextInt();
		
		while(numero!=0) {
			if(numero % 3 == 0) {
				somaNumero += numero;
			}
			System.out.println("\nEntre com um número: ");
			numero = leia.nextInt();
		}
		
		System.out.println("\nSomatório dos numeros multiplos de 3: " +somaNumero);
		
		
	}

}
