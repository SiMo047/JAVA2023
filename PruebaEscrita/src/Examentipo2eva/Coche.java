package Examentipo2eva;

public class Coche extends Vehiculo implements Descontable {

	

	
	private Combustible combustible ; 
	
	
	
	
	
	
	public Coche() {
		super();
	this.combustible=combustible.DIESEL;
	}






	public Coche(String matricula, String marca, Combustible combustible ) {
		super(matricula, marca);
		this.combustible=combustible ;
	
	}






	public Coche(Coche otro) {
		super(otro);
		this.combustible=otro.combustible;
	}

	/*gte y set */

	public Combustible getCombustible() {
		return combustible;
	}






	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

	/*toString*/

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", fechaentrada=" + fechaentrada + ", min=" + min
				+ ", plaza=" + plaza + ", combustible=" + combustible + "]";
	}
	

	
	/*este metodo llama al descuento del vehiculo para añadir mas condiciones
	 * como la del combutible  
	 */
@Override
	public double descuento() {
	/*este descuento es segun el combustible , heredamos el valor descuento de la clase 
	 * vehiculo con super.(nombre del metodo), asi seria super.descuento();
	 */
	double descuento = super.descuento();
	
	if (this.combustible.equals(combustible.DIESEL) || this.combustible.equals(combustible.GASOLINA)) {
		descuento-=0.10;
	}else {
		descuento+=0.10;
	}
	
	return descuento;
	}






@Override
	public double calcularImporte() {
	
	
	double importe = (1-this.descuento()) *Parking.PRECIO_BASE_POR_MINUTO*this.calcularMinutos();
		return importe;
	}





}
