package udemy;

public class Programa_017 {

	public static void main(String[] args) {
		// Declaração e definição de tamanho do vetor
		int numeros[] = new int[10];

		System.out.println("Tamanho do vetor: " + numeros.length);

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
			System.out.println("valor do vetor: " + i + " valor contido no vetor: " + numeros[i]);

			// 0..9
			// numeros[10] = 42;
			// System.out.println("numeros[10]);
			/*
			 * Os vetores/arrays possuem tamanho fixo e não podem ser aumentados/diminuidos
			 */

			numeros[0] = 7;
			System.out.println(numeros[0]); // primeiro elemento

			// numeros[0] = 23.4f;
			/*
			 * Os vetores possuem tipos de dados fixos e não aceitam tipos variados.
			 */

			for (int a = 0; a < numeros.length; a++) {
				numeros[a] = (int) Math.round(Math.random() * 10);
			}

			System.out.println(numeros[0]); // Primeiro elemento
			System.out.println(numeros[9]); // Segundo elemento

			// 0...1 double
			System.out.println(Math.random());

			System.out.println(Math.random() * 10);

			System.out.println(Math.round(Math.random() * 10));

			for( int i1 : numeros) {
				System.out.println(i1);
			}
		}
	}
}


