package com.repo.tp;

public class Test {

	public static void main(String[] args) {
		//test1();
		//test2();
		//test3();
		Coordenada coord1 = new Coordenada(3,2); 
		Coordenada coord2 = new Coordenada(3,8);
		Coordenada coord3 = new Coordenada(4,16);
		Parametro<Double,Integer> rectangulo = 
				new Parametro<Double,Integer>();
		rectangulo.agregar(2.0,90);
		rectangulo.agregar(4.0,90);
		
		Parametro<Double,Integer> tri = 
				new Parametro<Double,Integer>();
		tri.agregar(9.0,90);
		tri.agregar(4.0,90);
		tri.agregar(10.0, 90);
		
		Parametro<Double,Integer> poligono = 
				new Parametro<Double,Integer>();
		poligono.agregar(9.0,90);
		poligono.agregar(4.0,90);
		poligono.agregar(10.0, 90);
		poligono.agregar(10.0, 65);
		poligono.agregar(10.0, 87);
		poligono.agregar(10.0, 15);
		poligono.agregar(10.0, 39);
		poligono.agregar(10.0, 78);
		
		Parametro<Double,Integer> poligonoDos = 
				new Parametro<Double,Integer>();
		poligonoDos.agregar(9.0,90);
		poligonoDos.agregar(4.0,90);
		poligonoDos.agregar(10.0, 90);
		poligonoDos.agregar(10.0, 65);
		poligonoDos.agregar(10.0, 87);
		poligonoDos.agregar(10.0, 15);
		poligonoDos.agregar(10.0, 39);
		poligonoDos.agregar(10.0, 78);
		Figura f1 = new Rectangulo("Rectangulo1",rectangulo);
		Figura f2 = new Triangulo("Triangulo",tri);
		Figura f3 = new Poligono("Poligono",poligono);
		Figura f4 = new Poligono("Poligono",poligonoDos);
		Dibujo d1 = new Dibujo("Dos Figuras");
		Dibujo d2 = new Dibujo("Otras Dos Figuras");
		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1)); 
		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f3));
		
		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1));
		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f4));
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
		System.out.println(poligono.equals(poligonoDos));

		
	}
	//System.out.println(f1.perimetro());
	//System.out.println(f1.area());
	
//	
//	private static void test3() {
//		Coordenada coord1 = new Coordenada(3,2); 
//		Coordenada coord2 = new Coordenada(3,8);
//		Parametro p1 = new Parametro();
//		p1.
//		Figura f1 = new Polibryan("Cuad1",new Parametro(21,32)
//					, new Parametro(23,32), new Parametro(22,3),
//		new Parametro(22,3),new Parametro(22,3));
//		//faltan parametros en el contructor de cuadrado!
//		Figura f2 = new Cuadrado("Cuad2",2);
//		//faltan parametros en el contructor de cuadrado!
//		Dibujo d1 = new Dibujo("Dos Cuadrados");
//		Dibujo d2 = new Dibujo("Otros dos Cuadrados");
//		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1)); 
//		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
//		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f2)); 
//		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f1));	
//		System.out.println(f1.perimetro());
//		System.out.println(d1);
//		
//	}

	public static void test1(){
		Coordenada coord1 = new Coordenada(3,2); 
		Coordenada coord2 = new Coordenada(3,8);
		Figura f1 = new Cuadrado("Cuad1",1);
		//faltan parametros en el contructor de cuadrado!
		Figura f2 = new Cuadrado("Cuad2",2);
		//faltan parametros en el contructor de cuadrado!
		Dibujo d1 = new Dibujo("Dos Cuadrados");
		Dibujo d2 = new Dibujo("Otros dos Cuadrados");
		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1)); 
		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f2)); 
		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f1));
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("El resultadoes: "+d1.equals(d2)); //false
		System.out.println(d1.union(d2));
		System.out.println(d1.interseccion(d2));
		System.out.println("********************************");
		System.out.println("********************************");

		}
		
		
	
		
//		public static void test2(){
//		Coordenada coord1 = new Coordenada(3,2);
//		Coordenada coord2 = new Coordenada(3,8);
//		Coordenada coord3 = new Coordenada(4,6);
//		Coordenada coord4 = new Coordenada(6,3);
//		Figura f1 = new Cuadrado("Cuadrado1 ",4);		//faltan parametros en el contructor de cuadrado! 
//		Figura f3 = new Cuadrado("Cuadrado2 ",2);		//faltan parametros en el contructor de cuadrado! 
//		Figura  f2 = new Rectangulo("Rectangulo1",2,6);
//		Figura f4 = new Triangulo("Triangulo1",8,2);
//		Figura f5 = new Triangulo("Triangulo2",6,3);
//		Figura f6 = new Cubo("Cobu1", 3);
//		Figura f7 = new Elipse("Elipse1", 10,10);
//		Figura f8 = new Circulo("Elipse1", 10);
//		//Figura f9 = new Trapecio("Trapecio 1", 10,5,4);
//		Dibujo d1 = new Dibujo("Figuras");
//		Dibujo d2 = new Dibujo("Otras Figuras");
//		
//		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1));
//		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f3));
//		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
//		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f4));
//		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f5));
//		//d1.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f9));
//		
//
//		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1));
//		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
//		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f3));
//		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f4));
//		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f6));
//		
//		System.out.println(d1.toString());
//		System.out.println(d2.toString());
//		System.out.println("El resultadoes: "+d1.equals(d2)); //false
//		System.out.println(d1.union(d2));
//		System.out.println(d1.interseccion(d2));

		
		
		
	//}

}