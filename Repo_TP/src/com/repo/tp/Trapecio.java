package com.repo.tp;

public class Trapecio extends Poligono{
	
	public Trapecio(String nombre) {
		super(nombre);

	}
	@Override
	public double area() {
		
		return	((this.dimenciones.iesimo(0).getDim()+
					this.dimenciones.iesimo(1).getDim())/2)*
					this.dimenciones.iesimo(2).getDim();
			
		}

}
