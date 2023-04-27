package PracticaClase;

import java.time.LocalDate;

import PracticaClase.Pedido.Estado;
import PracticaClase.Producto.Categoria;

public class test {

	public static void main(String[] args) {

		
		
		
		Cliente c1 = new Cliente ("Ramon",2);
		Cliente c2 = new Cliente ("Alex",4);
		Cliente c3 = new Cliente ("Rafa",6);
		
		
		Producto p1 = new Producto ("LG-OLED",Categoria.TELEVISORES,1200.00);
		Producto p2 = new Producto ("SAMSUNG-QLED",Categoria.TELEVISORES,600.00);

		Producto p3 = new Producto ("GTA-V",Categoria.JUEGOS,19.00);
		Producto p4 = new Producto ("LAST OF US 2",Categoria.JUEGOS,24.00);

		Producto p5 = new Producto ("ABDEL",Categoria.LIBROS,10.00);
		Producto p6 = new Producto ("Libro2",Categoria.LIBROS,20.00);

		
	
		Pedido pd1 = new Pedido (LocalDate.now(),Estado.PROCESADO,c3);
		Pedido pd2 = new Pedido (LocalDate.of(0, 0, 0),Estado.RECIBIDO,c3);
		
		
	}

}
