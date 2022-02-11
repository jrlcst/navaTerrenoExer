package br.com.nava.terrenocalc.implementacao;

import java.util.Scanner;

public class CalcularTerreno {

	public static void main(String[] args) {
		
		double largura;
		double comprimento;
		double area;
		double valor;
		double preco;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();
		
		area = largura * comprimento;
		preco = valor * area;

		System.out.println();
		System.out.printf("Área do terreno = " + area,"%.2f");
		System.out.println();
		System.out.printf("Preço do terreno = " + preco,"%.2f");
	}

}
