package com.repo.tp;

public class Trapecio extends Poligono{
	
	public Trapecio(String nombre) {
		super(nombre);
		this.setCaras(4);

	}
	@Override
	public double area(){		
		double baseMayor = this.getDimenciones().iesimo(0).getDim();
		double b = this.getDimenciones().iesimo(1).getDim();
		double baseMenor = this.getDimenciones().iesimo(2).getDim();
		double d = (baseMayor-baseMenor)/2;;
		double altura = Math.sqrt(Math.pow(b, 2)-Math.pow(d, 2));
		return (((baseMayor+baseMenor)/2)*altura);	
	}
}
