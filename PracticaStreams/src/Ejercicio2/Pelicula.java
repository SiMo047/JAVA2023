package Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Pelicula {

	
	private static int contador=0; 
	
	private Integer id ;
	private String titulo ; 
	private LocalDate anio;
	private ArrayList<Genero>generos;
	private ArrayList<Director>directores;
	
	
	
	public Pelicula(String titulo, LocalDate anio) {
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.generos= new ArrayList<>();
		this.directores= new ArrayList<>();
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public LocalDate getAnio() {
		return anio;
	}



	public void setAnio(LocalDate anio) {
		this.anio = anio;
	}



	public Integer getId() {
		return id;
	}



	public ArrayList<Genero> getGeneros() {
		return generos;
	}



	public ArrayList<Director> getDirectores() {
		return directores;
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
		Pelicula other = (Pelicula) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
