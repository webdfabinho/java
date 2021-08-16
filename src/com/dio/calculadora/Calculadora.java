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
			
			System.out.println("A Soma dos Numeros é: " + soma);
			System.out.println("A Subtração dos Numeros é: " + subtracao);
			System.out.println("A Multiplicaçãoa dos Numeros é: " + multiplicacao);
			System.out.println("A Divisão dos Numeros é: " + divisao);
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
