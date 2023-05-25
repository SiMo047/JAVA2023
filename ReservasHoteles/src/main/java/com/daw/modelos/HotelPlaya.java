package com.daw.modelos;

public class HotelPlaya extends Hotel {

	private boolean ac ;

	
	
	public HotelPlaya() {
		super();

	}

	public HotelPlaya(String nombre, String direccion, String localidad, String provincia, int numHabitaciones,
			int precionoche, int calificacion ,boolean ac) {
		super(nombre, direccion, localidad, provincia, numHabitaciones, precionoche, calificacion);
		this.ac=ac;
	}

	/**
	 * @return the ac
	 */
	public boolean isAc() {
		return ac;
	}

	/**
	 * @param ac the ac to set
	 */
	public void setAc(boolean ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HotelPlaya [id=");
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
		builder.append(", ac=");
		builder.append(ac);
		builder.append("]");
		return builder.toString();
	}


	
	
	
	
}
