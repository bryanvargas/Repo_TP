package com.repo.tp;

public class Circulo extends Figura {

	public Circulo(String nombre, Parametro<Double,Integer> dimenciones ) {
		super(nombre, dimenciones);
	}
	@Override
	public double area() {	
		return  (Math.pow(Math.PI * this.dimenciones.iesimo(0).getDim(), 2));
	}
	
	@Override
	public double perimetro() {		
		return (2 * Math.PI * this.dimenciones.iesimo(0).getDim());
	}

	
	
	
	



}
