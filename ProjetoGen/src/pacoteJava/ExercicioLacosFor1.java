package pacoteJava;

import java.util.Scanner;

public class ExercicioLacosFor1 {

	public static void main(String[] args) {
		//1- Informar todos os números de 1000 a 1999 que quando 
		//divididos por 11 obtemos resto = 5. (FOR)
		
		/*int n, modulo;
		
		Scanner leia = new Scanner(System.in);
		
		for(n=1000;n<1999;n++ ) {
			System.out.println("\nInforme os numeros");
			n = leia.nextInt();
			System.out.println("\nInforme os numeros");
			modulo = (n/11 % 5);
			
		}
		System.out.println("\nEstes são os numeros: "+ modulo);*/	
	
	
		int num;
		Scanner leia = new Scanner(System.in);
	
		for(num=1000;num<=1999;num++) {
			
			if(num % 11 ==5) {
				System.out.println("\n Numero: "+num);
			}
			
		}
		
		
		
	}

}
