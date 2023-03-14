package Examen2022;

public class ClientePrimePro extends Cliente {

	
	private static double precioMensual=5;
	
	
	
	
	public ClientePrimePro() {
		super();
	this.precioMensual=precioMensual;
	}

	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual=precioMensual;
	}

	@Override
	public boolean esPro() {
		
		return true;
	}

	@Override
	public double getPrecioMensual() {
		
		return this.precioMensual;
	}

}
