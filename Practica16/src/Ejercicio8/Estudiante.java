package Ejercicio8;

import java.time.LocalDate;
import java.util.Objects;

public class Estudiante {

	
	private String dni ; 
	private String nombre ; 
	private String apellido ; 
	private LocalDate fnacimiento ; 
	private String direccion ; 
	private String localidad ; 
	private String email;
	private Integer tlf ;

	
	public Estudiante(String dni, String nombre, String apellido, LocalDate fnacimiento, String direccion,
			String localidad, String email, Integer tlf) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fnacimiento = fnacimiento;
		this.direccion = direccion;
		this.localidad = localidad;
		this.email = email;
		this.tlf = tlf;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFnacimiento() {
		return fnacimiento;
	}


	public void setFnacimiento(LocalDate fnacimiento) {
		this.fnacimiento = fnacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getTlf() {
		return tlf;
	}


	public void setTlf(Integer tlf) {
		this.tlf = tlf;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiante [dni=");
		builder.append(dni);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido=");
		builder.append(apellido);
		builder.append(", fnacimiento=");
		builder.append(fnacimiento);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", email=");
		builder.append(email);
		builder.append(", tlf=");
		builder.append(tlf);
		builder.append("]");
		return builder.toString();
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
		Estudiante other = (Estudiante) obj;
		return Objects.equals(dni, other.dni);
	} 
	
	
	
	
	
	
	
	
	
}
