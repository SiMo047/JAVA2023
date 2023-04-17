package Ejercicio8;

import java.util.Objects;
import java.util.TreeSet;

public class CentroEducativo {

	
	private TreeSet<Expediente>expedientes ;
	private String nombreCentro ; 
	private String direccion ; 
	private String localidad ; 
	private int telf ; 
	private String email ;
	
	
	
	public CentroEducativo(String nombreCentro, String direccion, String localidad, int telf, String email) {
		super();
		this.expedientes= new TreeSet <>();
		this.nombreCentro = nombreCentro;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telf = telf;
		this.email = email;
	}



	public String getNombreCentro() {
		return nombreCentro;
	}



	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
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



	public int getTelf() {
		return telf;
	}



	public void setTelf(int telf) {
		this.telf = telf;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public TreeSet<Expediente> getExpedientes() {
		return expedientes;
	}



	@Override
	public String toString() {
		return "CentroEducativo [nombreCentro=" + nombreCentro + ", direccion=" + direccion + ", localidad=" + localidad
				+ ", telf=" + telf + ", email=" + email + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(nombreCentro);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CentroEducativo other = (CentroEducativo) obj;
		return Objects.equals(nombreCentro, other.nombreCentro);
	} 
	
	
	
	
	public void addExpediente (Expediente e) {
		this.expedientes.add(e);
	}
	
	public Expediente  buscarExpediente ( String dni ) {
		
		
		for (Expediente e : this.expedientes) {
			if (e.getEstudiante().getDni().equals(dni)) {
			
				return e;
			}
		}
		
		
		return null; 
		
		
	}
	
	
	
}
