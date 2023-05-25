package com.daw.modelos;

public class HotelRural extends Hotel {

	
	private boolean calefaccion ;

	
	public HotelRural() {
		super();

	}



	public HotelRural(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
			int precionoche, int calificacion ,boolean calefaccion) {
		super(nombre, direccion, localidad, provincia, numHabitaciones, precionoche, calificacion);
		this.calefaccion= calefaccion ; 
	}



	/**
	 * @return the calefaccion
	 */
	public boolean isCalefaccion() {
		return calefaccion;
	}



	/**
	 * @param calefaccion the calefaccion to set
	 */
	public void setCalefaccion(boolean calefaccion) {
		this.calefaccion = calefaccion;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HotelRural [id=");
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
		builder.append(", calefaccion=");
		builder.append(calefaccion);
		builder.append("]");
		return builder.toString();
	} 
	
	
	
	
	
	
	
	
	
	
}
