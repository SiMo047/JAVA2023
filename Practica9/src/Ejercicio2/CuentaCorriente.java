package Ejercicio2;

public class CuentaCorriente extends CuentaBancaria {

	
	private double modifComisiones = 0.4; 
	
	
	
	
	
	
	/*constructor */
	
	public CuentaCorriente(double saldo,double comisionesAnual ) {
		super(saldo, true, true, comisionesAnual);
		this.comisionesAnual = comisionesAnual*this.modifComisiones;
	}

/*constructor copia */
	
	public CuentaCorriente(CuentaBancaria otra) {
		super(otra);
	
	}

	
	
}
