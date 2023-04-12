package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

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



		/*------------metodo de buscar con binarySearch--------------*/
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
		
		/*para utlizar la busqueda binaria hay ordenar antes el arraylist*/ 
			Collections.sort(this.publicaciones);
		/*luego hacemos la busqueda */
			
			int posicion = Collections.binarySearch(this.publicaciones, new Publicacion("",titulo,0,0,false));
			
			return this.publicaciones.get(posicion);
		
		
		
		
	}
	
	
	
	
	
	
	
}
