package com.repo.tp;

public class Trapecio extends Poligono{
	
	public Trapecio(String nombre) {
		super(nombre);
		this.setCaras(4);

	}
	@Override
	public double area() {
		
		return	((this.parametros.iesimo(0).getDim()+
					this.parametros.iesimo(1).getDim())/2)*
					this.parametros.iesimo(2).getDim();
			
		}
	//@Override
	public double areas(){		
		double baseMayor = this.getDimenciones().iesimo(0).getDim();
		double b = this.getDimenciones().iesimo(1).getDim();
		double baseMenor = this.getDimenciones().iesimo(2).getDim();
		double d = baseMayor+baseMenor;
		double altura = Math.sqrt(Math.pow(d, 2)+Math.pow(b, 2));
		return ((baseMayor+baseMenor)*altura)/2;	
	}
}
