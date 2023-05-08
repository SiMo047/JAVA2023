package Ejercicio2;

import java.util.ArrayList;
import java.util.Objects;

public class Director {

	private static int contador=0; 
	
	private Integer id ; 
	private String nombre ; 
	private ArrayList<Pelicula>peliculas;
	
	
	public Director(String nombre) {
		super();
		this.nombre = nombre;
		this.peliculas= new ArrayList<>();
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getId() {
		return id;
	}


	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	

	@Override
	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + ", peliculas=" + peliculas + "]";
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
		Director other = (Director) obj;
		return Objects.equals(id, other.id);
	}
	
	/*metodo que añade pelicula al array de peliculas */
	public void addPelicula (Pelicula p) {
		if (this.peliculas.indexOf(p)<0) {
		this.peliculas.add(p);
		}
	}
	
	/*metodo que elimina una pelicula del array */
	public void deletePelicula  (Pelicula p) {
		this.peliculas.remove(p);
	}
	
}