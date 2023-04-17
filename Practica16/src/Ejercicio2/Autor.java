package Ejercicio2;

import java.util.ArrayList;
import java.util.Objects;

public class Autor implements Comparable <Autor>{

	
	
	private String nombre ; 
	private String apellido ;
	private ArrayList<Publicacion>publicaciones;
	
	public Autor(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.publicaciones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(apellido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apellido, other.apellido);
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append("]");
		return builder.toString();
	}

	public void anadirPublicacion(Publicacion p ) {
		int posicion = this.publicaciones.indexOf(p); 
		
		if (posicion<0) {
			this.publicaciones.add(p); 
		}
	}

	@Override
	public int compareTo(Autor o) {
		return this.apellido.compareTo(o.getApellido());
	}
	
	
}
