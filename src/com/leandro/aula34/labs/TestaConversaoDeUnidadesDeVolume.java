package com.leandro.aula34.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestaConversaoDeUnidadesDeVolume {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat formato = new DecimalFormat("###################.########");

	public static void main(String[] args) {

		tela();

	}

	public static void tela() {
		int op = 0;
		boolean menuValido = false;
		double litros = 0;
		double metros = 0;
		double galaoAmericano = 0;

		while (!menuValido) {
			System.out.println("\t\tConvers�o de Unidades de Volume" + "\n\t\t1) Litros para Cent�metros C�bicos;"
					+ "\n\t\t2) Metros C�bicos para Litros;" + "\n\t\t3) Metros C�bicos para P�s C�bicos;"
					+ "\n\t\t4) Gal�o Americano para Polegadas C�bicas;" + "\n\t\t5) Gal�o Americano para Litros;"
					+ "\n\t\t6) Sair.");
			op = scan.nextInt();
			if (op > 0 && op < 7) {
				menuValido = true;
			} else {
				System.out.println("Op��o inv�lida. Tente novamente.");
			}

		}

		switch (op) {
		case 1:
			System.out.println("Litros: ");
			litros = scan.nextDouble();
			System.out.println(formato.format(litros) + " litro(s) = " + ConversaoDeUnidadesDeVolume.converterLC(litros)
					+ " cm�.");
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) N�o]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOp��o inv�lida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}

			break;
		case 2:
			System.out.println("Metros: ");
			metros = scan.nextDouble();
			System.out.println(formato.format(metros) + " m� = " + ConversaoDeUnidadesDeVolume.converterML(metros)
					+ " litros.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) N�o]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOp��o inv�lida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2) {
					System.exit(0);
				}
			}
			
			break;
		case 3:
			System.out.println("Metros: ");
			metros = scan.nextDouble();
			System.out.println(formato.format(metros) + " m� = " + ConversaoDeUnidadesDeVolume.converterMP(metros)
					+ " ft�.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) N�o]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOp��o inv�lida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}
			
			break;
		case 4:
			System.out.println("Gal�o Americano: ");
			galaoAmericano = scan.nextDouble();
			System.out.println(formato.format(galaoAmericano) + " gal�o(�es) americano(s) = "
					+ ConversaoDeUnidadesDeVolume.converterGP(galaoAmericano) + " in�.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) N�o]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOp��o inv�lida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}
			
			
			break;
		case 5:
			System.out.println("Gal�o Americano: ");
			galaoAmericano = scan.nextDouble();
			System.out.println(formato.format(galaoAmericano) + " gal�o(�es) americano(s) = "
					+ ConversaoDeUnidadesDeVolume.converterGL(galaoAmericano) + " litros.");
			
			menuValido = false;
			op = 0;
			while (!menuValido) {
				System.out.println("Continuar convertendo? [1) Sim / 2) N�o]");
				op = scan.nextInt();
				if (op > 0 && op < 3) {
					menuValido = true;
				} else {
					System.out.println("\t\tAviso" + "\n\t\tOp��o inv�lida. Tente novamente.");
				}
				if (op == 1) {
					tela();
				} else if(op == 2){
					System.exit(0);
				}
			}
			break;
		case 6:
			System.exit(0);
			break;
		}
	}

}
