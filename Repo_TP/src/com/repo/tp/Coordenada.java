package com.repo.tp;

public class Coordenada extends Tupla<Integer,Integer>{

	public Coordenada(Integer x,Integer y){
		super(x,y);
	}
	
	public void sumar(Integer x,Integer y){
		super.x = (Integer)super.x + x;
		super.y = (Integer)super.y + y;
	}
	
	
	public String toString(){
		return "Cordenadas: " + super.toString();
	}
	
	
}

