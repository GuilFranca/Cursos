package exe_secao_05;

import java.util.Scanner;

public class exe_07 {

	public static void main(String[] args) {
		
		float soma = 0, salvo = 0, media = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int num = 0; num < 3;num++) {
			System.out.println("Digite um número: ");
			soma = teclado.nextFloat();
			
			if(soma > 0) {
				salvo = salvo + soma;
				media++;
			}
			
		}
		
		float mediam = salvo / media;
		
		System.out.println("Media: " + media);
		System.out.println("A media dos números é de: " + mediam);
		
		teclado.close();
	}
	
}
