package view;

import java.util.Scanner;
import controller.FatorialController;

// Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
// recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):

public class main {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		FatorialController fatorialRecursiva = new FatorialController();
		int n = 0;
		
		System.out.println("Digite um número para calcular o fatorial: ");
		do {
			n = in.nextInt();
			
			if (n < 0 || n > 12) {
				System.out.println("O numero deve ser entre 0 ou 12!\n");
				System.out.println("Digite outro número para calcular o fatorial: ");
			}
		} while(n < 0 || n > 12);
		
		
		int result = fatorialRecursiva.fatorial(n);
			
		System.out.println("O resultado do fatorial de " + n + " é " + result);
		
	}

}
