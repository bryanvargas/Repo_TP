package com.repo.tp;
public class Poligono extends Figura{


    public Poligono(String nombre) {
		super(nombre);
		this.setCaras(1000000);
	}  

	
	@Override
	public  double area(){
		return 1.0;
	}
	

	@Override
	public double perimetro() {
		double perim =0;
		for(int i=0;i<this.parametros.parametros.size();i++){
			perim += this.parametros.parametros.get(i).getDim();
		}
		return perim;
	}	

}
