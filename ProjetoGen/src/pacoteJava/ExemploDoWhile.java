package pacoteJava;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		int valor,somaValor=0;
		
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("\nEntre com um valor: ");
			valor = leia.nextInt();
			somaValor += valor;
			
		}while(somaValor<=300);/*Condição falsa- sai do laço*/
		
		System.out.println("\nSomatório dos valores "+somaValor);
			
	}

}
