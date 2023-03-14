package Examen2022;

import java.util.Objects;

public abstract class Cliente {

	protected String dni ; 
	protected String nombre; 
	protected String email ; 
	protected double precioMensual ;
	
	public Cliente() {
		super();
		this.dni = "";
		this.nombre = "";
		this.email = "";
		this.precioMensual=0	;
		} 	
	
	public Cliente(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.precioMensual=0	;
		}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", email=" + email + ", precioMensual=" + precioMensual
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	} 
	
	
	public abstract boolean esPro ();
	
	public abstract double getPrecioMensual();
	
}
