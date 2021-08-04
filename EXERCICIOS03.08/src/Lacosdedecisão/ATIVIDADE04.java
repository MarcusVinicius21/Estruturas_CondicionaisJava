package Lacosdedecisão;

import java.util.Scanner;

public class ATIVIDADE04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raiz = 0, inserido, elevado = 0.0;
		
		System.out.println("Digite um número para obter as informações :");
		inserido = entrada.nextDouble();
		
		if(inserido % 2 == 0){
			raiz = inserido * inserido;
			

			System.out.println("O número digitado é PAR:" + "\nA raiz do mesmo é: " + raiz);
		}
		
		else{
			elevado = Math.pow(inserido, 2.0);
				System.out.println("O número digitado é ÍMPAR!" + "\nE o mesmo elevado é: " + elevado);	
		}

	}
	
}