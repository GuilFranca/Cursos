package aula_001;

import java.util.Scanner;

public class Programa_004 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número: ");
		
		num = teclado.nextInt();
		
		if(num > 5) {
			System.out.println("Sim, o número " + num + " é maior que 5.");
		} else if(num == 5) {
			System.out.println("O número " + num + " é igual a 5.");
		} else if(num % 2 == 0) {
			System.out.println("O número " + num + " é par.");
		} else {
			System.out.println("O número " + num + " é menor do que 5.");
		}
		
		teclado.close();
	}
}
