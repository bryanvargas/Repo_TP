package com.repo.tp;

public class Cubo extends Cuadrado {

	public Cubo(String nombre) {
		super(nombre);
		
	}
	@Override
	public double area(){
		return this.area()*2;
	}	
	
}
