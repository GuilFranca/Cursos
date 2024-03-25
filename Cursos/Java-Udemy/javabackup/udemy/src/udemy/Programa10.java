package udemy;

//Foreach //Para cada
public class Programa10 {

	public static void main(String[] args) {
		
		String nome = "Geek University";
		
		//Para cada um dos caracteres da string, imprima o caractere.
		for (char letra : nome.toCharArray()) {
			//System.out.println(letra); //pula uma linha pra cada caractere.
			System.out.print(letra);
		}
	}
}
