package Lacosdedecis�o;

import java.util.Scanner;

public class ATIVIDADE04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raiz = 0, inserido, elevado = 0.0;
		
		System.out.println("Digite um n�mero para obter as informa��es :");
		inserido = entrada.nextDouble();
		
		if(inserido % 2 == 0){
			raiz = inserido * inserido;
			

			System.out.println("O n�mero digitado � PAR:" + "\nA raiz do mesmo �: " + raiz);
		}
		
		else{
			elevado = Math.pow(inserido, 2.0);
				System.out.println("O n�mero digitado � �MPAR!" + "\nE o mesmo elevado �: " + elevado);	
		}

	}
	
}