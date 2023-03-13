package Examentipo2eva;

public class Furgoneta extends Vehiculo implements Descontable {

	private float longitud ; 
	
	
	
	public Furgoneta() {
		super();
	this.longitud=0;
	}

	public Furgoneta(String matricula, String marca, float longitud) {
		super(matricula, marca);
		this.longitud=longitud ; 
	}

	public Furgoneta(Furgoneta otro) {
		super(otro);
		this.longitud=otro.longitud;
	}

	@Override
	public String toString() {
		return "Furgoneta [matricula=" + matricula + ", marca=" + marca + ", fechaentrada=" + fechaentrada + ", min="
				+ min + ", plaza=" + plaza + ", longitud=" + longitud + "]";
	}

	
	@Override
	public double calcularImporte() {
		
	double importe ;
	
	importe = (1-this.descuento())*Parking.PRECIO_BASE_POR_MINUTO*this.calcularMinutos()+(this.longitud*Parking.PRECIO_BASE_POR_METRO);
	return importe ; 
	}

}
