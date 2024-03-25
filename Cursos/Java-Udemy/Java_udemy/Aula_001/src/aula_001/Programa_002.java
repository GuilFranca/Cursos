package aula_001;

import java.util.Scanner;

public class Programa_002 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade: ");
		
		idade = teclado.nextInt();
		
		System.out.println("Eu tenho " + idade + " anos.");
		
		teclado.close();
	}
	
}
