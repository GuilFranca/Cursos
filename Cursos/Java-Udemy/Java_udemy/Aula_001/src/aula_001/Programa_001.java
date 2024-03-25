//Variáveis
package aula_001;

import java.util.Scanner;

public class Programa_001 {

	public static void main(String[] args) {

		float numf;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um número float: ");

		numf = teclado.nextFloat();

		System.out.println("Você digitou: " + numf);

		teclado.close();
	}
}
/*
 * Declaração de variável int valor;
 * 
 * //Declaração de variáveis int num1, num2, num3;
 * 
 * //Declarando e inicializando algumas variáveis int num4, num5 = 4, num6 =7,
 * num8;
 * 
 * char caractere; float preco; }
 */
