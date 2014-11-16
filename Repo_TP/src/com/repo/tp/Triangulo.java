package com.repo.tp;

public class Triangulo extends Poligono {
	public Triangulo(String nombre) {
		super(nombre);
		this.setCaras(3);
		}	

	/**
	 * Formula de Heron
	 */
	@Override
	public double area(){
		double a = this.getDimenciones().iesimo(0).getDim();
		double b = this.getDimenciones().iesimo(1).getDim();
		double c = this.getDimenciones().iesimo(2).getDim();
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		
	}
	
}
