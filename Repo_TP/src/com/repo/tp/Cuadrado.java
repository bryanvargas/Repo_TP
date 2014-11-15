package com.repo.tp;

public class Cuadrado extends Rectangulo{
//	
//	public Cuadrado(String nombre,Parametro<Double, Integer> dimenciones) {		
//		super(nombre, dimenciones);		
//	}
//	@Override
//	public double area() {	
//		return Math.pow(this.dimenciones.iesimo(0).getDim(), 2);
//	}
	
	
	public Cuadrado(String nombre,double lado) {		
		super(nombre,agregarDimencion(lado, 90));
	
	}
	
//	
//	public static Parametro<Double, Integer> agregars(double lado){
//		Parametro<Double,Integer> p = new Parametro<Double,Integer>();
//		p.agregar(lado, 90);
//		return p;
//	}
	@Override
	public double area() {	
		return Math.pow(this.dimenciones.iesimo(0).getDim(), 2);
	}

}
