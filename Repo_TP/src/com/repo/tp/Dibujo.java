package com.repo.tp;

import java.util.ArrayList;
public class Dibujo {
	private ArrayList<Tupla<Coordenada,Figura>> dibujo ;
	private String nombre; 

	public Dibujo(String nombre){
		dibujo = new ArrayList<Tupla<Coordenada,Figura>>();
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void agregarFigura(Tupla<Coordenada,Figura> t){
		dibujo.add(t);		
	}	
	public int cantidad(){
		return dibujo.size();
	}


	
	public Dibujo union(Dibujo d2){
		Dibujo dibujoUnion = new Dibujo("DibujoUnion() ");
		dibujoUnion.dibujo.addAll(this.dibujo);
		for (Tupla<Coordenada,Figura> tupla : d2.dibujo){
			dibujoUnion.agregarFigura(tupla);
		}
		return dibujoUnion;
	}
	
	public Dibujo interseccion(Dibujo d2){
		Dibujo dibujoInterseccion = new Dibujo("DibujoInterseccion() ");
		if(this.equals(d2))
			dibujoInterseccion.dibujo.addAll(this.dibujo);
		else{
			for (Tupla<Coordenada,Figura> tupla : dibujo) {
				for(Tupla<Coordenada,Figura> otraTupla: d2.dibujo){
					if(tupla.equals(otraTupla))
						dibujoInterseccion.agregarFigura(tupla);
					}
				}
			}		
		return dibujoInterseccion;
	   }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dibujo == null) ? 0 : dibujo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object otroDibujo) {
		boolean ret=true;
		boolean ret2=false;
		Dibujo otroDib = (Dibujo)otroDibujo;
		for (Tupla<Coordenada,Figura> fig1 : dibujo) {
			for(Tupla<Coordenada,Figura> otroFig: otroDib.dibujo){
				ret2=ret2 || fig1.equals(otroFig);//compara <cordenadas, figuras>
						//|| fig1.getY().equals(otroDib);//compara figuras
			}
			ret=ret && ret2;
			ret2=false;
		}	
		return ret;
	}	

	public String toString(){
		String salida = "";
		salida += this.nombre + ":\n";
		for(int i=0;i<dibujo.size();i++){
			Tupla<Coordenada, Figura> aux = dibujo.get(i);			
			salida += aux.x.toString() +" "+ aux.y.toString() + "\n";

		}
		return salida;
		
	}
}
