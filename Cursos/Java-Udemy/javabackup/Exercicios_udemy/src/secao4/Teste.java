package secao4;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		double num;
		double num1 = 2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = teclado.nextDouble();
		
		double num2;
		
		num2 = num + num1;
		
		System.out.println(num2);
	}
}
