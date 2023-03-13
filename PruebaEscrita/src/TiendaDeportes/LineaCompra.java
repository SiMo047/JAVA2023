package TiendaDeportes;

import java.util.Objects;

public class LineaCompra {

	private int orden ; 
	private Producto producto ; 
	public int cantidad ;
	
	/*constructor */
	
	public LineaCompra(int orden, Producto producto, int cantidad) {
		super();
		this.orden = orden;
		this.producto = producto;
		this.cantidad = cantidad;
	}

	/*get y set */

	public int getOrden() {
		return orden;
	}



	public void setOrden(int orden) {
		this.orden = orden;
	}



	public Producto getProducto() {
		return producto;
	}



	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/*toString*/
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LineaCompra [orden=");
		builder.append(orden);
		builder.append(", producto=");
		builder.append(producto);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}
	
	/*equals */

	@Override
	public int hashCode() {
		return Objects.hash(producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaCompra other = (LineaCompra) obj;
		return Objects.equals(producto, other.producto);
	} 
	
	
	public double subtotal() {
		double subtotal=0 ;
		
		subtotal = (this.producto.getPrecio()-this.producto.descuento())*(this.cantidad);
		
		
		return subtotal ; 
	}
	


	
	
	
}
