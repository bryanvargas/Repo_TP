package com.repo.tp;

import java.util.ArrayList;


public class Parametro <T1,T2>{
	private T1 dim;
	private T2 angulo;
	ArrayList<Parametro<T1,T2>> parametros;
	
	
	public Parametro(){
		parametros=new ArrayList<Parametro<T1,T2>>();
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

	public Parametro<T1,T2> iesimo(int i){
		return  parametros.get(i);
	}
	
	public int cantidadParametros(){
		return this.parametros.size();
	}
	public void agregar(T1 i, T2 d) {
		this.parametros.add(new Parametro<T1,T2>(i,d));	
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((angulo == null) ? 0 : angulo.hashCode());
		result = prime * result + ((dim == null) ? 0 : dim.hashCode());		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		@SuppressWarnings("unchecked")
		Parametro<T1,T2> other = (Parametro<T1, T2>) obj;
		if (angulo == null) {
			if (other.angulo != null)
				return false;
		} else if (!angulo.equals(other.angulo))
			return false;
		if (dim == null) {
			if (other.dim != null)
				return false;
		} else if (!dim.equals(other.dim))
			return false;

		return true;
	}

	public String toString(){		
		String salida = "";		
		for(int i=0;i<parametros.size();i++){
			salida+= " Dimencion"+(i+1)+": " +"("+parametros.get(i).dim.toString()+")"+
						" angulo: "+ "("+parametros.get(i).angulo.toString()+"); ";
		}
		
		return salida;
	}



}
