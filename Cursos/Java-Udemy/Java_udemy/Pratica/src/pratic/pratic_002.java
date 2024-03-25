package pratic;

public class pratic_002 {

	public static void main(String[] args) {

		int numeros[] = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 2; //(int)Math.round(Math.random() *10);
			System.out.println("Vetor: " + i + " Valor contido: " + numeros[i]);
			
		}
		
		for (int i : numeros) {
			System.out.println(i);
		}
		
		
	}
}
