package com.repo.tp;

import java.util.ArrayList;


public class Parametro <T1,T2>{
	private T1 param;//parametro generico
	private T2 angulo;
	ArrayList<Parametro<T1,T2>> parametros;
	
	
	public Parametro(){
		parametros=new ArrayList<Parametro<T1,T2>>();
	}
	
	public Parametro(T1 dim,T2 angulo){	
		this.param=dim;
		this.angulo =angulo;
		
	}
	
	public T1 getDim() {
		return param;
	}

	public void setDim(T1 dim) {
		this.param = dim;
	}
	
	public T2 getAngulo() {
		return angulo;
	}
	
	public void setAngulo(T2 angulo) {
		this.angulo = angulo;
	}
	
	/** 
	 * @param index
	 * @return devuelve el el el i-parametro<T1,T2>
	 */
	public Parametro<T1,T2> iesimo(int index){
		return  parametros.get(index);
	}
	
	/**
	 * @return cantidad de parametros
	 */
	public int cantidadParametros(){
		return this.parametros.size();
	}
	
	/**
	 * @param parametro generico
	 * @param angulo generico
	 */
	public void agregar(T1 param, T2 angulo) {
		this.parametros.add(new Parametro<T1,T2>(param,angulo));	
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((angulo == null) ? 0 : angulo.hashCode());
		result = prime * result + ((param == null) ? 0 : param.hashCode());		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		@SuppressWarnings("unchecked")
		Parametro<T1,T2> other = (Parametro<T1, T2>) obj;
		if (angulo == null) {
			if (other.angulo != null)
				return false;
		} else if (!angulo.equals(other.angulo))
			return false;
		if (param == null) {
			if (other.param != null)
				return false;
		} else if (!param.equals(other.param))
			return false;

		return true;
	}

	public String toString(){		
		String salida = "";		
		for(int i=0;i<parametros.size();i++){
			salida+= " Dimencion"+(i+1)+": " +"("+parametros.get(i).param.toString()+")"+
						" angulo: "+ "("+parametros.get(i).angulo.toString()+"); ";
		}
		
		return salida;
	}



}
