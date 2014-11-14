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
	 
//	 @Override
//	 public boolean equals(Object obj) {
//	 boolean cierto = false;
//	 if (!(obj instanceof Triangulo)){
//	 throw new IllegalArgumentException("Ud. quiere ver si son iguales dos cosas que no son del mismo tipo");
//	 }
//	 Triangulo uno = (Triangulo) obj;
//	 if (this.dimenciones.iesimo(0).getDim() == uno.dimenciones.iesimo(0).getDim() && 
//			 this.dimenciones.iesimo(0).getDim() == uno.dimenciones.iesimo(0).getDim());
//	 cierto = true;
//	 return cierto;
//	 }
}
