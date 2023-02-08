package Ejercicio7;

public class Contacto {

	
	private String nombre ; 
	private int numero ;
	
	
	/*constructor */
	
	public Contacto() {
		super();
		this.nombre = "Sergio";
		this.numero = 632155789;
	} 
	
	public Contacto(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}
	
	/*get y set */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	



	
	
	
	
	
}
