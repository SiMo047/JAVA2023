package TiendaDeportes;

import java.util.ArrayList;

public class Tienda {

	private ArrayList<Producto>inventario ;
	private ArrayList<Compra>compras;

	/*constructor */
	
	public Tienda() {
		super();
		this.inventario=new ArrayList<>(); 
		this.compras=new ArrayList<>(); 
	}

	/*get */

	public ArrayList<Producto> getInventario() {
		return inventario;
	}


	public ArrayList<Compra> getCompras() {
		return compras;
	} 
	
	/*metodo que muestra todos los productos y el stock */
	public String mostrarInventario() {
		StringBuilder sb = new StringBuilder();
		
	for (Producto p : this.inventario) {
		
		sb.append("[Codigo = ");
		sb.append(p.getCodigo());
		sb.append(", Nombre = ");
		sb.append(p.getNombre());
		sb.append(", Stock = ");
		sb.append(p.getUnidadesStock());
	}
	
	return sb.toString();
	}
	
	
	/*metodo que muestra todas las compras y el total de todas las compras */
	public String mostrarCompras () {
		StringBuilder sb = new StringBuilder();
		double total=0;
		
		for (Compra c : this.compras) {
			sb.append(c); 
			total+=c.getPrecioTotal();
		}
		sb.append("\n");
		sb.append("Total de compras "+total);
		
		return sb.toString(); 
		
	}
	
	/*metodo que añade un producto al array inventario */
	public void addProducto(Producto p ) {
		
		int posicion = this.inventario.indexOf(p); 
		
		if (posicion<0) {
			this.inventario.add(p); 
		}
		
	}
	/*metodo que elimina el producto del array inventario */
	public void delProducto(Producto p ) {
		int posicion = this.inventario.indexOf(p); 
		if (posicion>=0) {
		this.inventario.remove(posicion); 
		}
	}
	
	
	public void addCompra(Compra c ) {
	
		
		for (Compra c1: this.compras) {
			
			
			for (LineaCompra lc : c1.getLineacompra()) {
				int pos= this.inventario.indexOf(lc.getProducto()); 
					Producto p = this.inventario.get(pos); 
					
					if (lc.getCantidad()>p.getUnidadesStock()) {
						throw new IllegalArgumentException ("No se puede realizar compra");
						
					}
			}
		
		}
		
		for (Compra c2 : this.compras) {
			
			
			for (LineaCompra lc : c2.getLineacompra()) {
				int pos= this.inventario.indexOf(lc.getProducto()); 
				Producto p = this.inventario.get(pos); 
				if (lc.getCantidad()<p.getUnidadesStock()) {
					p.setUnidadesStock(-1);
					this.compras.add(c);
				}
			}
		}
		
		
	}
	
	

	/*metodo que buscara los productos que contengan ese texto */
	public String buscarProducto(String texto) {
		
		ArrayList<Producto>pro = new ArrayList<>(); 
		
		
		for (Producto p : this.inventario) {
			
			if (p.getNombre().contains(texto)) {
				 pro.add(p);
			}
		}
		
		 
		StringBuilder sb = new StringBuilder();
		
		for (Producto p1 : pro) {
			sb.append(p1); 
			sb.append("\n"); 
		}
		
		return sb.toString();
		
	}
	
	
	
	
	
}
