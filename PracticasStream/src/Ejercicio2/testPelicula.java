package Ejercicio2;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;


public class testPelicula {

	  private ArrayList<Pelicula>peliculas;

	public testPelicula() {
		
		this.peliculas = new ArrayList<>();
	}

	    public void addpeli(Pelicula p) {
	    	this.peliculas.add(p);
	    }

	    
	    
	    
	    public void pelisOrdenadasPorAño() {
	       
	        this.peliculas.stream()
	                .sorted((p1,p2)->p1.getAnio().compareTo(p2.getAnio()))
	                .forEach(System.out::println);
	    }
	    
	    
	
	    
	    public void scifi2000() {
	       
	        this.peliculas.stream()
	        		/*.filter(p->p.getAnio()>2000)*/
	                .filter(p-> p.getGeneros().stream().anyMatch(pe->pe.getNombre().equals("Ciencia ficción")))
	                .forEach(System.out::println);
	    }
	    
	    
	    public void tituloMasLargo() {
	        Pelicula pelicula = this.peliculas.stream()
	                .max((p1,p2)->p1.getTitulo().length()>p2.getTitulo().length())));
	        System.out.println("Película con el título más largo: " + pelicula);
	    }
	    
	    
	    
	    public void directoresMayúsculas() {
	       
	    	this.peliculas.stream()
	                .flatMap(p -> p.getDirectores().stream())
	                .distinct()
	                .sorted((d1,d2)->d1.getNombre().compareTo(d2.getNombre()))
	                .map(d -> d.getNombre().toUpperCase())
	                .forEach(System.out::println);
	    }
	    
	    

	    
}
