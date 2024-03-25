package exercicios;

import java.util.Scanner;

public class Ex_41 {
	public static void main(String[] args) {
		int iniciador;

		double peso, altura, imc;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite 1 para fazer o calculo IMC \nDigite 2 para sair");
		iniciador = teclado.nextInt();

		while (iniciador == 1) {

			System.out.println("Digite o seu peso: ");
			peso = teclado.nextDouble();

			System.out.println("Digite a sua altura: ");
			altura = teclado.nextDouble();

			imc = peso / (altura * altura);

			String imcFormatado = String.format("%.2f", imc);
			
			System.out.printf("O seu IMC é: " + imcFormatado + " ");

			if (imc < 18.5) {
				System.out.println("Abaixo do peso.");
			} else if (18.6 <= imc && imc <= 24.9) {
				System.out.println("Saudável.");
			} else if (25 <= imc && imc <= 29.9) {
				System.out.println("Peso em excesso");
			} else if (30 <= imc && imc <= 34.9) {
				System.out.println("Obesidade Grau I");
			} else if (35 <= imc && imc <= 39.9) {
				System.out.println("Obesidade Grau II (severa)");
			} else if (40 <= imc) {
				System.out.println("Obesidade Grau III (mórbida)");
			}

			System.out.println("Digite 1 para fazer o calculo IMC \nDigite 2 para sair");
			iniciador = teclado.nextInt();

		}

		teclado.close();
	}
}
