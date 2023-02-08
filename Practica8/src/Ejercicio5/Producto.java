package Ejercicio5;

import java.util.Objects;

public class Producto {

	private int id;
	private  String descripcion;
	private double precioUnitario;
	private int unidadesDisponibles;
	private  int stockMaximo;
	private double descuento;
	
	
	/*constructores */
	
	public Producto(int id, String descripcion, double precioUnitario, int unidadesDisponibles, int stockMaximo,
			double descuento) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.unidadesDisponibles = unidadesDisponibles;
		this.stockMaximo = stockMaximo;
		this.descuento = descuento;
	}

	
	public Producto () {
		this.id=00; 
		this.descripcion=" "; 
		this.precioUnitario=0; 
		this.unidadesDisponibles=0; 
		this.descuento=0.25; 
	}


	/*get y set */
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}


	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this.unidadesDisponibles = unidadesDisponibles;
	}


	public int getStockMaximo() {
		return stockMaximo;
	}


	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}


	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precioUnitario=");
		builder.append(precioUnitario);
		builder.append(", unidadesDisponibles=");
		builder.append(unidadesDisponibles);
		builder.append(", stockMaximo=");
		builder.append(stockMaximo);
		builder.append(", descuento=");
		builder.append(descuento);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return id == other.id;
	}
	
	
	
	public boolean vender (int cantidad) {
		if ( (cantidad <=0) || this.unidadesDisponibles<cantidad) {
			return false ; 
		}else {
			this.unidadesDisponibles= this.unidadesDisponibles-cantidad;
			
			return true ; 
		}
	}
	
	
	public int reponer () {
		int diferencia ; 
		
	diferencia =  this.stockMaximo-this.unidadesDisponibles; 
	
		this.unidadesDisponibles=this.stockMaximo; 
	return diferencia ; 
	}
	
}
