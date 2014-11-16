package com.repo.tp;

public class Rectangulo extends Poligono {
	
	public Rectangulo(String nombre){
		super(nombre);
		this.setCaras(2);
		
	}

	@Override
	public double perimetro(){
		double d= super.perimetro();
		return d*2.0;		
	}
	@Override
	public double area() {
		return this.parametros.iesimo(0).getDim()*
				this.parametros.iesimo(1).getDim();
	}

}
