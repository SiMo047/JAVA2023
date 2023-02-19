package Ejercicio7;

import java.util.Objects;

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
	

	/* to string */

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}
	
	/*equals*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return numero == other.numero;
	}
	
	
	
	



	
	
	
	
	
}
