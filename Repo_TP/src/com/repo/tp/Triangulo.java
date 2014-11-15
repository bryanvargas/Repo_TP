package com.repo.tp;

public class Triangulo extends Poligono {
	public Triangulo(String nombre) {
		super(nombre);
		this.setCaras(3);
		}	
	
	@Override
	public double area() {		
		return (this.dimenciones.iesimo(0).getDim()*
				this.dimenciones.iesimo(1).getDim())/2;
	}	
	
}
