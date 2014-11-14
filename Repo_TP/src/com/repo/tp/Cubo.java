package com.repo.tp;

public class Cubo extends Cuadrado {

	public Cubo(String nombre, double lado) {
		super(nombre, lado);
		
	}
	@Override
	public double area(){
		return this.area()*2;
	}	
	
}
