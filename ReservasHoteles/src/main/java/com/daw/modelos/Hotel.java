package com.daw.modelos;

import java.util.Objects;

public class Hotel	 implements Comparable<Hotel> {

	public static int cont = 0;
	
	
	protected int id ; 
	protected String nombre ; 
	protected String direccion ;
	protected String localidad ; 
	protected String provincia ; 
	protected int numHabitaciones ; 
	protected int precionoche ; 
	protected int calificacion ;
	
	
	
	public Hotel() {
		super();
		this.id=cont++; 
		
	}



	public Hotel(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
			int precionoche, int calificacion) {
		super();
		this.id = cont++;
		this.nombre = nombre;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.numHabitaciones = numHabitaciones;
		this.precionoche = precionoche;
		this.calificacion = calificacion;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}



	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}



	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}



	/**
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}



	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	/**
	 * @return the numHabitaciones
	 */
	public int getNumHabitaciones() {
		return numHabitaciones;
	}



	/**
	 * @param numHabitaciones the numHabitaciones to set
	 */
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}



	/**
	 * @return the precionoche
	 */
	public int getPrecionoche() {
		return precionoche;
	}



	/**
	 * @param precionoche the precionoche to set
	 */
	public void setPrecionoche(int precionoche) {
		this.precionoche = precionoche;
	}



	/**
	 * @return the calificacion
	 */
	public int getCalificacion() {
		return calificacion;
	}



	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append(", numHabitaciones=");
		builder.append(numHabitaciones);
		builder.append(", precionoche=");
		builder.append(precionoche);
		builder.append(", calificacion=");
		builder.append(calificacion);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return id == other.id;
	}



	@Override
	public int compareTo(Hotel o) {

		return 0;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
