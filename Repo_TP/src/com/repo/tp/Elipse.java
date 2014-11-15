package com.repo.tp;

public class Elipse extends Figura {

	public Elipse(String nombre) {
		super(nombre);

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
	
	@Override
	public String toString(){
		String salida = "";		
		for(int i=0;i<dimenciones.pares.size();i++){
			salida+= " radio"+(i+1)+": " +"("+dimenciones.pares.get(i).getDim()+")";
		}		
		return salida;

	}
	
}
