package com.repo.tp;

public class Cuadrado extends Poligono{
	
	public Cuadrado(String nombre,double lado) {		
		super(nombre, new Parametro<Double,Integer>(lado,90));		
	}

	@Override
	public double area() {	
		return Math.pow(this.dimenciones.iesimo(0).getDim(), 2);
	}


//	@Override
//	public String toString() {		
//		return  super.toString()+"de largo: " + 
//				this.iesimoParametro(0).getX();
//	}


}
