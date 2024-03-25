package aula_001;

import java.util.Scanner;

public class Programa_007 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int idade = 1;
		String nome;

		//Sempre checa os valores antes de executar os códigos.
		while (idade > 0) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");
			// idade = teclado.nextInt(); //bug
			idade = Integer.parseInt(teclado.nextLine());

			System.out.println(nome + "tem" + idade + "anos");
		}

		teclado.close();

	}

}
