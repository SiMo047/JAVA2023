package Ejercicio6;

import Ejercicio5.Producto;

public class test {

	public static void main(String[] args) {

		
		Tienda Tienda = new Tienda();
		
		Tienda.añadirProducto(new Producto (001 , "Movil", 400,90,250,0.25));
		Tienda.añadirProducto(new Producto (002 , "Tablet", 350,95,150,0.15));
		
		System.out.println(Tienda);
		
		
		Tienda.venderProducto(002, 5);
		System.out.println(Tienda);
		
	}

}
