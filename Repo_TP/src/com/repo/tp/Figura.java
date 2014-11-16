package com.repo.tp;


public abstract class Figura{
	protected String nombre;
	protected int caras;
	protected  Parametro<Double, Integer> parametros = new  Parametro<Double, Integer>(); 
	
	public Figura(String nombre){
		setNombre(nombre);	
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre==null?"figura":nombre;
	}
	
    
	public int getCaras() {
		return caras;
	}
	
	public void setCaras(int caras) {
		this.caras = caras;
	}
	
	public Parametro<Double, Integer> getDimenciones() {
		return parametros;
	}

	public void setDimenciones(Parametro<Double, Integer> dimenciones) {
		this.parametros = dimenciones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((parametros == null) ? 0 : parametros.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figura other = (Figura) obj;
		if (parametros == null) {
			if (other.parametros != null)
				return false;
		} 
		else if (!parametros.equals(other.parametros))
			return false;
		int parametrosA = this.parametros.parametros.size();
		int parametrosB = other.parametros.parametros.size();
		if(parametrosA!=parametrosB){
			return false;
		}	
		if(!this.parametros.parametros.equals(other.parametros.parametros))
			return false;
		
		return true;
	}
	
	public String toString(){
		return this.nombre+": "+parametros.toString();
	}
	
	public  void agregarDimencion(double dim,int angulo){	
			if(this.parametros.cantidadParametros()<this.caras)
				this.parametros.agregar(dim, angulo);
			else
				throw new RuntimeException("el "+ this.nombre +
						" solo tiene "+ this.caras+" caras, Usted ingreso paramentros de mas ");
	}
	
	public abstract double area();
	public abstract double perimetro();
}
