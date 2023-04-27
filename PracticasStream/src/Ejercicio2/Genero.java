package Ejercicio2;

import java.util.Objects;

public class Genero {

	private static int contador=0; 
	
	private Integer id ; 
	private String nombre; 
	
	
	public Genero(String nombre) {
		super();
		this.nombre = nombre;
		this.id = ++contador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Genero [id=" + id + ", nombre=" + nombre + "]";
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
		Genero other = (Genero) obj;
		return id == other.id;
	}
	
	
	
	
}
