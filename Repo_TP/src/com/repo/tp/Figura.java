package com.repo.tp;


public abstract class Figura{
	protected String nombre;
	protected  Parametro<Double, Integer> dimenciones = new  Parametro<Double, Integer>(); 
	
	public Figura(String nombre/*, Parametro<Double,Integer> dimenciones*/){
		setNombre(nombre);
		//this.dimenciones = dimenciones;	
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre==null?"figura":nombre;
	}	
	public Parametro<Double, Integer> getDimenciones() {
		return dimenciones;
	}

	public void setDimenciones(Parametro<Double, Integer> dimenciones) {
		this.dimenciones = dimenciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dimenciones == null) ? 0 : dimenciones.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Figura other = (Figura) obj;
		if(!(this instanceof Figura)){
			return false;
		}
		if (dimenciones == null) {
			if (other.dimenciones != null)
				return false;
		} else if (!dimenciones.equals(other.dimenciones))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;

		int parametrosA = this.dimenciones.pares.size();
		int parametrosB = other.dimenciones.pares.size();
		if(parametrosA!=parametrosB){
			return false;
		}		
		return true;
	}

	public abstract double area();
	public abstract double perimetro();
	
	public String toString(){
		return this.nombre+dimenciones.toString();
	}
	
	public  void agregarDimencion(double dim,int angulo){
		//Parametro<Double,Integer> p = new Parametro<Double,Integer>();
		this.dimenciones.agregar(dim, angulo);
		//return p;
	}
	
}
