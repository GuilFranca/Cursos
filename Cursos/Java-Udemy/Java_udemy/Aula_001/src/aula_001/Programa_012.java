package aula_001;

//Tipos de dados
//Numéricos (Inteiros e Reais)
public class Programa_012 {

	public static void main(String[] args) {
		// tipos primários/primitivos obs: ocupa menos dados
		// Por padrão, os números reais em Java são considerados double
		float preco = 23.45555555f; // 23.40
		double preco2 = 23.4555555555555; // 23.4561187151651

		// Tipos não primários/primitivos obs: utilizado para fazer conversão
		Float preco3 = 44.55555555555555f;
		Double preco4 = 44.5555555555555555;

		System.out.println("float -> preco = " + preco);
		System.out.println("double -> preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);

		System.out.println("\n");

		System.out.println("float/Float = " + Float.SIZE + " bits");
		System.out.println("double/Double = " + Double.SIZE + " bits");

		System.out.println("\n");

		System.out.println("Valor Min float/Float " + Float.MIN_VALUE);
		System.out.println("Valor Max float/Float " + Float.MAX_VALUE);

		System.out.println("\n");

		System.out.println("Valor Min double/Double " + Double.MIN_VALUE);
		System.out.println("Valor Max double/Double " + Double.MAX_VALUE);
	}

}
