package com.leandro.aula34.labs;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		System.out.println("Teste do m�todo somar(): " + Calculadora.somar(10, 10));
		
		System.out.println("Teste do m�todo subtrair(): " + Calculadora.subtrair(50, 40));
		
		System.out.println("Teste do m�todo multiplicar(): " + Calculadora.multiplicar(10, 10));
		
		System.out.println("Teste do m�todo dividir(): " + Calculadora.dividir(1000, 2));
		
		System.out.println("Teste do m�todo elevar(): " + Calculadora.elevar(5, 5));
		
		// EXERC�CIO 3 NESSA MESMA CLASSE
		System.out.println("Teste do m�todo fatorar(): " + Calculadora.fatorar(10));
		

	}

}
