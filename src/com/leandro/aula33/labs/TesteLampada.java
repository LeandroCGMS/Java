package com.leandro.aula33.labs;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lamp = new Lampada();
		boolean estado = true;
		if(lamp.desligarLampada(estado) == true) {
			System.out.println("A l�mpada foi desligada com sucesso;");
		} else {
			System.out.println("Ao executar o m�todo de desligar a l�mpada, ela permaneceu"
					+ " no seu estado padr�o.");
		}
		estado = true;
		if(lamp.ligarLampada(estado) == true) {
			System.out.println("A l�mpada foi ligada com sucesso.");
		} else {
			System.out.println("Ao executar o m�todo de ligar a l�mpada, ela permaneceu no estado"
					+ " padr�o.");
		}

	}

}
