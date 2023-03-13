package TiendaDeportes;

import java.util.Scanner;

import TiendaDeportes.Ropa.Talla;
import TiendaDeportes.Ropa.Tipo;
import TiendaDeportes.Zapatillas.Categoria;
import TiendaDeportes.Zapatillas.Numero;

public class Aplicacion {

	public static void main(String[] args) {

		
		Tienda t1 = new Tienda();

		Ropa r1 = new Ropa ("Nike","Sudadera Comoda",50,5,"Rojo",Talla.M,Tipo.SUDADERA);
		Ropa r2 = new Ropa ("Adidas","Camiseta Comoda",54,3,"Blanca",Talla.M,Tipo.CAMISETA);
		Ropa r3 = new Ropa ("Puma","Sudadera Comoda",30,10,"Negra",Talla.XL,Tipo.CHAQUETA);

		Zapatillas z1 = new Zapatillas ("Nike","Zapatilla deportiva",60,20,Categoria.running,Numero.n40);
		Zapatillas z2 = new Zapatillas ("Adidas","Botas futbol",100,10,Categoria.fútbol,Numero.n40);
		Zapatillas z3 = new Zapatillas ("Puma","Zapatilla gym",60,15,Categoria.gimnasio,Numero.n41);
		
		t1.addProducto(r1);
		t1.addProducto(r2);
		t1.addProducto(r3);
		t1.addProducto(z1);
		t1.addProducto(z2);
		t1.addProducto(z3);
		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Menu Tinda");
		System.out.println("1.Mostrar Inventario");
		System.out.println("2.Buscar Producto");
		System.out.println("3.Mostrar Compras");
		System.out.println("4.Mostrar Compras por mes ");
		System.out.println("5.Hacer Compras");
		System.out.println("6.Salir");
		
		
		
		int opt=0 ; 
	
		
		
	}

}
