package exe_secao_05;

import java.util.Scanner;

public class exe_05 {

	public static void main(String[] args) {
		
		int soma = 0, salvo = 0;
		
		Scanner teclado = new Scanner(System.in);
				
		for(int num = 0;num < 3;num++) {
			System.out.println("Digite um número: ");
			soma = Integer.parseInt(teclado.nextLine());
			salvo = salvo + soma;
		}
		System.out.println("O valor da soma de todos esses números é: " + salvo);	
		
		teclado.close();
	}
}
