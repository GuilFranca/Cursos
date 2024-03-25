package exercicios;

import java.util.Scanner;

public class Ex_34 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int faltas;
		double nota;
		String nome;

		do {
			System.out.println("Escreva o nome do aluno: ");
			nome = teclado.next();

			System.out.println("Digite a nota do meliante: ");
			nota = teclado.nextDouble();

			System.out.println("Digte o número de faltas: ");
			faltas = teclado.nextInt();

			char conceito = 'E';

			if (nota < 0 || nota > 10 || faltas < 0) {
				System.out.println("Valor inválido. \nEscreva novamente.");
			} else {

				if (faltas <= 20) {
					if (nota >= 9) {
						conceito = 'A';
					} else if (nota >= 7.5) {
						conceito = 'B';
					} else if (nota >= 5) {
						conceito = 'C';
					} else if (nota >= 4) {
						conceito = 'D';
					} else {
						conceito = 'E';
					}
				} else {
					if (nota >= 9) {
						conceito = 'B';
					} else if (nota >= 7.5) {
						conceito = 'C';
					} else if (nota >= 5) {
						conceito = 'D';
					} else {
						conceito = 'E';
					}
				}

			}

			System.out.println("O aluno " + nome + " recebeu o conceito: " + conceito + "\nNotas: " + nota
					+ "\nFaltas: " + faltas);

		} while (nota < 0 || nota > 10 || faltas < 0);

		teclado.close();
	}
}