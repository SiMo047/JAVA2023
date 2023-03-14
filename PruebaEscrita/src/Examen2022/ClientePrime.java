package Examen2022;

public class ClientePrime extends Cliente {

	private static double precioMensual=3 ;
	
	
	public ClientePrime() {
		super();
	this.precioMensual=precioMensual;
	}

	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
	this.precioMensual=precioMensual ; 
	}

	@Override
	public boolean esPro() {
	
		return false;
	}

	@Override
	public double getPrecioMensual() {
		
		
		return this.precioMensual;
	}

}
