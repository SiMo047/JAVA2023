package Ejercicio4;

import java.util.ArrayList;



public class Libreria {

	
	private ArrayList<Libro>libros;
	private double ganancias ;
	
	
	/*constructor*/
	public Libreria() {
		super();
		this.libros = new ArrayList<>();
		this.ganancias = 0;
	} 
	
	
	
	public void adquirir(Libro lib, double precioCompra) {
		if(this.libros.indexOf(lib)<0) {
			this.libros.add(lib);
			lib.setPrecio_compra(precioCompra);
			} 
		
	}
	
	
	public void vender (Libro lib , double precioVenta ) {
		if (lib.isVendido()==false) {
		lib.setVendido(true);
		lib.setPrecio_venta(precioVenta);
		double venta = precioVenta - lib.getPrecio_compra();; 
		
		this.ganancias +=venta ; 
		}else {
			System.out.println("Este libro "+lib.getTitulo()+" esta vendido ");
		}
	}
	
	public double ganancias () {
		
		return  this.ganancias;
	}



	
	

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libreria ");
		builder.append("\n");
		
		for(Libro book: this.libros) {
			builder.append("[");
			builder.append("Titulo = ");
			builder.append(book.getTitulo());
			builder.append(" , Estado de venta = "+book.isVendido());
			builder.append("]");
			builder.append("\n");
			
			
		}
		builder.append("Ganancias Totales = ");
		builder.append(this.ganancias);
		builder.append("$");
		return builder.toString();
	}
	
	
	
}
