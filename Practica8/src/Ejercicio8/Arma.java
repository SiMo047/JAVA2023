package Ejercicio8;

public class Arma {

	private String nombre ; 
	private int daño ; 
	private int balas ;
	
	/*constructor */
	public Arma(String nombre, int daño, int balas) {
		super();
		this.nombre = nombre;
		this.daño = daño;
		this.balas = balas;
	}
	
	/*get y set */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public int getBalas() {
		return balas;
	}

	public void setBalas(int balas) {
		this.balas = balas;
	}

	
	/* to string */
	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", daño=" + daño + ", balas=" + balas + "]";
	} 
	

	
	
	
	
}
