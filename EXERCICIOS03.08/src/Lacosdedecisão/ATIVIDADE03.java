package Lacosdedecisão;

import java.util.Scanner;

public class ATIVIDADE03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade (10 ~ 25): ");
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <=14) {
		System.out.println("Você pertence a categoria: INFANTIL");
		
		}
		
		if (idade >= 15 && idade <=17) {
		System.out.println("Você pertence a categoria: JUVENIL");
		
		}
		
		if (idade >= 18 && idade <=25) {
		System.out.println("Você pertence a categoria: ADULTO");
		
	
		}
		
		
		entrada.close();
	}
	
	

}
