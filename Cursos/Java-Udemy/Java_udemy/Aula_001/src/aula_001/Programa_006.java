package aula_001;

import java.util.Scanner;

public class Programa_006 {

	public static void main(String[] args) {
		
		int n1, n2, n, op;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite 1 para somar e 2 para subtrair: ");
		op = teclado.nextInt();
		
		System.out.println("Digite o valor de n1: ");
		n1 = teclado.nextInt();
		
		System.out.println("Digite o valor de n1: ");
		n2 = teclado.nextInt();
		
		
		switch (op) {
		case 1:
			n = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + n);
			break;
		case 2:
			n = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + n);
			break;
		default:
			System.out.println("Deu erro aí garaio");
			break;
		}
		
		teclado.close();
	}
	
}
