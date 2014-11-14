package com.repo.tp;

public class Elipse extends Figura {

	public Elipse(String nombre,Parametro<Double,Integer> dimenciones) {
		super(nombre,dimenciones);

	}

	@Override
	public double area() {		
		return Math.PI*this.dimenciones.iesimo(0).getDim()*
					this.dimenciones.iesimo(1).getDim();
	}

	@Override
	public double perimetro() {
		double a = Math.pow(this.dimenciones.iesimo(0).getDim(),2);
		double b =Math.pow(this.dimenciones.iesimo(1).getDim(), 2);
		return 2*Math.PI*(Math.sqrt((a+b)/2));
	}
	

}
