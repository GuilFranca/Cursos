package exe_secao_05;

public class exe_02 {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		
		while(num1 <= 100) {
			System.out.println(num1);
			num1 = num1 + 1;
		}
		System.out.println("O número é igual a 100.");
		
		do {
			System.out.println(num2);
			num2 = num2 + 1;
		}while(num2 <= 100);
		System.out.println("O número é igual a 100.");
		
		for(int num3 = 0;num3 <= 100;num3++) {
			System.out.println(num3);
		}
		System.out.println("O número é igual a 100.");
	}
}

