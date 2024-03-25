package pratic;

import java.util.Scanner;

public class pratic_001 {
	public static void main(String[] args) {
		
		String operador;
		int num1 = 0, num2, num3, resu;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Para inicializar\n \ncalculadora digite: 1\nPara encerrar digite: 0");
		
		num1 = Integer.parseInt(teclado.nextLine());
		
		while (num1 == 1) {
			
			System.out.println("-=-=-=-=-=Calculadora-=-=-=-=-=");
			System.out.println("Digite qual operação deseja realizar: \n\nPara somar digite: +\nPara subtrair digite: -\nPara multiplicar digite: *\nPara dividir digite: /\n");
			
			operador = teclado.nextLine();
			
			switch (operador) {
			case "+":
				System.out.println("Digite n1:");
				num2 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("Digite n2:");
				num3 = Integer.parseInt(teclado.nextLine());
				
				resu = num2 + num3;
				
				System.out.println(num2 + " + " + num3 + " = " + resu);
				
				break;
				
			case "-":
				System.out.println("Digite n1:");
				num2 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("Digite n2:");
				num3 = Integer.parseInt(teclado.nextLine());
				
				resu = num2 - num3;
				
				System.out.println(num2 + " - " + num3 + " = " + resu);
				
				break;
				
			case "*":
				System.out.println("Digite n1:");
				num2 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("Digite n2:");
				num3 = Integer.parseInt(teclado.nextLine());
				
				resu = num2 * num3;
				
				System.out.println(num2 + " * " + num3 + " = " + resu);
				
				break;
				
			case "/":
				System.out.println("Digite n1:");
				num2 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("Digite n2:");
				num3 = Integer.parseInt(teclado.nextLine());
				
				resu = num2 / num3;
				
				System.out.println(num2 + " / " + num3 + " = " + resu);
				
				break;
			}
			
			System.out.println("\nPara Reinicializar a calculadora digite: 1\nPara encerrar digite: 0");
			
			num1 = Integer.parseInt(teclado.nextLine());
		}
		
		teclado.close();
		
	}
}
