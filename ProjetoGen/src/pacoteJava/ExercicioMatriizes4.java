package pacoteJava;

import java.util.Scanner;

public class ExercicioMatriizes4 {

	public static void main(String[] args) {
		//4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		//	(1) somar as duas matrizes 
		//	(2) subtrair a primeira matriz da segunda 
		//	(3) adicionar uma constante as duas matrizes
		//	(4) imprimir as matrizes 
		//	Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

		float [][] matriz1 = new float[2][2];
		float [][] matriz2 = new float[2][2];
		float [][] matriz3 = new float[2][2];
		int i,j,numero,op;
		
		Scanner leia = new Scanner(System.in);
		//Populando matrizes
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nEntre com o valor da Matriz1: ");
				matriz1[i][j] = leia.nextFloat();
				System.out.println("\nEntre com o valor da Matriz2: ");
				matriz1[i][j] = leia.nextFloat();
			}
		}
		
		do { //criando menu 
			System.out.println("\n\t\tMenu de Matrizes");
			System.out.println("\n1 - Somar as duas matrizes");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda ");
			System.out.println("\n3 - Adicionar uma constante as duas matrizes");
			System.out.println("\n4 - Imprimir as matrizes");
			System.out.println("\n0 - Sair do programa");
			System.out.println("\nDigite a sua opção");
			op = leia.nextInt();
			
			switch(op) {
				
			case 1:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] +matriz2[i][j];
						System.out.println("\nSoma " +matriz3[i][j]);
					}
				}break;
			case 2: 
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
						System.out.println("\nDiferença " +matriz3[i][j]);
						
					}
					
				}break;
				
			case 3:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
						System.out.println("\nDiferença " +matriz3[i][j]);
						
					}
				
				}break;
			case 4:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
						System.out.println("\nDiferença " +matriz3[i][j]);
						
					}
					
				}break;
			case 0:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
						System.out.println("\nDiferença " +matriz3[i][j]);		
				}
				
			}
				
			
			}
		
		
		}
	
		while(op!=0);
		
		
	}

}
