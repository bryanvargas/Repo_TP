package com.repo.tp;
public class Poligono extends Figura{
	
	protected int caras;

    public Poligono(String nombre,Parametro<Double,Integer> dimenciones ) {
		super(nombre, dimenciones);
		this.caras = this.dimenciones.pares.size();
	}  
    
	public int getCaras() {
		return caras;
	}
	
	public void setCaras(int caras) {
		this.caras = caras;
	}
	
	@Override
	public  double area(){
		return 0.0;
	}
	

	@Override
	public double perimetro() {
		double perim =0;
		for(int i=0;i<this.dimenciones.pares.size();i++){
			perim += this.dimenciones.pares.get(i).getDim();
		}
		return perim;
	}	

}
