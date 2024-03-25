package atividade3;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		
		System.out.println("Nome do produto: ");
		produto.produto = teclado.next();
		
		System.out.println("Insira a quantidade: ");
		produto.quantidade = teclado.nextDouble();
		
		System.out.println("Insira o preço individual: ");
		produto.preco = teclado.nextDouble();
		
		System.out.println("Confirmação: " + produto.produto + ", Estoque: " + produto.quantidade + ", Preço: " + produto.preco);
		
		System.out.println("Deseja acrescentar produtos ao estoque?");
		int estoque = teclado.nextInt();
		produto.addProdutos(estoque);
		
		System.out.println("Deseja remover produtos do estoque?");
		estoque = teclado.nextInt();
		produto.subProdutos(estoque);
		
		System.out.println("Confirmação: " + produto.produto + ", Estoque: " + produto.quantidade + ", Preço: " + produto.preco);
		
		teclado.close();
		
	}
}
