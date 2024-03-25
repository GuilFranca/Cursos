package aula_001;

public class Programa_014 {
	public static void main(String[] args) {
		//Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Tipos não primitivos
		Boolean v = true;
		Boolean f = false;
		
		boolean ativo = true;
		
		System.out.println("Verdadeiro: " + verdadeiro);
		System.out.println("falso: " + falso);
		System.out.println("v: " + v);
		System.out.println("f: " + f);
		
		if(verdadeiro) {
			System.out.println("É Verdadeiro");
		}else {
			System.out.println("É Falso");
		}
		
		if(ativo) {
			System.out.println("ativo é verdadeiro.");
		}else {
			System.out.println("... é falso.");
		}
		
	}
}

/*
if(realiza uma verificação que no final retorna ou true ou false)
*/