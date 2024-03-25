package udemy;

import java.util.Scanner;

public class Programa004 {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		num = teclado.nextInt();
		
		if(num > 5) {
			System.out.println("O número " + num + " é maior que 5");
		} else if(num == 5){
			System.out.println("O número " + num + " é igual a 5.");
		} else if(num % 2 == 0) {
			System.out.println("O número " + num + " é par");
		}else{
			System.out.println("O número " + num + " não é maior que 5.");
		}
		
		teclado.close();
	}
}
