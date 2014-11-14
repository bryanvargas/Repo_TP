package com.repo.tp;

public class Trapecio extends Poligono{
	
	public Trapecio(String nombre,Parametro<Double, Integer> dimenciones) {
		super(nombre, dimenciones);

	}
	@Override
	public double area() {
		
		return	((this.dimenciones.iesimo(0).getDim()+
					this.dimenciones.iesimo(1).getDim())/2)*
					this.dimenciones.iesimo(2).getDim();
			
		}

		
	
	
	@Override
	public String toString() {	
		
		return super.toString()+" base B " + this.dimenciones.iesimo(1).getDim()
				+" base b " +this.dimenciones.iesimo(2).getDim()+
				" altura "+this.dimenciones.iesimo(3).getDim();
	}

}