package com.repo.tp;

import java.util.ArrayList;


public class Parametro <T1,T2>{
	private T1 dim;
	private T2 angulo;
	ArrayList<Parametro<T1,T2>> pares;
	
	
	public Parametro(){
		pares=new ArrayList<Parametro<T1,T2>>();
		}

	public Parametro(T1 dim,T2 angulo){
		this.dim=dim;
		this.angulo =angulo;
	}	
	public T1 getDim() {
		return dim;
	}

	public void setDim(T1 dim) {
		this.dim = dim;
	}




	public T2 getAngulo() {
		return angulo;
	}




	public void setAngulo(T2 angulo) {
		this.angulo = angulo;
	}




	public void agregar(Parametro<T1,T2> p){
		pares.add(p);	
	}
	
	public Parametro<T1,T2> iesimo(int i){
		return  pares.get(i);
	}
	
	
	
	public String toString(){		
		String salida = "";
		//for(Parametro<T1,T2> p : pares)
			//salida +=" dimencion y angulo: "+p.angulo.toString()+" "+p.dim.toString();
		for(int i=0;i<pares.size();i++){
			salida+= " de largo"+(i+1)+": " +"("+pares.get(i).dim.toString()+")"+
						" angulo: "+ "("+pares.get(i).angulo.toString()+"); ";
		}
		
		return salida;
	}

	public void agregar(T1 i, T2 d) {
		this.pares.add(new Parametro<T1,T2>(i,d));	
	}

}
