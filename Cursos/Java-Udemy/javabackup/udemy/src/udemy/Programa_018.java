package udemy;

//Matrizes
/*
 Vetores/arrays/matrizes multi-dimensionais
 
 //Vetor
 int numeros[3];
 numeros[0] = 3;
 numeros[1] = 2;
 numeros[2] = 5;
 
 //Matriz
 [linhas] [colunas]
 int numeros[3][5]
 
 numeros[0][0] = 1; { {1,2,3}, {4,5,6}, {7,8,9} }
 numeros[0][1] = 2;   {4,5,6}
 numeros[0][2] = 3;   {7,8,9}
 numeros[1][0] = 4; 	
 numeros[1][1] = 5;
 numeros[1][2] = 6;
 numeros[2][0] = 7;
 numeros[2][1] = 8;
 numeros[2][2] = 9;
 */

public class Programa_018 {

	public static void main(String[] args) {
		//Declaração 
		int outros_numeros[][];
		
		//Declaração, definição de tamanho
		int numeros[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		//Declarar uma matriz informando somente as linhas
		int matriz[][] = new int[2][];
		matriz[0] = new int[5];
		matriz[1] =new int[3];
		
		int nova_matriz[][] = { {1, 2}, {4, 5, 6, 7 ,8}, {9, 10, 11} };
		
		
	}
}
