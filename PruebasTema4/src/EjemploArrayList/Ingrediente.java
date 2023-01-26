package EjemploArrayList;

import java.util.Objects;

public class Ingrediente {

	
	private String nombre ; 
	private int cantidad;

	
	
	
	public Ingrediente(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	} 
	
	public Ingrediente(Ingrediente Ingre ) {
		super();
		this.nombre = nombre ;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	/*TO STRING*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ingrediente [nombre=");
		builder.append(nombre);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	/*EQUALS*/

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		return Objects.equals(nombre, other.nombre);
	} 
	
	
	
	
	
}
