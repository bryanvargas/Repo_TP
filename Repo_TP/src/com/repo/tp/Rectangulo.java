package com.repo.tp;

public class Rectangulo extends Poligono {
	
	public Rectangulo(String nombre, Parametro<Double, Integer> dimenciones){
		super(nombre,dimenciones);
		
	}
	
	public double perimetro(){
		double d= super.perimetro();
		return d*2.0;		
	}
	@Override
	public double area() {
		return this.dimenciones.iesimo(0).getDim()*
				this.dimenciones.iesimo(1).getDim();
	}

//
//
//	@Override
//	public String toString() {
//		return super.nombre + " de base: " + this.iesimoParametro(0).getX() +
//							" y altura " + this.iesimoParametro(0).getY();
//		
//	}
	

}
