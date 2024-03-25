package aula_001;

//Criando nossas próprias funções

/*
 * Faça um programa, que receba diversos nomes
 *  de frutas do usuário e no final imprima 
 *  essas frutas em ordemcontrária. 
 *  O programa  deve solicitar ao usuário quantas frutas ele 
 *  quer informar.
 *  
 *  Informe quantas frutas deseja cadastrar:
 *  2
 *  
 *  Informe o nome de uma fruta:
 *  Manga
 *  
 *  Informe o nome de uma fruta:
 *  goiaba
 *  
 *  goiaba
 *  manga
 */
import java.util.Scanner;

public class Programa_016 {
	// Declaração do vetor
	static String frutas[];

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int qtd;

		System.out.println("Informe a quantidade de frutas para cadastrar:");
		qtd = Integer.parseInt(teclado.nextLine());

		teclado.close();
	}

	/*
	 * Uma função deve ter o seguinte: 
	 * a) Tipo de retorno (Tipo de dado que a função vai retornar); 
	 * b) Nome - Corresponde a ação que a função realiza; 
	 * c)Parâmetros/Argumentos de entrada (Opicional); 
	 * d) Retorno (Opicional - depende do tipo de retorno);
	 */

	// void = vazio (Quando a função não retorna nada);
	static void cadastrar_dados(int qtd) {

		frutas = new String[qtd];

		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o nome da fruta: ");
			frutas[i] = teclado.next();
		}

	}
	
	static void mostrar_dados(int qtd) {
		for (int i = qtd - 1; i >= 0; i--) {
			System.out.println(frutas[i]);
		}
		
	}
}
