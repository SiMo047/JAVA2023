package Ejercicio3;

import java.util.Objects;

public class Direccion {

	private String calle ; 
	private int numero ; 
	private String poblacion;
	private String provincia ; 
	private long cp ; 
	private String pais ; 
	private double latitud ; 
	private double longitud ;
	
	/*constructor*/
	public Direccion(String calle, int numero, String poblacion, String provincia, int cp, String pais, double latitud,
			double longitud) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.poblacion = poblacion;
		this.provincia = provincia;
		this.cp = cp;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	} 
	
	
	public Direccion(Direccion otra) {
		super();
		this.calle = otra.calle;
		this.numero = otra.numero;
		this.poblacion = otra.poblacion;
		this.provincia = otra.provincia;
		this.cp = otra.cp;
		this.pais = otra.pais;
		this.latitud = otra.latitud;
		this.longitud = otra.longitud;
	}

	/*get y set */

	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public long getCp() {
		return cp;
	}


	public void setCp(long cp) {
		this.cp = cp;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public double getLatitud() {
		return latitud;
	}


	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}


	public double getLongitud() {
		return longitud;
	}


	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	
	/*to string */

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", poblacion=" + poblacion + ", provincia="
				+ provincia + ", cp=" + cp + ", pais=" + pais + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(latitud, longitud);
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
		Direccion other = (Direccion) obj;
		return latitud == other.latitud && longitud == other.longitud;
	}
	
	
	
	public double distanciaKM(Direccion otro ) {
		int radio = 6371;
		
	
		double lat2 =Math.toRadians(otro.latitud); 
		double lat1 =Math.toRadians(this.latitud); 
		double long2= Math.toRadians(otro.longitud); 
		double long1 = Math.toRadians(this.longitud); 
		
		
		double Alat = lat2-lat1;
		double Along = long2-long1;
		
		
		
		double a =Math.pow(Math.sin(Alat/2), 2)+Math.cos(lat1)*Math.cos(lat2)
				*Math.pow(Math.sin(Along/2), 2);
		
		double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		
		double distancia = radio*c;
		
		return distancia; 
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
