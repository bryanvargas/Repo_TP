package com.repo.tp;


public abstract class Figura {
	protected String nombre;
	protected  Parametro<Double, Integer> dimenciones;
	
	public Figura(String nombre, Parametro<Double,Integer> dimenciones){
		setNombre(nombre);
		this.dimenciones = dimenciones;
		
		
		}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre==null?"figura":nombre;
	}
	

	public abstract double area();
	public abstract double perimetro();
	//@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((dim == null) ? 0 : dim.hashCode());
//		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
//		return result;
//	}
//
//	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		if(obj.getClass() != null)
//			return false;
		Figura other = (Figura) obj;
		int parametrosA = this.dimenciones.pares.size();
		int parametrosB = other.dimenciones.pares.size();
		if(parametrosA!=parametrosB){
			return false;
		}
//
//		if (nombre == null) {
//			if (other.nombre != null)
//				return false;
//		} else if (!nombre.equals(other.nombre))
//			return false;

		for (Parametro<Double,Integer> tupla : dimenciones.pares) {
			for(Parametro<Double,Integer> tupla2 : other.dimenciones.pares){
				if(!tupla.equals(tupla2));
				return false;
			}	
		}
		return true;
	}
//
//	public abstract double perimetro();
//
//
//	@Override
//	public String toString() {
//		String salida ="";
//		for(Parametro<Double,Integer> p:dimenciones.pares)
//			salida+="lado"+p.toString();
//		return  this.nombre +" "+ salida;
//	}
//	
	
	public String toString(){
		return this.nombre+dimenciones.toString();
	}
	
	
}
