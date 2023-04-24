package PracticaClase;

import java.time.LocalDate;

import PracticaClase.Pedido.Estado;
import PracticaClase.Producto.Categoria;

public class test {

	public static void main(String[] args) {

		
		
		
		Cliente c1 = new Cliente (1111,"Ramon",2);
		Cliente c2 = new Cliente (2222,"Alex",4);
		Cliente c3 = new Cliente (3333,"Rafa",6);
		
		
		Producto p1 = new Producto (1,"LG-OLED",Categoria.TELEVISORES,1200.00);
		Producto p2 = new Producto (2,"SAMSUNG-QLED",Categoria.TELEVISORES,600.00);

		Producto p3 = new Producto (3,"GTA-V",Categoria.JUEGOS,19.00);
		Producto p4 = new Producto (4,"LAST OF US 2",Categoria.JUEGOS,24.00);

		Producto p5 = new Producto (5,"ABDEL",Categoria.LIBROS,10.00);
		Producto p6 = new Producto (6,"Libro2",Categoria.LIBROS,20.00);
		
	
		
	}

}
