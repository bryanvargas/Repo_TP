package com.repo.tp;
public class Poligono extends Figura{
	protected int caras;

    public Poligono(String nombre,Parametro<Double,Integer> dimenciones ) {
		super(nombre, dimenciones);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caras;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poligono other = (Poligono) obj;
		if (caras != other.caras)
			return false;
		return true;
	}
	
//	public String toString(){
//		String salida="";
//		for(Parametro a:this.dim){
//			salida += "lado: "+a.toString();
//		}
//		return salida;
	//}
	

}
