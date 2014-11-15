package com.repo.tp;

public class Cuadrado extends Rectangulo{
	
	public Cuadrado(String nombre) {		
		super(nombre);
		this.setCaras(1);
	}

	@Override
	public double area() {	
		return Math.pow(this.dimenciones.iesimo(0).getDim(), 2);
	}
	

}
