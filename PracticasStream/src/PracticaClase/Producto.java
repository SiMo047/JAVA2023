package PracticaClase;

import java.util.Objects;

public class Producto {

	private static long cont=0;
	enum Categoria {LIBROS , JUEGOS , TELEVISORES};
	
	private long id ; 
	private String nombre ; 
	private Categoria categoria ; 
	private Double precio ;
	
	
	public Producto(String nombre, Categoria categoria, Double precio) {
		super();
		this.id = ++cont;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", precio=");
		builder.append(precio);
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

	
	
	
	
}
