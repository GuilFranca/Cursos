package exercicios;

import java.util.Scanner;

public class Ex_27 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a idade do nadador: ");
		idade = teclado.nextInt();
		
		if(idade < 5) {
			System.out.println("Idade inválida.");
		} else if(idade >= 5 && idade <= 7) {
			System.out.println("O nadador faz parte da categoria Infantil A.");
		} else if(idade >= 8 && idade <= 10) {
			System.out.println("O nadador faz parte da categoria Infantil B.");
		} else if(idade >= 11 && idade <= 13) {
			System.out.println("O nadador faz parte da categoria Juvenil A.");
		} else if(idade >= 14 && idade <= 17) {
			System.out.println("O nadador faz parte da categoria Juvenil B.");
		} else if(idade >= 18) {
			System.out.println("O nadador faz parte da categoria Sênior.");
		}
		
		teclado.close();
	}
	
}
