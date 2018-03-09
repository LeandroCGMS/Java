package com.leandro.aula46.labs;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
	private double ladoQuadrado;
	
	
	
	public double getLadoQuadrado() {
		return ladoQuadrado;
	}

	public void setLadoQuadrado(double ladoQuadrado) {
		this.ladoQuadrado = ladoQuadrado;
	}

	@Override
	public void calcularArea() {
		double areaQuadrado1 = Math.pow(ladoQuadrado, 2);
		double areaCubo = areaQuadrado1 * 6;
		System.out.print(areaCubo);
		
	}

	@Override
	public void calcularVolume() {
		double volume = Math.pow(this.ladoQuadrado, 3);
		System.out.print(volume + "\n");
		
	}

}
