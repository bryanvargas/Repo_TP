package com.repo.tp;

public class Elipse extends Figura {

	public Elipse(String nombre) {
		super(nombre);
		this.caras = 2;

	}

	@Override
	public double area() {		
		return Math.PI*this.parametros.iesimo(0).getDim()*
					this.parametros.iesimo(1).getDim();
	}

	@Override
	public double perimetro() {
		double a = Math.pow(this.parametros.iesimo(0).getDim(),2);
		double b =Math.pow(this.parametros.iesimo(1).getDim(), 2);
		return 2*Math.PI*(Math.sqrt((a+b)/2));
	}
	
	@Override
	public String toString(){
		String salida = this.nombre+ "";		
		for(int i=0;i<parametros.parametros.size();i++){
			salida+= " radio"+(i+1)+": " +"("+parametros.parametros.get(i).getDim()+")";
		}		
		return salida;

	}
	
}
