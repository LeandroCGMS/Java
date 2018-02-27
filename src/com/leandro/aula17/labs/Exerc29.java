package com.leandro.aula17.labs;

import java.util.Scanner;

public class Exerc29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um n�mero inteiro: ");
		int num = scan.nextInt();
	        
	        for(int i = 2; i <= num; i++) {//N�mero que vai ser verificado
	            int contador = 0;
	            for(int j = 2; j <= i; j++) {//Itera entre 2 e a vari�vel i para verificar se � primo
	                if(i % j == 0) {
	                    contador++;
	                }
	            }
	            if(contador == 1) {//Como todo n�mero inteiro � divisivel por 1, � testado apenas se ele � divisivel por ele mesmo.
	                System.out.println("O n�mero "+ i +" � primo.");
	            }
	        }
	    }
	}
