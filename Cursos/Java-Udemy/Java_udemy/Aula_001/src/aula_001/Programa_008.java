package aula_001;

import java.util.Scanner;

public class Programa_008 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int idade;
		String nome;
		
		//Primeiro executa o bloco, depois faz a checagem.
		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //bug
			idade = Integer.parseInt(teclado.nextLine());

			if(idade > 0) {
				System.out.println(nome + "tem" + idade + "anos");
			}
		} while(idade > 0);

		teclado.close();

	}

}
