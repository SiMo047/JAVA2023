package TiendaDeportes;

import java.util.Objects;

public class Producto implements Descontable {

	protected int codigo=0 ; 
	protected String nombre; 
	protected String descripcion ; 
	protected double precio ; 
	protected int unidadesStock ; 
	
	/*constructores */
	public Producto(String nombre, String descripcion, double precio, int unidadesStock) {
		super();
		this.codigo = id();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.unidadesStock = unidadesStock;
	}
	
	public int id () {
		return codigo++;
	}
	
	public Producto() {
		super();
		this.codigo = id();
		this.nombre = "";
		this.descripcion = "";
		this.precio = 0;
		this.unidadesStock = 1;
	}
	
	public Producto(Producto otro) {
		super();
		this.codigo = otro.id();
		this.nombre = otro.nombre;
		this.descripcion = otro.descripcion;
		this.precio = otro.precio;
		this.unidadesStock = otro.unidadesStock;
	}
	
	/*GET Y SET */
	
	
	public  int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidadesStock() {
		return unidadesStock;
	}

	public void setUnidadesStock(int unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	/*toString*/


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", unidadesStock=");
		builder.append(unidadesStock);
		builder.append("]");
		return builder.toString();
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
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
		return codigo == other.codigo;
	}

	@Override
	public double descuento() {
		
		return 0;
	}



}
