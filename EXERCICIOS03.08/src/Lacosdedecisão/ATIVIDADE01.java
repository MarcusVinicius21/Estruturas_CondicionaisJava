package Lacosdedecis�o;

import java.util.Scanner;

public class ATIVIDADE01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		

		double n1, n2, n3;		
		
		
		System.out.println("Digite tr�s n�meros: ");
		n1 = ler.nextInt();
		n2 = ler.nextInt();
		n3 = ler.nextInt();
		
		if(n3 > n2 && n3 > n1) {
			System.out.println("O maior n�mero �: \n" + n3);
		}
		else if(n2 > n3 && n2 > n1) {
			System.out.println("O maior n�mero �: \n" + n2);
		}
		
		else if(n1 > n3 && n1 > n2) {
			System.out.println("O maior n�mero �: \n" + n1);
			
		}
	
		ler.close();
	}

}
