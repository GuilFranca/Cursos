package aula_001;

import java.util.Scanner;

//Operações Matemáticas
public class Programa_015 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor de num1: ");
		num1 = Integer.parseInt(teclado.nextLine());

		System.out.println("Digite o valor de num2: ");
		num2 = Integer.parseInt(teclado.nextLine());

		// Soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + "+" + num2 + " é " + res);

		// Subtração
		res = num1 - num2;
		System.out.println("A subtração de " + num1 + "-" + num2 + " é " + res);

		// Multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação de " + num1 + "*" + num2 + " é " + res);

		// Divisão (Inteira)
		res = num1 / num2;
		System.out.println("A divisão de " + num1 + "/" + num2 + " é " + res);

		// Divisão (Real)
		res2 = (float) num1 / (float) num2; // cast
		System.out.println("A divisão de " + num1 + "/" + num2 + " é " + res2);

		// Módulo
		/*
		 * Se o resto do módulo da variável por 2 for 0, a variável é par. Se o resto
		 * for 1 é impar
		 */
		res = num1 % 2;
		System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);

		res = num2 % 3;
		System.out.println(num2 + " é divisível por 3? " + res);

		if (res == 0) {
			System.out.println("É sim!");
		}

		teclado.close();
	}
}
