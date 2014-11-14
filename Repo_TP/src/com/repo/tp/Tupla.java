package com.repo.tp;


public class Tupla<Tx,Ty> {
	Tx x;
	Ty y;
	
	public Tupla(){}
	
	public Tupla(Tx x,Ty y){
		this.x = x;
		this.y = y;
	}
	
	public Tx getX() {		return x;	}
	
	public void setX(Tx tx) {		this.x = tx;	}
	
	public Ty getY() {		return y;	}
	
	public void setY(Ty ty) {		this.y = ty;	}	


	@Override
	public String toString(){
		String ret = "";
		if (x != null) ret = ret +"("+ x.toString() +",";
		if (y != null) ret = ret + y.toString()+ ")";
		return ret;
	}
	
	/**
	 * Override del metodo equals de Object
	 * @param Object Tupla
	 * @return boolean True si dos tuplas son iguales.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object T2){
		
		boolean ret=true;
		if (T2 instanceof Tupla){
			Tupla<Tx,Ty> tupla2=(Tupla<Tx,Ty>)T2;
			ret=ret && (tupla2.canEqual(this));
			ret=ret && this.getX().equals(tupla2.getX());
			ret=ret && this.getY().equals(tupla2.getY());
		}
		
		return ret;
	}
	
	public boolean canEqual(Object other) {
        return (other instanceof Tupla);
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x.hashCode()+y.hashCode();
		return result;
	}

}



