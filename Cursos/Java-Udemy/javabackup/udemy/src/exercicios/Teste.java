package exercicios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        System.out.print("Digite o número de faltas do aluno: ");
        int faltas = scanner.nextInt();

        char conceito;

        if (faltas <= 20) {
            if (nota >= 9.0) {
                conceito = 'A';
            } else if (nota >= 7.5) {
                conceito = 'B';
            } else if (nota >= 5.0) {
                conceito = 'C';
            } else if (nota >= 4.0) {
                conceito = 'D';
            } else {
                conceito = 'E';
            }
        } else {
            if (nota >= 9.0) {
                conceito = 'B';
            } else if (nota >= 7.5) {
                conceito = 'C';
            } else if (nota >= 5.0) {
                conceito = 'D';
            } else if (nota >= 4.0) {
                conceito = 'E';
            } else {
                conceito = 'E';
            }
        }

        System.out.println("O conceito do aluno é: " + conceito);

        scanner.close();
    }
}
