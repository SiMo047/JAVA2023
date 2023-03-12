package Ejercicio5;

import java.util.ArrayList;

public class Biblioteca {

	private String direccion ; 
	private ArrayList<Publicacion>publicaciones;
	
	
	
	/*constructor */
	public Biblioteca(String direccion) {
		super();
		this.direccion = direccion;
		this.publicaciones = new ArrayList<>();
	}


/*get y set */

	public String getDireccion() {
		return direccion;
	}




	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	/*añadir publicacion al array de publicaciones */
	public void adquirirMaterial(Publicacion pub) {
		if (this.publicaciones.indexOf(pub)<0) {
			this.publicaciones.add(pub);
		}
	}
	
	public Publicacion buscar(String titulo) {
		
		for (Publicacion publi : this.publicaciones) {
			if (publi.getTitulo().equals(titulo)){
				return publi;
			}
		}
	
		return null ; 
	
		
		
		
		
	}
	
	
	
	
	
	
	
}
