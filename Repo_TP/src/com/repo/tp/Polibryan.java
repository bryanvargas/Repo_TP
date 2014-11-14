package com.repo.tp;

public class Polibryan extends Poligono{

	public Polibryan(String nombre,Parametro<Double,Integer> dimenciones){
		super(nombre,dimenciones);
		
	}

	@Override
	public double area() {		
		return 0;
	}
	
//	public String toString(){
//		String salida="";
//		for(Parametro a:this.dim){
//			salida += "lado: "+a.toString();
//		}
//		return salida;
//	}
	

}
