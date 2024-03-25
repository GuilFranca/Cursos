package aula_001;

import java.util.Scanner;

public class Programa_005 {

	public static void main(String[] args) {
		int num = 3, num2 = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de num: ");
		num = teclado.nextInt();
		
		num = (num2 > 0) ? num2 : 7;
		
		System.out.println("O valor de num: " + num +"\nO valor de num2: " + num2);
		
		teclado.close();
		
	}
}
