package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int a, b;
			
			System.out.println("Digite o Primeiro Numero: ");
			a = scan.nextInt();
			System.out.println("Digite o Segundo Numero: ");
			b = scan.nextInt();
			
			int soma = soma(a,b);
			int subtracao = subtracao(a,b);
			int multiplicacao = multiplicacao(a,b);
			int divisao = divisao(a,b);
			
			System.out.println("A Soma dos Numeros �: " + soma);
			System.out.println("A Subtra��o dos Numeros �: " + subtracao);
			System.out.println("A Multiplica��oa dos Numeros �: " + multiplicacao);
			System.out.println("A Divis�o dos Numeros �: " + divisao);
		}
				
			
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	
	
}
