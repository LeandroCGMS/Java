package com.leandro.aula34.labs;

import java.util.Scanner;

public class TesteConversaoDeUnidadesDeArea {
	static Scanner scan = new Scanner(System.in);
	private static String[] args;

	public static void main(String[] args) {
		double metros;
		double pes;
		double milhas;
		double acres;
		int op = 0;
		boolean menuValido = false;

		while (!menuValido) {
			System.out.println("\t\tConversor de Unidades de Medidas de �reas" + "\n\n\t\t1) Metros para P�s Quadrados;"
					+ "\n\t\t2) P�s para Cent�metros quadrados;" + "\n\t\t3) Milhas para Acres quadrados;"
					+ "\n\t\t4) Acres para P�s quadrados;" + "\n\t\t5) Sair do programa.");
			op = scan.nextInt();
			if (op > 0 && op < 6) {
				menuValido = true;
			} else {
				System.out.println("Op��o inv�lida. Tente novamente.");
			}
			
		}

		if (op == 1) {
			System.out.println("Digite a metragem que quer converter para p�s quadrados.");
			metros = scan.nextDouble();
			System.out.println(
					metros + " metros quadrados: " + ConversaoDeUnidadesDeArea.converterMP(metros) + " p�s quadrados.");
			voltarAoMenu();
		}

		if (op == 2) {
			System.out.println("Digite a medida em p�s quadrados para converter em cent�metros quadrados.");
			pes = scan.nextDouble();
			System.out.println(
					pes + " p�s quadrados: " + ConversaoDeUnidadesDeArea.converterPC(pes) + " cent�metros quadrados.");
			voltarAoMenu();
		}

		if (op == 3) {
			System.out.println("Digite a medida em milhas quadradas para converter em acres quadrados.");
			milhas = scan.nextDouble();
			System.out.println(milhas + " milhas quadrados: " + ConversaoDeUnidadesDeArea.converterMA(milhas)
					+ " acres quadrados.");
			voltarAoMenu();
		}

		if (op == 4) {
			System.out.println("Digite a medida em acres quadrados para converter em p�s quadrados.");
			acres = scan.nextDouble();
			System.out.println(
					acres + " acres quadrados: " + ConversaoDeUnidadesDeArea.converterAP(acres) + " p�s quadrados.");
			voltarAoMenu();
		}

		if (op == 5) {
			System.exit(0);
		}
	}
	
	static void voltarAoMenu() {
		boolean opValido = false;
		int op = 0;
		while ( !opValido ) {
			System.out.println("\t\t1) Voltar ao menu inicial"
					+ "\n\t\t2) Sair");
			op = scan.nextInt();
			if ( op > 0 && op < 3) {
				opValido = true;
			} else {
				System.out.println("Op��o inv�lida. Tente novamente.");
			}
		}
		if( op == 1) {
			TesteConversaoDeUnidadesDeArea.main(args);
		} else if ( op == 2 ) {
			System.exit(0);
		}
		
	}

}
