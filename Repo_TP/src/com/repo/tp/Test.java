package com.repo.tp;
/********************************************************************
 * @DESARROLLADOR Rodolfo Vargas V.
 * @FECHA ENTREGA:  17/11/2014
 * @PROGRAMACION_II  TP2
 * @CLIENTE: Sistema de Representacion UNGS
 * @Detalles: Sitema que realiza Dibujos apropiados para Figuras planares
 * 			
 ********************************************************************/

public class Test {

	public static void main(String[] args) {
		test1();
		test2();
		test3();		
	}

	public static void test1(){
		
		Coordenada coord1 = new Coordenada(3,2); 
		Coordenada coord2 = new Coordenada(3,8);
		
		Figura f1 = new Cuadrado("Cuadrado1");
		f1.agregarParametro(12, 90);

		Figura f2 = new Cuadrado("Cuadrado2");
		f2.agregarParametro(24, 90);

		
		Dibujo d1 = new Dibujo("Dos Cuadrados: ");
		Dibujo d2 = new Dibujo("Otros dos Cuadrados: ");
		
		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1)); 
		d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f2)); 
		d2.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f1));
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("El resultado es: "+d1.equals(d2)+"\n"); 
		System.out.println(d1.union(d2));
		System.out.println(d1.interseccion(d2));
		System.out.println("********************************");
		System.out.println("********************************");


		}
		
		
	
		
		public static void test2(){			
			Coordenada coord1 = new Coordenada(3,2); 
			Coordenada coord2 = new Coordenada(3,8);
			Coordenada coord3 = new Coordenada(5,8);
			Coordenada coord4 = new Coordenada(5,2);
			Coordenada coord5 = new Coordenada(9,2);
			Coordenada coord6 = new Coordenada(9,8);
			
			Figura f1 = new Rectangulo("Rectangulo1");
			f1.agregarParametro(2.0,90);
			f1.agregarParametro(4.0,90);
		
			Figura f2 = new Rectangulo("Rectangulo2");
			f2.agregarParametro(4.0,90);
			f2.agregarParametro(8.0,90);
			
			Figura f3 = new Triangulo("Triangulo");
			f3.agregarParametro(5.0,90);
			f3.agregarParametro(5.0,90);
			f3.agregarParametro(7.0, 90);
			
			Figura f4 = new Poligono("Poligono");
			f4.agregarParametro(9.0,90);
			f4.agregarParametro(4.0,90);
			f4.agregarParametro(10.0, 90);
			f4.agregarParametro(10.0, 65);
			f4.agregarParametro(10.0, 87);
			f4.agregarParametro(10.0, 15);
			f4.agregarParametro(10.0, 39);
			f4.agregarParametro(10.0, 78);
			;
			Figura f5 = new Poligono("Poligono");
			f5.agregarParametro(9.0,90);
			f5.agregarParametro(4.0,90);
			f5.agregarParametro(10.0, 90);
			f5.agregarParametro(10.0, 65);
			f5.agregarParametro(10.0, 87);
			f5.agregarParametro(10.0, 15);
			f5.agregarParametro(10.0, 39);
			f5.agregarParametro(10.0, 78);
			
			Figura f6 = new Elipse("Elipse1");
			f6.agregarParametro(5.0, 0);
			f6.agregarParametro(10.0, 0);
			
			Figura f7 = new Elipse("Elipse2");
			f7.agregarParametro(10.0, 0);
			f7.agregarParametro(15.0, 0);
			
			Figura f8 = new Trapecio("Trapecio1");
			f8.agregarParametro(20.0, 45);
			f8.agregarParametro(8.0, 65);
			f8.agregarParametro(10.0, 65);
			f8.agregarParametro(8.0, 45);
			
			
			Figura f9 = new Trapecio("trapecio2");
			f9.agregarParametro(40.0, 45);
			f9.agregarParametro(16.0, 60);
			f9.agregarParametro(20.0, 60);
			f9.agregarParametro(16.0, 45);
			
			Figura f10 = new Cuadrado("Cuadrado1");
			f10.agregarParametro(2.0, 90);			
			
			Figura f11 = new Cuadrado("Cuadrado2");
			f11.agregarParametro(4.0, 90);	
			
			Figura f12 = new Cubo("Cubo1");
			f12.agregarParametro(2.0, 90);			
			
			Figura f13 = new Cubo("Cubo2");
			f13.agregarParametro(4.0, 90);	
			
			Dibujo d1 = new Dibujo("Figuras");
			Dibujo d2 = new Dibujo("Otras Figuras");
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1)); 
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f3));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f4));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord6,f5)); 
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f6));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f7));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f8));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f9)); 
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f10));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f11));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord5,f12));
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f13));
			
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord6,f2));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f3));		
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f4));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f5));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord6,f6)); 
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f7));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord5,f8));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord3,f9));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f10)); 
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f11));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord4,f12));
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f13));

			
			System.out.println(d1);	
			System.out.println(d2);
			System.out.println("El resultado es: "+d1.equals(d2)+"\n"); //false		
			System.out.println(d1.union(d2));
			System.out.println(d1.interseccion(d2));
			System.out.println("********************************");
			System.out.println("********************************");

			
			
		
	}
		
		public static void test3(){
			
			Coordenada coord1 = new Coordenada(3,2); 
			Coordenada coord2 = new Coordenada(3,8);

			
			Figura f1 = new Rectangulo("Rectangulo1");
			f1.agregarParametro(21.2, 90);
			f1.agregarParametro(12.1, 90);
			
			Figura f2 = new Rectangulo("Rectangulo777");
			f2.agregarParametro(21.2, 90);
			f2.agregarParametro(12.1, 90);
			
			Dibujo d1 = new Dibujo("Dos Rectangulos");
			Dibujo d2 = new Dibujo("Otros dos Rectangulos");
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1)); 
			d1.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
			
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord1,f1)); 
			d2.agregarFigura(new Tupla<Coordenada,Figura>(coord2,f2));
			System.out.println(d1);
			System.out.println(d2);
			System.out.println("El resultado es: "+d1.equals(d2)+"\n");
			System.out.println(d1.union(d2));
			System.out.println(d1.interseccion(d2));
			System.out.println("********************************");
			System.out.println("********************************");
			
		}

}