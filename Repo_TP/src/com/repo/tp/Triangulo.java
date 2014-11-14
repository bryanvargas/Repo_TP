package com.repo.tp;

public class Triangulo extends Poligono {
	public Triangulo(String nombre,Parametro<Double,Integer> dimenciones) {
		super(nombre, dimenciones);	
	}
	@Override
	public double area() {		
		return (this.dimenciones.iesimo(0).getDim()*
				this.dimenciones.iesimo(0).getDim())/2;
	}
	
	 public String toString() {
		 return super.toString() + " de base "+ 
				 this.dimenciones.iesimo(0).getDim()+ 
				 " de altura " + this.dimenciones.iesimo(0).getDim();
				 
				 
	 }
}
