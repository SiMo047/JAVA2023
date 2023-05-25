package com.daw.modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva /*falta comparable */ {

	public static int cont = 0;
	
	private int id ;
	private LocalDate fechaEntrada ;
	private LocalDate fechaSalida ;
	private int cantHabitaciones ; 
	private int numPersonasxHabitacion; 
	private String dni ; 
	private String nacionalidad ; 
	private Hotel hotel ;
	
	
	
	public Reserva() {
		super();
		this.id=cont++;
	}



	public Reserva( LocalDate fechaEntrada, LocalDate fechaSalida, int cantHabitaciones,
			int numPersonasxHabitacion, String dni, String nacionalidad, Hotel hotel) {
		super();
		this.id = id;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.cantHabitaciones = cantHabitaciones;
		this.numPersonasxHabitacion = numPersonasxHabitacion;
		this.dni = dni;
		this.nacionalidad = nacionalidad;
		this.hotel = hotel;
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
	 * @return the fechaEntrada
	 */
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}



	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}



	/**
	 * @return the fechaSalida
	 */
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}



	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}



	/**
	 * @return the cantHabitaciones
	 */
	public int getCantHabitaciones() {
		return cantHabitaciones;
	}



	/**
	 * @param cantHabitaciones the cantHabitaciones to set
	 */
	public void setCantHabitaciones(int cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}



	/**
	 * @return the numPersonasxHabitacion
	 */
	public int getNumPersonasxHabitacion() {
		return numPersonasxHabitacion;
	}



	/**
	 * @param numPersonasxHabitacion the numPersonasxHabitacion to set
	 */
	public void setNumPersonasxHabitacion(int numPersonasxHabitacion) {
		this.numPersonasxHabitacion = numPersonasxHabitacion;
	}



	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}



	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}



	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}



	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}



	/**
	 * @return the hotel
	 */
	public Hotel getHotel() {
		return hotel;
	}



	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reserva [id=");
		builder.append(id);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", fechaSalida=");
		builder.append(fechaSalida);
		builder.append(", cantHabitaciones=");
		builder.append(cantHabitaciones);
		builder.append(", numPersonasxHabitacion=");
		builder.append(numPersonasxHabitacion);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", nacionalidad=");
		builder.append(nacionalidad);
		builder.append(", hotel=");
		builder.append(hotel);
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
		Reserva other = (Reserva) obj;
		return id == other.id;
	} 
	
	
	
	
	
	
	
}
